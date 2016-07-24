package page.girls.order.cart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class addToCart {

	public static void main(String arg[]) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		Thread.sleep(5000);
		driver.get("http://www.amazon.com");
		
		/*Thread.sleep(5000);
		driver.findElement(By.xpath("//select[@id='searchDropdownBox']/option[@value='search-alias=beauty']"));
		*/
		
		Thread.sleep(5000);
		Select sel= new Select(driver.findElement(By.id("searchDropdownBox")));
		sel.selectByValue("search-alias=beauty");
		
		Thread.sleep(5000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Aveeno Body lotion");
		
		Thread.sleep(5000);
		driver.findElement(By.className("nav-input")).click();
		
		Thread.sleep(5000);
		sel= new Select(driver.findElement(By.id("sort")));
		sel.selectByValue("price-asc-rank");
		
		Thread.sleep(5000);
		//driver.findElement(By.xpath(".//*[@id='ref_1249132011']/li/a/img"));
		boolean b= driver.findElement(By.xpath("//ul[@id='ref_1249132011']/li/a/img")).isSelected();
		System.out.println(b);
		driver.findElement(By.xpath("//ul[@id='ref_1249132011']/li/a/img")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='ref_331588011']/li[3]/a/img")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='result_0']/div/div[3]/div[1]/a/h2")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='add-to-wishlist-button-submit']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='ap_email']")).sendKeys("geethika.koneru67@gmail.com");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='ap_password']")).sendKeys("****");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='signInSubmit']")).click();
		
		Thread.sleep(3000);
		driver.quit();
	}
	
}
