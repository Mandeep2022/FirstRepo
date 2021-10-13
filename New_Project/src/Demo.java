import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.sun.jndi.url.dns.dnsURLContext;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\deepu\\chromedriver.exe");
		WebDriver D = new ChromeDriver();	
		D.get("https://www.amazon.in/");
		D.manage().window().maximize();
		System.out.println(D.getTitle());
		//D.manage().deleteAllCookies();
		//D.manage().wait(2000);
		D.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 11");
		D.findElement(By.xpath("//input[@id='nav-search-submit-button' and @type='submit']")).click();
		//D.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[3]/div/span/input")).click();
		
		
		
		
		
		
	}
}
