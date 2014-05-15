package com.skyhonney.huarongroad;

import java.util.HashMap;
import java.util.Map;

import com.skyhonney.huarongroad.view.PeopleButton;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsoluteLayout;

@SuppressWarnings("deprecation")
public class HuaRongRoadActivity extends Activity{
	private int offsetH = 40;
	private int offsetTop = 100;
	private int bgBtnWidth = 80;
	private AbsoluteLayout mainLayout;
	private Map<Integer, PeopleButton> peopleBtnMap;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mainLayout = new AbsoluteLayout(this);
		peopleBtnMap = new HashMap<Integer, PeopleButton>();
	}
	
	public PepoleBtnTouchListener createPepoleBtnTouchListener() {
		return new PepoleBtnTouchListener();
	}

	public int getOffsetH() {
		return offsetH;
	}

	public int getOffsetTop() {
		return offsetTop;
	}

	public int getBgBtnWidth() {
		return bgBtnWidth;
	}
	
	public AbsoluteLayout getMainLayout() {
		return mainLayout;
	}
	
	public Map<Integer, PeopleButton> getPeopleBtnMap() {
		return peopleBtnMap;
	}



	class PepoleBtnTouchListener implements View.OnTouchListener {

		@Override
		public boolean onTouch(View v, MotionEvent event) {
			return false;
		}

	}
	
	
}
