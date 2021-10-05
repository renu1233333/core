class NewspaperLanguageRunner
{
public static void main(String[] arg)
{
NewspaperLanguage[] lang=NewspaperLanguage.values();
for(int i=0;i<lang.length;i++)
{
	System.out.println(lang[i]);
	System.out.println(lang[i].price);
	
}
}
}