/**
 * 
 */
package com.java.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

/**
 * @author yuktisarwadia
 *
 */
public class FacebokLoginAutomation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new SafariDriver();
		
		driver.get("http:\\www.facebook.com");
		
		String url = "http:\\www.facebook.com";
		String currentUrl = driver.getCurrentUrl();
		
		if(url.equals(url) == currentUrl.equals(currentUrl)){
			System.out.println("Similar strings for url, proceed");
		}else
		{
			System.out.println("Disimilar strings for url, Stop");
			return;
		}
		
		driver.findElement(By.name("email")).sendKeys("yukti@gmail.com");;
		driver.findElement(By.name("pass")).sendKeys("123");
		driver.findElement(By.id("u_0_l")).click();
		
//		System.out.println("You're Logged in!! Congrats");
		
		driver.close();

	}

}
