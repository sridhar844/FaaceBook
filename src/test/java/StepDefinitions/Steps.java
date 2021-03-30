package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Steps {				

	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
    @Given("^Open the Chrome and launch the application$")					
    public void open_the_Chrome_and_launch_the_application() throws Throwable							
    {		
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sridhar\\Desktop\\chromedriver.exe");					
       driver= new ChromeDriver();					
       driver.manage().window().maximize();			
       driver.get("https://dev-api.iempowernow.com/b/login-business");				
    }		

    @When("^Enter the Country Code$")				
    public void Enter_the_Country_Code1() throws Throwable 							
    {		
    	driver.findElement(By.xpath("//span[contains(text() , 'Country Code *')]")).click();
        driver.findElement(By.xpath("//span[contains(text() , ' India +91 ')]")).click();
        Thread.sleep(2000);
    }		

    @Then("^Enter the mentor_phone number$")					
    public void Enter_the_mentor_phone_number() throws Throwable 							
    {		
    	driver.findElement(By.xpath("//input[@name = 'mentor_phone']")).sendKeys("9704017543");					
    }	
    
    @And("^click on Login button$")					
    public void click_on_Login_button() throws Throwable 							
    {		
    	driver.findElement(By.xpath("//button[@name = 'Submit']")).click();
    	Thread.sleep(4000);
    }	
    
    @Then("^Enter the verifyCode$")
    public void Enter_the_verifyCode() throws Throwable
    {
    	driver.findElement(By.name("verifyCode")).sendKeys("1234");
    }
  
    
    
    @And("^Click on Verify$")
    public void Click_on_Verify() throws Throwable
    {
    	driver.findElement(By.xpath("//button[@name = 'Verify']")).click();
    	Thread.sleep(4000);
    }
    
    
    
    @Then("^Click on requestMeeting$")
    public void Click_on_requestMeeting() throws Throwable
    {
    	driver.findElement(By.xpath("//button[contains(text() , ' Request Bot Assessment ')]")).click();
    	Thread.sleep(4000);
    }
    
    
    @Then("^Enter the Applicant Name$")
    public void Enter_the_Applicant_Name() throws Throwable
    {
    	driver.findElement(By.xpath("//input[@placeholder = 'Applicant Name']")).sendKeys("sayi");
    }
    
    
    @Then("^Enter the Applicant Email$")
    public void Enter_the_Applicant_Email() throws Throwable
    {
    	driver.findElement(By.xpath("//input[@placeholder = 'Applicant Email']")).sendKeys("sridhar.t@kairostech.com");
    }
    
    
    @Then("^Select the Country Code$")
    public void Select_the_Country_Code() throws Throwable
    {
    	driver.findElement(By.xpath("//span[contains(text() , 'Country Code *')]")).click();
        driver.findElement(By.xpath("//span[contains(text() , ' India +91 ')]")).click();
    }
    
    @Then("^Enter Applicant Phone Number$")
    public void Enter_Applicant_Phone_Number() throws Throwable
    {
    	driver.findElement(By.xpath("//input[@name = 'mentor_phone']")).sendKeys("8919425159");
    }
    @Then("^Choose the Resume file$")
    public void Choose_the_Resume_file() throws Throwable
    {
    	driver.findElement(By.xpath("//input[@id = 'fileControl1']")).sendKeys("C:\\Users\\Sridhar\\Documents\\Test.txt");
    }
    
    @Then("^Enter the Core Technologies$")
    public void Enter_the_Core_Technologies() throws Throwable
    {
    	driver.findElement(By.xpath("//input[@placeholder = 'Core Technologies To Assess*']")).sendKeys("java");
    	Thread.sleep(4000);
    	driver.findElement(By.xpath("//span[contains(text() , ' java ')]")).click();
    }
    
    @Then("^Click on Lisa bulit question set for me$")
    public void Click_on_Lisa_bulit_question_set_for_me() throws Throwable
    {
    	driver.findElement(By.xpath("//button[contains(text() , 'Lisa, Build Question Set For Me ')]")).click();
    	Thread.sleep(4000);
    }
    
    @Then("^Enter_the_notes$")
    public void Enter_the_notes() throws Throwable
    {
        driver.findElement(By.xpath("//textarea[@name = 'notes']")).sendKeys("Techniqual screening");
    }
    	
    
    
    @Then("^Enter the assessment live and date$")
    public void Enter_the_assessment_live_and_date() throws Throwable
    {
    	driver.findElement(By.xpath("//input[@placeholder = 'assessment live date and time:']")).sendKeys("11/24/2020, 10:00 AM");
    }
    
    @Then("^Select the Timezone$")
    public void Select_the_Timezone() throws Throwable
    {
    	driver.findElement(By.xpath("//span[contains(text() , 'Select Timezone')]")).click();
        driver.findElement(By.xpath("//mat-option[@value = 'Asia/Kolkata']")).click();


    
   }	
}