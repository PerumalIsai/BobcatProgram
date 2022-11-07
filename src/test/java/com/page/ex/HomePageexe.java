package com.page.ex;

import com.baseclass.BaseClass;
import com.page.locators.HomePageLocators;

public class HomePageexe extends HomePageLocators {

	public static void equpmentClick() {
		BaseClass.sleep(4000);
		HomePageLocators h = new HomePageLocators();
		BaseClass.movetoElement(h.getcancel());
		BaseClass.actionClick(h.getcancel());
		BaseClass.movetoElement(h.getequipment());
		BaseClass.click(h.getequipment());
	}
	public static void allLoadersClick() {
		BaseClass.sleep(3000);
		BaseClass.movetoElement(new HomePageLocators().getloaderlist());
		BaseClass.actionClick(new HomePageLocators().getloaderlist());
	}

}
