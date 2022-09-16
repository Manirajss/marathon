import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Secondtestcase {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(ch);
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[contains(@class,'input r4')]")).sendKeys("ramkumar.ramaiah@testleaf.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Password#123");
		driver.findElement(By.xpath("//input[contains(@class,'button r4')]")).click();
		driver.findElement(By.xpath("//div[@class='slds-r3']/following-sibling::div[1]")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		WebElement dropdown1 = driver.findElement(By.xpath("(//a[@class='slds-context-bar__label-action dndItem'])[2]"));
		driver.executeScript("arguments[0].click();", dropdown1);
		driver.findElement(By.xpath("//div[@title='New']")).click();
		driver.findElement(By.xpath("//label[text()='Opportunity Name']/following::input")).sendKeys("Rajalakshmi");
		driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).sendKeys("9/16/2022");
		WebElement dropdown2 = driver.findElement(By.xpath("//button[@data-position-id='lgcp-1000013']//span[1]"));
		driver.executeScript("arguments[0].click();", dropdown2);
		driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
		String attribute = driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]/a")).getAttribute("title");
        System.out.println(attribute);
      if (attribute.contains("Rajalakshmi")) {
           System.out.println("verfied");
           }else {
       System.out.println("not verfied"); }


	}

}
