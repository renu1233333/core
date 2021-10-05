class CricketTeamRunner
{public static void main(String[] arg)
{
CricketTeam cricket=new CricketTeam();
String country="INDIA";
CricketTeam cricket1=new CricketTeam(country,"Virat Kohli","Bumrah","Virat Kohli");
System.out.println(cricket.country+"\n"+cricket.captain+"\n"+cricket.bestBowler+"\n"+cricket.bestBatsman);


CricketTeam cricket2=new CricketTeam("Australia","Aaron Fimch","pat cummins");
System.out.println(cricket.country+"\n"+cricket.captain+"\n"+cricket.bestBowler+"\n"+cricket.bestBatsman);



CricketTeam cricket4=new CricketTeam("Pakistan","Babar");
System.out.println(cricket.country+"\n"+cricket.captain+"\n"+cricket.bestBowler+"\n"+cricket.bestBatsman);


CricketTeam cricket5=new CricketTeam("USA");
System.out.println(cricket.country+"\n"+cricket.captain+"\n"+cricket.bestBowler+"\n"+cricket.bestBatsman);
String refCountry="afghanistan";
String refCaptain="afgd";

CricketTeam cricket6=new CricketTeam(refCountry,refCaptain);
System.out.println(cricket.country+"\n"+cricket.captain+"\n"+cricket.bestBowler+"\n"+cricket.bestBatsman);


}
}