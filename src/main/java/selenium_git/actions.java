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
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://opensource-demo.orangehrmlive.com");
		d.manage().window().maximize();
		d.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		d.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		d.findElement(By.xpath("//button[@type='submit']")).click();
		Actions actions=new Actions(d);
		By ad=(By.xpath("//a[@class='oxd-main-menu-item']"));
		WebElement admin=d.findElement(ad);
		By org=By.xpath("//span[text()='Organization ']");
		WebElement orgn=d.findElement(org);
		actions.moveToElement(admin).click().perform();

	}

}
