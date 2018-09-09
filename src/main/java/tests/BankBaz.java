package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.BankbazaarHomePage;
import wdMethods.ProjectMethods;

public class BankBaz extends ProjectMethods{
	@BeforeClass
	public void setData() {
		testCaseName = "TC001_CreateLead";
		testCaseDescription ="Create a lead";
		category = "Smoke";
		author= "Babu";
		dataSheetName="TC001";
	}
	@Test 
	public void newbankbazaar() throws InterruptedException {
		new BankbazaarHomePage()
		.mouseover()
		.clickSearchButton()
		.clickscale()
		.clickYear()
		.clickDate()
		.clickContinueButton()
		.enterSalary()
		.salaryContinueButton()
		.selectBankRadioButton()
		.enterFirstName()
		.clickViewButton()
		.closePopup()
		.printResults();
	}
}

