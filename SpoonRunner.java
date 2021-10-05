class SpoonRunner
{
public static void main(String[] spoon)
{float weight=Float.parseFloat(spoon[1]);
Spoon chammach=new Spoon();
chammach.type=spoon[0];
chammach.weight=weight;
chammach.color=spoon[2];

//Spoon.getMessage(spoon[0],weight,spoon[1]);
System.out.println(chammach.type);
System.out.println(chammach.weight);
System.out.println(chammach.color);
System.out.println(chammach.type);
Spoon chammachRef1=new Spoon();
chammachRef1.type="steel";
chammachRef1.weight=0.5f;
chammachRef1.color="silver";

System.out.println(chammachRef1.type);
System.out.println(chammachRef1.weight);
System.out.println(chammachRef1.color);

Spoon chammachRef2=new Spoon();
chammachRef2.type="gold";
chammachRef2.weight=1f;
chammachRef2.color="golden";

System.out.println(chammachRef2.type);
System.out.println(chammachRef2.weight);
System.out.println(chammachRef2.color);

Spoon chammachRef3=new Spoon();
chammachRef3.type="silver";
chammachRef3.weight=0.5f;
chammachRef3.color="silver";


System.out.println(chammachRef3.type);
System.out.println(chammachRef3.weight);
System.out.println(chammachRef3.color);


Spoon chammachRef4=new Spoon();
chammachRef4.type="plastic";
chammachRef4.weight=0.5f;
chammachRef4.color="white";


System.out.println(chammachRef4.type);
System.out.println(chammachRef4.weight);
System.out.println(chammachRef4.color);


}
}