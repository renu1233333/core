class PrimeMinisterDetails{
public static void main(String[] args)
{	
int age=Integer.parseInt(args[2]);
boolean married=Boolean.parseBoolean(args[3]);
boolean alive=Boolean.parseBoolean(args[4]);
int duration=Integer.parseInt(args[5]);
PrimeMinister.getDetailsOfPrimeMinister(args[0],args[1],age,married,alive,duration);
//PrimeMinister.getDetailsOfPrimeMinister("")
}
}