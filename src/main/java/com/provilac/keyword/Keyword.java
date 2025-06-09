package com.provilac.keyword;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.provilac.stepDefination.TestBase;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Keyword {

	
	public String getInputFromUser() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter OTP received on mobile: ");
		String s=sc.nextLine();
		return s;
		
	}
	
	public void clickOnelementInFrame(int index, WebElement element) {
		TestBase.driver.switchTo().frame(index);
		element.click();
		TestBase.driver.switchTo().parentFrame();
	}
	
	public void captureScreenShot() {
		AShot ashot= new AShot();
	BufferedImage img=	ashot.shootingStrategy(ShootingStrategies.viewportPasting(3000)).takeScreenshot(TestBase.driver).getImage();
	try {
		ImageIO.write(img, "jpg", new File("screenshot.jpg"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
}
