package com.provilac.utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import com.provilac.stepDefination.TestBase;

public class WaitUtil {
	
	public static FluentWait<WebDriver> wait;
	
	static {
		wait= new FluentWait<WebDriver>(TestBase.driver);
		wait.pollingEvery(Duration.ofMillis(500));
		wait.withTimeout(Duration.ofMinutes(1));
	}

		public static void elementToBeVisible(WebElement element) {
				wait.until(ExpectedConditions.visibilityOf(element));
		}
	
		public static void elementToBeClickable(WebElement element) {
			wait.until(ExpectedConditions.elementToBeClickable(element));
		}
		
		public static void staleOfElement(WebElement ele) {
			wait.until(ExpectedConditions.stalenessOf(ele));
		}
		
		public static WebElement waitForVisibility(By locator) {
		    return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		}
		
		public static void staleElement(WebElement ele) {
			wait.until(ExpectedConditions.stalenessOf(ele));
		}
		
}
