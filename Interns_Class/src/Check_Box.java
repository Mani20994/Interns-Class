
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_Box {
	
    public void start() throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.fb.com");
		
		
 WebElement option1 = driver.findElement(By.xpath(".//*[@id='u_0_9']"));
		
		
		if(option1.isSelected()) {
		
			
		System.out.println("Checkbox Already Checked ON");
		}
		else {
			option1.click();
			System.out.println("Check box Toggled OFF and Clicked");
			
		}
}
}
