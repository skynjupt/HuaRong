package com.skyhonney.huarongroad.level;

import android.content.Context;
import android.graphics.drawable.Drawable;

import com.skyhonney.huarongroad.R;

public class PepoleType {
	public static final int CAO_CAO = 0;
	public static final int ZHANG_FEI_H = 1;
	public static final int ZHANG_FEI_V = 2;
	public static final int GUAN_YU_H = 3;
	public static final int GUAN_YU_V = 4;
	public static final int ZHAO_YUN_H = 5;
	public static final int ZHAO_YUN_V = 6;
	public static final int MA_CHAO_H = 7;
	public static final int MA_CHAO_V = 8;
	public static final int HUANG_ZHONG_H = 9;
	public static final int HUANG_ZHONG_V = 10;
	public static final int SOLDIER1 = 11;
	public static final int SOLDIER2 = 12;
	public static final int SOLDIER3 = 13;
	public static final int SOLDIER4 = 14;

	public static Drawable getDwByPeopleType(int peopleType, boolean isFocus,
			Context context) {
		Drawable drawable = null;

		if (isFocus) {
			switch (peopleType) {
			case CAO_CAO:
				drawable = context.getResources().getDrawable(
						R.drawable.caocao_focus);
				break;
			case ZHANG_FEI_H:
				drawable = context.getResources().getDrawable(
						R.drawable.zhang_fei_h_focus);
				break;
			case ZHANG_FEI_V:
				drawable = context.getResources().getDrawable(
						R.drawable.zhang_fei_v_focus);
				break;
			case GUAN_YU_H:
				drawable = context.getResources().getDrawable(
						R.drawable.guan_yu_h_focus);
				break;
			case GUAN_YU_V:
				drawable = context.getResources().getDrawable(
						R.drawable.guan_yu_v_focus);
				break;
			case ZHAO_YUN_H:
				drawable = context.getResources().getDrawable(
						R.drawable.zhao_yun_h_focus);
				break;
			case ZHAO_YUN_V:
				drawable = context.getResources().getDrawable(
						R.drawable.zhao_yun_v_focus);
				break;				
			case MA_CHAO_H:
				drawable = context.getResources().getDrawable(
						R.drawable.ma_chao_h_focus);
				break;
			case MA_CHAO_V:
				drawable = context.getResources().getDrawable(
						R.drawable.ma_chao_v_focus);
				break;
			case HUANG_ZHONG_H:
				drawable = context.getResources().getDrawable(
						R.drawable.huang_zhong_h_focus);
				break;
			case HUANG_ZHONG_V:
				drawable = context.getResources().getDrawable(
						R.drawable.huang_zhong_v_focus);
				break;
			case SOLDIER1:
				drawable = context.getResources().getDrawable(
						R.drawable.soldier_focus);
				break;
			case SOLDIER2:
				drawable = context.getResources().getDrawable(
						R.drawable.soldier_focus);
				break;
			case SOLDIER3:
				drawable = context.getResources().getDrawable(
						R.drawable.soldier_focus);
				break;
			case SOLDIER4:
				drawable = context.getResources().getDrawable(
						R.drawable.soldier_focus);
				break;
			default:
				break;
			}

		} else {
			switch (peopleType) {
			case CAO_CAO:
				drawable = context.getResources()
						.getDrawable(R.drawable.caocao);
				break;
			case ZHANG_FEI_H:
				drawable = context.getResources().getDrawable(
						R.drawable.zhang_fei_h);
				break;
			case ZHANG_FEI_V:
				drawable = context.getResources().getDrawable(
						R.drawable.zhang_fei_v);
				break;
			case GUAN_YU_H:
				drawable = context.getResources().getDrawable(
						R.drawable.guan_yu_h);
				break;
			case GUAN_YU_V:
				drawable = context.getResources().getDrawable(
						R.drawable.guan_yu_v);
				break;
			case ZHAO_YUN_H:
				drawable = context.getResources().getDrawable(
						R.drawable.zhao_yun_h);
				break;
			case ZHAO_YUN_V:
				drawable = context.getResources().getDrawable(
						R.drawable.zhao_yun_v);
				break;					
			case MA_CHAO_H:
				drawable = context.getResources().getDrawable(
						R.drawable.ma_chao_h);
				break;
			case MA_CHAO_V:
				drawable = context.getResources().getDrawable(
						R.drawable.ma_chao_v);
				break;
			case HUANG_ZHONG_H:
				drawable = context.getResources().getDrawable(
						R.drawable.huang_zhong_h);
				break;
			case HUANG_ZHONG_V:
				drawable = context.getResources().getDrawable(
						R.drawable.huang_zhong_v);
				break;
			case SOLDIER1:
				drawable = context.getResources().getDrawable(
						R.drawable.soldier);
				break;
			case SOLDIER2:
				drawable = context.getResources().getDrawable(
						R.drawable.soldier);
				break;
			case SOLDIER3:
				drawable = context.getResources().getDrawable(
						R.drawable.soldier);
				break;
			case SOLDIER4:
				drawable = context.getResources().getDrawable(
						R.drawable.soldier);
				break;
			default:
				break;
			}

		}

		return drawable;
	}
	
	public static String int2Str(int type) {
		String str = "cao_cao";
		
		switch (type) {
		case CAO_CAO:
			str = "cao_cao";
			break;
		case ZHANG_FEI_H:
			str = "zhang_fei_h";
			break;
		case ZHANG_FEI_V:
			str = "zhang_fei_v";
			break;
		case GUAN_YU_H:
			str = "guan_yu_h";
			break;
		case GUAN_YU_V:
			str = "guan_yu_v";
			break;
		case ZHAO_YUN_H:
			str = "zhao_yun_h";
			break;
		case ZHAO_YUN_V:
			str = "zhao_yun_v";
			break;
		case MA_CHAO_H:
			str = "ma_chao_h";
			break;
		case MA_CHAO_V:
			str = "ma_chao_v";
			break;
		case HUANG_ZHONG_H:
			str = "huang_zhong_h";
			break;
		case HUANG_ZHONG_V:
			str = "huang_zhong_v";
			break;
		case SOLDIER1:
			str = "soldier1";
			break;
		case SOLDIER2:
			str = "soldier2";
			break;
		case SOLDIER3:
			str = "soldier3";
			break;
		case SOLDIER4:
			str = "soldier4";
			break;
		default:
			break;
		}
		
		return str;
	}
	
	 public static int str2Int(String typeStr) {
		 int type = CAO_CAO;
		 
		 if(typeStr == null) {
			 return type;
		 }
		 String str = typeStr.trim();
		 
		 if("cao_cao".equals(str)) {
			 type = CAO_CAO;
		 } else if("zhang_fei_h".equals(str)) {
			 type = ZHANG_FEI_H;
		 } else if("zhang_fei_v".equals(str)) {
			 type = ZHANG_FEI_V;
		 } else if("guan_yu_h".equals(str)) {
			 type = GUAN_YU_H;
		 } else if("guan_yu_v".equals(str)) {
			 type = GUAN_YU_V;
		 } else if("zhao_yun_h".equals(str)) {
			 type = ZHAO_YUN_H;
		 } else if("zhao_yun_v".equals(str)) {
			 type = ZHAO_YUN_V;
		 } else if("ma_chao_h".equals(str)) {
			 type = MA_CHAO_H;
		 } else if("ma_chao_v".equals(str)) {
			 type = MA_CHAO_V;
		 } else if("huang_zhong_h".equals(str)) {
			 type = HUANG_ZHONG_H;
		 } else if("soldier1".equals(str)) {
			 type = SOLDIER1;
		 } else if("soldier1".equals(str)) {
			 type = SOLDIER1;
		 } else if("soldier1".equals(str)) {
			 type = SOLDIER1;
		 } else if("soldier1".equals(str)) {
			 type = SOLDIER1;
		 } 
		 
		 return type;
	 }

}
