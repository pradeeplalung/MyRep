import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Yahoo {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// text , properties, xls

		//System.setProperty("webdriver.chrome.driver", "H:\\chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		
		// HW
		String browser = "Mozilla"; // properties
		WebDriver driver = null;
		
		if(browser.equals("Mozilla"))
			driver = new FirefoxDriver();
		else if(browser.equals("Chrome")){
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
		    driver = new ChromeDriver();
		}else if(browser.equals("IE")){
		// exe path
		}
		
		//WebDriver driver = new FirefoxDriver();
		driver.get("http://www.aligned-assets.co.uk/housing/index.html");
		/*******xPath******/
	    driver.findElement(By.xpath("//input[@type = 'text' and @name = 'Name']")).sendKeys("hello");
		
		/*******csslocator*******/
		driver.findElement(By.cssSelector("input[type ='text'][name = 'Name']")).sendKeys("hello12");
		/****OR*****/
		driver.findElement(By.cssSelector("input[type ='text'],input[name = 'Name']")).sendKeys("hello12");
		/*****/
		driver.findElement(By.xpath("//input[@type = 'text' and @name = 'email']")).sendKeys("pradeep.lalung@ymail.com");
		/*******csslocator*******/
		driver.findElement(By.cssSelector("input[type ='text'][name = 'email']")).sendKeys("pradeep.lalung@ymail12.com");
		//<input type="text" name="Organisation" size="15"/>
		driver.findElement(By.xpath("//input[@type = 'text' and @name = 'Organisation']")).sendKeys("Organisation");
		/*******csslocator*******/
		driver.findElement(By.cssSelector("input[type ='text'][name = 'Organisation']")).sendKeys("Organisation12");
		driver.findElement(By.xpath("//input[@name = 'SecQuestion']")).sendKeys("SecOrganisation");
		/*******csslocator*******/
		driver.findElement(By.cssSelector("input[name = 'SecQuestion']")).sendKeys("SecQuestion12");
		//textarea name="Question"
		driver.findElement(By.xpath("//textarea[@name = 'Question']")).sendKeys("QuestionTEXTAREA");
		/*******csslocator*******/
		driver.findElement(By.cssSelector("textarea[name = 'Question']")).sendKeys("Question12TextArea");
	
		
		// interfacename = new calssImple();
	}

}
