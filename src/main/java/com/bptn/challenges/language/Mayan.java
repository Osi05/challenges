package com.bptn.challenges.language;

public class Mayan extends Language {

	public Mayan(String name, int speakersPopulation) {
		super(name, speakersPopulation, "Central America", "verb-object-subject");
	}

	// Overriding getInfo()
	public void getInfo() {
		System.out.println(name + " is spoken by " + speakersPopulation + " people mainly in " + regionsSpoken
				+ ".\nThe language follows the word order: " + wordOrder + "\nFun fact: " + name
				+ " is an ergative language.\n");
	}

}
