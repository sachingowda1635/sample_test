package sele_prg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class child6 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		WebElement ele1 = driver.findElement(By.xpath("//span[.='Downloads']"));
		WebElement ele2 = driver.findElement(By.xpath("//span[.='Documentation']"));
		WebElement ele3 = driver.findElement(By.xpath("//span[.='Projects']"));
		WebElement ele4 = driver.findElement(By.xpath("//span[.='Support']"));
		ArrayList<WebElement> a = new ArrayList<WebElement>();
		a.add(ele1);
		a.add(ele2);
		a.add(ele3);
		a.add(ele4);
		Actions actions = new Actions(driver); 
		Robot r = new Robot();
		for(WebElement ele:a)
		{
			actions.contextClick(ele).perform();
			Thread.sleep(2000);
			
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_T);
		}
	}
	

}
