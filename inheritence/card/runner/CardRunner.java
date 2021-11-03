package com.xworkz.casting.card.runner;
import com.xworkz.casting.card.*;
public class CardRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Card card=new Card();
		System.out.println(card.expeiredYear);
		System.out.println(card.name);
		
		Card cardRef=new AdharCard();
		System.out.println(cardRef.expeiredYear);
		
		if(cardRef instanceof AdharCard)
		{
			AdharCard adharCard=(AdharCard)cardRef;
			System.out.println(adharCard.adharNo);
		}
		
		AdharCard adhar=new AdharCard();
		ATMCard atm=new ATMCard();
		Card[] card1=new Card[10];
		card1[0]=adhar;
		card1[1]=atm;
		
		for (int i = 0; i < card1.length; i++) {
			if(card1[i] instanceof AdharCard)
			{
				AdharCard adharRef1=(AdharCard) card1[i];
				System.out.println(adharRef1.adharNo);
			}
			if(card1[i] instanceof ATMCard)
			{
				ATMCard atmRef1=(ATMCard) card1[i];
				System.out.println(atmRef1.bankName);
			}
		}
		
		
		
		
	}

}
