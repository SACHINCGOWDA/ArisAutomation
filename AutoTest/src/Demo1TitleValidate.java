import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1TitleValidate {
	public static void main (String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\00004947\\OneDrive - Arisglobal software pvt Ltd\\Automation B5\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String vTitle= driver.getTitle();
		
		if(vTitle.equalsIgnoreCase("Google"))
		{
			System.out.println("PASS");
			driver.close();
		}
		else
		{
			System.out.println("FAIL");
			driver.close();
		}
	}

}
