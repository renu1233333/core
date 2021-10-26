package com.xworkz.dao;
import com.xworkz.dto.*;
public class MovieDAO {

	private MovieDTO[] movieDTOs=new MovieDTO[34];
	private int popcorn;
	public void save(MovieDTO ref)
	{
		if(ref!=null)
		{
			this.movieDTOs[popcorn++]=ref;
		}
		else
		{
			System.err.println("cannot add ,passing null refernce");
		}
	}
	
	
	public void display()
	{
		for(int kayi=0;kayi<this.movieDTOs.length;kayi++)
		{
			MovieDTO movieRef=this.movieDTOs[kayi];
			if(movieRef!=null)
			{
				System.out.println(movieRef);
				System.out.println(movieRef.getName());
				System.out.println(movieRef.getDirector());
				System.out.println(movieRef.getNumberofCharacter());
				System.out.println(movieRef.getRatings());
			}
			else
			{
				System.err.println("pointing to null at index".concat(String.valueOf(kayi)));
			}
		}
	}
	
	public void delete(int index)
	{
		if(index<this.movieDTOs.length && index>=0)
		{
			this.movieDTOs[index]=null;
			this.popcorn++;
			
		}
		else
		{
			System.err.println("Cannot delete at idex ".concat(String.valueOf(index)));
			
		}
	}
	
	public void update(MovieDTO ref,int index)
	{
		if(ref!=null && index<this.movieDTOs.length && index>=0)
		{
			this.movieDTOs[index]=ref;
			this.popcorn++;
		}
		else
		{
			System.err.println("Cannot update either reference is null or index is invalid and index is ".concat(String.valueOf(index)));
			
		}
	}
	
	public int numberOfIndex()
	{
		return this.popcorn;
	}
	
	
	public boolean match(String directorName)
	{
		for(int index=0;index<this.movieDTOs.length;index++)
		{
		  MovieDTO ref=this.movieDTOs[index];
		  if(ref!=null)
		  {
			  if(ref.getDirector().equals(directorName))
			  {
				  return true;
			  }
		  }
		
			  
		}
		return false;
	}
}
