class DataTypeRunner
{
public static void main(String[] args)
{
float flow=DataTypes.size;
System.out.println(flow);
System.out.println(DataTypes.weight);
System.out.println(DataTypes.mal);
System.out.println(DataTypes.no);
System.out.println(DataTypes.type);
DataTypes.weight=34.2f;
System.out.println("\u0000");
System.out.println(DataTypes.size==DataTypes.height);
System.out.println(DataTypes.size==DataTypes.weight);
System.out.println(DataTypes.special);

}}