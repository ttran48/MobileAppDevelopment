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

<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    ...
    ...

Then create another relative layout inside of the root relative layout by navigating to the Design tab selecting Layout in the Palette.
Drag and drop the Relative Layout into the Component Tree under the root Relative Layout as shown

![img6](https://cloud.githubusercontent.com/assets/25268970/25109020/eacde6c0-23a7-11e7-8f54-0cbf82771c05.jpg)
