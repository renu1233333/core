package com.xworkz.interfacekeyword.bird;

public class ArrayBirdDAOs extends ArrayBirdDAO{
	@Override
	public int update(int index,BirdDTO birdDTO) {
		if(index<super.birdDTOs.length && index>=0 && birdDTOs!=null)
		{
			super.birdDTOs[index]=birdDTO;
			System.out.println("updated at index ".concat(String.valueOf(index)));
			return index;
		}
		System.out.println("update failed..");
		return -1;
	}
	@Override
	public void displayDetails() {
		for(int i=0;i<birdDTOs.length;i++)

		{
			BirdDTO ref=birdDTOs[i];
			if(ref!=null)
			{
				System.out.println(ref.getId());
				System.out.println(ref.getAge());
				System.out.println(ref.getBreed());
				System.out.println(ref.getOrigin());
				System.out.println(ref.isCanFly());
			}
			else
			{
				System.out.println("refering null at index ".concat(String.valueOf(i)));
			}
		}
	}
}
