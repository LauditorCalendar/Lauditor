package com.pom;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.abst.Reusable;
      

public class ViewGeneralMatterUpdateGroupsPOM extends Reusable{
	
	 WebDriver driver;

	public ViewGeneralMatterUpdateGroupsPOM(WebDriver driver) {
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@placeholder='Search Group']")
	WebElement searchInputFields;
	
	@FindBy(xpath="//button[@data-bs-toggle='dropdown']")
	WebElement actionBtnViewGeneral;
	
	@FindBy(xpath="//ul[@class='dropdown-menu custom-dropdown show'] //li[3]")
	WebElement updateGroupsMatter;
	
	@FindBy(xpath="//tr//td[1]")
	List<WebElement> allMatterNamesText;
	
	// Action Button Click
	@FindBy(xpath="//tr//td[6]")
	List<WebElement> actionBtnClicked; 
	
	// Action Button
	@FindBy(xpath = "//div //button[@data-bs-toggle='dropdown']")
	WebElement actionBtn;
	
	public void searchInputandUpdateGroupsMatter(String searchCaseName) throws InterruptedException {
		Thread.sleep(3000);
		searchInputFields.clear();
		searchInputFields.sendKeys(searchCaseName);
		
		
		Thread.sleep(2000);
		pageDown();
		
		Actions action = new Actions(driver);
		
		for (int i = 0; i < allMatterNamesText.size(); i++) {
			String textNames = allMatterNamesText.get(i).getText();

			if (searchCaseName.contains(textNames)) {
				visibilityOfAllElements(actionBtn);
				WebElement actionClicked = actionBtnClicked.get(i);
				visibilityOfAllElements(actionBtn);
				action.moveToElement(actionClicked).click().perform();

				Thread.sleep(2000);
				action.moveToElement(updateGroupsMatter).click().perform();

			}

		}
		
		

	}
	
	 //Right Side Unselected group
	@FindBy(xpath="//div[@class='col-6 matterpadding'][1]")
	WebElement leftSideUnselectedGroup;
	
	@FindBy(xpath="//div[@class='input-group multicheck court']")
	List<WebElement> listOfSelectedGroupNames;
	
	@FindBy(xpath="//i[@class='fa fa-regular fa-circle-xmark calimg calitem input-group-append sgroup']")
	List<WebElement> checkBoxSelect;
	
	public void unselectedGroupsOnLeftSide(String [] unselectedGroupNames) throws InterruptedException {
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.moveToElement(leftSideUnselectedGroup).perform();
		
		List<String> selectedGroupNames = Arrays.asList(unselectedGroupNames);
		
		for(int i=0; i<listOfSelectedGroupNames.size();i++)
			
		{
			String allGroupNameText = listOfSelectedGroupNames.get(i).getText();
			if(selectedGroupNames.contains(allGroupNameText)) {
				WebElement selectGroup=checkBoxSelect.get(i);
				JavascriptExecutor executor = (JavascriptExecutor) driver;
				visibilityOfElementWait(selectGroup);
				executor.executeScript("arguments[0].click();", selectGroup);
				i--;
				
			}
		}


}
	// Select Group
	
	@FindBy(xpath = "//div[@class='form-group'][2]")
	WebElement rightSideUnSelectedGroup;
	
	@FindBy(xpath = "//div[@class='multicheck form-control textbox']")
	List<WebElement> listOfGroupNames;
	
	@FindBy(xpath = "//input[@class='form-check-inpu calimg calitem input-group-app end checkboxitem']")
	List<WebElement> checkBoxSelect1;
	
	public void selectGrouponRightSide(String[] selectMultipleGroup) throws InterruptedException {
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.moveToElement(rightSideUnSelectedGroup).perform();

		List<String> groupNameSelected = Arrays.asList(selectMultipleGroup);

		for (int i = 0; i < listOfGroupNames.size(); i++) {

			String allGroupNameText = listOfGroupNames.get(i).getText();
			if (groupNameSelected.contains(allGroupNameText)) {
				WebElement selectGroup = checkBoxSelect1.get(i);
				JavascriptExecutor executor = (JavascriptExecutor) driver;
				visibilityOfElementWait(selectGroup);
				executor.executeScript("arguments[0].click();", selectGroup);
				i--;
			}
	}

	
	}
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submitBtn;
	 
	//submit
	public void submitUpdateGroup() throws InterruptedException {
		Thread.sleep(3000);
		visibilityOfElementWait(submitBtn);
		submitBtn.click();
	}
	
	//Cancel
	@FindBy(xpath="//button[@type='reset']")
	WebElement cancelBtn;
	
	public void submitCancelGroup() throws InterruptedException {
		visibilityOfElementWait(cancelBtn);
		Thread.sleep(3000);
		cancelBtn.click();
	}
	
	//Alert Yes
	@FindBy(xpath="//button[@class='btn btn-default alertbtn alertbtnyes']")
	WebElement alertYesBtn;
	
	public void alertYesButton() throws InterruptedException {
		Thread.sleep(3000);
		visibilityOfElementWait(alertYesBtn);
		alertYesBtn.click();
	}
	
	//Alert No
	@FindBy(xpath="//button[@class='btn btn-default alertbtn alertbtnno ng-star-inserted']")
	WebElement alertNoBtn;
	
	public void alertNoBtn() {
		visibilityOfElementWait(alertNoBtn);
		alertNoBtn.click();
	}
	
	// View Matter List
	@FindBy(xpath="//button[@class='btn btn-default alertbtn']")
	WebElement viewMatterListBtn;
	
	public void viewMatterButton() {
		visibilityOfElementWait(viewMatterListBtn);
		viewMatterListBtn.click();
	}
	
	// PageDown
		public void pageDown1() throws InterruptedException {
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		}		
			// PageUp
			public void pageUp() throws InterruptedException {
				Thread.sleep(2000);
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollTo(0,150)");
			}
			
			public void selectedGroupNameIsDisplay(String[] groupNames) throws InterruptedException {
				Thread.sleep(3000);

				// String[] groupNames = {"Meeting Group","Case 1","case2"};
				Actions action = new Actions(driver);
				action.moveToElement(leftSideUnselectedGroup).perform();

				for (String groupNameCheckDisplay : groupNames) {
					try {
						driver.findElement(By.xpath("//*[contains(text(),'" + groupNameCheckDisplay + "')]"));
						System.out.println("'" + groupNameCheckDisplay + "' is displayed");
					} catch (NoSuchElementException e) {
						System.out.println("'" + groupNameCheckDisplay + "' is not displayed");
					}
				}

	
			}		
			// Alert heading
			@FindBy(xpath="//p[@class='alertparatxt']")
			WebElement alertText;
			
			//Alert Ok
			@FindBy(xpath="//button[@class='btn btn-default alertbtn']")
			WebElement alertOkBtn;
			
			//check alert is present or not
			public void alertIsPresent(String selectedName) throws InterruptedException {
				Thread.sleep(3000);
				Actions action=new Actions(driver);
				action.moveToElement(leftSideUnselectedGroup).perform();
				
				for(int i=0; i<listOfSelectedGroupNames.size();i++) {
					String textGroupNames=listOfSelectedGroupNames.get(i).getText();
					if(selectedName.equals(textGroupNames)) {
						WebElement removeClicked =checkBoxSelect.get(i);
						JavascriptExecutor executor = (JavascriptExecutor) driver;
						visibilityOfElementWait(removeClicked);
						executor.executeScript("arguments[0].click();", removeClicked);
						visibilityOfElementWait(alertText);
						
						String text =alertText.getText();
						
						String values ="Alert";
						if(text.contains(values)) {
							System.out.print("Alert is displayed.");
							Thread.sleep(3000);
						    alertOkBtn.click();
						}
							else {
								System.out.println("Alert is not displayed.");
							}
						}


						
						
					}
				}
				
				
			}
			
			
	


