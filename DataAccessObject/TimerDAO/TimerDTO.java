package com.xworkz.dto;

public class TimerDTO {
private boolean working;
private Integer currentTime;
private boolean digital;


public TimerDTO() {
	// TODO Auto-generated constructor stub
	System.out.println("Invoking TimerDtO constructor");
}


public TimerDTO(boolean working, int currentTime, boolean digital) {
	super();
	this.working = working;
	this.currentTime = currentTime;
	this.digital = digital;
}


public boolean isWorking() {
	return working;
}


public void setWorking(boolean working) {
	this.working = working;
}


public Integer getCurrentTime() {
	return currentTime;
}


public void setCurrentTime(Integer currentTime) {
	this.currentTime = currentTime;
}


public boolean isDigital() {
	return digital;
}


public void setDigital(boolean digital) {
	this.digital = digital;
}


}
