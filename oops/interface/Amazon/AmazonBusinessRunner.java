package com.xworkz.interfacekeyword.amazon;

public class AmazonBusinessRunner {

	public static void main(String[] args) {
		
		CartDTO cartDTORef=new CartDTO("gadgets",2,2000.7f,"ear_phones");
		AmazonCartDAO amzonCartDAORef=new ArrayAmazonCartDAO();
		AmazonBusiness business=new AmazonBusiness(amzonCartDAORef);
		business.saveCart(cartDTORef);
		business.findCartByName(null);
		business.displayCart();

	}

}
