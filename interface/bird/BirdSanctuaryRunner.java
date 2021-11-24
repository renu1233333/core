package com.xworkz.interfacekeyword.bird;

public class BirdSanctuaryRunner {

	public static void main(String[] args) {
		
		BirdDTO birdDTORef=new BirdDTO("234", "parrot", 1, "India", true);
		BirdDTO birdDTORef1=new BirdDTO("234", "duck", 1, "India", true);
		BirdDTO birdDTORef2=new BirdDTO("234", "peacock", 1, "India", true);
		BirdDTO birdDTORef3=new BirdDTO("234", "peagon", 1, "India", true);
		
		
       BirdDAO birdDAOs=new ArrayBirdDAOs();
       BirdSantuary birdRef=new BirdSantuary(birdDAOs);
       
       birdRef.saveBirdDetails(birdDTORef);
       birdRef.saveBirdDetails(birdDTORef1);
       birdRef.saveBirdDetails(birdDTORef2);
       birdRef.displayDetails();
       
       
       birdRef.deleteDetails(2);
       birdRef.displayDetails();
       
        birdRef.updateDetails(2, birdDTORef3);
        
        birdRef.displayDetails();
	}

}
