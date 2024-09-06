package com.jbk.entity;

public class Classrooms {

	private int clsID;
	private String clsName;
	private String clsFloor;
	private String clsLocation;
	private int clsStudCount;
	private int clsStudPlaced;
	
	
	public int getClsID() {
		return clsID;
	}
	public void setClsID(int clsID) {
		this.clsID = clsID;
	}
	public String getClsName() {
		return clsName;
	}
	public void setClsName(String clsName) {
		this.clsName = clsName;
	}
	public String getClsFloor() {
		return clsFloor;
	}
	public void setClsFloor(String clsFloor) {
		this.clsFloor = clsFloor;
	}
	public String getClsLocation() {
		return clsLocation;
	}
	public void setClsLocation(String clsLocation) {
		this.clsLocation = clsLocation;
	}
	public int getClsStudCount() {
		return clsStudCount;
	}
	public void setClsStudCount(int clsStudCount) {
		this.clsStudCount = clsStudCount;
	}
	public int getClsStudPlaced() {
		return clsStudPlaced;
	}
	public void setClsStudPlaced(int clsStudPlaced) {
		this.clsStudPlaced = clsStudPlaced;
	}

	@Override
	public String toString() {
		return "Classrooms [clsID=" + clsID + ", clsName=" + clsName + ", clsFloor=" + clsFloor + ", clsLocation="
				+ clsLocation + ", clsStudCount=" + clsStudCount + ", clsStudPlaced=" + clsStudPlaced + "]";
	}

}
