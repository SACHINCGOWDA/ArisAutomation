import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Day2_LinkedIn3 {
	public static void main (String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\00004947\\OneDrive - Arisglobal software pvt Ltd\\Automation B5\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open Linked In
		driver.get("https://www.linkedin.com" );
				
		//Click on sign on
		driver.findElement(By.className("nav__button-secondary")).click();
		
		//Enter User Name
		driver.findElement(By.id("username")).sendKeys("doghusky");
		
		//Enter Password
		driver.findElement(By.name("session_password")).sendKeys("Husky@007");
		
		//Click on sign In and Different Xpaths
		
		//1 driver.findElement(By.xpath("//button[@aria-label='Sign in']")).click();
		//driver.findElement(By.xpath("//*[@aria-label='Sign in']")).click();
		//driver.findElement(By.xpath("//button[@class='btn__primary--large from__button--floating']")).click();
		System.out.println("the title is :" +driver.getTitle());
	
		
		Thread.sleep(2000);
		
		//Close the browser
		driver.close();
	}

}
