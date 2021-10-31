package com.xworkz.dto;
import com.xworkz.dto.*;
public class InstagramApplicationDTO extends ApplicationDTO{

	private float totalUsersInbillion;
	private String serverLocation;
	
	public InstagramApplicationDTO() {
	System.out.println("Invoking no argu constructor");
	}
	
	public InstagramApplicationDTO(float totalUsersInbillion, String serveLocation) {
		super("instagram","210.0.0.28.71","Instagram","Kevin Systrom");
		this.totalUsersInbillion = totalUsersInbillion;
		this.serverLocation = serveLocation;
	}

	public float getTotalUsers() {
		return totalUsersInbillion;
	}
	public void setTotalUsers(float totalUsersInbillion) {
		this.totalUsersInbillion = totalUsersInbillion;
	}
	public String getServeLocation() {
		return serverLocation;
	}
	public void setServeLocation(String serveLocation) {
		this.serverLocation = serveLocation;
	}
	
}
