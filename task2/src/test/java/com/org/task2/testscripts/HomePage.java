package com.org.task2.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.org.task2.constants.ConstantPaths;
import com.org.task2.helpers.PageAction;
import com.org.task2.helpers.PageActions;
import com.org.task2.helpers.ReadPropertiesFile;
import com.org.task2.helpers.ValidateTestResult;
import com.org.task2.testbase.InvokeBrowser;

public class HomePage extends InvokeBrowser {

	String Css;
	WebElement inputElement;
	PageAction page;
	ReadPropertiesFile read;

	String Xpath, usrname, pswd;

	@Test
	public void login() {
		page = new PageAction(driver);
		read = new ReadPropertiesFile();

// click home

		page.click(read.readPropertiesFile("loc.menu.home.xpath", ConstantPaths.LOCATORS_FILE));

		log.info("clicked on HOME MENU");
//validate home tab
		Xpath = read.readPropertiesFile("loc.validate.home.xpath", ConstantPaths.LOCATORS_FILE);
		String hometab = page.selectLocators(Xpath).getText();
		String exphome = read.readPropertiesFile("exphome", ConstantPaths.LOCATORS_FILE);
		ValidateTestResult.validateData(hometab, exphome, "No match");
		log.info("home tab validated");

// click hot sauces
//
//		
		page.click(read.readPropertiesFile("loc.menu.hotsauces.xpath", ConstantPaths.LOCATORS_FILE));
//	
		log.info("clicked on hot sauces");
//validate hot sauces tab
//		Xpath = read.readPropertiesFile("loc.validate.hotsauces.xpath", ConstantPaths.LOCATORS_FILE);
//		String hotsaucestab = page.selectLocators(Xpath).getText();
//		String exphotsauces = read.readPropertiesFile("exphotsauces", ConstantPaths.LOCATORS_FILE);
//		ValidateTestResult.validateData(hotsaucestab, exphotsauces, "No match");
//		log.info("sauce tab validated");
// click merchandise
//

		page.click(read.readPropertiesFile("loc.menu.merchandise.xpath", ConstantPaths.LOCATORS_FILE));

		log.info("clickced merchandise");
//validate merchandise tab
//		Xpath = read.readPropertiesFile("loc.validate.merchandise.xpath", ConstantPaths.LOCATORS_FILE);
//		String merchandise = page.selectLocators(Xpath).getText();
//		String expmerchandise = read.readPropertiesFile("expmerchandise", ConstantPaths.LOCATORS_FILE);
//		ValidateTestResult.validateData(merchandise, expmerchandise, "No match");
//		log.info("merchandise tab validated");
// clearance

		page.click(read.readPropertiesFile("loc.menu.clearance.xpath", ConstantPaths.LOCATORS_FILE));

		log.info("clicked clearance");
//validate clearance tab
//		Xpath = read.readPropertiesFile("loc.validate.clearance.xpath", ConstantPaths.LOCATORS_FILE);
//		String clearance = page.selectLocators(Xpath).getText();
//		String expclearance = read.readPropertiesFile("expclearance", ConstantPaths.LOCATORS_FILE);
//		ValidateTestResult.validateData(clearance, expclearance, "Np match");
//		log.info("clearance tab validated");

// new to sauce

		page.click(read.readPropertiesFile("loc.menu.newtohotsauce.xpath", ConstantPaths.LOCATORS_FILE));

		log.info("clicked on sauce tab");
//validate new to sauce tab
//		Xpath = read.readPropertiesFile("loc.validate.newtohotsauce.xpath", ConstantPaths.LOCATORS_FILE);
//		String newtootsauce = page.selectLocators(Xpath).getText();
//		String exptext = read.readPropertiesFile("exptext", ConstantPaths.LOCATORS_FILE);
//		ValidateTestResult.validateData(newtootsauce, exptext, "Np match");
//		log.info("validated sauce tab");

// FAQ

		page.click(read.readPropertiesFile("loc.menu.faq.xpath", ConstantPaths.LOCATORS_FILE));
		log.info("clicked on FAQ");
//validate faq tab
//		Xpath = read.readPropertiesFile("loc.validate.faq.xpath", ConstantPaths.LOCATORS_FILE);
//		String faq = page.selectLocators(Xpath).getText();
//		String expvalue = read.readPropertiesFile("expvalue", ConstantPaths.LOCATORS_FILE);
//		ValidateTestResult.validateData(faq, expvalue, "Np match");
//		log.info("validated faq tab");

	}
}
