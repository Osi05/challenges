package com.bptn.challenges.bugdetective;

import java.lang.Math;

public class Fortune {
	
	//generateRandom method
	public int generateRandom() {
		
		int rand = (int)(Math.random() * 10);
		
		return rand;
	}
	
	public static void main(String[] args) {
		
		Fortune fortuneCookie = new Fortune();
		
		int fortune = fortuneCookie.generateRandom();
		
		if(fortune == 0) {
			System.out.println();
		}
		else if (fortune == 1) {
			System.out.println();
		}
		else if (fortune == 2) {
			System.out.println();
		}
		else if (fortune == 3) {
			System.out.println();
		}
		else if (fortune == 4) {
			System.out.println();
		}
		else if (fortune == 5) {
			System.out.println();
		}
		else if (fortune == 6) {
			System.out.println();
		}
		else if (fortune == 7) {
			System.out.println();
		}
		else if (fortune == 8) {
			System.out.println("");
		}
		else if (fortune == 9) {
			System.out.println("The fortune you seek is in a different cookie.");
		}
		
	}

}
