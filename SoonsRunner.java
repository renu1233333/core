class SoonsRunner
{
	public static void main(String[] arg)
	{
		Spoons spoo=new Spoons("silver","silver",1.1f);
		System.out.println(spoo.type);
		System.out.println(spoo.color);
		System.out.println(spoo.weight);
		Spoons spoo1=new Spoons();
		System.out.println(spoo1.type);
		System.out.println(spoo1.color);
		System.out.println(spoo1.weight);
		Spoons spoo2=new Spoons("black",1.3f);
		System.out.println(spoo2.type);
		System.out.println(spoo2.color);
		System.out.println(spoo2.weight);
	}
}