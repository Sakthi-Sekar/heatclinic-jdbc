package com.org.task2.helpers;

import org.testng.Assert;

public class ValidateTestResult {

	public static boolean validateData(Object actual, Object expected, String message) {
		try {
			Assert.assertEquals(actual, expected);
			return true;
		} catch (AssertionError assertionError) {
			return false;
		}
	}

}
