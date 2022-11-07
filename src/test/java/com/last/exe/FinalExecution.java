package com.last.exe;

import com.page.ex.HomePageexe;
import com.page.ex.LoaderPageExe;

public class FinalExecution extends LoaderPageExe {

	public static void main(String[] args) {
		
		browserLaunch();
		url("https://www.bobcat.com/in/en/");
		equpmentClick();
		allLoadersClick();
		loadersDetails();
	}

}
