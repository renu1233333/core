package com.xworkz.objectoverride;

import com.xworkz.objectoverride.constants.PlantType;

public class Plant {

	private String name;
	private boolean alive;
	private int lifeSpan;
	private PlantType type;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setLifeSpan(int lifeSpan) {
		this.lifeSpan = lifeSpan;
	}

	public int getLifeSpan() {
		return lifeSpan;
	}

	public void setType(PlantType type) {
		this.type = type;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 233;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();

	}

	@Override
	public boolean equals(Object obj) {
		System.out.println(obj);
		if (obj == null) {
			return false;

		}
		System.out.println(this.lifeSpan + "@@@@@@");
		if (obj instanceof Plant) {
			Plant plantRef = (Plant) obj;
			String nameRef = plantRef.getName();
			int lifespanRef = plantRef.getLifeSpan();
			System.out.println(lifespanRef + "%%%%");
			System.out.println(nameRef + "****");
			Integer lifeRef = Integer.valueOf(this.lifeSpan);
			System.out.println(lifeRef.getClass());

			if (name.equals(nameRef) && lifeRef.equals(lifespanRef)) {
				System.out.println("matched");
				return true;

			}
		}
		return false;
	}
}
