package com.page.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoaderLocators extends HomePageLocators {
	public LoaderLocators() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@class='col-12 mb-4 col-md-6 col-lg-4']")
	private List<WebElement> loader;
	
	public List<WebElement> getloader(){
		return loader;
	}
	
	
}
