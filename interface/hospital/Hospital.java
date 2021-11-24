package com.xworkz.interfacekeyword.hospital;

public class Hospital {

	
	private String name;
	private String location;
	private boolean govt;
	private HospitalAdmitRule hospitalAdmitRule;
	private HospitalDischargeRule hospitalDischargeRule;
	
	
	public Hospital() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Hospital(String name, String location, boolean govt, HospitalAdmitRule hospitalAdmitRule,
			HospitalDischargeRule hospitalDischargeRule) {
		super();
		this.name = name;
		this.location = location;
		this.govt = govt;
		this.hospitalAdmitRule = hospitalAdmitRule;
		this.hospitalDischargeRule = hospitalDischargeRule;
	}


	public void admitPatient()
	{
		if(hospitalAdmitRule!=null)
		{
			System.out.println("passed the rules");
			String register=hospitalAdmitRule.register();
			if(register=="registered")
			{
				System.out.println("Already registered");
				double advance=hospitalAdmitRule.payAdvance();
				boolean insurance=hospitalAdmitRule.validInsurance();
				if(advance>=1000 ||insurance==true)
				{
					System.out.println("either you paid advance or you got health insurance");
				}
				else
				{
					System.out.println("please pay the advance..");
				}
			}
			else
			{
				System.out.println("patient name is not yet registered..please register");
			}
		
		}
		
		else
		{
			System.out.println("pass the rules first");
		}
		
	}
	
	public void dischargePatient()
	{
		if(hospitalDischargeRule!=null)
		{
			System.out.println("passed the rules");
			boolean payBill=hospitalDischargeRule.payBill();
			double discount =hospitalDischargeRule.discount();
			if(payBill==true && discount>=10)

			{
				System.out.println("we are discharging patient");
			}
			else
			{
				System.out.println("please pay the bill before discharge");
			}
		}
		else
		{
			System.out.println("please pass the rules first");
		}
	}
	
	
}
