package Step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class googlesearchsteps {
	
	WebDriver driver;
	
	@Given("I am on the googlr homepage")
	public void i_am_on_the_googlr_homepage() {
	  
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver(); 
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
	}

	@When("I enter search {string}")
	public void i_enter_search(String string) {
		
		WebElement searchBx;
		
		searchBx = driver.findElement(By.name("q"));
		
		searchBx.sendKeys(string);
	}

	@When("I click on google search button")
	public void i_click_on_google_search_button() {
	    
		WebElement searchBtn;
		searchBtn = driver.findElement(By.name("btnK"));
		
		searchBtn.click();
	}

	@Then("I recive relates search result")
	public void i_recive_relates_search_result() {
	    
		WebElement resultStats;
		
		resultStats = driver.findElement(By.id("result-stats"));
				
				String results = resultStats.getText();
				
			System.out.println("=====================");
			System.out.println(results);
			
			System.out.println("======================");
		
		
	}


}
