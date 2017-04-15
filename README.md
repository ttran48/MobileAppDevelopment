# MobileAppDevelopment

## Technology Requirements
- IDE: Eclipse

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
