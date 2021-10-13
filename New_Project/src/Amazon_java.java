import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_java {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\deepu\\chromedriver.exe");
		WebDriver D = new ChromeDriver();	
		D.get("https://www.amazon.in/");
		//D.manage().timeouts().wait(2000);
		D.manage().window().maximize();
		List<WebElement> l1 = D.findElement(By.xpath("//div[@id='nav-xshop']")).findElements(By.tagName("a"));
		System.out.println(l1.size());
		
		for(int i=0; i<l1.size(); i++) {
			System.out.println(l1.get(i).getText());
		}
		
		D.close();
		
		//D.findElement(By.xpath("//div[@id='nav-xshop']")).findElements(By.tagName("a"));
		//Set <WebElement> s1 =  new Set<WebElement> (D.findElement(By.xpath("//div[@id='nav-xshop']")).findElements(By.tagName("a")));
		
		//Iterator itr = (Iterator) s1.iterator();
		
		
	}

}
