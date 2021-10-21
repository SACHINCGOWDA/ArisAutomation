import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1Edge {
	public static void main (String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\00004947\\OneDrive - Arisglobal software pvt Ltd\\Automation B5\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		String vTitle= driver.getTitle();
		System.out.println("The title is: " +vTitle);
		System.out.println("URL is: " +driver.getCurrentUrl());
		driver.close();
	
	}

}
