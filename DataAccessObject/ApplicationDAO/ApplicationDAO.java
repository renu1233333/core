package com.xworkz.dao;
import com.xworkz.dto.*;
import com.xworkz.dto.*;

public class ApplicationDAO {

	ApplicationDTO[]  applicationDTOs=new ApplicationDTO[10];
	FacebookApplicationDTO[] facebookDTOs=new FacebookApplicationDTO[5];
	InstagramApplicationDTO[] instagramDTOs=new InstagramApplicationDTO[5];
	private int counter;
	
	public void save(ApplicationDTO ref)
	{
		if(ref!=null && counter<this.applicationDTOs.length)
		{
			this.applicationDTOs[this.counter++]=ref;
		}
		else
		{
			System.out.println("cannot add at index".concat(String.valueOf(this.counter)));
			
		}
	}
	
	public void saveFacebookDTO(FacebookApplicationDTO ref)
	{
		if(ref!=null && counter<this.facebookDTOs.length)
		{
			this.facebookDTOs[this.counter++]=ref;
		}
		else
		{
			System.out.println("cannot add at index".concat(String.valueOf(this.counter)));
			
		}
	}
	
	public void saveInstagramDTO(InstagramApplicationDTO ref)
	{
		if(ref!=null && counter<this.instagramDTOs.length)
		{
			this.instagramDTOs[this.counter++]=ref;
		}
		else
		{
			System.out.println("cannot add at index".concat(String.valueOf(this.counter)));
			
		}
	}

	
	
	public void displayInstagramDTOs()
	{System.out.println("*****************displaying InstagramapplicationDTO*******************");
		for(int pooja=0;pooja<this.facebookDTOs.length;pooja++)
		{
			InstagramApplicationDTO ref=this.instagramDTOs[pooja];
			if(ref!=null)
			{
				System.out.println(ref.getName());
				System.out.println(ref.getCompany());
				System.out.println(ref.getTotalUsers());
				System.out.println(ref.getServeLocation());
				System.out.println(ref.getVersion());
				System.out.println(ref.getFounder());
			}
		}
	}
	
	public void displayFaceBookDTO()
	{System.out.println("*****************displaying FaceBookapplicationDTO*******************");
		for(int renu=0;renu<this.facebookDTOs.length;renu++)
		{
			FacebookApplicationDTO ref=this.facebookDTOs[renu];
			if(ref!=null)
			{
				System.out.println(ref.getName());
				System.out.println(ref.getCompany());
				System.out.println(ref.getCeoName());
				System.out.println(ref.getHeadquarter());
				System.out.println(ref.getVersion());
				System.out.println(ref.getFounder());
			}
		}
	}
	
	
	
	public void deleteApplicationDTO(int index)
	{
		if(index>=0 && index<this.applicationDTOs.length)
		{
			this.applicationDTOs[index]=null;
			System.out.println("deleted at ".concat(String.valueOf(index)));
		}
		else
		{
			System.out.println("index is incorrect at ".concat(String.valueOf(index)));
			
		}
	}
	public void display()
	{System.out.println("*****************displaying applicationDTO*******************");
		for (int i = 0; i < applicationDTOs.length; i++) {
			ApplicationDTO ref=this.applicationDTOs[i];
			
			if(ref!=null)
			{
				System.out.println(ref.getCompany());
				System.out.println(ref.getVersion());
				System.out.println(ref.getFounder());
				System.out.println(ref.getName());
			}
			else
			{
			 System.out.println("refering to null at index".concat(String.valueOf(i)));
			}
		}
	}
	
	public ApplicationDTO getApplicationDTOByName(String name)
	{
		if(name!=null)
		{
			for(int paper=0;paper<this.applicationDTOs.length;paper++)
			{
				ApplicationDTO ref=this.m;
				if(ref!=null)//null check
					
				{
					String tempName=ref.getName();
					if(name.equalsIgnoreCase(tempName))
					{
						return applicationDTOs[paper];
					}
				}
			}
		}
		
		return null;
	}
	
}
