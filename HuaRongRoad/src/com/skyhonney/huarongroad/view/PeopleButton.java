package com.skyhonney.huarongroad.view;

import android.R.color;
import android.content.Context;
import android.graphics.Canvas;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.skyhonney.huarongroad.level.PepoleType;

public class PeopleButton extends ImageButton {

	private Context mContext;
	private int peopleType;
	private boolean isFocus = false;

	public PeopleButton(Context context, int peopleType) {
		super(context);
		this.mContext = context;
		this.peopleType = peopleType;
		setBackgroundColor(color.background_dark);
		setPadding(0, 0, 0, 0);
		setScaleType(ImageView.ScaleType.FIT_XY);
	}

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		setImageDrawable(PepoleType.getDwByPeopleType(peopleType, isFocus,
				mContext));
	}

	public boolean isFocus() {
		return isFocus;
	}

	public void setFocus(boolean isFocus) {
		this.isFocus = isFocus;
	}

	public int getPeopleType() {
		return peopleType;
	}

}
