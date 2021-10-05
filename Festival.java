class Festival
{
String festivalName;
String month;
int numberofDays;
String worshipGod;
String specialfor;

Festival()
{
System.out.println("Invoking Default Constructor");
}

Festival(String festivalName,String month,int numberofDays,String worshipGod)
{System.out.println("Constructor overloading");
	this.festivalName=festivalName;
 this.month=month;
 this.numberofDays=numberofDays;
 this.worshipGod=worshipGod;

}

Festival(String festivalName,String month,int numberofDays)
{System.out.println("Constructor overloading");
	this.festivalName=festivalName;
 this.month=month;
 this.numberofDays=numberofDays;
 this.specialfor=specialfor;
 

}

Festival(String festivalName,String month)
{System.out.println("Constructor overloading");
	this.festivalName=festivalName;
 this.month=month;

 

}

Festival(String festivalName)
{System.out.println("Constructor overloading");
	this.festivalName=festivalName;
 
}


Festival(String festivalName,int numberofDays)
{System.out.println("Constructor overloading");
	this.festivalName=festivalName;
	this.numberofDays=numberofDays;
}
Festival(String festivalName,int numberofDays,String worshipGod )
{System.out.println("Constructor overloading");
	this.festivalName=festivalName;
	this.numberofDays=numberofDays;
	this.worshipGod=worshipGod;
}
Festival(int numberofDays,String worshipGod )
{System.out.println("Constructor overloading");
	
	this.numberofDays=numberofDays;
	this.worshipGod=worshipGod;
}




}