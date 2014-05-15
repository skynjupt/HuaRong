package com.skyhonney.huarongroad.move;

public class MoveData {
	private String direction;
	private String pepoleTyoe;
	
	public MoveData() {
		
	}
	
	public MoveData(String dir, String type) {
		this.direction = dir;
		this.pepoleTyoe = type;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getPepoleTyoe() {
		return pepoleTyoe;
	}

	public void setPepoleTyoe(String pepoleTyoe) {
		this.pepoleTyoe = pepoleTyoe;
	}
	
	
}
