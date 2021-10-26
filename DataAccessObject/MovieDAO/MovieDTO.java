package com.xworkz.dto;

public class MovieDTO {
private String name;
private String director;
private int numberofCharacter;
private float ratings;
public MovieDTO() {
	// TODO Auto-generated constructor stub
	System.out.println("Invoking MovieDTO constructor");
}
public MovieDTO(String name, String director, int numberofCharacter, float ratings) {
	super();
	this.name = name;
	this.director = director;
	this.numberofCharacter = numberofCharacter;
	this.ratings = ratings;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDirector() {
	return director;
}
public void setDirector(String director) {
	this.director = director;
}
public int getNumberofCharacter() {
	return numberofCharacter;
}
public void setNumberofCharacter(int numberofCharacter) {
	this.numberofCharacter = numberofCharacter;
}
public float getRatings() {
	return ratings;
}
public void setRatings(float ratings) {
	this.ratings = ratings;
}
}
