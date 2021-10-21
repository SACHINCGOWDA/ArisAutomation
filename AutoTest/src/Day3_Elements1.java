import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day3_Elements1 {
	public static void main (String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\00004947\\OneDrive - Arisglobal software pvt Ltd\\Automation B5\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open Linked In
		driver.get("https://www.amazon.in/" );
		System.out.println("the title is :" +driver.getTitle());
		
		Select Dropdown = new Select(driver.findElement(By.id("searchDropdownBox")));
		Dropdown.selectByIndex(2);
		Thread.sleep(2000);
		Dropdown.selectByValue("search-alias=fashion");
		Thread.sleep(2000);
		Dropdown.selectByVisibleText("Electronics");
		Thread.sleep(2000);
		
		driver.close();
	}

}
