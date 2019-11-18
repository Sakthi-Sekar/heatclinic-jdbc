package com.org.task2.testscripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.org.task2.constants.ConstantPaths;
import com.org.task2.helpers.PageActions;
import com.org.task2.helpers.ReadExcelData;
import com.org.task2.helpers.ValidateTestResult;

public class MerchandisePage extends HomePage {
	@Test(priority = 3)
	public void merchandiseOrderPage() {
// click merchandise menu bar

		page.click(read.readPropertiesFile("loc.menu.merchandise.xpath", ConstantPaths.LOCATORS_FILE));
		log.info("clicked on merchandise");
//validate the text 
		Xpath = read.readPropertiesFile("loc.validate.merchandisemens.text.xpath", ConstantPaths.LOCATORS_FILE);
		String acttxt = page.selectLocators(Xpath).getText();
		String expectedtext = read.readPropertiesFile("expectedtext", ConstantPaths.LOCATORS_FILE);
		ValidateTestResult.validateData(acttxt, expectedtext, "No match");
		log.info("validated text");
//click on buy now

		page.click(read.readPropertiesFile("loc.click.buynow.xpath", ConstantPaths.LOCATORS_FILE));
		log.info("clicked on buy now");
//select color

		page.click(read.readPropertiesFile("loc.selectredcolor.xpath", ConstantPaths.LOCATORS_FILE));
		log.info("selected color");
//select size

		page.click(read.readPropertiesFile("loc.selectsize.xpath", ConstantPaths.LOCATORS_FILE));
		log.info("selected size");
//select name

		page.click(read.readPropertiesFile("loc.field.name.xpath", ConstantPaths.LOCATORS_FILE));
		log.info("selected name");
//enter personalised name
		Xpath = read.readPropertiesFile("loc.field.name.xpath", ConstantPaths.LOCATORS_FILE);
		String entername = read.readPropertiesFile("name", ConstantPaths.LOCATORS_FILE);
		page.selectLocators(Xpath).sendKeys(entername);
		// driver.findElement(By.xpath(Xpath)).sendKeys(entername);
		log.info("entered personalised name");
// click buy now on modal popup

		page.click(read.readPropertiesFile("loc.popup.clickbuynow.xpath", ConstantPaths.LOCATORS_FILE));
		log.info("Clicked on buynow");
	}

}
