package com.packageOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\ratneshwar.jha\\eclipse-workspace\\MavenProject\\src\\main\\resources\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/Samsung-Galaxy-Blue-128GB-Storage/dp/B09CGJK2HG/ref=sr_1_2_sspa?crid=32RAWVTQWWDV9&keywords=mobile&qid=1648184118&sprefix=mobile%2Caps%2C285&sr=8-2-spons&psc=1&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUExUDlWVlVCNUdUNlRPJmVuY3J5cHRlZElkPUEwNDU3OTgzMTk3QkQzM1JLS0JHUSZlbmNyeXB0ZWRBZElkPUEwNjc1NDI1MjZERzZKU1Y3Q1VJMyZ3aWRnZXROYW1lPXNwX2F0ZiZhY3Rpb249Y2xpY2tSZWRpcmVjdCZkb05vdExvZ0NsaWNrPXRydWU=");
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//span[@class='a-price a-text-price a-size-medium apexPriceToPay']/span")).getText();

		
		//https://www.amazon.in/Samsung-Galaxy-Blue-128GB-Storage/dp/B09CGJK2HG/ref=sr_1_2_sspa?crid=32RAWVTQWWDV9&keywords=mobile&qid=1648184118&sprefix=mobile%2Caps%2C285&sr=8-2-spons&psc=1&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUExUDlWVlVCNUdUNlRPJmVuY3J5cHRlZElkPUEwNDU3OTgzMTk3QkQzM1JLS0JHUSZlbmNyeXB0ZWRBZElkPUEwNjc1NDI1MjZERzZKU1Y3Q1VJMyZ3aWRnZXROYW1lPXNwX2F0ZiZhY3Rpb249Y2xpY2tSZWRpcmVjdCZkb05vdExvZ0NsaWNrPXRydWU=
	}

}
