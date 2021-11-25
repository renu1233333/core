package com.xworkz.exception.panCard;

public class StorageFullException extends RuntimeException{

	public StorageFullException() {
		super();
	}
	
	public StorageFullException(String msg)
	{
		super(msg);
	}
}
