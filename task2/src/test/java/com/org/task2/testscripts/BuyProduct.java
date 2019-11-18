package com.org.task2.testscripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.org.task2.constants.ConstantPaths;
import com.org.task2.helpers.PageActions;
import com.org.task2.helpers.ValidateTestResult;

public class BuyProduct extends MerchandisePage {
	@Test(priority = 4)
	public void clickCartAndViewDetails() {
		// click cart symbol

		page.click(read.readPropertiesFile("loc.click.cartsymbol.xpath", ConstantPaths.LOCATORS_FILE));

//validate size
		Xpath = read.readPropertiesFile("loc.validatecart.size.xpath", ConstantPaths.LOCATORS_FILE);
		String actsize = page.selectLocators(Xpath).getText();
		String expsize = read.readPropertiesFile("expsize", ConstantPaths.LOCATORS_FILE);
		ValidateTestResult.validateData(actsize, expsize, "No match");
		log.info(" matches");
//validate personalized name
		Xpath = read.readPropertiesFile("loc.validate.personalizedname.xpath", ConstantPaths.LOCATORS_FILE);
		String actlname = page.selectLocators(Xpath).getText();
		String exptname = read.readPropertiesFile("exptname", ConstantPaths.LOCATORS_FILE);
		ValidateTestResult.validateData(actlname, exptname, "No match");
		log.info(" matches");
//validate color
		Xpath = read.readPropertiesFile("loc.validatecolor.xpath", ConstantPaths.LOCATORS_FILE);
		String actcolor = page.selectLocators(Xpath).getText();
		String expcolor = read.readPropertiesFile("expcolor", ConstantPaths.LOCATORS_FILE);
		ValidateTestResult.validateData(actcolor, expcolor, "No match");
		log.info(" matches");
//validate price
		Xpath = read.readPropertiesFile("loc.validate.initialprice.xpath", ConstantPaths.LOCATORS_FILE);
		String actprice = page.selectLocators(Xpath).getText();
		String expprice = read.readPropertiesFile("initprice", ConstantPaths.LOCATORS_FILE);
		ValidateTestResult.validateData(actprice, expprice, "No match");
		log.info("matches");
//validate total price
		Xpath = read.readPropertiesFile("loc.validate.total.xpath", ConstantPaths.LOCATORS_FILE);
		String acttotal = page.selectLocators(Xpath).getText();
		String exptotal = read.readPropertiesFile("total", ConstantPaths.LOCATORS_FILE);
		ValidateTestResult.validateData(acttotal, exptotal, "No match");
		log.info("matches");

	}
	// loc.validate.final

	@Test(priority = 5)
	public void clickProduct() {
		page.click(read.readPropertiesFile("loc.increase.qty.xpath", ConstantPaths.LOCATORS_FILE));
		// page.selectLocators("loc.increase.qty.xpath").clear();
		// driver.findElement(By.xpath(Xpath)).clear();
		Xpath = read.readPropertiesFile("loc.increase.qty.xpath", ConstantPaths.LOCATORS_FILE);
		String number = read.readPropertiesFile("number", ConstantPaths.LOCATORS_FILE);
		page.selectLocators(Xpath).sendKeys(number);

		page.click(read.readPropertiesFile("loc.click.update.xpath", ConstantPaths.LOCATORS_FILE));

		/*
		 * Xpath = read.readPropertiesFile("loc.validate.final",
		 * ConstantPaths.LOCATORS_FILE); String actfinaltotal =
		 * page.selectLocators(Xpath).getText(); String expfinaltotal =
		 * read.readPropertiesFile("final", ConstantPaths.LOCATORS_FILE);
		 * ValidateTestResult.validateData(actfinaltotal, expfinaltotal, "No match");
		 * log.info(" matches");
		 */

	}
}
