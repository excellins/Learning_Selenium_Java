import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Locators3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/collins.eban/Documents/chromedriver.exe");
		
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);
		//SIBLING - CHILD PARENT TRAVERSE
		//ABSOLUTE XPATH>> START FROM THE VERY TOP (HTML LAND="E"), THE ROOT OBJECT
		//IN ABSOLUTE XPATH YOU TRANSVERSE TO CHILD WHICH IS LONG, IT REPRESENTS SINGLE SLASH /
		//EG /HTML/BODY/HEADER
		
		//RELATIVE XPATH YOU CAN JUST START WRITING FROM THE MIDDLE OF YOUR DOM
		//EG RELATIVELY POITING TO THEIR POSITION IN THIS CASE IT IS //
		//EG //HEADER (SCANS FROM THE MIDDLE)
		
		//IF SOMETHING BREAKS IN THE MIDDLE OF YOUR HEIRACHY (DEV CHANGED SOMETHING) YOUR XPATH FAILS 
		//>> THATS WHY PEOPLE SUGGEST USING RELATIVE XPATH ALWAYS START WITH //
		
		//from parent to child>>//header/div/button[1]
		//transversing from one sibling to another sibling use this //header/div/button[1]/following::button[1]
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//header/div/button[1]/following::button[1]")).click();
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following::button[1]")).getText());
		//going from sibling back to parent //header/div/button[1]///header/div/button[1]/parent::div
		//only difference instead of ::following, you do ::parent
		//going from parent to sibling and back to parent: //header/div/button[1]/following-sibling::button[2]/parent::div
		//note you cant do it with css, only xpath
		//people say css is faster than xpath, but in css you cant transverse
		//BELO GOING FROM PARENT TO SIBLING, TO SIBLING BACK TO PARENT TO SIBLING
		//driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[2]/parent::div"))
		
		//BELOW FROM PARENT TO CHULD AND BACK TO PARENT TO CHILD
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());
		
	}

}
