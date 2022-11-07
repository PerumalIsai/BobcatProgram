package com.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileReader;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public static void browserLaunch() {
		try {
			// System.setProperty("webdriver.chrome.driver",
			// "C:\\Users\\ISAI\\eclipse-workspace\\GmailNewUser\\driver\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void url(String url) {
		driver.get(url);
	}

	public static void sendKeys(WebElement element, String name) {
		element.sendKeys(name);
	}

	public static WebElement findById(String id) {
		return driver.findElement(By.id(id));
	}

	public static WebElement findByName(String name) {
		return driver.findElement(By.name(name));
	}

	public static WebElement findByXpath(String xpath) {
		return driver.findElement(By.xpath(xpath));
	}

	public static void sendkeys1(By by, String name) {
		driver.findElement(by).sendKeys(name);
	}

	public static void click(WebElement element) {
		element.click();
	}

	public static void clear(WebElement element) {
		element.clear();
	}

	public static void keyDown(int n) {

		try {
			Robot r = new Robot();
			for (int i = 1; i < n; i++) {
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static String propertiesFile(String name) {
		String property = name;
		try {
			// File f = new
			// File("C:\\Users\\ISAI\\eclipse-workspace\\GmailNewUser\\src\\test\\resources\\Test.properties\\sendkeys.properties");
			FileReader fr = new FileReader(new File(
					"C:\\Users\\ISAI\\eclipse-workspace\\GmailNewUser\\src\\test\\resources\\Test.properties\\sendkeys.properties"));
			// FileReader fr1 = new FileReader(f);
			Properties ps = new Properties();
			ps.load(fr);
			property = ps.getProperty(name);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return property;
	}

	public static void movetoElement(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).build().perform();
	}

	public static void actionClick(WebElement element) {
		Actions a = new Actions(driver);
		a.click(element).build().perform();
	}

	public static void implicitlyWait(long n) {
		try {
			driver.manage().timeouts().implicitlyWait(n, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void sleep(long n) {
		try {
			Thread.sleep(n);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String getAttribute(WebElement element, String value) {
		String attribute=value;
	    attribute = element.getAttribute(value);
		System.out.println(attribute);
		return attribute;
	}

	public static void scrollParticularPlace(String name) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true)", name);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void listofElements(List<WebElement> element) {
		
		for(WebElement element1:element) {
			System.out.println(element1.getText());
		}
	}
}
