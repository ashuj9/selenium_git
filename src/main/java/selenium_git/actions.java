package selenium_git;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions {

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://www.hyrtutorials.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Actions actions=new Actions(d);
		actions
		.moveToElement(d.findElement(By.xpath("(//a[text()='YouTube Courses'])")))
		.moveToElement(d.findElement(By.xpath("//a[text()='English']")))
		.moveToElement(d.findElement(By.xpath("(//a[text()='Core Java'])[1]")))
		.click()
		.perform();
		
		

	}

}
