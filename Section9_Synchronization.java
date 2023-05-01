import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;

public class Section9_Synchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//what is synchronization issue?
		//when operations are performed on a web element that is not yet 
		//>>present in the DOM, or it is not a state to accept commands
		
		//automation fails because pages havent yet loaded, elementNotFooundException
		//how to acheive proper synchronization? 4 ways
		//1 - Implicit Wait
		//2 - Explicit Wait
		//3 - Thread. Sleep
		//4 - Fluent Wait
		//synchronization is when we pause or stop execution of our webdriver until element
		//in DOM is found
		
		//IMPLICIT WAIT >> We define wait time globally eg wait for 10 sec before throwing error
		//>>i click on item, result not found, dont fail immediately, wait for 10 seconds
		// - YOU DEFINE IT GLOBALLY, IF YOU HAVE MANY STEPS, SINCE YOU DECLARED GLOBALLY IT WILL CATER FOR MANY STEPS
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		//Implicit waits are used to provide a default waiting time between each consecutive test step/command across 
		//>>the entire test script. Thus, the subsequent test step would only execute when the specified amount of time has elapsed after executing the previous test step/command.
		//BUT IMPLICIT WAIT, WILL WAIT FOR 5 SEC AND STILL LISTENING TO DOM SUCH THAT WHEN RESULTS ARE RETURNED IT CONT=INUES 
			//DISADVANTAGE OF IMPLICIT\\
		//The main disadvantage of implicit wait is that it slows down test performance. 
		//Another disadvantage of implicit wait is : Suppose, you set the waiting limit to be 10 seconds, and the elements appear in the DOM in 11 seconds, your tests will be failed because you told it to wait a maximum of 10 seconds.
		//BECAUSE OF ABOVE TEST EXECUTION IS SLOW :)\
		//HOW TO SOLVE THE ABOVE ISSUES? EXPLICIT WAIT
		//it can extend the run time of our test
		 
		
		//Explicit waits are used to halt the execution until the time a particular condition is met or the maximum time has elapsed. Unlike Implicit waits, Explicit waits are applied for a particular instance only.
		//EXPLICIT WAIT HELPS YOU TO TAGE A SPECIFIC ELEMENT
		//WHATEVER YOU DO IN IMPLICIT WAIT AFFECTS GLOBALLY, BUT EXPLICIT WAIT YOU CAN TAGE A SPECIFIC ELEMENT
		//WebDriverWait waiting = new WebDriverWait(driver, Duration.ofSeconds(10));
		//whatever you do in explicit wait affects that locator only
		//WebDriver introduces classes like WebDriverWait and ExpectedConditions to enforce Explicit waits
		//ExpectedConditions class provides a great help to deal with scenarios where we have to ascertain for a condition to occur before executing the actual test step.
		//ExpectedConditions class comes with a wide range of expected conditions that can be accessed with the help of the WebDriverWait reference variable and until() method.
		//Navigate() methods/commands are used to simulate the user behavior while navigating between various web pages back and forth.
		
		
		//INTERVIEW QUESTIONS?
		//IDEAL STRATEGY OF USING SYNCHRONIZATION IN SELENIUM WEB DRIVER
		//ANS, COMBINATION OF USING IMPLICIT AND EXPLICIT IS THE IDEA STRATEGY
		//IN REAL TIME IF YOU WOKR IN WHERE THERE ARE THOUSANDS OF TEST CASES YOU WILL SEE WHY EXPLICIT IS GOOD TOO
		//
		
		//DIFFERENCES\\\\\ 
		
		
		//THREAD JUST SLEEP
		//NO LOGIC, NOT PART OF SELENIUM, YOU JUST PAUSE YOUR EXCECUTION FOR SOME TIME
		//EVEN IF RESULTS WAIT FOR 3 SECONDS, IT WILL LOAD FOR 5 SEC
		//BUT IMPLICIT WAIT, WILL WAIT FOR 5 SEC AND STILL LISTENING TO DOM SUCH THAT WHEN RESULTS ARE RETURNED IT CONT=INUES 
	}

}
