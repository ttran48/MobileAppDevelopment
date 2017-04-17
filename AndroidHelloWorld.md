# Android Hello World

The 2 files that I am building are included in this repository. Note that my included files will not work if
performing the copy/paste function. The file paths must be changed to rectify the errors.
- MainActivity.java
- activity_main.xml

## Technology Requirements
- IDE: Android Studio
- Driver for Windows 

https://developer.android.com/studio/run/win-usb.html

This is complete instruction of installing java, eclipse and android SDK and ADT 
(Android Development Tool) plugin for eclipse.

https://www.youtube.com/watch?v=TKjm-c_irTk

Watch the Youtube video and follow the instruction till minute 20. (Not more)
The video is old so is may be missing some APIs. These will be identified and installed during the
setup process.

## Setting Up the Workspace
- Create a folder in your selected location named workspace
- Go back to the Worksspace Launcher and browse to your new folder. Click OK.
- Click Open Preferences on the dialog window and browse to the sdk folder. 
This is usually located in the .anroid folder. Click Apply.
- Click OK to close the dialog window. Your workspace is now ready to 
begin Android development

## Creating the Project
```
1) From the Eclipse's main menu choose
File > New > Android Application Project
```
![appimg1](https://cloud.githubusercontent.com/assets/25268970/25066558/fbb82a84-21f6-11e7-8f48-b00c727bd76f.jpg)

```
2) The application name is displayed on the phone's screen as the name of the app. 

Note: There are no spaces allowed in the project name and package name. Additionally, 
in place of "example" you should put your company name. This identifier will be 
used in the Play Store to link your apps to the services they use and connect all your 
apps.
```

```
3) Next, click the Minimum Required SDK drop-down.

For the requirements of my assignment, I selected the following:
API 19: Android 4.4(KitKat)
API 20: Android 4.4W(KitKat Wear)
API 21: Android 5.0(Lollipop)

Note: Each release of the android OS is associated with an SDK so that programmers 
can write code for that platform. The minimum required SDK determines what phones 
and other Android devices will be able to install your app. The recommended minimum 
is the default: Froyo API 8. An app that has this minimum will be accessbile to 
more than 90% of the devices "in the wild."

```

```
4) Select the Empty Activity for the mobile app. Select Next then select Finish in
the next window.
```
![appimg2](https://cloud.githubusercontent.com/assets/25268970/25066674/25b9ddba-21fb-11e7-8c64-e76a13ac7fc8.jpg)

```
Side Notes: If you are providing an icon for your app, you will have to supply 
several sizes of the same picture. This is because Android apps can run on any Android 
device that meets the apps SDK requirements. However, these devices can have different
screen resolutions and different screen sizes. By supplying different icons sizes, the
app will pick the one that best matches the device it is running on.

Suggested sizes for app icons are 32x32, 48x48, 72x72, 96x96 and 144x144 pixels
```

## Coding the Interface

```
1) Double click the activity_main.xml file
.../app/src/main/res/layout/activity_main.xml

2) Change text size by selecting the Design Tab then selecting Textview under 
ConstraintLayoutand a Properties panel will populate on the right side of the 
window

3) Change the textSize to 24sp
```

![appimg3](https://cloud.githubusercontent.com/assets/25268970/25068476/36367f9e-2233-11e7-9eb8-a6fd5f198b10.jpg)

```
4) Add another TextView Widget to the User Interface by selecting the widget 
then dragging and dropping it anywhere
```
![appimg4](https://cloud.githubusercontent.com/assets/25268970/25068527/6b38de5c-2234-11e7-9409-950cf925de5e.jpg)

```
5) Add an ID to the first <TextView in the activity_main.xml
android:id="@+id/textViewDisplay"

Should look like this:

    <TextView
        android:id="@+id/textViewDisplay"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Hello World!"
        android:textSize="24sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent" />
```

```
6) Change the text of the new TextView widget from "TextView" to "Name: "
Then change the layout of both widgets to look like the image below. By
selecting the desired widget and dragging it to the relative location of choice

The precise positioning is not important
```

![appimg5](https://cloud.githubusercontent.com/assets/25268970/25068628/c9db589c-2237-11e7-8906-4068460675cd.jpg)

```
7) Add the EditText Element to activity_main.xml
Note: This element may not be located in the Widgets. If it is not, copy the following
code into your xml file and place it under the <TextView block

<EditText
    android:id="@+id/et_simple"
    android:layout_height="wrap_content"
    android:layout_width="match_parent">
    android:ems="10"
    android:inputType="text"
</EditText>

Change the default id to "@+id/editTextName"
```

```
8) Locate widgets once again. Drag and drop the button element onto the UI.
Change the ID to "@+id/buttonDisplay"
Change the text attribute from "button" to "Display"
```

## Coding App Behavior

```
Navigate to the MainActivity.java file and Copy/Paste the following code

/* Identifies this class as belonging to the cortana package */
package com.example.tomtran.cortana;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/* MainActivity is a subclass of AppCompatAcitvity */
public class MainActivity extends AppCompatActivity {

    @Override /* this annotation tells the compiler that the
    following method is to be used in place of the super class's method of the same name */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /* this code tells the activity to use the activity_main.xml files as the layout */
        setContentView(R.layout.activity_main);
        initDisplayButton();
    }
    private void initDisplayButton() {
        Button displayButton = (Button) findViewById(R.id.buttonDisplay);
        displayButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                EditText editName = (EditText) findViewById(R.id.editTextName);
                TextView textDisplay = (TextView) findViewById(R.id.textViewDisplay);
                String nameToDisplay = editName.getText().toString();
                textDisplay.setText("Hello " + nameToDisplay);
            }
        });
    }
}
```

## Issues
```
1 - No <RelativeLayout in the xml file means that you will not be able to hold elements in place,
be sure that this is included in the xml
2 - Hover over the red keywords and press Alt+Enter; then select the appropriate options that
appear to correct the errors.
```
