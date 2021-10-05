
class Overload{
public static int sum(int a,int b){
return a+b;
}
public static float sum(float a,float b){
return a+b;
}
}
class Overloading
{

public static void main(String[] val)
{
int res=Overload.sum(4,2);
float sum1=Overload.sum(4.3f,4.2f);
System.out.println(res);
System.out.println(sum1);

}
}
