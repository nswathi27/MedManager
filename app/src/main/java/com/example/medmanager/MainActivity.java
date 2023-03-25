package com.example.medmanager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.example.medmanager.mydatabase.MedicalDB;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MedicalDB medicalDB;
    private TextView emptyView;
    private UserListAdapter userListAdapter;
    private FloatingActionButton addUserButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        medicalDB = MedicalDB.getInstance(this.getApplicationContext());

        emptyView = findViewById(R.id.user_empty);
        Cursor userList = medicalDB.getUserList(medicalDB.getWritableDatabase());

        if (userList.getCount() == 0) {
            emptyView.setText(R.string.empty_users);
        }

        recyclerView = findViewById(R.id.user_list);
        addUserButton = findViewById(R.id.add_user);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        userListAdapter = new UserListAdapter(getApplicationContext(), medicalDB);
        userListAdapter.setUserData(userList);
        recyclerView.setAdapter(userListAdapter);

        addUserButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAddUserDialog().show();
            }
        });
    }

    private AlertDialog showAddUserDialog() {
        View dialogLayout = View.inflate(this, R.layout.add_user_dialog, null);
        EditText userNameEditText = dialogLayout.findViewById(R.id.add_username);

        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this);

        dialogBuilder.setPositiveButton("ADD", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                medicalDB.addUser(medicalDB.getWritableDatabase(), userNameEditText.getText().toString().trim());
                Cursor userList = medicalDB.getUserList(medicalDB.getWritableDatabase());
                userListAdapter.setUserData(userList);
                userListAdapter.notifyDataSetChanged();
                recyclerView.setAdapter(userListAdapter);
                emptyView.setText("");
            }
        });

        dialogBuilder.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        dialogBuilder.setView(dialogLayout);
        return dialogBuilder.create();
    }

    @Override
    protected void onResume() {
        super.onResume();
        userListAdapter.setUserData(medicalDB.getUserList(medicalDB.getWritableDatabase()));
        userListAdapter.notifyDataSetChanged();
        recyclerView.setAdapter(userListAdapter);
    }
}
