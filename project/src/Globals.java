// This string is autogenerated by ChangeAppSettings.sh, do not change spaces amount anywhere
package com.sourceforge.sc2;

import android.app.Activity;
import android.content.Context;

class Globals {
	public static String ApplicationName = "Ur-QuanMasters";

	// Should be zip file
	public static String DataDownloadUrl = "Game data is 14 Mb|https://sites.google.com/site/xpelyax/Home/sc2-data.zip?attredirects=0%26d=1|http://sitesproxy.goapk.com/site/xpelyax/Home/sc2-data.zip^3DO remixed music (19 Mb)|:addons/3domusic/3domusic.zip:https://sites.google.com/site/xpelyax/Home/3domusic.zip?attredirects=0%26d=1|:addons/3domusic/3domusic.zip:http://sitesproxy.goapk.com/site/xpelyax/Home/3domusic.zip^UQM music remix pack 1 (50 Mb)|:addons/remix/uqm-remix-pack1.zip:http://sourceforge.net/projects/sc2/files/UQM%20Remix%20Packs/UQM%20Remix%20Pack%201/uqm-remix-pack1.zip/download^UQM music remix pack 2 (60 Mb)|:addons/remix/uqm-remix-pack2.zip:http://sourceforge.net/projects/sc2/files/UQM%20Remix%20Packs/UQM%20Remix%20Pack%202/uqm-remix-pack2.zip/download^UQM music remix pack 3 (40 Mb)|:addons/remix/uqm-remix-pack3.zip:http://sourceforge.net/projects/sc2/files/UQM%20Remix%20Packs/UQM%20Remix%20Pack%203/uqm-remix-pack3.zip/download";

	// Set this value to true if you're planning to render 3D using OpenGL - it eats some GFX resources, so disabled for 2D
	public static boolean NeedDepthBuffer = false;

	// Set this value to true if you're planning to render 3D using OpenGL - it eats some GFX resources, so disabled for 2D
	public static boolean HorizontalOrientation = true;
	
	// Readme text to be shown on download page
	public static String ReadmeText = "^You may press \"Home\" now - the data will be downloaded in background".replace("^","\n");
	
	public static boolean AppUsesMouse = false;

	public static boolean AppNeedsArrowKeys = true;

	public static boolean AppUsesJoystick = false;
	
	public static boolean AppUsesMultitouch = false;

	public static int AppTouchscreenKeyboardKeysAmount = 2;

	// Phone-specific config
	// It will download app data to /sdcard/alienblaster if set to true,
	// otherwise it will download it to /data/data/de.schwardtnet.alienblaster/files
	public static boolean DownloadToSdcard = false;
	public static boolean PhoneHasTrackball = false;
	public static boolean PhoneHasArrowKeys = false;
	public static boolean UseAccelerometerAsArrowKeys = false;
	public static boolean UseTouchscreenKeyboard = false;
	public static int TouchscreenKeyboardSize = 0;
	public static int AccelerometerSensitivity = 0;
	public static int TrackballDampening = 0;
	public static int AudioBufferConfig = 0;
	public static boolean OptionalDataDownload[] = null;
}

class LoadLibrary {
	public LoadLibrary() { System.loadLibrary("sdl"); System.loadLibrary("sdl_image"); };
}
