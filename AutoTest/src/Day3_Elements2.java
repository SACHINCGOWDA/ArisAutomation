import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day3_Elements2 {
	public static void main (String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\00004947\\OneDrive - Arisglobal software pvt Ltd\\Automation B5\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cleartrip.com/" );
		System.out.println("the title is :" +driver.getTitle());
		
		Select Dropdown = new Select(driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[2]/div/div[4]/div/div[1]/select")));
		Dropdown.selectByIndex(1);
		Thread.sleep(2000);
		Dropdown.selectByValue("3");
		Thread.sleep(2000);
		Dropdown.selectByVisibleText("6");
		Thread.sleep(2000);
				
		driver.close();
	}

}
