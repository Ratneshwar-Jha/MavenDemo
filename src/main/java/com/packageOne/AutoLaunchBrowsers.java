package com.packageOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoLaunchBrowsers {
	
	WebDriver driver;
@Test

	public void Browser() throws InterruptedException
	{
	//public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\ratneshwar.jha\\eclipse-workspace\\MavenProject\\src\\main\\resources\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		//EdgeDriver driver = new EdgeDriver();
		//ChromeDriver driver= new ChromeDriver();
		//WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		//driver.get("https://www.yatra.com/");
		//driver.findElement(By.xpath("(//p[@class='a-text-left a-size-base'])[1]")).click();
		//driver.findElement(By.xpath("(//td[@id='BE_flight_origin_date']")).click();
		
				//driver.findElement(By.xpath("(//td[@id='28/04/2022']")).click();
		
		//Thread.sleep(10000);
		//driver.findElement(By.partialLinkText("Gmail")).click();
		//driver.findElement(By.xpath("//*[@href='https://mail.google.com/mail/&ogbl']")).click();

		//WebDriverWait wait=new WebDriverWait(driver, 30);
        //WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(
                                       // By.id("dnn_dnnUser_enhancedRegisterLink")));
        //element.click();
		
		//Find number of webElements
		//int x=driver.findElements(By.xpath(".//*")).size();
		//System.out.println(x);
	}
@ Test
public void SecondBrowser()
{
	WebDriverManager.edgedriver().setup();
	
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	//ChromeDriver driver= new ChromeDriver();
	//driver.get("https://www.google.com/");
	driver.get("https://www.yatra.com/");
}
}
