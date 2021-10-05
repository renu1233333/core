class CountryNameByPincode{
public static String getCountryByPincode(int pin)
{
if(pin==91){
return "India";
}
if(pin==01){
return "canada";
}
if(pin==90){
return "pakistan";
}
return "no match";
}
}