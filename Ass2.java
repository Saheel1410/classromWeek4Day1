package selenium.learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ass2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement malefashion = driver.findElementByXPath("(//span[@class='catText'])[6]");
Actions builder = new Actions(driver);
builder.moveToElement(malefashion).perform();
driver.findElementByXPath("(//span[text()='Loafers'])").click();
WebElement lofers = driver.findElementByXPath("(//img[@class='product-image '])[1]");
builder.moveToElement(lofers).perform();
lofers.click();


	}

}
