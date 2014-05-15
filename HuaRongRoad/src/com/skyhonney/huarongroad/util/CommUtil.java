package com.skyhonney.huarongroad.util;

import com.skyhonney.huarongroad.common.CommData;

import android.app.Activity;
import android.content.ContentResolver;
import android.provider.Settings;
import android.provider.Settings.SettingNotFoundException;
import android.view.WindowManager;

public class CommUtil {
	public static int getScreenBrightness(Activity context) {
		
		int bright = 0;
		
		try {
			ContentResolver contentResolver = context.getContentResolver();
			bright = Settings.System.getInt(contentResolver, "screen_brightness");
			
		} catch (SettingNotFoundException e) {
			e.printStackTrace();
			return bright;
		}
		
		return bright;
	}
	
	public static void setBrightness(Activity a, float bright) {
		if(bright < 0.1F) {
			bright = 0.1F;
		}
		
		CommData.brightness = bright;
		WindowManager.LayoutParams params = a.getWindow().getAttributes();
		params.screenBrightness = bright;
		a.getWindow().setAttributes(params);
		
	}
}
