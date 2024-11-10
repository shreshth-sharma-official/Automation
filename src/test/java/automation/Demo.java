package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://formfacade.com/website/google-forms-question-types-checkboxes-multi-select.html");
		WebElement dd= driver.findElement(By.xpath("//label[@for='entry.1587519277.On foot']"));
		
		Actions ac= new Actions(driver);
		ac.moveToElement(dd);
		ac.perform();
	
//		Thread.sleep(2000);
		dd.click();
		
		Thread.sleep(5000);
	    driver.close();
	}

}
