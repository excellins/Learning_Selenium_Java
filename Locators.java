import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");// * is regular expression for allow anything, remotely allow all websites
		System.setProperty("webdriver.chrome.driver", "/Users/collins.eban/Documents/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(ops);
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("inputUsername")).sendKeys("Collins");
		driver.findElement(By.name("inputPassword")).sendKeys("password");
		driver.findElement(By.name("chkboxOne")).click();
		
		driver.findElement(By.className("signInBtn")).click();//for class when you see space know there are two classes you can use,
		//driver.findElement(By.cssSelector("button.signInBtn")).click();//using this for css locator to find by class name
		
		//driver.findElement(By.cssSelector("p.error")).getText();//to extract text from browser
		//not to see it in console out put you have to grab it like below
		
		//below show error because fo time out so we use implicit wait
		
		//implicitwait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		//NOTICE ALL OUR LOCATORS USED>? ONE ON ONE MAPPGIN
		//XPATH AND CSS ARENT ONE ON ONE MAPPING, YOU WILL CONSTRUCT THE MAPPING (XPATH OR CSS)
		//TO GENERATE CSS SELECTOR YOU SAY TAGNAME.CLASSNAME EG P.ERROR
		// OR TAGNAME#ID OR INPUT#CSS
		//.//*[@type='submit']
		
		
		//XPATH, IF YOU SEE A, KNOW IT IS LINK, A IS ANCHOR
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		//xpath and csss are generic locators
		//inout[@name='UserName']
		//checking of your xpath or css is fine from console dev tools
		//xpath use $x(.//*[@placeholder="Name"])
		//css use $('p.error') 
		//driver.findElement(By.xpath(""));
		driver.findElement(By.xpath(".//*[@placeholder='Name']")).sendKeys("Collins Abang Eban");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("excellins@gmail.com");
		//driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();//using another locator to get it
		//situation where there are many of the same elements using same name you can use an index on the xpath or selector to handle them uniquely
		////input[@type='text'][2]
		//Tagname[@attribute='value'][index] in case of similar values
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		//you can do xpath like this "//input[@type='text'][2]") or like this ".//*[@type='text'][2]") both works
		//we use xpath because for css you can add an array to check the index it wont work "input[type='text'][2]") wont work
		//to do index in css do like this input[type='text']:nth-child(2) osmetime sthis chooses 2 elements because of hidden atributes, that why xpath and css my defer
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("excellins@yahoo.com");
		
		//key takeaay
		//another great way of using xpath is navigatin from parent to child on your html element see below
		//see the forgot password? do this //Form/h2, it highlights it
		//only in begining you give //, after form you try to identify h2 inside the parent only so you use / slash
		// so when you say //form you then say i want to use / to serach the parent
		//doing this enables you to use xpath without depending on attributes
		
		//so to get phone nmber //form/input, but issue here is that the form has multiple input and it got confused
		//to clear the confusion you //form/input[3] you then use index
		//forinstace some elements with no atributes "FORM NAME"
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("0803302222");
		//parentTagname/childTagname\
		driver.findElement(By.className("reset-pwd-btn")).click();
		//driver.findElement(By.className("infoMsg"));//this works
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());//notice xpath we did this //form/input[3]
		
		//for css we can just do this form p
		//for css>> Parenttagname childtagname no slashes
	}

}
