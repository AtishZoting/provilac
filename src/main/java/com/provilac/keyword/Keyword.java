package com.provilac.keyword;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

import javax.imageio.ImageIO;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.provilac.stepDefination.TestBase;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Keyword {

	Actions action = new Actions(TestBase.driver);

	public String getInputFromUser() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter OTP received on mobile: ");
		String s = sc.nextLine();
		sc.close();
		return s;
	}

	public void clickOnelementInFrame(int index, WebElement element) {
		TestBase.driver.switchTo().frame(index);
		element.click();
System.out.println("changes from Atish1 branch");
System.out.println("Ticket2");


		TestBase.driver.switchTo().parentFrame();
	}

	public void captureScreenShot(String filePath) throws IOException {

		Date date = new Date();
		String dateFormat = date.toString().replace(" ", "-").replace(":", "-");
		AShot ashot = new AShot();
		BufferedImage img = ashot.shootingStrategy(ShootingStrategies.viewportPasting(2000))
				.takeScreenshot(TestBase.driver).getImage();

		String baseDir = System.getProperty("user.dir");
		ImageIO.write(img, "jpg", new File(baseDir + filePath + dateFormat + ".jpg"));

	}

	public void clickOnWebElement(WebElement ele) throws InterruptedException {

		action.moveToElement(ele);
		action.click();
		action.perform();
	}

	public void acceptAlert() {
		Alert alert = TestBase.driver.switchTo().alert();
		alert.accept();
	}

	public void scrollPage() {
		JavascriptExecutor jse = (JavascriptExecutor) TestBase.driver;
		jse.executeScript("window.scrollBy(0,500)");
	}

	public void sendTextOnWebElement(WebElement ele, String value) {

		action.moveToElement(ele);
		action.click();
		action.sendKeys(value);
		action.perform();
	}

}
