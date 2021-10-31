package com.xworkz.factory.starter;

import com.xworkz.factory.*;

public class FactoryRunner extends Object {

	public  static void main(String[] args) {
		SugarFactory factory0 = new SugarFactory();

		int workers = factory0.noOfWorkers;
		System.out.println(workers);

		System.out.println(factory0.getOwnername());

		SugarFactory factory1 = new SugarFactory("ambika", "spices products", 700, 1998);

		System.out.println(factory1.getName());
		System.out.println(factory1.getProduct());
		System.out.println(factory1.getNoOfWorkers());
		System.out.println(factory1.getSince());

		Factory ref = new SugarFactory("hayavadan", "pencil", 800, 1887);

		Factory ref1 = new SugarFactory();

		System.out.println(ref);
		System.out.println(ref.getOwnername());
		System.out.println(ref.getProduct());
		System.out.println(ref.getNoOfWorkers());
		System.out.println(ref.getSince());

		factory1.hiding();// method overriding

		Object obj = new Factory();
		Object obj3 = new SugarFactory();
		Object obj1 = new Object();
            SugarFactory manga=  new SugarFactory();//
            System.out.println(manga.noOfWorkers);
            
           Factory reference2= new SugarFactory();
            System.out.println(reference2.age);
            
          Factory refd= new Factory();
          System.out.println(reference2.getClass().getName()+"   77777777");
          manga.sum();
          SugarFactory wed= (SugarFactory)reference2;
          
          
        
           
	}

}
