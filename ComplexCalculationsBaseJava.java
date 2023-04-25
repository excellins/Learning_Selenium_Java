import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ComplexCalculationsBaseJava {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/collins.eban/Documents/chromedriver.exe");
		
		//ARRAY DECLARATTION, PLEASE READ FROM LINE  --------
		//String itemsNeeded = "Cucumber";//to declar this an an array we do below
		String[] itemsNeeded = {"Cucumber", "Brocolli"};
		
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);
		int checkTimesEntered = 0;
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		//IF WE USE THIS //button[text()='ADD TO CART'], see many elements using add to cart
		//also tagName[]
		//so in order to use cucumber we have to identify the product block completely
		//so we try to get the css based upon the class name the syntax is below
		//h4.product-name, from here we have many elements matching
		//the only thing to do is iterate and pick the index which cucumber is present
		
		//we are now gonna use find Elements because we are going to retrieve all the elements that we have
		//in the CSS
		
		//driver.findElements(By.cssSelector("h4.product-name"));//notice we use find elementsssss, because we are dealing with more than one item
		//Also the return type of fineDlements is WenElement, so see below
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i = 0; i < products.size(); i++)
		{
			//String name = products.get(i).getText();//we have to split to remove -1 kg
			String[] name = products.get(i).getText().split("-");//notewheever you split it becomes an arra, left value and right value
			String formattedName = name[0].trim();
			//1. Brocolli - 1kg is getText returns and we split it
			//2. after split we pull value of 0 index which is //brocolli
			//3. we realise there is a space so we use trim
			//4. after that only brocolli is gotten, we will then copy the name "formattedName"
			// and replace in if(itemsNeededList.contains(formattedName))
			
			
			
			//format to get actual veggies name
			//CHECK WHETHER NAME EXTRACTED IS PRESENT IN ARRAY OR NOT
			//CONVERT "itemsNeeded" TO ARRAY LIST, IT SUPPORTS CONTAINS METHOF
			
			List itemsNeededList = Arrays.asList(itemsNeeded);
			
			//if(name.contains("Cucumber"))
			//{
				//CLICK ON ADD TO CART
			//	driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();//we use get i because we are certain the value of cucumber is stored in i
				//the current value is i which is cucumber
			//	break;//to exit the loop so that it doesnt continue to loop even after we found our target, we have saved 27 iterations
			//}
			
			//int checkTimesEntered = 0;
			if(itemsNeededList.contains(name))
			{
				
					//driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();//IT IS DANGEROUS TO REPLY ON TEXT FOR LOCATORS, TEXT CAN CHANGE AT ANYTIME, NOTICE ADD TO CART, CHANGES TO ADDED
					//above we say get based on add to cart text, this fails because after click button changes
					//so when you click index starts from 0, and when button change evevrything mismatched
					driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();//SO WE USE THIS BECAUSE ADD TO CART IS DYNAMIC
					//break; in this case we cant use break in this case because we will come out of the block
					//AND WHEN BLOCK IS EXITED IT WONT VALIDATE FOR OTHERS IN THE ARRAY EG BROCOLLI
					// WE CANNOT USE BREAK IF WE ARE GOING WITH MULTIPLE VALUES IN ARRAY
					// BUT ALL ROWS WILL BE RAN. SO HOW DO WE SOLVE INSTEAD OF USING BREAK, REMEMBER WHEN ITEMS MATCHES IN ARRAY IT RUN
					// WE NEED A CONDITION TO CHECK THE AMOUNT OF TIMES WE ENTERED THE ARRAY SO WE CREATED"CHECK TIMES ENTERED"
					//IF WE GO WITH SINGLE ELEMENT WE CAN USE BREAK
					//THE GOOD THING WE THIS IS THAT WE DONT NEED TO KEEP CHANGING CODE ALL WE CAN DO IS TO KEEP ON EXPANDING ON OUR ARRAY
					//ItemsNeeded = {cucumber, brocolli, "beeroot"} etc remains, you can adnother string (beeroot)
					//all you need do is expand your array, dont hardcode
					//note one issue, cucumber is, cucumber - 1kg, now should we rename our text to be Cucumber - 1kg?
					//no that isnt good practice, people will want us to just get the product names for cleaner code
					//if thats the requirement you use split to remove 1kg like this
					
					
					//IT IS DANGEROUS TO REPLY ON TEXT FOR LOCATORS, TEXT CAN CHANGE AT ANYTIME, NOTICE ADD TO CART, CHANGES TO ADDED
					if(checkTimesEntered == o)//but instead of giving the number, what if 4 items are added?
					//it breaks so it is better we ise size of array like below
					if(checkTimesEntered == itemsNeeded.length)
					break;
					
			}
		}
		//BUT WHAT IF WE WANT TO ADD ANOTHER ITEM EG BROCOLII, WILL WE THEN CREATE ANOTHER LOOP SIMILAR TO CUCUMBER?
		//NO THATS BAD PRACTICE AND CODE UPLICATION SO WE HANDLE IT BY CREATING AN ARRAY 
		
		//TO IDENTFY MULTIPLE PRODUCTS NAMES, WE HAVE AN EXPECTED ARRAY, WE DCLEAR PRODUCTS WE WANNA CLICK
		//WE HAVE AN ARRAY WITH LIST OF VEGGIES WHAT WE WANNA SELECT AND PASS THE ARRAY INTO THE FOR LOOP
		//WHATEVER PRODUCT WE GET IN FOR LOOP WE CHECK IF PRODUCT IS PRESENT IN ARRAY
		//IF PRESENT WE GO AN CLICK, SEE LINE 16
		
		//for (int i = 0; i < 4; i++)
		//{
		//	driver.findElement(By.xpath(".//a[@class='increment']")).click();
		//}
		
		

	}

}
