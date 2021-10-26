package com.xworkz.dao;
import com.xworkz.dto.*;
public class MilkCanDAO {

	
	private MilkCanDTO[] milkCanDTOs=new MilkCanDTO[30];
	private int milky;
	
	public void save(MilkCanDTO ref)
	{
		if(ref!=null)
		{
	          this.milkCanDTOs[milky++]=ref;
		}
		else
		{
			System.err.println("passed reference is null at index".concat(String.valueOf(milky)));
		}
	}
	
	public void display()
	{
		for(int i=0;i<this.milkCanDTOs.length;i++)
		{
		MilkCanDTO milkRef=this.milkCanDTOs[i];
		if(milkRef!=null)
		{
			System.out.println(milkRef);
			System.out.println(milkRef.getQuantity());
			System.out.println(milkRef.getPrice());
			System.out.println(milkRef.isQuality());
				
		}
		else
		{
			System.err.println("pointing to null reference at index".concat(String.valueOf(i)));
			
		}
		}
	}
	
	
	public void delete(int index)
	{
		if(index<this.milkCanDTOs.length && index>=0)
		{
			this.milkCanDTOs[index]=null;
			this.milky--;
		}
		else
		{
			System.err.println("cannot delete ,index is invalid");
			
		}
	}
	
	public void update(MilkCanDTO ref,int index)
	{
		if(ref!=null && index<this.milkCanDTOs.length && index>=0)
		{
			this.milkCanDTOs[index]=ref;
			this.milky++;
	    }
		else
		{
			System.err.println("cannot update either reference is null or index is invalid at index".concat(String.valueOf(index)));
			
		}
	}
	
	
	public int numberOfIndex()
	{
		return this.milky;
	}
	public boolean match(Integer quantity)
	{
		for(int i=0;i<this.milkCanDTOs.length;i++)
		{
			MilkCanDTO qauantityRef=this.milkCanDTOs[i];
			if(qauantityRef!=null)
			{
				if(qauantityRef.getQuantity().equals(quantity))
				{
					return true;
				}
			}
		}
		return false;
	}
	
}
