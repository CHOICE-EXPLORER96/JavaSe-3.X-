package com.selenium.elementfinder;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementFindByXpath {

	static WebElement searchBox;
	static WebElement link;

	public static void main(String[] args) throws Exception {

		// In the previous class we have found elements using some of the commonly used
		// locators such as ID, NAME , TAGNAME...
		// But sometime it happens for particular elements, ID keeps changing at every
		// refresh so our code will not work at all unless we change
		// So in order to avoid such situations we can just use one of the most reliable
		// way to locate element is BY XPATH
		/*
		 * Again there are different ways we can define Xpath of any elements Broadly
		 * Xpath is classified as --- ABSOLUTE XPATH and RELATIVE XPATH But it is always
		 * recommended to use Relative Xpath rather than Absolute Xpath
		 */

		// lets consider again the previous elements -- SearchBox and Link
		System.setProperty("webdriver.chrome.driver", "/Users/gaurnitai/Documents/SeleniumJava/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		// On landing to Amazon home page we will find SearchBox and Link

		// HTML code for Searchbox

		/*
		 * <input type="text" id="twotabsearchtextbox" value="" name="field-keywords"
		 * autocomplete="off" placeholder="" class="nav-input" tabindex="6">
		 */

		// lets see first how ABSOLUTE XPATH of any element looks like

		searchBox = driver
				.findElement(By.xpath("html/body/div[1]/header/div/div[1]/div[3]/div/form/div[3]/div[1]/input"));
		System.out.println(searchBox);

		// This is how Absolute Path looks like ... basically it start from the root tag
		// but there is drawback of using this
		// and hece it is always reccomended to use Relative Xpath because if we observe
		// above xpath its starting from root tag and if
		// any developer make some changes to the HTML code and add some more element
		// within then the whole xpath will get change and our
		// selenium will no more be valid and hence it is always recommended to use
		// RELATIVE Path

		// Lets see how relative path looks like

		searchBox = driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']"));
		System.out.println(searchBox);

		// This is what we have Relative Xpath. So here we dont consider root tag rather
		// we consider immediate tag
		// ie. tag close to or belong to same element so even if there is any changes in
		// between its not gonna impact

		// above xpath can be further modified to more specific to element we are
		// looking

		/*
		 * <input type="text" id="twotabsearchtextbox" value="" name="field-keywords"
		 * autocomplete="off" placeholder="" class="nav-input" tabindex="6">
		 */

		searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		System.out.println(searchBox);

		searchBox = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")); // here using Java concept in
																							// place of single quote
																							// using double with
																							// backsash
		System.out.println(searchBox);

		// other ways to find the SearchBox using XPATH
		searchBox = driver.findElement(By.xpath("//input[@name='field-keywords']"));
		System.out.println(searchBox);

		searchBox = driver.findElement(By.xpath("//input[@class='nav-input']"));
		System.out.println(searchBox);

		// Lets find Link using xpath

		/*
		 * <a href="/gp/yourstore/home/ref=nav_cs_ys" class="nav-a nav_a"
		 * id="nav-your-amazon">rajeshwar's Amazon.in</a>
		 */

		Thread.sleep(3000);

		// link =
		// driver.findElement(By.xpath("html/body/div[1]/header/div/div[2]/div[3]/div/div/a[1]"));
		// //Absolute Path

		System.out.println("\n");

		link = driver.findElement(By.xpath(".//*[@id='nav-your-amazon']"));
		System.out.println(link);

		link = driver.findElement(By.xpath("//*[@id='nav-your-amazon']"));
		System.out.println(link);

		link = driver.findElement(By.xpath("//a[@id='nav-your-amazon']"));
		System.out.println(link);

		System.out.println(link.getAttribute("href"));
		System.out.println(link.getAttribute("id"));
		// link =
		// driver.findElement(By.xpath("//a[@href='/gp/yourstore/home/ref=nav_cs_ys/261-3075081-3737335']"));

		// link =
		// driver.findElement(By.xpath("//a[@href='https://www.amazon.in/gp/yourstore/home/ref=nav_cs_ys/259-2850526-7332712']"));
		// I think its not possible to use href in XPATH since tried different way still
		// getting same error

		// System.out.println(link);

		link = driver.findElement(By.xpath("//a[@class='nav-a nav_a']"));
		System.out.println(link);

		// Now lets see some more interesting way to use Xpath for finding elements
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
		 * Here if we observe the root tab is <div> and within that we have child tab <a>
		 */
		// If we observe its like a list/sequence of tab <a> within <div> tab.So if we
		// say 1st element then it will be ‘Your’s Amazon.in’.Similarly 2nd element will
		// be ‘Today’s deals’ and so on.
		// Now lets see how we can access these elements using Xpath
		link = driver.findElement(By.xpath("//div[@id='nav-xshop']/a[@id='nav-your-amazon']"));
		System.out.println("\nFirst element is: " + link.getText());

		link = driver.findElement(By.xpath("//div[@id='nav-xshop']/a[@tabindex='22']"));
		System.out.println("Sec element is: " + link.getText());

		link = driver.findElement(By.xpath("//div[@id='nav-xshop']/a[@tabindex='23']"));
		System.out.println("Third element is: " + link.getText());

		// Now as we observe its kind of element list within <div> so we can also locate
		// as follow
		link = driver.findElement(By.xpath("//div[@id='nav-xshop']/a[1]"));
		System.out.println("\nFirst element is: " + link);
		System.out.println("Sec element is: " + link.getText());

		link = driver.findElement(By.xpath("//div[@id='nav-xshop']/a[2]"));
		System.out.println("Sec element is: " + link.getText());

		link = driver.findElement(By.xpath("//div[@id='nav-xshop']/a[3]"));
		System.out.println("Third element is: " + link.getText());

		// lets see how we can use XPATH in other ways
		// 1. start-with 2. end-with 3.contains 4.matches

		List<WebElement> link1 = driver.findElements(By.xpath("//div[starts-with(@id,'nav')]"));
		for (WebElement wb : link1) {
			System.out.println(wb.getText());
		}
		System.out.println(link1.size());

		// so on the right side we can see there are 31 items which id starts with 'nav'

		// syntax for ends-with is same as starts-with as

		/*
		 * <input type="text" id="twotabsearchtextbox" value="" name="field-keywords"
		 * autocomplete="off" placeholder="" class="nav-input" tabindex="6">
		 */

		// link = driver.findElement(By.xpath("//input[ends-with(@id,'_textbox')]"));

		// link = driver.findElement(By.xpath("//input[contains(@id,'textbox')]"));
		// System.out.println(link);
		List<WebElement> myList = new ArrayList<WebElement>();

		myList = driver.findElements(By.xpath("//div[contains(@id,'nav')]"));

		for (WebElement wb : myList) {
			// System.out.println(wb);
			System.out.println(wb.getText());
		}

		System.out.println(myList.size());

		List<WebElement> myList1 = new ArrayList<WebElement>();

		myList1 = driver.findElements(By.xpath("//*[not(div)][contains(@id,'nav')]"));

		for (WebElement wb : myList1) {
			// System.out.println(wb);
			System.out.println(wb.getText());
		}

		System.out.println(myList1.size());
		
		// for above code we get 35 elements
		
		
		List<WebElement> myList2 = new ArrayList<WebElement>();

		myList2 = driver.findElements(By.xpath("//*[not(div)][contains(@*,'nav')]"));

		for (WebElement wb : myList2) {
			// System.out.println(wb);
			System.out.println(wb.getText());
		}

		System.out.println(myList2.size());
		
		// for above code we get 794 elements

		// link = driver.findElement(By.xpath("//input[ends-with(@id,'_textbox')]"));

		// System.out.println(link);
		
		//Now lets discuss another important aspect in XPATH : Relative XPATH with // and / 
		/*
		<div class="nav-fill">
          <div id="nav-xshop-container" class="">
            <div id="nav-xshop">
            <script type="text/javascript">window.navmet.tmp=+new Date();</script>
              <a href="/gp/yourstore/home/ref=nav_cs_ys" class="nav-a nav_a" id="nav-your-amazon">Your Amazon.in</a>
              <a href="/gp/goldbox/ref=nav_cs_gb" class="nav-a" tabindex="22">Today's Deals</a>
              <a href="/gp/sva/dashboard/ref=nav_nav_apay" class="nav-a" tabindex="23">Amazon Pay</a>
              <a href="/selling/ref=nav_cs_sell" class="nav-a" tabindex="24">Sell</a>
              <a href="/gp/help/customer/display.html/ref=nav_cs_help?ie=UTF8&amp;nodeId=200507590" class="nav-a" tabindex="25">Customer Service</a>
            <script type="text/javascript">window.navmet.push({key:'CrossShop',end:+new Date(),begin:window.navmet.tmp});</script>
           </div>
        </div>
      </div> 
*/
	 // from the above HTML code we can see <div> -- <div> --<div>---<a><a><a>
		// so here root tag is <div class="nav-fill">
		//so Xpath with root tag will be as -- //div/div/div/a
		
		List<WebElement> xpath1 = driver.findElements(By.xpath("//div/div/div/a"));
		System.out.println(xpath1.size()); //273

		List<WebElement> xpath2 = driver.findElements(By.xpath("//div[@class='nav-fill']/div/div/a"));
		System.out.println(xpath2.size()); // 5
		
		List<WebElement> xpath3 = driver.findElements(By.xpath("//div[@class='nav-fill']/div/a"));
		System.out.println(xpath3.size()); // 0 since its valid but in this case not since we miss one child div tag
		
		List<WebElement> xpath4 = driver.findElements(By.xpath("//div[@class='nav-fill']//div/a"));
		System.out.println(xpath4.size()); // 5 here we are getting 5 since we have used // 
		
		List<WebElement> xpath5 = driver.findElements(By.xpath("//div[@class='nav-fill']//div[@id='nav-xshop']/a"));
		System.out.println(xpath5.size()); // 5
		
		List<WebElement> xpath6 = driver.findElements(By.xpath("//div[@class='nav-fill']/div[@id='nav-xshop']/a"));
		System.out.println(xpath6.size()); // 0 since we removed one / slash
		
		List<WebElement> xpath7 = driver.findElements(By.xpath("//div[@class='nav-fill']//div[@id='nav-xshop']/a[4]"));
		System.out.println(xpath7.size()); // 1
		
		List<WebElement> xpath8 = driver.findElements(By.xpath("//div[@class='nav-fill']//div[@id='nav-xshop']/a[2]"));
		System.out.println(xpath8.size()); // 1
		
		
		//Now lets discuss another important aspect in XPATH : Relative XPATH with 'Text' Keyword
		/*
		<div class="nav-fill">
          <div id="nav-xshop-container" class="">
            <div id="nav-xshop">
            <script type="text/javascript">window.navmet.tmp=+new Date();</script>
              <a href="/gp/yourstore/home/ref=nav_cs_ys" class="nav-a nav_a" id="nav-your-amazon">Your Amazon.in</a>
              <a href="/gp/goldbox/ref=nav_cs_gb" class="nav-a" tabindex="22">Today's Deals</a>
              <a href="/gp/sva/dashboard/ref=nav_nav_apay" class="nav-a" tabindex="23">Amazon Pay</a>
              <a href="/selling/ref=nav_cs_sell" class="nav-a" tabindex="24">Sell</a>
              <a href="/gp/help/customer/display.html/ref=nav_cs_help?ie=UTF8&amp;nodeId=200507590" class="nav-a" tabindex="25">Customer Service</a>
            <script type="text/javascript">window.navmet.push({key:'CrossShop',end:+new Date(),begin:window.navmet.tmp});</script>
           </div>
        </div>
      </div> 
*/
	link = driver.findElement(By.xpath("//a[text()='Your Amazon.in']"))	; // here we have to specify the complete text we are looking for
	System.out.println("\n"+link.getText());
	
	link = driver.findElement(By.xpath("//a[contains(text(),'Your')]")); // here we can simply specify some part 
	System.out.println("\n"+link.getText());
	    
	}

}
