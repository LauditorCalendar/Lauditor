package com.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.abst.Reusable;

public class ViewGeneralMatterPOM extends Reusable{
	WebDriver driver;
	

	public ViewGeneralMatterPOM(WebDriver driver) {
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
		}
	
	//Left side Menu Matter Name
	@FindBy(xpath="(//img[@class='mattersicon'])[1]")
	WebElement matterTab;
	
	//General matter tab
	@FindBy(xpath="(//a[@class='optiontwo comptwo'])[1]")
	WebElement generalMatterTab;
	
	
	public void leftMatterTab() throws InterruptedException {
		visibilityOfElementWait(matterTab);
		matterTab.click();
	}
	public void generalMatterIcon() throws InterruptedException {
		visibilityOfElementWait(generalMatterTab);
		Thread.sleep(2000);
        generalMatterTab.click();
	}
	
	@FindBy(xpath="//input[@placeholder='Search Group']")
	WebElement searchInputFields;
	
	@FindBy(xpath="//button[@data-bs-toggle='dropdown']")
	WebElement actionBtnViewGeneral;
	
	public void clickActionBtn() throws InterruptedException {
		visibilityOfElementWait(actionBtnViewGeneral);
		Thread.sleep(2000);

		actionBtnViewGeneral.click();
	}
	
	@FindBy(xpath="//ul[@class='dropdown-menu custom-dropdown show'] //li[2]")
	WebElement editMatterInfoPage;
	
	public void editMatterInfoPageBtn() throws InterruptedException {
		visibilityOfElementWait(editMatterInfoPage);
		Thread.sleep(2000);

		Actions action = new Actions(driver);
		action.moveToElement(editMatterInfoPage).click().perform();
		
	}
	
	//Case Title
	@FindBy(id="title")
	WebElement reEditCaseTitleField;
	
	public void editCaseTitle(String caseTitle) throws InterruptedException {
		visibilityOfElementWait(reEditCaseTitleField);
		reEditCaseTitleField.clear();
		reEditCaseTitleField.sendKeys(caseTitle);
		
	}
	
	//case Number
	@FindBy(id="matterNumber")
	WebElement reEditCaseNumberField;
	
	public void editCaseNumber(String caseNumber)throws InterruptedException {
		visibilityOfElementWait(reEditCaseNumberField);
		reEditCaseNumberField.clear();
		reEditCaseNumberField.sendKeys(caseNumber);
	}
	//Description
	@FindBy(name="description")
	WebElement reEditDescriptionField;
	
	public void editDescription(String editDescription) throws InterruptedException{
		visibilityOfElementWait(reEditDescriptionField);
		reEditDescriptionField.clear();
		reEditDescriptionField.sendKeys(editDescription);
	}
	
	//Matter Type
	@FindBy(id="matterType")
	WebElement reEditMatterTypeField;
	
	public void editMatterType(String editMatterType) throws InterruptedException{
		visibilityOfElementWait(reEditMatterTypeField);
		reEditMatterTypeField.clear();
		reEditMatterTypeField.sendKeys(editMatterType);
		
	}
	//Start Date
	@FindBy(xpath="(//*[@class='mat-mdc-button-touch-target'])[1]")
	WebElement reEditStartDate;
	
	public void startDate(String date) throws InterruptedException{
		visibilityOfElementWait(reEditStartDate);
		reEditStartDate.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='" + date + "']")).click();

		}
	
	//Close Date
	@FindBy(xpath="(//*[@class='mat-mdc-button-touch-target'])[2]")
	WebElement reEditCloseDate;
	
	public void closeDate(String closedate) throws InterruptedException{
		visibilityOfElementWait(reEditCloseDate);
		reEditCloseDate.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='" + closedate + "']")).click();

	}
	
	// Priority
		public void priorityChange(String prioritySelect) throws InterruptedException {
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[text()='" + prioritySelect + "']")).click();

}
		// Status - Active
		@FindBy(xpath = "//button[text()='Active']")
		WebElement statusActiveBtn;

		// Status - Active
		public void statusActive() throws InterruptedException {
			visibilityOfElementWait(statusActiveBtn);
			statusActiveBtn.click();
		}

		// Status Pending
		@FindBy(xpath = "//button[text()='Pending']")
		WebElement statusSelect;

		// Status - Pending
		public void statusPending() throws InterruptedException {
			visibilityOfElementWait(statusSelect);
			statusSelect.click();
}
		// Next
		@FindBy(xpath="//button[@class='btn btn-default btnsave savecls']")
		WebElement editMatterInfoSave;
		
		// Cancel
		@FindBy(xpath = "//button[@type='reset']")
		WebElement matterInfoCancel;

		public void editMatterSave() throws InterruptedException {
			Thread.sleep(2000);
			visibilityOfElementWait(editMatterInfoSave);
			editMatterInfoSave.click();
}
		@FindBy(xpath = "//button[@class='btn btn-default alertbtn']")
		WebElement successPopupOk;

		// Success Popup view matter list button
		public void successPopupEditMatterInfo() throws InterruptedException {
			visibilityOfElementWait(successPopupOk);
			successPopupOk.click();
}
		public void scrollUp() throws InterruptedException {
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0,100)");
		}

		// Scroll down
		public void scrollDown() throws InterruptedException {
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		}
		@FindBy(xpath="//tr//td[1]")
		List<WebElement> allMatterNamesText;
		
		// Action Button Click
		@FindBy(xpath="//tr//td[6]")
		List<WebElement> actionBtnClicked; 
		
		// Action Button
		@FindBy(xpath = "//div //button[@data-bs-toggle='dropdown']")
		WebElement actionBtn;
		
		public void searchBarFieldsandActionBtn(String MatterName) throws InterruptedException{
			visibilityOfElementWait(searchInputFields);
			searchInputFields.clear();
			searchInputFields.sendKeys(MatterName);
			
			Thread.sleep(2000);
			pageDown();
			
			Actions action = new Actions(driver);
			for(int i=0;i<allMatterNamesText.size();i++) {
				String textNames = allMatterNamesText.get(i).getText();
				
				if(MatterName.contains(textNames))
				{
					visibilityOfAllElements(actionBtn);
					WebElement actionClicked = actionBtnClicked.get(i);
					visibilityOfAllElements(actionBtn);
				action.moveToElement(actionClicked).click().perform();
				}
			}
			
	

		}
}
