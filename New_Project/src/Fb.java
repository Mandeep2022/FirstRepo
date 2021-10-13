import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.sun.jndi.url.dns.dnsURLContext;

public class Fb {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\deepu\\chromedriver.exe");
		WebDriver D = new ChromeDriver();	
		D.get("https://www.facebook.com/");
		D.manage().window().maximize();
		//System.out.println(D.getTitle());
		D.findElement(By.xpath("//input[@id='email']")).sendKeys("mandeephanjraa1@gmail.com");
		D.findElement(By.xpath("//input[@id='pass']")).sendKeys("Mandeep");
		D.findElement(By.xpath("//button[@name='login']")).click();
		//D.manage().timeouts().wait(2000);
		//D.quit();
		
		
		
		
		
	}
}
