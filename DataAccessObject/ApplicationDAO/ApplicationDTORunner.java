package com.xworkz.dp;
import com.xworkz.dao.*;
import com.xworkz.dto.*;
public class ApplicationDTORunner {

	public static void main(String[] args) {
		
         ApplicationDTO applicationDTOs=new ApplicationDTO("whatsapp messanger","2.19. 134.","whatsapp","Jan Koum");
         ApplicationDTO applicationDTOs1=new ApplicationDTO("Snapchat","10.52.3.0","SnapChat Inc","Evan Spiegel");
         
         FacebookApplicationDTO facebookDTOs=new FacebookApplicationDTO("Mark Zuckerberg","Menlo Park, California, United States");
         InstagramApplicationDTO instagramDTOS=new InstagramApplicationDTO(1.386f,"London");
         
		ApplicationDAO applicationDAOs=new ApplicationDAO();
		
		ApplicationDAO applicationDAOs1=new ApplicationDAO();
		
		ApplicationDAO applicationDAOs2=new ApplicationDAO();
		
		
		applicationDAOs.save(applicationDTOs);
		applicationDAOs.save(applicationDTOs1);
		
		applicationDAOs.deleteApplicationDTO(-6);
		applicationDAOs.display();
		ApplicationDTO application=applicationDAOs.getApplicationDTOByName("whatsapp messanger");
		System.out.println("getApplicationDTO By Name");
		if(application!=null)
		{
		System.out.println(application.getCompany());
		System.out.println(application.getFounder());
		System.out.println(application.getName());
		System.out.println(application.getVersion());
		}
		else
		{
			System.out.println("no match");
		}
		
		
		applicationDAOs1.saveFacebookDTO(facebookDTOs);
		applicationDAOs1.displayFaceBookDTO();
		
		
		applicationDAOs2.saveInstagramDTO(instagramDTOS);
		applicationDAOs2.displayInstagramDTOs();
		
		
		
	}

}
