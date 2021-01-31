package org.sk.service;
// business service method

public class TutorialFinderService {
	public String getBestTutorialSite(String language) {
		
		if (language.equals("java")) {
		
		return "java Brains";
		}
		else {
			return "Language not yet supported  !";
		}
		}
	}
