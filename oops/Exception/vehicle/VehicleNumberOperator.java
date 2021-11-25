package com.xworkz.exception.vehicle;

public class VehicleNumberOperator {

	private String[] operator = new String[5];
	private int counter = 0;

	public void create(String vehicleNo) throws VehicleNumberValidationException {
		System.out.println("invoked create");
		if (vehicleNo != null && this.counter < this.operator.length) {

			String firstPattern = vehicleNo.substring(0, 2);
			String secondPattern = vehicleNo.substring(2, 4);
			String thirdPattern = vehicleNo.substring(4, 6);
			String lastPattern = vehicleNo.substring(6, 10);

			System.out.println(firstPattern);
			 System.out.println(secondPattern);
			 System.out.println(thirdPattern);
			 System.out.println(lastPattern);
			System.out.println(vehicleNo.length());

			if (vehicleNo.length() == 10 && firstPattern.matches("[A-Z]+") && secondPattern.matches("[0-9]+")
					&& thirdPattern.matches("[A-Z]+") && lastPattern.matches("[0-9]+")) {
				this.operator[this.counter] = vehicleNo;
				System.out.println("Saved successfully " + this.operator[this.counter]);
				this.counter++;

			} else {
				throw new VehicleNumberValidationException("passed vehicle number is invalid");

			}

		} else {
			throw new StorageFullException("either passed vehicle number is null or storage is full ");
		}
	}
}
