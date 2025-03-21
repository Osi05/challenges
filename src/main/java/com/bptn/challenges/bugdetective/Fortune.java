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
	}

}
