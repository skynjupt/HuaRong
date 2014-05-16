package com.skyhonney.huarongroad;

import com.skyhonney.huarongroad.common.CommData;
import com.skyhonney.huarongroad.common.Constants;
import com.skyhonney.huarongroad.util.CommUtil;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.SeekBar;

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
		mGameImageButton.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.putExtra("index", 0);
				intent.setClass(MainActivity.this, SelectGameActivity.class);
				startActivity(intent);
			}
		});
		mAboutImageButton = (ImageButton) findViewById(R.id.aboutBtn);
		mAboutImageButton.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.setClass(MainActivity.this, AboutActivity.class);
				startActivity(intent);
			}
		});
		mHelpImageButton = (ImageButton) findViewById(R.id.helpBtn);
		mHelpImageButton.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.setClass(MainActivity.this, HelpActivity.class);
				startActivity(intent);
			}
		});
		CommData.brightness = CommUtil.getScreenBrightness(this) / 255.0F;
		SeekBar seekBar = (SeekBar) findViewById(R.id.brightnessSeekBar);
		seekBar.setMax(255);
		seekBar.setProgress((int) (255.0F * CommData.brightness));
		seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
			}

			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
				CommUtil.setBrightness(MainActivity.this,
						seekBar.getProgress() / 255.0F);
			}

			@Override
			public void onProgressChanged(SeekBar seekBar, int progress,
					boolean fromUser) {
				CommUtil.setBrightness(MainActivity.this,
						seekBar.getProgress() / 255.0F);
			}
		});
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_BACK) {
			new AlertDialog.Builder(this)
					.setTitle(R.string.exit)
					.setIcon(null)
					.setMessage(R.string.are_you_sure_exit)
					.setPositiveButton(R.string.ok,
							new DialogInterface.OnClickListener() {

								@Override
								public void onClick(DialogInterface dialog,
										int which) {
									finish();
								}
							})
					.setPositiveButton(R.string.cancel,
							new DialogInterface.OnClickListener() {

								@Override
								public void onClick(DialogInterface dialog,
										int which) {

								}
							}).show();
			return true;
		}
		return super.onKeyDown(keyCode, event);
	}
}
