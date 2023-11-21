package com.pom;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.abst.Reusable;

public class CreateMember extends Reusable {

	WebDriver driver;

	public CreateMember(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// CreateMember
	@FindBy(xpath = "//button[@routerlink='/groups/create-member']")
	WebElement createMember;

	public void createMemberTab() throws InterruptedException
	{
		Thread.sleep(2000);
		createMember.click();
	}
	// Name
	@FindBy(name = "name")
	WebElement createName;
	// Designation
	@FindBy(name = "designation")
	WebElement designation;
	// Currency
	@FindBy(name = "currency")
	WebElement defaultCurrencyBtn;
	// DefaultRate
	@FindBy(name = "defaultRate")
	WebElement defaultRate;
	// Email
	@FindBy(name = "email")
	WebElement memberEmail;
	// Confirm Email
	@FindBy(name = "emailConfirm")
	WebElement memberConfirmEmail;

	// Click on assign Group
	@FindBy(xpath = "//i[@class='fa fa-solid fa-plus calimg calitem input-group-append sgroup']")
	WebElement assignGroupBtn;

	// List of GroupName text
	@FindBy(xpath = "//div[@class='callselect']")
	List<WebElement> listofgroupsname;

	// selectButton
	@FindBy(xpath = "//input[@id='flexCheckDefault']")
	List<WebElement> selectBtnGroup;

	// Save button selected Group
	@FindBy(xpath = "//button[@type='submit']")
	WebElement saveBtnSelectedGroup;

	// Add Team Member
	@FindBy(xpath = "//button[text()='Add Members']")
	WebElement addTeamMemberPopupBtn;

	// View Changes
	@FindBy(xpath = "//button[text()='View Changes']")
	WebElement viewChangesPopupBtn;
	
	//cancel Button
	@FindBy(xpath="//button[@class='btn btn-default btncancel']")
	WebElement cancelBtn;
	
	//Yes on Cancel
	@FindBy(xpath="//button[@class='btn btn-default alertbtn alertbtnyes']")
	WebElement yesBtnOnCancel;
	
	//No on Cancel
	@FindBy(xpath ="//button[@class='btn btn-default alertbtn alertbtnno']")
	WebElement noBtnOnCancel;
	
	// Close btn on cancel
	@FindBy(xpath="//button[@class='btn-close']")
	WebElement closeBtn;
	
	//Back Btn On Assign to Group
	@FindBy(xpath="//button[@class='btn btn-default btnsave btnback']")
	WebElement backBtn;
	
	
	
	public void enterAllFieldsInAccountCreation(String crName, String crDesignation, String crDefaultRate, String crEmail,
			String crConfirmEmail, String currencyNames)throws InterruptedException {
		Thread.sleep(2000);
		createName.sendKeys(crName);
		designation.sendKeys(crDesignation);
		defaultRate.sendKeys(crDefaultRate);
		memberEmail.sendKeys(crEmail);
		memberConfirmEmail.sendKeys(crConfirmEmail);
		defaultCurrencyBtn.click();
		
	}
    public void saveBtn() throws InterruptedException {
    	Thread.sleep(2000);
	visibilityOfElementWait(saveBtnSelectedGroup);
	saveBtnSelectedGroup.click();

}
    public void viewChangesBtn() {
    	visibilityOfElementWait(viewChangesPopupBtn);
    	viewChangesPopupBtn.click();
    }
    
    public void cancelButton() {
    	visibilityOfElementWait(cancelBtn);
    	cancelBtn.click();
    }
    
    public void CancelWithYes() {
    	visibilityOfElementWait(yesBtnOnCancel);
    	yesBtnOnCancel.click();
    }
    
    public void CancelWithNo() {
    	visibilityOfElementWait(noBtnOnCancel);
    	noBtnOnCancel.click();
    }
    
    public void BackBtn() {
    	visibilityOfElementWait(backBtn);
    	backBtn.click();
    }
    
    public void closeBtnOnCancel() {
    	visibilityOfElementWait(closeBtn);
    	closeBtn.click();
    }
    
    
    
    

	
	
	public void createTeamMemberInfo(String crName, String crDesignation, String crDefaultRate, String crEmail,
			String crConfirmEmail, String currencyNames,String[] named) throws InterruptedException {
		
		Thread.sleep(2000);
		createName.sendKeys(crName);
		designation.sendKeys(crDesignation);
		defaultRate.sendKeys(crDefaultRate);
		memberEmail.sendKeys(crEmail);
		memberConfirmEmail.sendKeys(crConfirmEmail);
		defaultCurrencyBtn.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[text()='" + currencyNames + "']")).click();
		assignGroupBtn.click();
		
		int j = 0;
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		Thread.sleep(5000);
		List<String> selectgroupname = Arrays.asList(named);

		Thread.sleep(5000);
		for (int i = 0; i < listofgroupsname.size(); i++) {

			String groupsnametext = listofgroupsname.get(i).getText();
			Thread.sleep(2000);
			if (selectgroupname.contains(groupsnametext)) {
				j++;
				Thread.sleep(2000);

				WebElement selectedGroupNameBtnClick = selectBtnGroup.get(i);

				executor.executeScript("arguments[0].click();", selectedGroupNameBtnClick);
				if (j == selectgroupname.size()) {
					break;
				}
			}

		}

		Thread.sleep(2000);

		//executor.executeScript("scrollBy(0, 4500)");

		/*Thread.sleep(2000);
		// Save
		saveBtnSelectedGroup.click();

		Thread.sleep(2000);
		// View Changes
		viewChangesPopupBtn.click();*/
		
	}
	
	// Assertion 
	//Check the team member name
		@FindBy(xpath="//tr//td[1]")
		List<WebElement> teamMemberNameAssert;
	
	public void assertTeamMember(String names) throws InterruptedException
	{		
			Thread.sleep(2000);
			boolean nameTeamMatched = teamMemberNameAssert.stream().anyMatch(selectedAllName-> selectedAllName.getText().equalsIgnoreCase(names));
			assertTrue(nameTeamMatched);
	}
	// Check the error message "Confirm mail does not match"
	
	@FindBy(xpath ="//div[contains(text(),'Confirm email does not match')]")
	WebElement mismatchErrorMessage;
	
	public void assertMismatchErrorMessage(String actErrorMessage) {
		String expErrorMessage = mismatchErrorMessage.getText();
		assertEquals(actErrorMessage, expErrorMessage);
		System.out.println(expErrorMessage);

}
	
	// If firm name is already exist, check the error message
	
	@FindBy(xpath ="//div[@class='invalid-feedback']")
	WebElement nameExistErrorMessage;
	
	public void nameExistAssertErrorMessage(String actExistErrorMessage) {
		String expExistErrorMessage = nameExistErrorMessage.getText();
		assertEquals(actExistErrorMessage, expExistErrorMessage);
		System.out.println(expExistErrorMessage);

}
	
	@FindBy(xpath="(//p[@class='thheadname'])[1]")
	WebElement viewMembersPage;
	
	public void navigatingtoViewMemberPage(String actualPage) {
		String expPage = viewMembersPage.getText();
		assertEquals(actualPage, expPage);
		System.out.println(expPage);

	}
	@FindBy(xpath = "(//label[@class='lable-size'])[3]")
	WebElement accountCreationPage;
	
	public void accountCreationPage(String actualPage) {
		String expectPage = accountCreationPage.getText();
		assertEquals(actualPage, expectPage);
		System.out.println(expectPage);
	}
	
	@FindBy(xpath="//input[@placeholder='Search Members']")
	WebElement searchBarInAssignGroupPage;
	
	public void searchBarAppearance() throws InterruptedException {
		Thread.sleep(2000);
		visibilityOfAllElements(searchBarInAssignGroupPage);
		boolean text = searchBarInAssignGroupPage.isDisplayed();
		System.out.println(text);
		
	}
	
	public void pageDown() throws InterruptedException {
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
}
