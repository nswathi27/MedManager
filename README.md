# App Name : MedManager
> ### An Android application that displays a person's medication schedules or timings on a single device. Reminders that include the quantity of the medicine, name of the medicine and all of its other details.

* activity_main - It is the login page where user can enter their credentails and also has a signup button if user is a new user.
* activity_user-It adds name of the user by clicking add button 
* add_user_dialog – Used for adding new user to the application.
* user_card – It displays the list of all the users.
* add_med_dialog -It takes the medicine details such as medicine name, quantity, reminder time and days.
* activity_medicine – It shows the medicine list taken by the user.


### Features
 * Add new medicine
 * Update medicine
 * Delete medicine
 * Set reminders for taking medicine
 * Features : Offline Advantage : As the Application works with an offline database which is stored in the device, no internet connection is required, offline storage      of database helps in faster read write operations.

---
### Tools Used :
#### Frontend :
  * XML
#### Backend :
  * Android Studio IDE
  * Java 
  * SQLite database ( SQLiteOpenHelper )


#### Team Members :
 * Vineetha Aredla (S554808)
 * Swathi Nuli (S555089)
 * Amani Chennu (S549242)
 * Swarnalatha Yadla (S556383)

#### Test Credentials :
> Username : Amani <br>
> Password : amani@123

# MedManager

## APK Information

### APK name: com.example.medmanager
### APK size: 4.07 MB
### Minimum Android version: Android 4.1 (Jelly Bean)
### Target Android version: Android 12.0 (S)

> App is compatible with devices running Android 4.1 (Jelly Bean) or higher, which is equivalent to API level 16.
> App is optimized for devices running Android 12.0 (S), which is equivalent to API level 32.

---
### Sequence Information :
 * Open the app and enter your name and email address.
 * After successfully authenticating the user, the user is redirected to Add Medicine page where a new user can be added.
 * Next, by clicking the user icon it redirects to add medicine page where there exists (+) button.
 * Clicking the (+) button, opens a dialog/prompt box which contains input fields for entering the medicine name, quantity. User can select time and also has toggle       button for repeating the reminder on the selected days.
 * The reminder after adding can be enabled/disabled using the toggle button. When wenabled by the user, will show a toast message mentioning the reminder is set.

