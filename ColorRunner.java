enum Color
{
WHITE,RED,BLUE,GREEN,BLACK;
}

class ColorRunner
{
public static void main(String[] arg)
{
Color arr[]=Color.values();
for(Color col:arr)
{
System.out.println(col+" has index "+col.ordinal());
}
}
}