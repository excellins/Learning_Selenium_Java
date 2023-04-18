import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//TESTNG is one of the testing frame work
//assertion helps us in validation, if result is expected or not, testNG provides the future of assertion
public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/collins.eban/Documents/chromedriver.exe");
		
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);
		driver.get("http://spicejet.com");
		
		driver.findElement(By.cssSelector("input[id*='SeniroCitizenDiscount']")).click();//note i put * after ID, that is regular experssion to mathc any id with the name SeniorCitizen...
		//ALSO REMEMBER CSS SELECTOR SYNTX IS, TAGNAME(INPUT) AND ATTRIBUTRE(ID) EQUALS (=) VALUE
		
		//TO KNOW IF CHECK BOX IS SELECTED OR NOT, SEE BELOW, IF RETURNS TRUE THEN CHECKBOX IS SELECTED , AND OTHERWISE
		//driver.findElement(By.cssSelector("input[id*='SeniroCitizenDiscount']")).isSelected(); // i will add this to print below
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniroCitizenDiscount']")).isSelected());
		//this will print to the console
		//to check the number of checkboxes on page
		//1. inspect element to find a locator common to all checkBoxes, count them
		//we used css, tagName, attribute and value input[type='checkbox'], this fetched 6 checkboxes on page
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size()); //notice we use elemens plural because we have many items to return
		
		
	}

}
