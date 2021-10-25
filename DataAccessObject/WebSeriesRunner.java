package com.xworkz.dto;
import com.xworkz.constants.Genre;
import com.xworkz.dao.WebSeriesDAO;
import com.xworkz.dto.*;
public class WebSeriesRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebSeriesDTO webSeriesDTOs=new  WebSeriesDTO("asur",Genre.ACTION,100,4.5f,1,1);
		WebSeriesDTO webSeriesDTOs1=new  WebSeriesDTO("money heist",Genre.ACTION,2000,4.8f,5,2);
		
		
		WebSeriesDAO web=new WebSeriesDAO();
		web.save(webSeriesDTOs);
		web.save(webSeriesDTOs1);
		
		
		web.display();
		
		web.delete(-1);
		web.delete(0);
		
		web.display();
		
		
	}

}
