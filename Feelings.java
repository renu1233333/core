class Feelings{
public static String getFeelingsByTemperature(int temp){
if(temp>= -30 && temp< -20)
{
return "Very Cold if you are outside,unbearable to most";
}
if(temp>=-20 && temp< -10){
return "Very Cold but still bearable if in lots of warm cloths";
}
if(temp>= -10 && temp<0 ){
return "Cold";

}
if(temp>=0 && temp<4){
return "cold";
}

if(temp>=4 && temp<16){
return "Cold";
}
if(temp>=16 && temp<24)
{
return "warm";
}
if(temp>=24 && temp<26){
return "warm to hot";
}
if(temp>=26 && temp<30)
{
return "Feeling hot";
}
if(temp>=30 && temp<40)
{return "Very hot";
}
if(temp>=40 && temp<60)
{
return "extremely hot";
}
if(temp>=60 && temp<=90){
return "too hot to live in";
}
return "Not found";
}
}