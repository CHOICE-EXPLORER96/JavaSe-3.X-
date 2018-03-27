package com.selenium.elementfinder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementFindByCssSelector {

	// lets discuss another more important way  of finding ELEMENTS on web Page 
	// By Using CSS SELECTOR -- its also reliable as XPATH but its much more faster than XPATH
	//Lets see syntax and some examples 
	static WebElement searchBox;
	static WebElement link;
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "/Users/gaurnitai/Documents/SeleniumJava/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		/*
		Locate elements by CSS Selectors
	
		WebElement emailInputField =
		driver.findElement(By.cssSelector("form input#email"));
		or
		WebElement emailInputField =
		driver.findElement(By.cssSelector("input.email"));
		or
		WebElement emailInputField =
		driver.findElement(By.cssSelector("input[type='submit'][value='Subscribe']"));
		*/

		/*
		Performing partial match on attribute value
		
		^= as in input[id^='email'] means Starting with.
		 
		$= as in input[id$='_name'] means Ending with.
		
		*= as in Input[id*='userName'] means Containing.
*/
		/*
		 * <input type="text" id="twotabsearchtextbox" value="" name="field-keywords"
		 * autocomplete="off" placeholder="" class="nav-input" tabindex="6">
		 */
		
		//5. CSS Selector - SubString (based on above HTML Code)
  		//Lets find second anchor link 
		Thread.sleep(5000);
		
     
		
		searchBox = driver.findElement(By.cssSelector("input[type='text']"));
		System.out.println(searchBox);
		System.out.println(searchBox.getText());
		
		searchBox = driver.findElement(By.cssSelector("input[type^='tex']"));
		System.out.println(searchBox);
		
		searchBox = driver.findElement(By.cssSelector("input[type*='text']"));
		System.out.println(searchBox);
		//searchBox = driver.findElement(By.cssSelector("input[type$='_xt']")); // ends-with doesn't work same as XPATH
		//System.out.println(searchBox);
	
		
		/*
		 * <div id="nav-xshop">
		 * <script type="text/javascript">window.navmet.tmp=+newDate();</script> 
		 * <a href="/gp/yourstore/home/ref=nav_cs_ys"class="nav-a nav_a" id="nav-your-amazon">Your Amazon.in</a>
		 * <a href="/gp/goldbox/ref=nav_cs_gb" class="nav-a" tabindex="22">Today's Deals</a> 
		 * <a href="/gp/sva/dashboard/ref=nav_nav_apay" class="nav-a" tabindex="23">Amazon Pay</a> 
		 * <a href="/selling/ref=nav_cs_sell" class="nav-a" tabindex="24">Sell</a> 
		 * <a href="/gp/help/customer/display.html/ref=nav_cs_help?ie=UTF8&amp;nodeId=200507590" class="nav-a" tabindex="25">Customer Service</a> 
		 * <script type="text/javascript">window.navmet.push({key:'CrossShop',end:+newDate(),begin:window.navmet.tmp});</script>
		 * </div> 
		 */
		
		
		
		//1. CSS Selector - ID (based on above HTML Code)
		//Lets find first anchor link 
		link =driver.findElement(By.cssSelector("a#nav-your-amazon")); // id="nav-your-amazon" 
		System.out.println(link.getText());
		
		//2. CSS Selector - CLASS (based on above HTML Code)
				//Lets find first anchor link 
		//link =driver.findElement(By.cssSelector("a.nav-a nav_a")); // this is not working : error
		link =driver.findElement(By.cssSelector("a.nav-a.nav_a")); // now its working 
		
		/*very impotnt point to remeber :
			if class have strings seperated with tab we should always use dot in between them when we specify that class value in CSS */
		
		System.out.println(link.getText());
		
	
		
		//3. CSS Selector - Attribute (based on above HTML Code)
		//Lets find first anchor link 
        link =driver.findElement(By.cssSelector("a[class='nav-a nav_a']"));
        System.out.println(link.getText());
        
        link =driver.findElement(By.cssSelector("a[tabindex='22']"));
        System.out.println(link.getText()); //Today's Deals
        
     	//4. CSS Selector - ID/CLASS + Attribute (based on above HTML Code)
		//Lets find second anchor link 
        link =driver.findElement(By.cssSelector("a#nav-your-amazon[class='nav-a nav_a']"));
        System.out.println(link.getText());
        
        link =driver.findElement(By.cssSelector("a.nav-a[tabindex='22']"));
        System.out.println(link.getText());
        
        link =driver.findElement(By.cssSelector("a.nav-a[tabindex='22'][class='nav-a']"));
        System.out.println(link.getText());
		
      //5. CSS Selector - SubString (based on above HTML Code) --- CHECK In the beginning of code
		
        //6. Lets discuss the last and final way to use CSS Selector in Selenium
        // CSS Selector - inner Text 
        //Its same as text() we use in XPATH to locate particular element on Web Page only difference is the syntax
        
        //link = driver.findElement(By.cssSelector("a:contains('Amazon Pay')")); // very important use always single quote for Text
        System.out.println(link.getText());
        
        // Below codes are not working 
        
        link = driver.findElement(By.cssSelector("a[text='Amazon Pay']")); //very important -do not use () after text
        System.out.println("css selector with Text "+link.getText());
        
        link = driver.findElement(By.cssSelector("a[innerText='Amazon Pay']"));
        System.out.println(link.getText());
        
        link = driver.findElement(By.cssSelector("a:contains('Amazon Pay')")); // very important use always single quote for Text
        System.out.println(link.getText());
		
	}

}
