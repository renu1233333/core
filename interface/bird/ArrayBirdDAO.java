package com.xworkz.interfacekeyword.bird;

public abstract class ArrayBirdDAO implements BirdDAO{

	BirdDTO[] birdDTOs=new BirdDTO[10];
	int counter=0;
	
	
	@Override
	public boolean save(BirdDTO birdDTO) {
		
		if(this.birdDTOs!=null && this.counter<birdDTOs.length)
		{
			this.birdDTOs[this.counter++]=birdDTO;
			System.out.println("saved ");
			return true;
		}
		return false;
	}
	@Override
	public boolean delete(int index) {
		if(index<this.birdDTOs.length && index>=0)
		{
			this.birdDTOs[index]=null;
			System.out.println("deleted at index ".concat(String.valueOf(index)));
			return true;
		}
		System.out.println("cannot delete details");
		return false;
	}
	
	
}
