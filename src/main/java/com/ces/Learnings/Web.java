package com.ces.Learnings;

import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Web {
	
	HashMap<Integer, String> map = new HashMap<Integer, String>();
	//WebDriver driver = new ChromeDriver();
	WebDriver driver = new FirefoxDriver();
	
	public void pagelink(String link)
	{
			driver.get(link);					
			
	}
	
	public void timemanagement()
	{
		//driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public void windowsizing()
	{
		
		driver.manage().window().maximize();
	}
	
	public void click(String locator, String locvalue) 
	{	
		try
			{	
				switch (locator) 
				{
					case "linktext" :
					driver.findElement(By.linkText("locvalue")).click();
					break;
					
					case "id" :
					driver.findElement(By.id(locvalue)).click();
					break;
			
					case "xpath" :
					driver.findElement(By.xpath(locvalue)).click();
					break;
				}
			}
		catch (Exception e)
		{
				System.out.println("could not connect to the server");
		}
			
	}
		
	public void elementtext(String locator, String element, String sendkeys)
	{
		try
			{	
				switch (locator) 
				{
					case "name" :
					driver.findElement(By.name(element)).sendKeys(sendkeys);
					break;
				}
			}
		catch (Exception e)
			{
				System.out.println("could not connect to the server");
			}
			

	}
	public void selectbyIndex(String locator, String element, int value)
	{
		try
			{	
				switch (locator) 
				{
			
					case "name" :
					Select sel1 = new Select(driver.findElement(By.name(element)));
					sel1.selectByIndex(value);
					break;
			
					case "xpath" :
					Select sel2 = new Select(driver.findElement(By.xpath(element)));
					sel2.selectByIndex(value);
				}
			}
			
		catch (Exception e)
			{
				System.out.println("could not connect to the server");
			}
	}
		
	public void selectbyValue(String locator, String element, String value)
	{
		try
			{	
				switch (locator) 
				{
				
					case "name" :
					Select sel2 = new Select(driver.findElement(By.name(element)));
					sel2.selectByValue(value);
					break;
				}
			}
		catch (Exception e)
			{
				System.out.println("could not connect to the server");
			}
	}
		
	public void radiobutton(String locator, String element)
	{
		try
			{	
				switch(locator)
				{
					case "id" :
					WebElement rdBtn_Exp = driver.findElement(By.id(element));
					rdBtn_Exp.click();
					break;
			
					case "xpath" :
					WebElement rdBtn_Exp1 = driver.findElement(By.xpath(element));
					rdBtn_Exp1.click();
					break;
				}
			}
		catch (Exception e)
			{
				System.out.println("could not connect to the server");
			}
		}
		public void ExampleForAlert(String locator, String element)
		{
			try
			{
				switch(locator)
				{
				case "xpath" :
					driver.findElement(By.xpath(element)).click();
					Alert alert=driver.switchTo().alert();
					//System.out.println(alert.getText());
					alert.accept();
				}
			}
			catch (Exception e)
			{
				System.out.println("could not connect to the server");
			}
			
		}
		public void ConfirmBox(String link1)
		{
			driver.get(link1);
			//driver.findElement(By.xpath("//button[@onclick='confirmFunction()']")).click();
			Alert alert=driver.switchTo().alert();
			//System.out.println(alert.getText());
			alert.dismiss();
			Alert alert1=driver.switchTo().alert();
			//System.out.println(alert1.getText());
			alert1.accept();
		}
		public void GetAlertText(String locator, String element)
		{
			try
		{
			switch(locator)
			{
			case "id" :
				driver.findElement(By.id(element)).click();
				Alert alert=driver.switchTo().alert();
				System.out.println(alert.getText());
				alert.accept();
			}
		}
		catch (Exception e)
		{
			System.out.println("could not connect to the server");
		}
		}
		
		public void tc() throws IOException{
		
			int Row_count = driver.findElements(By.xpath("//*[@id='divTrainsList']/table[1]/tbody/tr")).size();
			int Col_count = driver.findElements(By.xpath("//*[@id='divTrainsList']/table[1]/tbody/tr[1]/td")).size();
			System.out.println(Row_count);
			System.out.println(Col_count);
			
			String first_part = "//*[@id='divTrainsList']/table[1]/tbody/tr["; 
			String second_part = "]/td["; 
			String third_part = "]";
			
			 for (int i=1; i<=Row_count; i++){
				for(int j=1; j<=Col_count; j++){
					String final_xpath = first_part+i+second_part+j+third_part;
					
					String Table_data = driver.findElement(By.xpath(final_xpath)).getText();
					map.put(j, Table_data);
					System.out.print(map +" "); 
					
				} 
				System.out.println(""); 
				System.out.println(""); 
				}
			
			}

}
