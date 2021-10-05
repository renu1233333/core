class TempleAndTerrorist{
public static void main(String[] trump)
{String[] temples={"Ragigudda Temple","Vinayaka Temple","Saibaba Temple","Balmuri Ganesh temple","Shiva Temple","Hanuman Tempel","Kodanda Rama","Patalamma Temple","Ganapati Mandir","Sri Renuka Yellamma Temple","Muneeshwar swamy Temple","sri Chamundeshwari Temple","Iskcon Temple"};

TempleAndTerroristNames.getTemplesNearMe(temples);
System.out.println(temples.length);
System.out.println("*********************************");
String[] terror={"Abu sayyaf Group","Al-Qaida","Al-shabab","zawahri","Nasir","Ahmed","Javed","Muhammed","Shakil","Iftikhar ali"};
TempleAndTerroristNames.getTerrorist(terror);
}
}