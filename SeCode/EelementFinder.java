package com.selenium.elementfinder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EelementFinder {
	
	static WebElement searchBox;
	static WebElement link;

	public static void main(String[] args) throws Exception {

		// lets discuss how we can find the 'WEBELEMENTS' from web page / web applcation
		// Basically there are different ways to find the webelements of any web
		// application
		// In this class we will discuss some of the simplest element finder
		// 1. By Id 2.By Name 3.By ClassName 4.By TagName 5.By Link

		// lets see first how we can locate Webelement using ID

		 System.setProperty("webdriver.chrome.driver", "/Users/gaurnitai/Documents/SeleniumJava/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		/*
		 * <input type="text" id="twotabsearchtextbox" value="" name="field-keywords"
		 * autocomplete="off" placeholder="" class="nav-input" tabindex="6">
		 */
		//on landing to amazon Home Page we will find SEARCH box and above is the HTML code for the same.Now lets see how we can access 
		//searchbox using different locators
		
		// 1. To find element by ID 
		 searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		 System.out.println("Search Box using Id : "+searchBox);
		System.out.println(searchBox.getText());
		System.out.println(searchBox.getTagName());
		System.out.println(searchBox.getClass());
		
		// 2. To find element by Name 
		searchBox = driver.findElement(By.name("field-keywords"));
		System.out.println("Search Box using Name : "+ searchBox);
		System.out.println(searchBox.getText());
		System.out.println(searchBox.getTagName());
		System.out.println(searchBox.getClass());
		
		// 3. To find Element by ClassName
		searchBox = driver.findElement(By.className("nav-input"));
		System.out.println("Search Box using ClassName : "+ searchBox);
		System.out.println(searchBox.getText());
		System.out.println(searchBox.getTagName());
		System.out.println(searchBox.getClass());
		
		// 4. To find SearchBox using TagName
		searchBox = driver.findElement(By.tagName("input"));
		System.out.println("Search Box using TagName : "+searchBox);
		
		
		// In console we can see all the ways of locating elements are working fine without any error
		
		// 5. Lets discuss BY LINK
		
		/* Basically By LINK is used to access any link on web pages ie. any text that navigate to another page on clicking 
		 * and generally this elements are represented under attribute name-- 'href'
		 */
		
	//	<a href="/gp/yourstore/home/ref=nav_cs_ys" class="nav-a nav_a" id="nav-your-amazon">rajeshwar's Amazon.in</a>

	    System.out.println();
		link = driver.findElement(By.linkText("Your Amazon.in"));
		System.out.println("Link element using By LINK :" + link);
		System.out.println(link.getText()); // Your Amazon.in --- from this we can say when we have to use By Link to locate any link, 
		// the link text is nothing but same as we get using link.getText() method. So if we are not sure lnk text we have 
		//to use in By.LinkText() method we can simple cross check using link.getText() method
		System.out.println(link.getAttribute("href")); // https://www.amazon.in/gp/yourstore/home/ref=nav_cs_ys/260-7785790-4590402
		System.out.println(link.getAttribute("id")); // nav-your-amazon

		link = driver.findElement(By.linkText("Customer Service"));
		System.out.println("\nLink element using By LINK :" + link); // "\n to print line in next line"
		System.out.println(link.getText());
		
		link = driver.findElement(By.linkText("Today's Deals"));
		System.out.println("\nLink element using By LINK :" + link); // "\n to print line in next line"
		System.out.println(link.getText());
		
		Thread.sleep(3000);
		link = driver.findElement(By.partialLinkText("Today's"));
		System.out.println("\nLink element using By LINK :" + link); // "\n to print line in next line"
		System.out.println(link.getText());
		

		link = driver.findElement(By.partialLinkText("Your"));
		System.out.println("\nLink element using By LINK :" + link); // "\n to print line in next line"
		System.out.println(link.getText());
		
	}

}
