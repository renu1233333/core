package com.xworkz.interfacekeyword.Bank;



public interface BankDAO {

	boolean save(BankDTO bankDTORef);
	boolean delete(int index);
	boolean update(int index,BankDTO bankDTORef);
	void display();
}
