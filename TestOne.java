package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestOne {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\Driver\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		//driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb\r\n"
				+ "");
		
	WebElement fname=driver.findElement(By.id("input-firstname"));
		fname.sendKeys("sample");
//		
//		WebElement lname=driver.findElement(By.id("input-lastname"));
//		lname.sendKeys("Hello");
//		
//		WebElement email=driver.findElement(By.id("input-email"));
//		email.sendKeys("world@gmail.com");
//		
//		WebElement pass=driver.findElement(By.id("input-password"));
//		pass.sendKeys("byebye");
//		
//		WebElement btn=driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button"));
//		btn.click();
		
//		Thread.sleep(5000);
//		driver.close();
		
		//by using xpath
//		WebElement sebtn=driver.findElement(By.xpath("//input[@name=\"search\"]"));
//		sebtn.sendKeys("laptop");
		//by using id
		//WebElement sebtn=driver.findElement(By.name("search"));
		//sebtn.sendKeys("laptops");
		
		WebElement searchbar=driver.findElement(By.xpath("//*[@id=\"search\"]/input"));
		searchbar.click();
		
		WebElement btn=driver.findElement(By.xpath("//*[@id=\"search\"]/button"));
		btn.click();
		//wait for 3 secs
		Thread.sleep(3000);
		//backward
		driver.navigate().back();
		//javascriptexecutor
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1300)", "");
		Thread.sleep(5000);
		
		//returns
		WebElement returns =driver.findElement(By.xpath("/html/body/footer/div/div/div[2]/ul/li[2]/a"));
		returns.click();
		driver.close();
	}

}
