package com.bptn.challenges.language;

public class Language {

	// instances for Language
	protected String name;
	protected int speakersPopulation;
	protected String regionsSpoken;
	protected String wordOrder;

	// constructor for Language
	public Language(String name, int speakersPopulation, String regionsSpoken, String wordOrder) {
		this.name = name;
		this.speakersPopulation = speakersPopulation;
		this.regionsSpoken = regionsSpoken;
		this.wordOrder = wordOrder;

	}

	// creating getInfo method
	public void getInfo() {
		System.out.println(name + " is spoken by " + speakersPopulation + " people mainly in " + regionsSpoken
				+ ".\nThe language follows the word order: " + wordOrder + ".\n");
	}

	public static void main(String[] args) {

		Language myLang = new Language("Nyu", 100000, "Asia", "verb-object-subject");

		myLang.getInfo();

		Mayan mayanLang = new Mayan("Ki'che'", 2330000);

		mayanLang.getInfo();

	}

}
