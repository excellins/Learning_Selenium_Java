
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Section9_Base {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/collins.eban/Documents/chromedriver.exe");

		String[] itemsNeeded = { "Cucumber", "Brocolli" };

		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//from above we are waitinf ro 5 sec, if object diplays in 2 secodns it wont wait for 5
		//it will go ahead and show it
		//driver() = our crhome driver
		//manage() = you are managing driver with diffrent paramater
		//timeout(), the parameter from manage 
		

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		addItems(driver, itemsNeeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(), 'PROCEED TO CHECKOUT')]")).click();
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("collinsAcademy");
		//remember css you can simply say tagename . className eg input.promoCode
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		//driver.findElement(By.cssSelector("span.promoInfo")).getText();//TO GET THE TEXT
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		//NOTE, TEXT IS ONLY VISIBLE AFTER YOU CLICK ON "APPLY", BUT BECAUSE WE ALREADY SPECIFY
		//>>IMPLICIT WAIT IT WAITS FOR SOME SECODS (5) EVEN WHEN ELEMENT ISNT VISIBLE 
		//SO WE SOLVE THE SNC ISSUE WITH IMPLICIT WAIT DECLARATION
		//>>>>>>>>>>>IMPLICIT WAIT PROS<<<<<<<<<<<<<<<<<<<<<<\\
		//-- CODE IS OPTIMIZED AND MORE READABLE, YOU DECLARE IT ONCE
		
		//>>>>>>>>>>>IMPLICIT WAIT CONS<<<<<<<<<<<<<<<<<<<<<<\\
		//-- SOMETIMES HIDES PERFORMANCE ISSUES, ESPECIALLY WITH LOAD TIME
	}

	// WANT TO WRITE REUSABLE METHODS? WRITE IT OUTSIDE OF PUBLIC STATIC VOID MAIN method
	public static void addItems(WebDriver driver, String[] itemsNeeded) throws InterruptedException {
		Thread.sleep(5000);
		int j = 0;

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		
		for (int i = 0; i < products.size(); i++) {

			String[] name = products.get(i).getText().split("-");
			

			List itemsNeededList = Arrays.asList(itemsNeeded);

			if (itemsNeededList.contains(name)) {

				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

					if (j == itemsNeeded.length)
						break;

			}
		}

	}

}
