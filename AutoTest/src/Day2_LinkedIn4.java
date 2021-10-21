import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Day2_LinkedIn4 {
	public static void main (String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\00004947\\OneDrive - Arisglobal software pvt Ltd\\Automation B5\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open Linked In
		driver.get("https://www.linkedin.com" );
		System.out.println("the title is :" +driver.getTitle());
	
		
		Thread.sleep(2000);
		
		//Close the browser
		driver.close();
	}

}
