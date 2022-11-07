package com.page.ex;

import com.baseclass.BaseClass;
import com.page.locators.LoaderLocators;

public class LoaderPageExe extends HomePageexe{
	
	public static void loadersDetails() {
		BaseClass.keyDown(14);
		BaseClass.sleep(3000);
		BaseClass.listofElements(new LoaderLocators().getloader());
	}

}
