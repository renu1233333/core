class HalfPattern
{
public static void main(String[] arg)
{
int num1=Integer.parseInt(arg[0]);
int num2=Integer.parseInt(arg[1]);
HalfPattern pattern=new HalfPattern();
pattern.halfPattern(num1,num2);
}
public void halfPattern(int r,int c)
{int mid=(r/2)+1;
if(r%2!=0)
{
 for(int row=1;row<=r;row++)
 {
 for(int col=1;col<=c;col++)
 {
 if( row>=mid && col>=mid )
 {
 System.out.print(row+""+col+"\t");
 }
 else
 {
 System.out.print("\t");
 }
 }
 System.out.println();
}

}
else{
	System.out.println("Give only odd number");
}
}
}