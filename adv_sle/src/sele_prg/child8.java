package sele_prg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.security.PublicKey;

import org.openqa.selenium.firefox.FirefoxDriver;

public class child8 {
	
	public static void main(String[] args) throws InterruptedException, AWTException { 
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver	.get("https://www.selenium.dev/");
		Thread.sleep(3000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_SPACE);
		r.keyRelease(KeyEvent.VK_ALT);
		r.keyRelease(KeyEvent.VK_SPACE);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_C);
		

	
	}

}
