class ReturnType{
public static void main(String[] v){
String area="btm";
String res=getContest(area);
System.out.println(res);
}

public static String getContest(String area){
if(area=="Btm")
{
return "renu";
}
else{
return "no name called renu";
}
}
}