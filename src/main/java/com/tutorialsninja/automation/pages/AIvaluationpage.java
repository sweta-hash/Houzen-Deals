package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;


public class AIvaluationpage {
	public AIvaluationpage() {
		 PageFactory.initElements(Base.driver,this);
	 }
		
		
		@FindBy(xpath="//*[@placeholder='Zoopla/Rightmove url']")
		public static WebElement aiValuationTextBox;
		
		@FindBy(xpath="//*[text()=\"Evaluate\"]")
		public static WebElement evaluateButton;
		
		public static void evaluateZooplaLink() {
			Elements.TypeText(AIvaluationpage.aiValuationTextBox, "https://www.zoopla.co.uk/for-sale/details/59357225/?featured=1&utm_content=featured_listing");
		    Elements.click(AIvaluationpage.evaluateButton);
		}
		
		}
		

