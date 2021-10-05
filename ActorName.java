class ActorName{
public static void main(String[] args){
System.out.println(args);
System.out.println(args[0]);
String movieName=args[0];
String[] acts=Movie.getMovie(movieName);
System.out.println(acts);
if(acts!=null){
	System.out.println(acts.length);
	System.out.println(acts[0]);
	System.out.println(acts[1]);
}
else{
	System.out.println("actor is null");
}
}
}