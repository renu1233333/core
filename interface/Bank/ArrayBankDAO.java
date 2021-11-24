package com.xworkz.interfacekeyword.Bank;



public class ArrayBankDAO implements BankDAO{
	BankDTO[] bankDTORef = new BankDTO[10];
    int counter=0;
	@Override
	public boolean save(BankDTO bankDTO) {
		if(bankDTORef!=null && this.counter<bankDTORef.length)
	    {
			bankDTORef[this.counter++]=bankDTO;
	    	System.out.println("successfully saved ");
	    	return true;
	    	
	    }
	    else
	    {
	    	System.err.println("cannot save");
	    }
		return false;
	}
	@Override
	public boolean delete(int index) {
		if(index>=0 && index<this.bankDTORef.length)
		  {
			bankDTORef[index]=null;
			  System.out.println("deleted at index "+index);
			  return true;
		  }
		  else
		  {
			  System.err.println("cannot delete");
		  }
		return false;
	}
	@Override
	public boolean update(int index, BankDTO bankDTO) {
		if(index>=0 && index<this.bankDTORef.length && bankDTORef!=null)
        {
			bankDTORef[index]=bankDTO;
        	System.out.println("updated at index "+index);
        	return true;
        }
        System.out.println("cannot update ");
		return false;
	}
	@Override
	public void display() {
		for(int i=0;i<bankDTORef.length;i++)
		{
			if(bankDTORef[i]!=null)
			{
				System.out.println(bankDTORef[i].getId());
				System.out.println(bankDTORef[i].getName());
				System.out.println(bankDTORef[i].getIfsc());
				System.out.println(bankDTORef[i].getBranch());
			}
			else
			{
				System.err.println("pointing to null at index "+i);
			}
			
		}
		
	}
	
}
