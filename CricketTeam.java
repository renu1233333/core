class CricketTeam
{
String country;
String captain;
String bestBowler;
String bestBatsman;

CricketTeam()
{
System.out.println("Invoking Default Constructor");
}
CricketTeam(String country,String captain,String bestBowler,String bestBatsman)
{
this.country=country;
this.captain=captain;
this.bestBowler=bestBowler;
this.bestBatsman=bestBatsman;
}


CricketTeam(String country,String captain,String bestBowler)
{
this.country=country;
this.captain=captain;
this.bestBowler=bestBowler;

}
CricketTeam(String country,String captain)
{
this.country=country;
this.captain=captain;


}
CricketTeam(String country)
{
this.country=country;
}

CricketTeam(String refCountry,String refBatsMan)
{
	country=refCountry;
	bestBatsman=refBatsMan;
}

}