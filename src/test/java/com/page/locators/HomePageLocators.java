package com.page.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class HomePageLocators extends BaseClass {

	public HomePageLocators() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//button[@aria-label='Close'])[2]")
	private WebElement cancel;

	public WebElement getcancel() {
		return cancel;
	}

	@FindBy(xpath = "(//div[@class='text-uppercase m-0 pr-2 py-1 font-weight-bold'])")
	private WebElement equipment;

	public WebElement getequipment() {
		return equipment;
	}

	@FindBy(xpath = "(//span[@class='menu-lvl3 position-relative d-inline-block text-wrap'])[3]")
	private WebElement loaderlist;

	public WebElement getloaderlist() {
		return loaderlist;

	}

}
