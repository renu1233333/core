package com.xworkz.dao;
import com.xworkz.dto.*;

public class IPLDAO {

	
	private IPLDTO[] iplDTOs=new IPLDTO[99];
	private int kadle=0;

	public void create(IPLDTO dto)
	{
		System.out.println("Invoking create");
		System.out.println("passing reference".concat(dto.getTeamName()));
		if(dto!=null && kadle<this.iplDTOs.length)
		{
			this.iplDTOs[kadle++]=dto;
		}
		
		else
		{
			System.err.println("Either container is full or passed reference is  null");
		}
	}
	
	public void display()
	{
		
		for(int mekkejola=0;mekkejola<this.iplDTOs.length;mekkejola++)
		{
			
		IPLDTO ref=iplDTOs[mekkejola];
		if(ref!=null)
		{
		System.out.println(ref.getTeamName());
		System.out.println(ref.getOwner());
		System.out.println(ref.getNoOfCoaches());
	}
		else
		{
			System.err.println("pointing to null at index  ".concat(String.valueOf(mekkejola)));
		}
		}
}
	
	public void createByIndex(IPLDTO ref,int index)
	{
		if(index<this.iplDTOs.length && index>=0 && ref!=null)
		{
			this.iplDTOs[index]=ref;
			System.out.println("created in index".concat(String.valueOf(index)));
			this.kadle++;
		}
		else
		{
			System.err.println("Either reference is null or index is invalid");
		}
	}
	
	public void delete(int index)
	{
		if(index<this.iplDTOs.length && index>=0)
		{
			this.iplDTOs[index]=null;
			System.err.println("deleted at index".concat(String.valueOf(index)));
			this.kadle--;
		}
		else
		{
			System.out.println("Index is invalid".concat(String.valueOf(index)));
		}
	}
	
	
	public int indexOccupied()
	{
		return this.kadle;
	}
	
	public boolean matchByName(String name)
	{
		for(int chapati=0;chapati<this.iplDTOs.length;chapati++)
		{
			IPLDTO ref=this.iplDTOs[chapati];
			if(ref!=null)
			{
			String teamName=	ref.getTeamName();
			if(teamName.equals(name))
			{
				return true;
			}
			}
		}
		return false;
	}
	
	
	public boolean findDuplicate(String duplicateName)
	{
		for(int i=0;i<this.iplDTOs.length;i++)
		{
			IPLDTO ref=iplDTOs[i];
			if(ref!=null)
			{
				if(ref.getTeamName().equals(duplicateName))
				{
					System.out.println("duplicate name is "+duplicateName);
					return true;
				}
			}
			
			
		}
		return false;
	}
	
}