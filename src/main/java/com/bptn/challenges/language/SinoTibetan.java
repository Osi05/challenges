package com.bptn.challenges.language;

public class SinoTibetan extends Language{
	
	public SinoTibetan(String name, int speakersPopulation) {
		
		super(name, speakersPopulation, "Asia", "subject-object-verb");
		
		if(name.contains("Chinese")) {
			this.wordOrder = "subject-verb-object";
		}
	}
}
