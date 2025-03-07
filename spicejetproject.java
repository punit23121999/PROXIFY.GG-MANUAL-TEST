package airlines;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class spicejetproject {

	public static void main(String[]args) throws InterruptedException {
		
//		WebDriver driver=new ChromeDriver();
//		
//		driver.manage().window().maximize();
//		
//		driver.get("https://www.spicejet.com/");
//		
//		driver.findElement(By.xpath("(//div[@class=\"css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep\"]/input)[1]")).click();
//		
//	
//		
//	
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='css-76zvg2 r-cqee49 r-ubezar r-1kfrs79']")));
//       
//       
//        List<WebElement> depCities = driver.findElements(By.cssSelector("div[class='css-76zvg2 r-cqee49 r-ubezar r-1kfrs79']"));
//        
//        
//        for (WebElement city : depCities) {
//            if (city.getText().equalsIgnoreCase("Darbhanga")) {
//                city.click();
////                break; 
//            }
//        }
//		
//       List<WebElement> depCities1 = driver.findElements(By.cssSelector("div[class='css-1dbjc4n r-18u37iz']"));
//        
//        
//        for (WebElement city2 : depCities1) {
//            if (city2.getText().equalsIgnoreCase("Delhi")) {
//                city2.click();
//                break; 
//            }
//        }
//        
        
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://proxify.gg/login");
		
		driver.manage().window().maximize();
		  
		driver.findElement(By.id("email")).sendKeys("admin@gmail.com");	
		
		driver.findElement(By.id("password")).sendKeys("7ERssaf51Z39n");
		
		Thread.sleep(5000);
		
		//driver.findElement(By.cssSelector("[id='recaptcha-anchor']")).click();
		
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[normalize-space()='Plans']")).click();
		
		Thread.sleep(2000);
		
	
		
		  JavascriptExecutor js = (JavascriptExecutor) driver;

          // Scroll down by 1000 pixels
          js.executeScript("window.scrollBy(0, 2000);");

          Thread.sleep(5000);
          js.executeScript("window.scrollBy(0, -2000);");
          
          
          driver.findElement(By.xpath(" //a[normalize-space()='Invoices']")).click();
          
          driver.findElement(By.xpath(" //a[normalize-space()='Topup']")).click();
          
          driver.findElement(By.xpath("//input[@id='amount']")).sendKeys("20");
          
          driver.findElement(By.xpath("//div[@class='flex items-center space-x-3 p-4 rounded-lg border-2 hover:border-black transition-colors cursor-pointer']")).click();
          
          driver.findElement(By.cssSelector("span[class='truncate text-xs']")).click();
          
          
          driver.findElement(By.cssSelector("div:nth-child(5)")).click();
         // driver.navigate().back();
		
    
        
        
		
			
		
		
		
	}

}
