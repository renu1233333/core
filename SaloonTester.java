class SaloonRunner
{
public static void main(String[] hittu)

{
Saloon saloon=new Saloon();
saloon.name="Green Trends";
saloon.location="BTM";
saloon.openTime=9.0f;
saloon.closeTime=9.0f;
saloon.branch=SaloonBranch.JAYANAGAR;


Saloon saloon1=new Saloon();
saloon1.name="YLG";
saloon1.location="Jayanagar";
saloon1.openTime=8.0f;
saloon1.closeTime=8.0f;
saloon1.branch=SaloonBranch.MGROAD;


saloon.hairCut();
saloon1.hairCut();
}
}