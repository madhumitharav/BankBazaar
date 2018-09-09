package pages;



import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import wdMethods.SeMethods;

public class BankbazaarHomePage extends SeMethods {
	     /*@Given("launch the browser")
         public BankbazaarHomePage launchbrowser() {
        	 startApp("chrome", "https://www.bankbazaar.com/");
        	 return this;
         }*/
         //@Given ("mouseover on invesment option")
         public BankbazaarHomePage mouseover() throws InterruptedException {
        	 WebElement invesment = driver.findElementByXPath("(//a[@title='Investments'])[1]");
     		Actions builder = new Actions(driver);
     		builder.moveToElement(invesment).perform();
     	     Thread.sleep(3000);
     		driver.findElementByXPath("(//a[@title='Mutual Funds'])[1]").click();
     		Thread.sleep(3000);
     		return this;
         }
         //@And ("click on search for mutual funds button")
         public BankbazaarHomePage clickSearchButton() throws InterruptedException {
        	 driver.findElementByLinkText("Search for Mutual Funds").click();
        	 Thread.sleep(2000);
        	 return this;
         }
         
        // @And ("click on scale")
         public BankbazaarHomePage clickscale() throws InterruptedException {
        	 driver.findElementByXPath("//div[@class='rangeslider__handle']").click();
        	 Thread.sleep(2000);
        	 return this;
         }
         
        // @And ("Click year")
         public BankbazaarHomePage clickYear() throws InterruptedException {
        	 driver.findElementByLinkText("Jan 2000").click();
        	 Thread.sleep(2000);
        	 return this;
         }
        // @And ("Click date")
         public BankbazaarHomePage clickDate() throws InterruptedException {
        	 driver.findElementByXPath("//div[text()='22']").click();
        	 Thread.sleep(2000);
        	 return this;
         }
         
        // @And ("Click continue button")
         public BankbazaarHomePage clickContinueButton() throws InterruptedException {
        	 driver.findElementByLinkText("Continue").click();
        	 Thread.sleep(3000);
        	 return this;
         }
        // @And ("Enter salary")
         public BankbazaarHomePage enterSalary() throws InterruptedException {
        	 driver.findElementByXPath("//input[@name='netAnnualIncome']").sendKeys("700000");
        	 Thread.sleep(1000);
        	 return this;
         }
        // @And ("Click Salary continue button")
         public BankbazaarHomePage salaryContinueButton() throws InterruptedException {
        	 driver.findElementByLinkText("Continue").click();
        	 Thread.sleep(3000);
        	 return this;
        	 }
         
        // @And ("Select Bank")
         public BankbazaarHomePage selectBankRadioButton() throws InterruptedException {
        	 driver.findElementByXPath("(//input[@name='primaryBankAccount'])[3]").click();
        	 Thread.sleep(3000);
        	 return this;
         }
        // @And ("Enter First Name")
         public BankbazaarHomePage enterFirstName() throws InterruptedException {
        	 driver.findElementByXPath("//input[@name='firstName']").sendKeys("Madhu");
        	 Thread.sleep(1000);
        	 return this;
         }
        // @And ("Click View Mutual Funds Button")
         public BankbazaarHomePage clickViewButton() throws InterruptedException {
        	 driver.findElementByLinkText("View Mutual Funds").click();
        	 Thread.sleep(90000);
        	 return this;
         }
       //  @And ("Close the new popup")
         public BankbazaarHomePage closePopup() throws InterruptedException {
        	 driver.findElementById("closeExitBlockerModal").click();
        	 Thread.sleep(500);
        	 return this;
        	
         }
         
       // @Then ("Print Results")
        public void printResults() {
        	List<WebElement> allSchemes = driver.findElementsByClassName("js-offer-name");
    		for (WebElement eachScheme : allSchemes) {
    			System.out.println(eachScheme.getText());
    			WebElement eleAmount = driver.findElementByXPath("//span[contains(text(),'"+eachScheme.getText()+"')]/following::span[@class='fui-rupee bb-rupee-xs']/..");
    			System.out.println(eleAmount.getText());
    			
        	}
		
        }
}	
        /*WebElement schemeName = driver.findElementByXPath("(//span[@class='js-title'])[1]");
        for(String eachschemeName: schemeName)
        System.out.println(getText(schemeName));*/
        
         
         
         
         
         
         
