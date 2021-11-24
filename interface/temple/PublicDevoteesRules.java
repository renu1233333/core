package com.xworkz.interfacekeyword.temple;

public class PublicDevoteesRules implements DevoteeRules{
	
	@Override
	public boolean slipperOff() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean noPhotography() {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	public boolean maintailNeatness() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean maintainSilence() {
		// TODO Auto-generated method stub
		return false;
	}

}
