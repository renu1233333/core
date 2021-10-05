class Corona{
	public static void getPatients(String name,int age,String from,boolean admitted,String admittedTo,int infectedDays,boolean alive,boolean discharged)
	{
		System.out.println(name+"\n"+age+"\n"+from+"\n"+admitted+"\n"+admittedTo+"\n"+infectedDays+"\n"+alive+"\n"+discharged);
		
	}

public static void main(String[] pat){
	int age=Integer.parseInt(pat[1]);
	boolean admit=Boolean.parseBoolean(pat[3]);
	int infectedDays=Integer.parseInt(pat[5]);
	boolean alive=Boolean.parseBoolean(pat[6]);
	boolean discharged=Boolean.parseBoolean(pat[7]);
	getPatients(pat[0],age,pat[2],admit,pat[4],infectedDays,alive,discharged);
	
}	
	
	}
