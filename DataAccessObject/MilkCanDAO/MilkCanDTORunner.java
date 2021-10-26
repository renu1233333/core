package com.xworkz.dp;
import com.xworkz.dto.*;
import com.xworkz.dao.*;
public class MilkCanDTORunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MilkCanDTO milkCanDTOs=new MilkCanDTO(2,false,12.4f);
		MilkCanDTO milkCanDTOs1=new MilkCanDTO(3,true,14.4f);
		MilkCanDTO milkCanDTOs2=new MilkCanDTO(1,false,19.4f);
		
		MilkCanDAO milkCanDAOs=new MilkCanDAO();
		milkCanDAOs.save(milkCanDTOs);
		milkCanDAOs.save(milkCanDTOs1);
		
		milkCanDAOs.display();
		int numberOfIndex=milkCanDAOs.numberOfIndex();
		System.out.println("total  number of index".concat(String.valueOf(numberOfIndex)));
		milkCanDAOs.delete(-3);
		milkCanDAOs.update(milkCanDTOs2, 10);
		boolean found=milkCanDAOs.match(2);
		System.out.println("match found ".concat(String.valueOf(found)));
		
		
		
		
		
	}

}
