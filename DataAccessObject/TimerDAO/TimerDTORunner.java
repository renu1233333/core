package com.xworkz.dp;
import com.xworkz.dao.*;
import com.xworkz.dto.*;
public class TimerDTORunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TimerDTO timerDTOs1=new TimerDTO(true,2,false);
		TimerDTO timerDTOs2=new TimerDTO(false,4,true);
		TimerDTO timerDTOs3=new TimerDTO(true,7,true);
		
		TimerDAO timerDAOs=new TimerDAO();
		timerDAOs.save(timerDTOs1);
		timerDAOs.save(timerDTOs2);
		
		timerDAOs.display();
         
		timerDAOs.delete(26);
		
		int numberOfIndex=timerDAOs.noIndex();
		System.out.println(numberOfIndex);
		
		timerDAOs.update(timerDTOs3, 27);
		timerDAOs.display();
		
		boolean timer=timerDAOs.match(8);
		System.out.println("found ".concat(String.valueOf(timer)));
		
		
	}

}
