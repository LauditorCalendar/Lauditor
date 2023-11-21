package com.pom;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.abst.Reusable;

public class CreateGeneralMatterPOM extends Reusable {
	WebDriver driver;

	public CreateGeneralMatterPOM(WebDriver driver) {
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}
	// Left Side Menu Matter Name
	@FindBy(xpath="(//div //img[@class='mattersicon'])[1]")
	WebElement matterTab;
	
	//General Matter Tab
	@FindBy(xpath="//*[text()='General Matters']")
	WebElement generalMatterTab;
	
	//Create Matter Tab
	@FindBy(xpath = "//a[text()='Create']")
	WebElement createMatterTab;
	
	//Case Title
	@FindBy(id="title")
	WebElement caseTitleField;
	
	//case Number
		@FindBy(id="matterNumber")
		WebElement matterNumberField;
		
		//(//span[@class='mat-mdc-button-touch-target'])[1]
		//Start Date
		@FindBy(xpath="(//span[@class='mat-mdc-button-touch-target'])[1]")
		WebElement startDateClick;
		
		//close Date
		@FindBy(xpath="(//span[@class='mat-mdc-button-touch-target'])[2]")
		WebElement closeDateClick;
		
		//Description
		@FindBy(name="description")
		WebElement DescriptionField;
		
		//matter Type
		@FindBy(id="matterType")
		WebElement matterTypeField;
		
               //Next button
				@FindBy(className="btnsave")
				WebElement matterInfoNext;
				
				//Cancel
				@FindBy(xpath = "//button[@type='reset']")
				WebElement cancel;
		
		public void leftMatterTab() throws InterruptedException {
			pageUp();

			Thread.sleep(2000);
			visibilityOfAllElements(matterTab);
			matterTab.click();
		}
		public void generalMatterTab() throws InterruptedException {
			pageUp();

            Thread.sleep(4000);
            visibilityOfAllElements(generalMatterTab);
            generalMatterTab.click();
			Thread.sleep(4000);
			visibilityOfAllElements(createMatterTab);
			createMatterTab.click();
		}
		
		
			
		
			
		public void createGeneralMatter(String caseTitle, String matterNumber) throws InterruptedException {
			Thread.sleep(5000);
			visibilityOfAllElements(caseTitleField);
			caseTitleField.sendKeys(caseTitle);
			
			visibilityOfAllElements(matterNumberField);
			matterNumberField.sendKeys(matterNumber);
			
			Thread.sleep(1000);
			pageDown();
			Thread.sleep(3000);
			matterInfoNext.click();
}
		
		public void createGeneralAllFieldEnter(String caseTitle, String matterNumber, String startDate, String closeDate, String description, String matterType,String prioritySelect) throws InterruptedException {
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0,400)");
			visibilityOfAllElements(caseTitleField);
			caseTitleField.sendKeys(caseTitle);
			visibilityOfAllElements(matterNumberField);
			matterNumberField.sendKeys(matterNumber);
			visibilityOfAllElements(matterTypeField);
			matterTypeField.sendKeys(matterType);	
			visibilityOfAllElements(startDateClick);
			startDateClick.click();
			Thread.sleep(2000);
			// String date = " 5 ";
			driver.findElement(By.xpath("//div[text()='" + startDate + "']")).click();
			Thread.sleep(2000);
			visibilityOfAllElements(closeDateClick);
			closeDateClick.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[text()='" + closeDate + "']")).click();
			Thread.sleep(2000);
				
			//Priority = Medium
			driver.findElement(By.xpath("//button[text()='" + prioritySelect + "']")).click();
			statusActive();
			Thread.sleep(1000);
			visibilityOfAllElements(DescriptionField);
			DescriptionField.sendKeys(description);
			pageDown();

			
			
			
			}
		
		//Group Selecting
		
		// All Name Text Group
		@FindBy(xpath="//div //div[@class='callselect']")
		List<WebElement> listOfGroupsName;
		
		//CheckBox Select
		@FindBy(xpath="//*[@id='flexCheckDefault']")
		List<WebElement> checkboxSelectGroup;
		
		@FindBy(className = "btnsave")
		WebElement nextBtn;
		
		public void selecting(String[] NameList) throws InterruptedException {
			Thread.sleep(2000);
			// String[] groupNameList = {"Group Modules Test","Corporative
			// Law","Administration Group"};
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0,500)");
			
			try
			{
				
				int j = 0;
				List<String> groupNames = Arrays.asList(NameList);
				
				String textGroup=new String();
				Thread.sleep(5000); 
				JavascriptExecutor executor = (JavascriptExecutor) driver;
				WebElement checkboxSelectedGroupName;
				for (int i = 0; i <listOfGroupsName.size(); i++) 
				{
					textGroup = listOfGroupsName.get(i).getText();
					
					  if (groupNames.contains(textGroup)) { 
						  j++; 
						  Thread.sleep(3000); 
						  checkboxSelectedGroupName = checkboxSelectGroup.get(i); 
							visibilityOfAllElements(checkboxSelectedGroupName);
						  executor.executeScript("arguments[0].click();", checkboxSelectedGroupName);
						  i--;
						  }	
					  if (j == groupNames.size())
					  { 
						  break;
						  }
				}
			}
				catch (Exception e)
				{
					System.out.println(e);
			
				}
			
			
			
		}
			
			// Document Page Save / Alert Popup
			
			@FindBy(xpath = "//div[@class='alertbutton ng-star-inserted']//button[2]")
			WebElement alertYes;

			@FindBy(className = "alertbtnno")
			WebElement alertNo;
			
			@FindBy(xpath = "//button[text()='Add Matter']")
			WebElement addMatterSuccessPopup;
			
			@FindBy(xpath = "//button[text()='View Matter List']")
			WebElement viewMatterListSuccessPopup;
			
			public void documentPageSaveandSuccessPopup() throws InterruptedException {
				visibilityOfAllElements(alertYes);
				alertYes.click();
				visibilityOfAllElements(viewMatterListSuccessPopup);
				viewMatterListSuccessPopup.click();
				Thread.sleep(8000);
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollTo(0,50)");
			}
			
			public void nextPage() throws InterruptedException
			{	
				pageDown();
				Thread.sleep(2000);
				visibilityOfAllElements(matterInfoNext);
				matterInfoNext.click();
			}
			public void cancelButton() throws InterruptedException {
				pageDown();
				Thread.sleep(2000);
				visibilityOfAllElements(cancel);
				cancel.click();
			}
			public void alertPopupYes() throws InterruptedException
			{
				visibilityOfAllElements(alertYes);
				alertYes.click();		
			}
			public void alertPopupNo() throws InterruptedException {
				Thread.sleep(1000);
				visibilityOfAllElements(alertNo);
				alertNo.click();
			}
			
			public void viewMatterListSuccess() throws InterruptedException
			{
				visibilityOfAllElements(viewMatterListSuccessPopup);
				viewMatterListSuccessPopup.click();
			}
			
			@FindBy(xpath="//button[@class='btn btn-default alertbtn ng-star-inserted']")
			WebElement addMatterSuccess;
			
			public void addMatterSuccess() throws InterruptedException
			{
				visibilityOfAllElements(addMatterSuccess);
				addMatterSuccess.click();
			}
			
			//Temp Client - Individuals
			@FindBy(xpath="//input[@placeholder='Search Client']")
			WebElement inputTempClientSearchBox;
			
			@FindBy(id="name")
			WebElement firstNameTempClient;
			
			@FindBy(id="lastName")
			WebElement lastNameTempClient;
			
			@FindBy(id="email")
			WebElement emailTempClient;
			
			@FindBy(id="confirmemail")
			WebElement confirmemailTempClient;
			
			@FindBy(xpath="//select[@class='form-control textbox ng-untouched ng-pristine ng-invalid']")
			WebElement countryTempClient;
			
			@FindBy(id="phonenumber")
			WebElement phonenumberTempClient;
			
			
			
			
			public void tempClientIndividuals(String searchTempClient, String firstName, String lastName, String emailAddress, String confirmEmailAddress, String country, String phoneNumber) throws InterruptedException {
				Thread.sleep(3000);
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollTo(0,500)");
				Thread.sleep(1000);
				visibilityOfAllElements(inputTempClientSearchBox);
				inputTempClientSearchBox.sendKeys(searchTempClient);
				visibilityOfAllElements(firstNameTempClient);
				firstNameTempClient.sendKeys(firstName);
				lastNameTempClient.sendKeys(lastName);
				emailTempClient.sendKeys(emailAddress);
				// Scroll down till the bottom of the page
				pageDown();
				Thread.sleep(1000);
				visibilityOfAllElements(confirmemailTempClient);
				confirmemailTempClient.sendKeys(confirmEmailAddress);
				visibilityOfAllElements(countryTempClient);
				countryTempClient.click();
				Select objSelect =new Select(driver.findElement(By.xpath("//select[@class='form-control textbox ng-untouched ng-pristine ng-invalid']")));
				Thread.sleep(2000);
				objSelect.selectByVisibleText(country);
				phonenumberTempClient.sendKeys(phoneNumber);
				
			}
			//Cancel
			@FindBy(xpath = "(//button[@type='reset'])[1]")
			WebElement cancelTempClient;
			
			public void cancelTempClientBtn() throws InterruptedException {
				pageDown();
				Thread.sleep(1000);
				cancelTempClient.click();
				
			}
				
				//Add Temporary Button
				@FindBy(xpath="//button[@class='btn btn-primary savecls']")
				WebElement addTemporaryBtn;
				
				public void addTemporaryButton() throws InterruptedException {
					Thread.sleep(2000);
					visibilityOfAllElements(addTemporaryBtn);
					addTemporaryBtn.click();
				}
				//Add Team Member
				@FindBy(xpath="//button[@class='btn btn-default alertbtn']")
				WebElement addTeamMembersBtnTempClients;
				
				public void addTeamMembersTempClientsBtn() throws InterruptedException {
					Thread.sleep(2000);
					visibilityOfAllElements(addTeamMembersBtnTempClients);
					addTeamMembersBtnTempClients.click();
				}

			
			
			//Temp Client - Entity
			
			@FindBy(name="entity")
			WebElement entityTab;
			
			@FindBy(id="fullname")
			WebElement firmNameEntity;
			
			@FindBy(id="contact_person")
			WebElement contactPersonEntity;
			
			public void tempClientEntity(String searchTempEntity,String firmName,String contactPerson,String emailId,String confirmEmailId,String countryEntitys,String phoneNumber) throws InterruptedException{
				Thread.sleep(3000);
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollTo(0,500)");
				Thread.sleep(1000);
				visibilityOfAllElements(inputTempClientSearchBox);
				inputTempClientSearchBox.sendKeys(searchTempEntity);
				visibilityOfAllElements(entityTab);
				entityTab.click();
				visibilityOfAllElements(firmNameEntity);
				firmNameEntity.sendKeys(firmName);
				contactPersonEntity.sendKeys(contactPerson);
				emailTempClient.sendKeys(emailId);
				// Scroll down till the bottom of the page
				pageDown();
				Thread.sleep(1000);
				visibilityOfAllElements(confirmemailTempClient);
				confirmemailTempClient.sendKeys(confirmEmailId);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//div//select")).click();
				Select objSelect1 =new Select(driver.findElement(By.xpath("//div//select")));
				Thread.sleep(2000);
				objSelect1.selectByVisibleText(countryEntitys);
				phonenumberTempClient.sendKeys(phoneNumber);
				
				}
			
			// Status - Active and Pending

			// Status - Active
			@FindBy(xpath = "//button[text()='Active']")
			WebElement statusActiveBtn;

			// Status Pending
			@FindBy(xpath = "//button[text()='Pending']")
			WebElement statusSelect;

			// Status - Active
			public void statusActive() throws InterruptedException {
				visibilityOfAllElements(statusActiveBtn);
				statusActiveBtn.click();
			}

			// Status - Pending
			public void statusPending() throws InterruptedException {
				visibilityOfAllElements(statusSelect);
				statusSelect.click();
			}

			// In left side check group names are appear
			@FindBy(xpath = "//div[@class='col-6 matterpadding'] //div[1]")
			WebElement names;
			
			public void checkLeftSideSelectedNameareEmpty() throws InterruptedException {
				scrollUpnearbySearchbox();
				Thread.sleep(2000);	
				Assert.assertTrue(names.getText().isEmpty());
				
				}
			public void scrollUpnearbySearchbox() throws InterruptedException {
				Thread.sleep(2000);
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollTo(0,500)");
				
			}
			@FindBy(xpath="(//div[@class='col-6 matterpadding'])[1]")
			WebElement clientEmptyname;
			
			public void checkLeftSidegroupsSelectedNameareEmpty() throws InterruptedException {
				scrollUpnearbySearchbox();
				Thread.sleep(2000);
				Assert.assertTrue(clientEmptyname.getText().isEmpty());

			}
			
			//Select All Button
			@FindBy(id = "selectAll")
			WebElement selectAll;
			
			public void selectAllBtn() throws InterruptedException {
				scrollUpnearbySearchbox();

				Thread.sleep(5000);
				visibilityOfAllElements(selectAll);
				selectAll.click();
			}
			
			public void checkSelectAllCheckboxIsUnSelected() throws InterruptedException {
				scrollUpnearbySearchbox();
				Thread.sleep(2000);
				visibilityOfAllElements(selectAll);
				boolean isNameUnselected = selectAll.isSelected();
				Assert.assertTrue(isNameUnselected);

			}
			
			
			public void InputSearchBox(String text) throws InterruptedException {
				pageUp();
				Thread.sleep(2000);
				visibilityOfAllElements(inputTempClientSearchBox);
				inputTempClientSearchBox.sendKeys(text);

			}
			
			public void InputSearchBoxTempClients(String searchText) throws InterruptedException {
				Thread.sleep(3000);
				inputTempClientSearchBox.sendKeys(searchText);

		}
			
		//Module heading name
			
			// MatterInfo
			@FindBy(xpath = "(//img[@class='stepimg'])[1]")
			WebElement matterInfoTabCreateMatter;

			// Groups
			@FindBy(xpath = "(//img[@class='stepimg'])[1]")
			WebElement groupTabCreateMatter;

			// Clients
			@FindBy(xpath = "(//img[@class='stepimg'])[1]")
			WebElement clientTabCreateMatter;

			// Team Member
			@FindBy(xpath = "(//img[@class='stepimg'])[1]")
			WebElement teamMemberTabCreateMatter;

			// Documents
			@FindBy(xpath = "(//img[@class='stepimg'])[1]")
			WebElement documentTabCreateMatter;
			
			// Assert Checking scenario
			@FindBy(xpath="//input[@name='startdate']")
			WebElement startDateTextCheck;
			
			@FindBy(xpath="//input[@name='closedate']")
			WebElement closeDateTextCheck;

			
			@FindBy(xpath = "(//button[@name='priority'])[1]")
			WebElement priorityHigh;

			@FindBy(xpath = "//button[@class='selectprior optionhigh']")
			WebElement statusActive;
			
			public void checkAllFieldsareEmptyinMatterinfoPage() throws InterruptedException {
				Thread.sleep(2000);
				Assert.assertTrue(caseTitleField.getText().isEmpty());
				Assert.assertTrue(matterNumberField.getText().isEmpty());
				Assert.assertTrue(startDateTextCheck.getText().isEmpty());
				Assert.assertTrue(closeDateTextCheck.getText().isEmpty());
				Assert.assertTrue(DescriptionField.getText().isEmpty());
				Assert.assertTrue(matterTypeField.getText().isEmpty());
	}
			
			public void checkAllFieldsareEmptyinTempClients() throws InterruptedException {
				Thread.sleep(3000);
				visibilityOfAllElements(firstNameTempClient);
				Assert.assertTrue(firstNameTempClient.getText().isEmpty());
				Assert.assertTrue(lastNameTempClient.getText().isEmpty());
				pageDown();
				Thread.sleep(1000);
				Assert.assertTrue(emailTempClient.getText().isEmpty());
				Assert.assertTrue(confirmemailTempClient.getText().isEmpty());
				Assert.assertTrue(phonenumberTempClient.getText().isEmpty());
			}
			// Temp Entity

			public void checkAllFieldsareEmptyinTempEntity() throws InterruptedException {
				Thread.sleep(2000);
				visibilityOfAllElements(entityTab);
				entityTab.click();
				Assert.assertTrue(firmNameEntity.getText().isEmpty());
				Assert.assertTrue(contactPersonEntity.getText().isEmpty());
				pageDown();
				Thread.sleep(1000);
				Assert.assertTrue(emailTempClient.getText().isEmpty());
				Assert.assertTrue(confirmemailTempClient.getText().isEmpty());
				Assert.assertTrue(phonenumberTempClient.getText().isEmpty());
			}
			
			@FindBy(xpath = "//div //h5[text()='Selected Document(s)']")
			WebElement selectedDocumentNameText;

			public void selectedDocumentNameTextVerification() throws InterruptedException {
				scrollUpnearbySearchbox();
				Thread.sleep(2000);
				visibilityOfAllElements(selectedDocumentNameText);
				boolean text = selectedDocumentNameText.isDisplayed();
				Assert.assertTrue(text);
			}
		
				
			}

			
			
		

			
			
			
			
			
			
			
			
			








						  
					  


				







			

		

		




		
		
		
		
		
		
	
	
	
	
	




