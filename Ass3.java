package selenium.learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ass3 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//WebElement box = driver.findElementByXPath("(//div[@class='example'])[6]");
		
		//builder.moveToElement(box).perform();
		WebElement app = driver.findElementByXPath("(//option[text()='Appium'])[6]");
		WebElement load = driver.findElementByXPath("(//option[text()='Loadrunner'])[6]");
	//WebElement app = driver.findElementByXPath("((//option[@value='2'])[6]");

	//WebElement load = driver.findElementByXPath("(//option[@value='4'])[6]");
	Actions builder = new Actions(driver);
	builder.keyDown(Keys.CONTROL).click(app).click(load).keyUp(Keys.CONTROL).perform();
	driver.close();
	
	}

}
