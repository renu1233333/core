class WeatherRunner

{
public static void main(String[] idli)
{
	WeatherSeason season=WeatherSeason.RAINY;
	String humidity="cloudy";
Weather weather=new Weather(season,humidity);;
weather.feel=true;
System.out.println(weather.season);
System.out.println(weather.temperatureinCelsius);
System.out.println(weather.humidity);
System.out.println(weather.feel);

System.out.println(Weather.numberOfInstance);

}
}