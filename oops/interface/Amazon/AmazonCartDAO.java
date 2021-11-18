package com.xworkz.interfacekeyword.amazon;

public interface AmazonCartDAO {

	boolean save(CartDTO cartDTO);
	CartDTO findByName(String name);
	void displayAllCartDeatils();
	
	
}
