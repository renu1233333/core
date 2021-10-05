class RegistrationForm
{
States states;
public static void main(String[] a)
{
	States states1=States.ANDHRAPRADESH;
	States[] states=States.values();
	
	for(int i=0;i<states.length;i++)
	{
	System.out.println(states[i].name);
	}
	for(States state:states)
	{
	System.out.println(state.name);
	}
}
}