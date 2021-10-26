package com.xworkz.dao;
import com.xworkz.dto.*;
public class TimerDAO {

	TimerDTO[] timerDTOs=new TimerDTO[26];
	private int mangya=0;
	public void save(TimerDTO ref)
	{
		
		if(ref!=null)
		{
			this.timerDTOs[mangya++]=ref;
			
		}
		else
		{
			System.err.println("cannot save ,reference is null at index".concat(String.valueOf(mangya)));
			
		}
	}
	
	
	public void display()
	{
		for(int index=0;index<this.timerDTOs.length;index++)
		{
			TimerDTO ref=this.timerDTOs[index];
			if(ref!=null)
			{
				System.out.println(ref);
				System.out.println(ref.getCurrentTime());
				System.out.println(ref.isDigital());
				System.out.println(ref.isWorking());
			}
			else
			{
				System.err.println("reference is pointing to null at index".concat(String.valueOf(index)));
				
			}
		}
	}
	
	public void delete(int index)
	{
		if(index<this.timerDTOs.length && index>=0)
		{
			this.timerDTOs[index]=null;
			this.mangya--;
			
		}
		else
		{
			System.err.println("cannot delete".concat(String.valueOf(index)));
		}
	}
	
	public void update(TimerDTO ref,int index)
	{
		if(ref!=null && index<this.timerDTOs.length && index>=0)
		{
			this.timerDTOs[index]=ref;
			this.mangya++	;
		}
		else
		{
			System.err.println("cannot update .either index is invalid or refrence is null at index".concat(String.valueOf(index)));
			
		}
	}
	
	public int noIndex()
	{
		return mangya;
		
		
	}
	
	public boolean match(Integer currentTime)
	{
		for(int i=0;i<this.timerDTOs.length;i++)
		{
			TimerDTO timer=this.timerDTOs[i];
			if(timer!=null)
			{
				if(timer.getCurrentTime().equals(currentTime))
				{
					return true;
				}
			}
		}
		return false;
	}
	
	
}
