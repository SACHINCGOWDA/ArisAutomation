import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Day2_LinkedIn {
	public static void main (String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\00004947\\OneDrive - Arisglobal software pvt Ltd\\Automation B5\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open Linked In
		driver.get("https://www.linkedin.com" );
		System.out.println("the title is :" +driver.getTitle());
		
		//Click on sign on
		driver.findElement(By.className("nav__button-secondary")).click();
		
		//Enter User Name
		driver.findElement(By.id("username")).sendKeys("doghusky6@gmail.com");
		
		//Enter Password
		driver.findElement(By.name("session_password")).sendKeys("Husky@007");
		
		//Click on sign In
		driver.findElement(By.xpath("//*[@id=\"organic-div\"]/form/div[3]/button")).click();
		
		String Error = driver.findElement(By.className("form__label--error")).getText();
		System.out.println("The error is :" +Error);
		Thread.sleep(5000);
		
		//Close the browser
		driver.close();
	}

}
