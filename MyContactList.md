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
   android:layout_height="wrap_content">
```
### Step 5
Locate the color.xml file, open and add the following code into the resource block
```
<color name = "toolbar_background">#bebebe</color>
 ```
### Step 6
Return to the Toolbar XML in activity_contact.xml and modify/remove material as needed. The following code should look similar to below:

```
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="com.example.tomtran.mycontactlist.ContactActivity">

    <RelativeLayout
        android:id="@+id/toolbar"
        android:background="@color/toolbar_background"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_alignParentLeft="true"
        android:layout_alignParentTop="true" >

        <ToggleButton
            android:id="@+id/toggleButtonEdit"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_alignParentLeft="true"
            android:layout_marginLeft="20dp"
            android:text="ToggleButton" />

        <Button
            android:id="@+id/buttonSave"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_alignParentRight="true"
            android:layout_marginRight="20dp"
            android:text="Save" />


    </RelativeLayout>

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
![img12](https://cloud.githubusercontent.com/assets/25268970/25145447/3c004622-243f-11e7-981c-d8054aadecd5.jpg)

## Create the Data Entry Form
### Step 1
In the activity_contact.xml, switch to the Design Tab and locate the Containers option in the Palette. Select ScrollView, drag and drop between the toolbar RelativeLayout and Navbar RelativeLayout. Like so:

![img14](https://cloud.githubusercontent.com/assets/25268970/25146004/7f456c18-2440-11e7-815f-54f1629e2465.jpg)

### Step 2
Switch to the Text Tab and modify the default code to reflect the code below:
```
    <ScrollView
        android:id="@+id/scrollView1"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_alignParentLeft="true"
        android:layout_below="@+id/toolbar"
        android:layout_above="@+id/navbar" >

        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent" >
        </RelativeLayout>
    </ScrollView>
```
### Step 3
Add in a TextView element into the ScrollView element.

```
    <ScrollView
        android:id="@+id/scrollView1"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_alignParentLeft="true"
        android:layout_below="@+id/toolbar"
        android:layout_above="@+id/navbar" >
        
        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent" >
            
            <TextView
                android:id="@+id/textContact"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_alignParentLeft="true"
                android:layout_marginLeft="10dp"
                android:layout_marginTop="5dp"
                android:text="Contact:"
                android:textAppearance="?android:attr/textAppearanceSmall" />
         </RelativeLayout>
    </ScrollView>
 ```
### Step 4
Add in an EditText element into the ScrollView element. Modify previous code in the activity_contact.xml to reflect the following:

```
<ScrollView
        android:id="@+id/scrollView1"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_alignParentLeft="true"
        android:layout_below="@+id/toolbar"
        android:layout_above="@+id/navbar" >
        
        <TextView
                android:id="@+id/textContact"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_alignParentLeft="true"
                android:layout_marginLeft="10dp"
                android:layout_marginTop="5dp"
                android:text="Contact:"
                android:textAppearance="?android:attr/textAppearanceSmall" />

        <EditText
            android:id="@+id/editName"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_alignParentLeft="true"
            android:layout_marginLeft="10dp"
            android:layout_below="@+id/textContact"
        android:ems="14"
        android:imeOptions="actionNext"
        android:inputType="textCapWords" >    
        
        <requestFocus />    
        </EditText>

        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent" >
        </RelativeLayout>
</ScrollView>
  ```
### Step 4
Add in a TextView element under the EditText element with the following material:

```
<TextView
    android:id="@+id/textAddress"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:layout_alignParentLeft="true"
    android:layout_below="@+id/editName"
    android:layout_marginLeft="10dp"
    android:layout_marginTop="15dp"
    android:text="Address:"
    android:textAppearance="?android:attr/textAppearanceSmall" />
```

### Step 5
Next copy the previous EditText element and paste it after the TextView element. Change the new EditText element to reflect the following code below

```
        <EditText
            android:id="@+id/editAddress"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_alignParentLeft="true"
            android:layout_marginLeft="10dp"
            android:layout_below="@+id/textAddress"
            android:ems="14"
            android:imeOptions="actionNext"
            android:inputType="textCapWords" >
            
        </EditText>
```
Your Design View should look like below thus far.

![img15](https://cloud.githubusercontent.com/assets/25268970/25147985/5bdd66de-2447-11e7-8844-2dd77015ca0f.jpg)

### Step 6
Create 3 more EditText elements for City, State and Zip. Add these 3 elements under the previous EditText element that was created for Address.

```
            <EditText
                android:id="@+id/editCity"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_alignParentLeft="true"
                android:layout_marginLeft="10dp"
                android:layout_below="@+id/editAddress"
                android:ems="8"
                android:imeOptions="actionNext"
                android:nextFocusDown="@+id/editState"
                android:inputType="textCapWords" >

            </EditText>

            <EditText
                android:id="@+id/editState"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_toRightOf="@+id/editCity"
                android:layout_alignBottom="@+id/editCity"
                android:ems="2"
                android:maxLength="2"
                android:imeOptions="actionNext"
                android:nextFocusDown="@+id/editZipcode"
                android:inputType="textCapCharacters" >

            </EditText>

            <EditText
                android:id="@+id/editZipcode"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_toRightOf="@+id/editState"
                android:layout_alignBottom="@+id/editState"
                android:ems="4"
                android:maxLength="5"
                android:imeOptions="actionNext"
                android:nextFocusDown="@+id/editHome"
                android:inputType="numberSigned" >

            </EditText>
```

### Step 7
Next create a TextView and EditText element for each field; Home Phone and Cell Phone. This should be a total of 4 blocks of code for each field. Find the code below and implement it under the last created EditText element which should have been Zip code.

```
            <TextView
                android:id="@+id/textHome"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_alignParentLeft="true"
                android:layout_marginLeft="10dp"
                android:layout_marginTop="15dp"
                android:layout_below="@+id/editCity"
                android:text="Home Phone:"
                android:textAppearance="?android:attr/textAppearanceSmall" />

            <EditText
                android:id="@+id/editHome"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_alignParentLeft="true"
                android:layout_marginLeft="10dp"
                android:layout_below="@+id/textHome"
                android:ems="7"
                android:maxLength="14"
                android:imeOptions="actionNext"
                android:nextFocusDown="@+id/editCell"
                android:inputType="phone" >

            </EditText>

            <TextView
                android:id="@+id/textCell"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_alignBottom="@+id/textHome"
                android:layout_alignLeft="@+id/editCell"
                android:text="Cell Phone:"
                android:textAppearance="?android:attr/textAppearanceSmall" />

            <EditText
                android:id="@+id/editCell"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_toRightOf="@+id/editHome"
                android:layout_alignBottom="@+id/editHome"
                android:ems="7"
                android:maxLength="14"
                android:imeOptions="actionNext"
                android:nextFocusDown="@+id/editEMail"
                android:inputType="phone" >

            </EditText>
            
```
### Step 8
Then create another additional 3 elements for Birthday Text, Date Text and a Button to change the date. Implement the code under the last created element which should have been an EditText element for the Cell Phone field

```
            <TextView
                android:id="@+id/textBday"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_alignParentLeft="true"
                android:layout_marginLeft="10dp"
                android:layout_marginTop="15dp"
                android:text="Birthday:"
                android:layout_below="@+id/editEMail"
                android:paddingBottom="25dp"
                android:textAppearance="?android:attr/textAppearanceSmall" />
            
            <TextView
                android:id="@+id/textBirthday"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_marginLeft="10dp"
                android:text="01/01/1970"
                android:layout_toRightOf="@+id/textBday"
                android:layout_alignBottom="@+id/textBday"
                android:paddingBottom="25dp"
                android:textAppearance="?android:attr/textAppearanceSmall" />
            
            <Button
                android:id="@+id/btnBirthday"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_alignParentRight="true"
                android:layout_marginRight="10dp"
                android:layout_alignBaseline="@+id/textBirthday"
                android:text="Change"/>
```

![img16](https://cloud.githubusercontent.com/assets/25268970/25150584/72a501ac-2450-11e7-8f2d-0c0fcf2d30c7.jpg)
