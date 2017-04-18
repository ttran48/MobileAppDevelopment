# MyContactList

## Create Project
### Step 1
![img1](https://cloud.githubusercontent.com/assets/25268970/25102495/b2d6343c-2386-11e7-868b-e126679641cb.jpg)
### Step 2
![img2](https://cloud.githubusercontent.com/assets/25268970/25105107/4aa59c08-2391-11e7-8f46-ca237e212e27.jpg)
## Step 3
![img3](https://cloud.githubusercontent.com/assets/25268970/25105106/4aa2af2a-2391-11e7-8be1-7a7e6978bd6d.jpg)

### Step 4 
Select Next. Change the name of the activity to ContactActivity in the Blank Activity window. Click Finish.

### Step 5 
Create three more blank acitvities.
    Right-click com.example.tomtran.mycontactlist
    Select New > Activity > Empty Activity
    
![img4](https://cloud.githubusercontent.com/assets/25268970/25106263/921df968-2396-11e7-87a3-398dc3985ed9.jpg)

### Step 6
Rename the Activity Name to ContactListActivity and Layout Name to activity_contact_list.
Then create 2 more blank activities and name them ContactMapActivity and ContactSettingsActivities

## Create the Navigation Bar
### Step 1
Add images to the project. Right-click on the drawable-hdpi folder in the res folder and 
select New > Image Asset then select Asset Type: Image

### Step 2
Select the path of where is the image is stored, rename the image respectively to its name and select next then finish. Repeat this step for the other 2 images. The images that need to be imported are ContactListIcon, SettingsIcon, and MapsIcon

![img5](https://cloud.githubusercontent.com/assets/25268970/25108646/5c2125a6-23a5-11e7-971c-8766778f300d.jpg)

### Step 3
Open the activity_contact.xml. Select the Hello World on the UI and delete it. Change the constraint layout to a 
relative layout if needed by in the text tab. Below is a sample:
```
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
xmlns:app="http://schemas.android.com/apk/res-auto"
xmlns:tools="http://schemas.android.com/tools"
    ...
    ...
```
Then create another relative layout inside of the root relative layout by navigating to the Design tab selecting Layout in the Palette.
Drag and drop the Relative Layout into the Component Tree under the root Relative Layout as shown

![img6](https://cloud.githubusercontent.com/assets/25268970/25109020/eacde6c0-23a7-11e7-8f54-0cbf82771c05.jpg)

### Step 4
In the same xml file, navigate to the Palette in the Design Tab. Select Images in the Palette and then drag and drop ImageButton under the second Relative Layout in the Component Tree. A window will populate to allow the selection of an image. Select the ContactListIcon and OK.

![img7](https://cloud.githubusercontent.com/assets/25268970/25109548/63dbf824-23ab-11e7-9bdc-c320f7ddc445.jpg)

### Step 5
Switch to the activity_contact.xml. Locate the child Relative Layout of the root Relative Layout.
Change the content of android:layout_width to "fill_parent"
```
<RelativeLayout
        android:layout_width="fill_parent"
        android:layout_height="wrap-content"
        android:layout_alignParentStart="true"
        android:id="@+id/relativeLayout">
```
### Step 6
Navigate back to the Design Tab, select ImageButton from the Palette and drag it under the previous button in the Component Tree. Again, a window will populate to select an image. Select mapicon. Repeat the process for the settingsicon.

![img8](https://cloud.githubusercontent.com/assets/25268970/25110175/e7cf2472-23af-11e7-8161-216292f8df33.jpg)

## Create a Color Resource
### Step 1
Navigate to the res > values folder and right-click it.
Select New > XML > Values XML File

![img9](https://cloud.githubusercontent.com/assets/25268970/25114842/b20d1072-23cf-11e7-846d-abafb6d265ba.jpg)

A window will pop-up. Type color as the Value File Name and select finish.

### Step 2
Locate the color.xml file and insert <color name = "navbar_background">#1a1a48</color> in between resources tags.
Like so:
```
<resources>
    <color name = "navbar_background">#1a1a48</color>
</resources>
```

### Step 3
Return to the activity_contact.xml and modify/remove the content in the Text tab to reflect the content below. Everything should be similar except for file paths i.e. com.example.tomtran.mycontactlist.ContactActivity
```
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="com.example.tomtran.mycontactlist.ContactActivity">

    <RelativeLayout
        android:id="@+id/navbar"
        android:background="@color/navbar_background"
        android:layout_width="fill_parent"
        android:layout_height="wrap_content"
        android:layout_alignParentBottom="true" >

        <ImageButton
            android:id="@+id/imageButtonList"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_centerVertical="true"
            android:layout_toLeftOf="@+id/imageButtonMap"
            android:layout_marginRight="20dp"
            android:src="@mipmap/contactlisticon" />
        <ImageButton
            android:id="@+id/imageButtonMap"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_centerVertical="true"
            android:layout_centerHorizontal="true"
            android:src="@mipmap/mapicon" />

        <ImageButton
            android:id="@+id/imageButtonSettings"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_centerVertical="true"
            android:layout_marginLeft="20dp"
            android:layout_toRightOf="@+id/imageButtonMap"
            android:src="@mipmap/settingsicon" />

    </RelativeLayout>

</RelativeLayout>
```
This is what your product should look like thus far:
![img10](https://cloud.githubusercontent.com/assets/25268970/25139071/377684c8-242a-11e7-94e7-991af87a8554.jpg)

### Step 4
Next copy the complete code from step 3 and implement this code into the following xml files.
- activity_contact_list.xml
- activity_contact_map.xml
- activity_contact_settings.xml

## Create the Toolbar
### Step 1
Return to the activity_contact.xml and select the Design Tab. Drag and drop a RelativeLayout under the root RelativeLayout in the Component tree.
<p>Be sure to not drag and drop the RelativeLayout into the navigation bar. If this mistake was made, simple just drag it out of the child relative layout</p>

### Step 2
Then locate the Toggle Button in Palette > Widgets. Drag and drop this element into the new Relativelayout in the component tree

![img11](https://cloud.githubusercontent.com/assets/25268970/25144275/402dc156-243b-11e7-8e1a-db4a1b359007.jpg)

### Step 3
Drag another regular button into the same child relative layout
 
### Step 4
Navigate to the Text tab and ensure that the layout width and height for that child Relativelayout is set to match_parent
```
   android:layout_width="match_parent"
   android:layout_height="match_parent">
```
