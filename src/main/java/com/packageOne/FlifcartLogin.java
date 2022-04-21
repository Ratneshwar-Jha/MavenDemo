package com.packageOne;//input[@class='_2IX_2- VJZDxU']

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlifcartLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		//_2KpZ6l _2doB4z
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='_1_3w1N']")).click();
		//driver.findElement(By.xpath("(//td[@id='BE_flight_origin_date']")).click();
		
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("hello");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("hello");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		
	}

}
