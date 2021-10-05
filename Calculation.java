class Calculation{
public static void main(String[] val)
{
Add sum=new Add();
int sum1=sum.getSum(4,3);
System.out.println(sum1);
}}

class Add{
public int getSum(int a,int b){
return a+b;
}}