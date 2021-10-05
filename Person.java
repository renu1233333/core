class Person{
public static String personName(byte date,String month,short year)
{
if(date==9 && month=="October" && year==1998){
return "Renu";
}
if(date==24 && month=="april" && year==2001){
return "vishwa";
}
if(date==18 && month=="June" && year==1998){
return "krutika";
}
return "No match for this Date of Birth";
}
}