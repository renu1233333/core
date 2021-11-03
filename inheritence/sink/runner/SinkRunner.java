package com.xworkz.casting.sink.runner;
import com.xworkz.casting.card.runner.ATMCard;
import com.xworkz.casting.card.runner.AdharCard;
import com.xworkz.casting.sink.*;
public class SinkRunner {

	public static void main(String[] args) {
		
        BathroomSink bathroom=new BathroomSink();
        KitchenSink kitchen=new KitchenSink();
        Sink[] sink=new Sink[10];
        sink[0]=bathroom;
        sink[1]=kitchen;
        
        
        for (int i = 0; i < sink.length; i++) {
			if(sink[i] instanceof BathroomSink)
			{
				BathroomSink bathroomRef1=(BathroomSink) sink[i];
				System.out.println(bathroomRef1.type);
			}
			if(sink[i] instanceof KitchenSink)
			{
				KitchenSink kitchenRef1=(KitchenSink) sink[i];
				System.out.println(kitchenRef1.material);
			}
		}
	}

}
