package com.xworkz.dp;
import com.xworkz.dto.*;
import com.xworkz.dao.*;
public class WalletDTORunner {
public static void main(String[] args)
{
	WalletDTO walletDTOs1=new WalletDTO("puma","leather",4,400.4f);
	WalletDTO walletDTOs2=new WalletDTO("Urban Forest","Blue Leather",3,324.4f);
	WalletDTO wallet=null;
	
	WalletDAO walletDAOs=new WalletDAO();
	walletDAOs.create(walletDTOs1);
	walletDAOs.create(wallet);
	
	
	walletDAOs.display();
	
	int totalIndex=walletDAOs.numberOfIndex();
	System.out.println("Total index is ".concat(String.valueOf(totalIndex)));
	
	walletDAOs.delete(-6);
	totalIndex=walletDAOs.numberOfIndex();
	System.out.println("Total index is ".concat(String.valueOf(totalIndex)));
	
	walletDAOs.updateByIndex(new WalletDTO("urban forest","black leather",2,340.2f),9);
	
	totalIndex=walletDAOs.numberOfIndex();
	System.out.println("Total index is ".concat(String.valueOf(totalIndex)));
	
	boolean found=walletDAOs.match("ter");
	System.out.println("matching is ".concat(String.valueOf(found)));
	
	
	
}
}
