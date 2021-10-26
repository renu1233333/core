package com.xworkz.dto;

public class IPLDTO {
private String teamName;
private Integer noOfCoaches;
private String owner;
public IPLDTO() {
	// TODO Auto-generated constructor stub
	System.out.println("Invoking IPLDTO constructor");
}
public IPLDTO(String teamName, Integer noOfCoaches, String owner) {
	super();
	this.teamName = teamName;
	this.noOfCoaches = noOfCoaches;
	this.owner = owner;
}
public String getTeamName() {
	return teamName;
}
public void setTeamName(String teamName) {
	this.teamName = teamName;
}
public Integer getNoOfCoaches() {
	return noOfCoaches;
}
public void setNoOfCoaches(Integer noOfCoaches) {
	this.noOfCoaches = noOfCoaches;
}
public String getOwner() {
	return owner;
}
public void setOwner(String owner) {
	this.owner = owner;
}


}
