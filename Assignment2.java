import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/collins.eban/Documents/chromedriver.exe");
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(ops);
		driver.get("https://www.rahulshettyacademy.com/angularpractice/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("name")).sendKeys("Collins");
		driver.findElement(By.name("email")).sendKeys("collins@test.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("samplePassword");
		Thread.sleep(3000);
		driver.findElement(By.id("exampleCheck1")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(".//*[@id='exampleFormControlSelect1']/option[2]")).click();
		
		driver.findElement(By.id("inlineRadio1")).click();
		
		driver.findElement(By.name("bday")).sendKeys("01/01/1990");
		driver.findElement(By.cssSelector(".btn.btn-success")).click();
		
		
		
		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
		
		
		
		
		
		
		
		

	}

}
