package com.xworkz.dp;
import com.xworkz.dao.*;
import com.xworkz.dto.*;
public class MovieDTORunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieDTO movieDTOs1=new MovieDTO("KGF","prashanth neel",500,4.9f);
		MovieDTO movieDTOs2=new MovieDTO("bahubali","rajamauli",999,4.9f);
		MovieDTO movieDTOs3=new MovieDTO("PK","Rajkumar hirani",670,4.9f);
		
		MovieDAO movieDAOs=new MovieDAO();
		movieDAOs.save(movieDTOs1);
		movieDAOs.save(movieDTOs2);
		
		movieDAOs.display();
		movieDAOs.delete(-8);
		
		movieDAOs.update(movieDTOs3, 0);
		int indexNumber=movieDAOs.numberOfIndex();
		System.out.println(indexNumber);
		
	boolean found=	movieDAOs.match("Rajkumar hirani");
		System.out.println("Found ".concat(String.valueOf(found)));
		
	}

}
