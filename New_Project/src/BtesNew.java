import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BtesNew {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\deepu\\chromedriver.exe");
		WebDriver D = new ChromeDriver();	
		D.get("https://www.btes.co.in/");
		D.findElement(By.xpath("//a[text()='Training Courses ']")).click();
		D.findElement(By.xpath("//a[text()='Python Training with ML ']")).click();

	}

}
