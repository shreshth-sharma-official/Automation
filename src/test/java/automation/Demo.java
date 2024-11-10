package automation;

import static org.testng.Assert.fail;

import java.util.Set;

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
		driver.manage().window().maximize();
		WebElement dd= driver.findElement(By.xpath("//label[@for='entry.1587519277.On foot']"));
		String url= driver.getCurrentUrl();
		String PageSource=driver.getPageSource();
		String Title=driver.getTitle();
		Set<String> Win=driver.getWindowHandles();
		String win1=driver.getWindowHandle();
//		driver.navigate()
//		Boolean an=driver.findElement(null).isDisplayed();
		
		//basic methods
//1) get
//	clear
//	close
//	quit
//	manage
//	getcurrenturl
//	getpagesource
//	getattribute
//	getcssvalue
//	navigate
//	switchto
//	click
//	IsDisabled
//	isenabled
//	isselected
//	getwindowhandle
//	getwindowhandles
//	getTitle
//	findElements
//	FindElement
//	sendkeys
//	getlocation
//	getSize
//	getTagName
		
	}

}
