
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class Day3_Elements6 {
	public static void main (String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\00004947\\OneDrive - Arisglobal software pvt Ltd\\Automation B5\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Load the website
				driver.get("http://www.amazon.in/");
				System.out.println("title is : "+driver.getTitle());

		        Actions act=new Actions(driver);
		        act.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();

		        driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a/span")).click();


		        System.out.println("title is : "+driver.getTitle());

		        Thread.sleep(4000);

		        driver.close();
	}

}
