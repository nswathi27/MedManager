package com.Project.medmanager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;
import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    public static BreakIterator empty_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button signBTN = (Button)findViewById(R.id.signBTN);
        signBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,UserActivity.class);
                startActivity(i);
            }
        });
    }
}
