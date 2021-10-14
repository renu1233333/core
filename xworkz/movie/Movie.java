package com.xworkz.movie;


public class Movie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Director director=new Director();
            director.setDirectorName("Rajamuali");
            String directorName=director.getDirectorName();
            
            System.out.println(directorName);
            
            com.xworkz.Characters.Actor actor=new com.xworkz.Characters.Actor();
            actor.setName("prabhas");
           String actorName= actor.getName();
            
            System.out.println(actorName);
            
            
            Actor actressRef=new Actor();
            actressRef.setName("Anuska");
            String actressName=actressRef.getName();
            System.out.println(actressName);
            
            
	}

}
