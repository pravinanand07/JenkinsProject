package org.temp;

import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NaukriUpdate {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Praveen\\eclipse-workspace\\SRYA\\JenkinsProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/mnjuser/homepage");
		driver.findElement(By.id("usernameField")).sendKeys("praveene94kumar@gmail.com");
		driver.findElement(By.id("passwordField")).sendKeys("albuquerque@07" +Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'UPDATE')]")).click();
		Thread.sleep(5000);
		WebElement findElement = driver.findElement(By.xpath("(//*[contains(text(),'Employment')])[2]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", findElement);
		driver.findElement(By.xpath("(//span[@class='edit icon'])[3]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@class='material-icons close'])[5]")).click();
		driver.findElement(By.xpath("//label[@for='no']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@for='yes']")).click();
		Thread.sleep(3000);
		WebElement save = driver.findElement(By.xpath("//button[@id='submitEmployment']"));
		js.executeScript("arguments[0].scrollIntoView(true)", save);
		save.click();
	}

}
