package com.xworkz.interfacekeyword.temple;

public class TempleAssociation {

	private DevoteeRules devoteeRules;
	private String name;
	
public TempleAssociation() {
	System.out.println("invoked no argument default constructor");
}

public TempleAssociation(DevoteeRules devoteeRules, String name) {
	super();
	this.devoteeRules = devoteeRules;
	this.name = name;
}

public void allowDevotees()
{
	
	System.out.println("invoked allowDetails");
	if(devoteeRules!=null)
	{
		System.out.println("passed the rules");
	    boolean slipperResult=devoteeRules.slipperOff();
	    if(slipperResult)
	    {
	    	System.out.println("implementing next method rule");
	    	
	    	boolean photoResult=devoteeRules.noPhotography();
	    	boolean maintainSilence=devoteeRules.maintainSilence();
	    	if(photoResult && maintainSilence)
	    	{
	    		System.out.println("good devotee");
	    	}
	    	else
	    	{
	    		System.err.println("Bad devotees do not maintain silence and takes photo!!!!!!....warning you to maintain silence and dont take");
	    	}
	    }
	    else
	    {
	    	System.err.println("please leave the slipper outside temple premises");
	    }
		
	}
	else
	{
		System.err.println("pass me the rules");
	}
}
}
