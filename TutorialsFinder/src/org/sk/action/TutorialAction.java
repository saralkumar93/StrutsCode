package org.sk.action;

import org.sk.service.TutorialFinderService;

public class TutorialAction {
	
	private String bestTutorialSite;
	private String language;
	
	
	public String getTutorial() {
	//	TutorialFinderService tutorialFinderService=new TutorialFinderService();
		//System.out.println(getLanguage());
	//	setBestTutorialSite(tutorialFinderService.getBestTutorialSite(getLanguage()));
		System.out.println("getTutorial method called");
		return "success";
	}
	public String addTutorial() {
		//TutorialFinderService tutorialFinderService=new TutorialFinderService();
		//System.out.println(getLanguage());
		//setBestTutorialSite(tutorialFinderService.getBestTutorialSite(getLanguage()));
		System.out.println("addTutorial called");
		return "success";
	}

	public String getBestTutorialSite() {
		return bestTutorialSite;
	}

	public void setBestTutorialSite(String bestTutorialSite) {
		this.bestTutorialSite = bestTutorialSite;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

}
