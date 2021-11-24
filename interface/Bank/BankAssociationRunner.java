package com.xworkz.interfacekeyword.Bank;


public class BankAssociationRunner {

	public static void main(String[] args) {
		BankDTO bankDTOs=new BankDTO("AXISINBBXXX", "Axis Bank", "UTIB0000009", "Bangalore");
		
		BankDTO bankDTOs2=new BankDTO("HDFCINBBXXX", "HDFC Bank", "HDFC0000077", "Bangalore");
		BankDTO bankDTOs3=new BankDTO("SBININBBXXX", "SBI Bank", "SBININBBXXX", "Janakpuri");
		

		BankDAO bankDAORef=new ArrayBankDAO();
		
		BankAssociation association=new BankAssociation(bankDAORef);
		association.saveDetails(bankDTOs);
		
		association.saveDetails(bankDTOs2);
		association.saveDetails(bankDTOs3);
		
		association.displayDetails();
		
		association.deleteAtIndex(3);
		association.displayDetails();
		association.updateDetails(3, bankDTOs3);
		association.displayDetails();
		
	}

}
