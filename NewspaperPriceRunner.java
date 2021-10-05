class NewspaperPriceRunner
{
public static void main(String[] arg)
{
NewspaperLanguage[] prices=NewspaperLanguage.values();
for(int size=0;size<prices.length;size++)
{
System.out.println(prices[size].price);
}
}
}