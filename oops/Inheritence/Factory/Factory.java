package com.xworkz.factory;

public class Factory extends Object{

	private String ownername="varsha";
	private String product="sugar ";
	public int noOfWorkers=500;
	private int since=1947;
	
	public void hiding()
	{
		System.out.println("hided");
	}
	public Factory() {
		System.out.println("Invoking no argument Factory constructor");
		
	}
	
	


	public Factory(String ownername, String product, int noOfWorkers, int since) {
		super();
		this.ownername = ownername;
		this.product = product;
		this.noOfWorkers = noOfWorkers;
		this.since = since;
	}




	public String getOwnername() {
		return ownername;
	}


	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}


	public String getProduct() {
		return product;
	}


	public void setProduct(String product) {
		this.product = product;
	}


	public int getNoOfWorkers() {
		return noOfWorkers;
	}


	public void setNoOfWorkers(int noOfWorkers) {
		this.noOfWorkers = noOfWorkers;
	}


	public int getSince() {
		return since;
	}


	public void setSince(int since) {
		this.since = since;
	}
	
	
	
	
}
