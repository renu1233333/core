package com.xworkz.exception.vehicle;

public class StorageFullException extends RuntimeException {

	public StorageFullException() {
		super();
	}

	public StorageFullException(String msg) {
		super(msg);
	}
}
