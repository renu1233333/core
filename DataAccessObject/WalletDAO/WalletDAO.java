package com.xworkz.dao;
import com.xworkz.dto.*;
public class WalletDAO {

	private WalletDTO[] walletDTOs=new WalletDTO[24];
	private int counter;
	public void create(WalletDTO ref)
	{
		if(ref!=null)
		{
			this.walletDTOs[counter++]=ref;
		}
		else
		{
			System.out.println("You are passing null refernce");
		}
	}
	
	
	
	public void display()
	{
		for(int manga=0;manga<this.walletDTOs.length;manga++)
		{
			WalletDTO reference=this.walletDTOs[manga];
			if(reference!=null)
			{
				System.out.println(reference);
				System.out.println(reference.getCompanyName());
				System.out.println(reference.getMaterial());
				System.out.println(reference.getPrice());
				System.out.println(reference.getTotalCompartment());
			}
			else
			{
				System.err.println("reference is pointing to index".concat(String.valueOf(manga)));
			}
		}
	}
	
	
	public void delete(int index)
	{
		if(index<this.walletDTOs.length && index >=0)
		{
			this.walletDTOs[index]=null;
			this.counter--;
		}
		
		else
		{
			System.out.println("Invalid index");
			
		}
	}
	
	public void updateByIndex(WalletDTO ref,int index)
	{
		if(ref!=null && index>=0 && index<this.walletDTOs.length)
		{
			System.out.println("updated at index".concat(String.valueOf(index)));
			this.walletDTOs[index]=ref;
			this.counter++;
		}
		else
		{
			System.out.println("either index is invalid or passed reference is null");
		}
	}
	
	public boolean match(String companyName)
	{
	    for(int fan=0;fan<this.walletDTOs.length;fan++)
	    {
	    	WalletDTO name=this.walletDTOs[fan];
	    	if(name!=null)
	    	{
	    		
	    	
	    	if(name.getCompanyName().equals(companyName))
	    	{
	    		return true;
	    	}
	    	}
	    	
	    }
	    return false;
	}
	
	
	public int numberOfIndex()
	{
		return this.counter;
	}
	
}
