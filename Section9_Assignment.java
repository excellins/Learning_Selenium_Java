import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Section9_Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(ops);
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");		
		driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("learning");
		
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[4]/div/label[2]/span[2]")).click();
		
		WebDriverWait waiting = new WebDriverWait(driver, Duration.ofMillis(7000));
		waiting.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		//driver.switchTo().alert().accept();
		driver.findElement(By.id("okayBtn")).click();
		
		WebElement select = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select dropDown = new Select(select);
		dropDown.selectByValue("consult");
		driver.findElement(By.xpath(".//*[@id='signInBtn']")).click();
		
		waiting.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
		
		List<WebElement> products = driver.findElements(By.cssSelector(".card-footer .btn-info"));
		
		for(int i = 0; i < products.size(); i++)
		{
			driver.findElement(By.partialLinkText("Checkout")).click();
			
		}
		
		
			
	}

}
