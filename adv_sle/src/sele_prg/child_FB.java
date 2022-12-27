package sele_prg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class child_FB {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https:/www.facebook.com");
		driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		Robot r= new Robot();
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_SPACE);
		r.keyPress(KeyEvent.VK_N);
		r.keyRelease(KeyEvent.VK_ALT);
		r.keyRelease(KeyEvent.VK_SPACE);
		r.keyRelease(KeyEvent.VK_N);
		

	}

}
