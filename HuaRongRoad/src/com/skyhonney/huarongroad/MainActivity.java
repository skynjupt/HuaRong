package com.skyhonney.huarongroad;

import com.skyhonney.huarongroad.common.Constants;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ImageButton;

public class MainActivity extends Activity {
	
	private ImageButton mGameImageButton;
	private ImageButton mAboutImageButton;
	private ImageButton mHelpImageButton;
	private SharedPreferences mSettings;

	@SuppressWarnings("deprecation")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		Constants.SCREEN_W = getWindowManager().getDefaultDisplay().getWidth();
		Constants.SCREEN_H = getWindowManager().getDefaultDisplay().getHeight();
		
		mGameImageButton = (ImageButton) findViewById(R.id.newGameBtn);
		mAboutImageButton = (ImageButton) findViewById(R.id.aboutBtn);
		mHelpImageButton = (ImageButton) findViewById(R.id.helpBtn);
		
	}



}
