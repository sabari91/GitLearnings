package com.ces.Learnings;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ces.Learnings.*;
public class WebTc {
	
	public static void main(String args[]){
		
		
		Web obj = new Web();
		obj.timemanagement();
		obj.windowsizing();
		obj.pagelink("https://www.irctc.co.in/eticketing/loginHome.jsf");
		obj.click("xpath", "/html/body/div/div/div[11]/form/div[1]/div[4]/div/ul/li[2]/a");
		obj.elementtext("name", "userName", "samaurai");
		obj.ExampleForAlert("xpath", "//html/body/form/div/div/div[9]/table/tbody/tr[1]/td[2]/table/tbody[1]/tr/td/table[1]/tbody[1]/tr[7]/td[2]/a");
		obj.GetAlertText("xpath", "//html/body/form/div/div/div[9]/table/tbody/tr[1]/td[2]/table/tbody[1]/tr/td/table[1]/tbody[1]/tr[7]/td[2]/a");
		obj.elementtext("name", "userName", "samaurai");
		obj.click("id", "myLink");
		obj.selectbyIndex("name", "question", 1);
		obj.elementtext("name", "answer", "puppy");
		obj.elementtext("name", "firstName", "samurai");
				
	}

}
