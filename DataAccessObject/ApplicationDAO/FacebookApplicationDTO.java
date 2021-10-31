package com.xworkz.dto;
import com.xworkz.dto.*;
public class FacebookApplicationDTO extends ApplicationDTO{
  private String ceoName;
  private String headquarter; 
  FacebookApplicationDTO()
  {
	  System.out.println("Invoking no arg FacebookApplicationDTO constructor");
  }
public FacebookApplicationDTO(String ceoName, String headquarter) {
	super("meta","342.0.0.37.119","Meta Platforms, Inc.","Mark Zuckerberg");
	this.ceoName = ceoName;
	this.headquarter = headquarter;
}
public String getCeoName() {
	return ceoName;
}
public void setCeoName(String ceoName) {
	this.ceoName = ceoName;
}
public String getHeadquarter() {
	return headquarter;
}
public void setHeadquarter(String headquarter) {
	this.headquarter = headquarter;
}
  
  
}
