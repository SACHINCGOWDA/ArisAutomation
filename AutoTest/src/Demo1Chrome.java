import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1Chrome {
	public static void main (String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\00004947\\OneDrive - Arisglobal software pvt Ltd\\Automation B5\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String vTitle= driver.getTitle();
		System.out.println("The title is: " +vTitle);
		System.out.println("URL is: " +driver.getCurrentUrl());
		driver.close();
	
	}

}
