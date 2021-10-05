class Details{
public static String[] getDetailsForGadgets(String gad)
{
if(gad.equals("mouse")){
String[] name={"Dell-WM118","Black","wireless","Rs.650"};
return name;
}
if(gad.equals("Wi-Fi")){
String[] name={"JioFi-M2S","Black","Wireless","Rs.1599"};
return name;
}
if(gad.equals("Earphone")){
String[] name={"Master and Dynamic MW60","Orange","Wireless","Rs 2000"};
return name;
}
if(gad.equals("Joystick")){
String[] name={"Redgear Ms-150","Blood Red","Wireless","Rs.1499"};
return name;
}
return null;
}
}