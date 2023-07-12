package selenium_git;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jsexecutor {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://www.hyrtutorials.com/");
		d.manage().window().maximize();
		JavascriptExecutor js= (JavascriptExecutor) d;
		js.executeScript("window.scrollTo(0,-500)");
		//js.executeScript("document.getElementById('ty_footer').scrollIntoView()");
		
		

	}

}
