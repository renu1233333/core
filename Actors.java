class Actors{
public static void main(String[] name)
{
String movieName="KGF";
String[] actorsName=MovieName.getActorsByMovie(movieName);
for(int i=0;i<actorsName.length;i++){
System.out.println(actorsName[i]);
}
}
}