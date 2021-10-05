class KeyBoardRunner
{
public static void main(String[] keyss)
{
String type="wired";
String color="white";
int numberOfKeys=102;
KeyBoard board=new KeyBoard(type,color,numberOfKeys);
System.out.println(board.type);
System.out.println(board.color);
System.out.println(board.numberOfKeys);
type="wireless";
color="Black";
numberOfKeys=103;
KeyBoard keys=new KeyBoard(type,color,numberOfKeys);
System.out.println(keys.type);
System.out.println(keys.color);
System.out.println(keys.numberOfKeys);


}
}