import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Btes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\deepu\\chromedriver.exe");
		WebDriver D = new ChromeDriver();	
		D.get("https://online.btes.co.in/");
		D.manage().window().maximize();
		//D.findElement(By.xpath("//a[@href='https://online.btes.co.in/']")).click();
		
		//D.get("https://online.btes.co.in/login/index.php");
		//D.manage().timeouts().wait(2000);
		D.findElement(By.xpath("//a[@href='https://online.btes.co.in/login/index.php']")).click();
		D.findElement(By.xpath("//input[@id='username']")).sendKeys("mandeep1234");
		D.findElement(By.xpath("//input[@id='password']")).sendKeys("Mandeep@1234");
		D.findElement(By.xpath("//button[@id='loginbtn']")).click();
		
	}

}
