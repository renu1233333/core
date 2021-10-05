class TrailRunner
{
public static void main(String[] arg)
{
	System.out.println(Trail.name);
Trail treat=new Trail();
System.out.println(treat.name);

treat.getMessage();


treat.printMessage();
System.out.println(Trail.name);

Trail treat1=new Trail();
treat1.name="hadapd";
System.out.println(treat1.name);
Trail treat3=new Trail();
System.out.println(treat3.name);

int iNum=91;
double iDouble=4.123;
String s="91";
String sample=String.valueOf(iNum);
System.out.println(sample);
System.out.println(iNum+s);


sample=String.valueOf(iDouble);
System.out.println(sample);
System.out.println(s+sample);


Integer bool=Integer.valueOf(iNum);
System.out.println(bool);

Double dd=Double.valueOf(iNum);
System.out.println(dd);

String ss="34";
Integer ini=56;
int num=Integer.parseInt(ss);
System.out.println(num);


 Integer aa = Integer.valueOf(12);
 System.out.println(aa.getClass().getSimpleName());
 int bb=12;
 System.out.println(aa==bb);
 

}
}