class MovieName{
public static String[] getActorsByMovie(String movie){
String[] noMatch={};
if(movie=="Maari 2")
{
String[] name={"Dhanush","sai Pallavi","Tovino Thomas"};
return name;
}
if(movie=="KGF")
{
String[] name={"yash","Srinidhi shetty","Anant Nag"};
return name;
}
if(movie=="3 Idiots")
{
String[] name={"Amir Khan","R.Madhavan","Sharman Joshi","Kareena Kapoor"};
return name;
}
return noMatch;
}
}