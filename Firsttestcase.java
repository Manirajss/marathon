import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Firsttestcase {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//ChromeDriver driver=new ChromeDriver();
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(ch);
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[contains(@class,'input r4')]")).sendKeys("ramkumar.ramaiah@testleaf.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Password#123");
		driver.findElement(By.xpath("//input[contains(@class,'button r4')]")).click();
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='slds-r3']/following-sibling::div[1]")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//ChromeOptions ch=new ChromeOptions();
		//ch.addArguments("--disable-notifications");
		//ChromeDriver driver=new ChromeDriver(ch);
		WebElement dropdown1 = driver.findElement(By.xpath("//span[text()='Accounts']"));
		//Select source1=new Select(dropdown1);
		//source1.selectByIndex(-1);
		driver.executeScript("arguments[0].click();", dropdown1);
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@title='New']")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys("Rajalakshmi");
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement dropdown2 = driver.findElement(By.xpath("(//button[contains(@class,'slds-combobox__input-value')])[3]"));
		//driver.findElement(By.xpath("(//div[@role='none']//button)[3]")).click();
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//Select source2=new Select(dropdown2);
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//driver.findElement(By.className("slds-form-element slds-form-element_horizontal")).click();
		//source2.selectByIndex(2);
		driver.executeScript("arguments[0].click();", dropdown2);
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//span[text()='Public'])[1]")).click();
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		String attribute = driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]/a")).getAttribute("title");
        System.out.println(attribute);
      if (attribute.contains("Rajalakshmi")) {
           System.out.println("verfied");
           }else {
       System.out.println("not verfied"); }


	}

}
