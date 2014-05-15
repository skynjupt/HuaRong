package com.skyhonney.huarongroad.move;

public class DirectionType {
	public static final int UP = 0;
	public static final int DOWN = 1;
	public static final int RIGHT = 2;
	public static final int LEFT = 3;
	
	public static final String UP_STR = "up";
	public static final String DOWN_STR = "down";
	public static final String RIGHT_STR = "right";
	public static final String LEFT_STR = "left";
	
	public static int str2Int(String dir) {
		int ret = 0;
		
		if(dir == null) {
			return ret;
		} else if(UP_STR.equals(dir)) {
			ret = UP;
		} else if(DOWN_STR.equals(dir)) {
			ret = DOWN;
		} else if(RIGHT_STR.equals(dir)) {
			ret = RIGHT;
		} else if(LEFT_STR.equals(dir)) {
			ret = LEFT;
		} 
		
		return ret;
	}
	
	public static String getOppositeDirection(String dir) {
		String ret = null;
		
		if(dir == null) {
			return ret;
		} else if(UP_STR.equals(dir)) {
			ret = DOWN_STR;
		} else if(DOWN_STR.equals(dir)) {
			ret = UP_STR;
		} else if(RIGHT_STR.equals(dir)) {
			ret = LEFT_STR;
		} else if(LEFT_STR.equals(dir)) {
			ret = RIGHT_STR;
		} 
		
		return ret;
	}
}
