package com.xworkz.objectoverride;

import com.xworkz.objectoverride.constants.WatchType;

public class Watch {

	private String brandName;
	private WatchType type;
	private float price;

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setType(WatchType type) {
		this.type = type;
	}

	public WatchType getType() {
		return type;
	}

	@Override
	public String toString() {

		return super.toString();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 100;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			System.out.println("you are passing null.Do not pass null");
			return false;
		}

		if (obj instanceof Watch) {
			Watch castedWatch = (Watch) obj;
			String brandNameRef = castedWatch.getBrandName();
			System.out.println(brandNameRef);
			System.out.println(this.brandName);
			WatchType typeRef = castedWatch.getType();

			System.out.println(this.type);
			System.out.println(typeRef);

			if (brandName.equals(brandNameRef) && type.equals(typeRef)) {
				System.out.println("matched");
				return true;
			}
		}

		return false;
	}
}
