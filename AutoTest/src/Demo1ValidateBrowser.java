import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1ValidateBrowser {
	public static void main (String[] args) {
		Scanner mobj1 = new Scanner(System.in);
		System.out.println("Enter browser name");
		String Browser = mobj1.nextLine();
		
		if(Browser.contains("edge"))
		{
		System.setProperty("webdriver.edge.driver","C:\\Users\\00004947\\OneDrive - Arisglobal software pvt Ltd\\Automation B5\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		String vTitle= driver.getTitle();
		System.out.println("The title is: " +vTitle);
		System.out.println("URL is: " +driver.getCurrentUrl());
		driver.close();
		}
		else if(Browser.contains("chrome"))
		{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\00004947\\OneDrive - Arisglobal software pvt Ltd\\Automation B5\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		String vTitle= driver.getTitle();
		System.out.println("The tilte is: " +vTitle);
		System.out.println("URL is: " +driver.getCurrentUrl());
		driver.close();
		}
		else
		{
			System.out.println("Invalid Browser");
		}
	}

}
