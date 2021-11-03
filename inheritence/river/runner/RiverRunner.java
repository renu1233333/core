package com.xworkz.casting.river.runner;

import com.xworkz.casting.*;
import com.xworkz.casting.river.*;

public class RiverRunner {

	public static void main(String[] args) {

		River river = new River();

		System.out.println(river.destination);
		System.out.println(river.length);
		System.out.println(river.name);
		System.out.println(river.origin);

		TungabadraRiver tungabadra = new TungabadraRiver();

		System.out.println(tungabadra.destination);
		System.out.println(tungabadra.length);
		System.out.println(tungabadra.name);
		System.out.println(tungabadra.origin);
		System.out.println(tungabadra.noDams);

		SharavatiRiver sharavati = new SharavatiRiver();
		System.out.println(sharavati.destination);
		System.out.println(sharavati.length);
		System.out.println(sharavati.name);
		System.out.println(sharavati.origin);
		System.out.println(sharavati.color);

		River tunga = new TungabadraRiver();
		System.out.println(tunga.destination);

		if (tunga instanceof TungabadraRiver) {

			TungabadraRiver tungaRef = (TungabadraRiver) tunga;
			System.out.println(tungaRef.noDams);
			System.out.println("**********");
			tungaRef.displayFlow();

		}

		if (tunga instanceof SharavatiRiver) {
			SharavatiRiver sharaRef = (SharavatiRiver) tunga;
			System.out.println(sharaRef.destination);

		}

		River[] riverRef = new River[3];
		riverRef[0] = tungabadra;

		riverRef[1] = sharavati;

		for (int kimchi = 0; kimchi < riverRef.length; kimchi++) {
			if (riverRef[kimchi] instanceof TungabadraRiver) {
				TungabadraRiver tungaRiverRef = (TungabadraRiver) riverRef[kimchi];
				System.out.println(tungaRiverRef.noDams);
			}
			if (riverRef[kimchi] instanceof SharavatiRiver) {
				SharavatiRiver sharavatiRiverRef = (SharavatiRiver) riverRef[kimchi];
				System.out.println(sharavatiRiverRef.color);
			}
		}

		Object obj = new TungabadraRiver();
		if (obj instanceof TungabadraRiver) {
			TungabadraRiver riverRef1 = (TungabadraRiver) obj;
			System.out.println(riverRef1.noDams);
		}
		River river1 = new SharavatiRiver();

		if (river1 instanceof River) {
			SharavatiRiver riv = (SharavatiRiver) river1;
		}

		Object obj1 = new River();
		if (obj1 instanceof Object) {
			River riv4 = (River) obj1;
			System.out.println(riv4.destination);
			System.out.println(riv4.length);
		}

	}

}
