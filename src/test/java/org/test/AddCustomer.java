package org.test;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddCustomer {
static WebDriver driver;
@Given("the user is in telecom home page")
public void the_user_is_in_telecom_home_page() {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse workspaace\\AddcustomerSteps\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/telecom/");
   
}

@Given("the user click on add customer")
public void the_user_click_on_add_customer() {
	driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	
 }

@When("the user is filling the details")
public void the_user_is_filling_the_details() {
	

	driver.findElement(By.xpath("//label[@for='done']")).click();
	driver.findElement(By.id("fname")).sendKeys("keerthana");
	driver.findElement(By.id("lname")).sendKeys("Ramamurthy");
	driver.findElement(By.id("email")).sendKeys("k@gmail.com");;
	driver.findElement(By.name("addr")).sendKeys("kumbakonam");;
	driver.findElement(By.name("telephoneno")).sendKeys("34567890");
	
	
	
    }

@When("the user click on submit button")
public void the_user_click_on_submit_button() {
	driver.findElement(By.name("submit")).click();;
	
}

@Then("the user shoud display the customer id")
public void the_user_shoud_display_the_customer_id() {
		Assert.assertTrue( driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());		
}



}
