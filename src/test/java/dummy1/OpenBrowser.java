package dummy1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				driver.get("https://www.google.com");
				System.out.println("Test checked");
				driver.close();

	}

}
