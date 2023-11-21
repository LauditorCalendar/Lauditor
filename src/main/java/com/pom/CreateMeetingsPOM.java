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

import com.abst.Reusable;

public class CreateMeetingsPOM extends Reusable {
	WebDriver driver;

	public CreateMeetingsPOM(WebDriver driver) {

		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// left side meetings icon
	@FindBy(xpath = "(//div //img[@class='mattersicon'])[5]")
	WebElement meetingsTab;

	// create meeting button
	@FindBy(xpath = "//a[@class='optionone compone']")
	WebElement createTab;
	
	//View Meeting button
	@FindBy(xpath="//a[text()='Day']")
	WebElement viewTab;
	
	// Month View Tab
	@FindBy(xpath="//div //a[text()='Month']")
	WebElement monthTab;

	// Subject or Task
	@FindBy(xpath = "(//div//select)[1]")
	WebElement subjectortask;

	// Select Timezone
	@FindBy(xpath = "//select[@class='form-select calendorselect ng-valid ng-touched ng-dirty']")
	WebElement timeZone;

	// Select Repetition
	@FindBy(xpath = "(//div//select)[5]")
	WebElement repetition;

	// datepicker
	@FindBy(id = "datepicker")
	WebElement datePicker;

	// Collect all Dates
	@FindBy(xpath = "//td[@role='gridcell']")
	List<WebElement> AllDates;

	// Exact Month
	@FindBy(xpath = "(//div[@class='bs-datepicker-head']//button[@class='current'])[1]")
	WebElement AllMonth;

	// Save button
	@FindBy(xpath = "//button[@class='btn btn-default btnsave savecls']")
	WebElement saveBtn;

	// View Changes button
	@FindBy(xpath = "//button[@class='btn btn-default alertbtn']")
	WebElement viewChangesBtn;

	// Select Event Year
	@FindBy(xpath = "(//div[@class='bs-datepicker-head']//button[@class='current'])[2]")
	WebElement EventYear;

	public void leftSideMeetingsTab() throws InterruptedException {
		 

		Thread.sleep(2000);
		visibilityOfAllElements(meetingsTab);
		meetingsTab.click();
		Thread.sleep(2000);
		scrollUp();
		Thread.sleep(2000);

		
	}

	public void createMeetingTab() throws InterruptedException {
		Thread.sleep(2000);
		pageUp();
		visibilityOfAllElements(createTab);
		createTab.click();
	}
	
	public void viewDayTab() throws InterruptedException {
		Thread.sleep(2000);
	//	pageUp();
		visibilityOfAllElements(viewTab);
		viewTab.click();

}
	public void monthViewTab() throws InterruptedException {
		Thread.sleep(2000);
		pageUp();
		visibilityOfAllElements(monthTab);
		monthTab.click();

}
	

	public void subjectOrTaskButtonClick(String selectTask, String meetingDates, String selectMonth, String selectYear)
			throws InterruptedException {
		Thread.sleep(5000);
		visibilityOfAllElements(subjectortask);
		subjectortask.click();
		// driver.findElement(By.xpath("//select[@class='form-select calendorselect
		// ng-pristine ng-invalid ng-touched']")).click();
		
		Select objSelect = new Select(subjectortask);
		Thread.sleep(2000);
		objSelect.selectByVisibleText(selectTask);
		
		// Thread.sleep(2000);
		visibilityOfAllElements(datePicker);
		datePicker.click();
		pageDown1();
		Thread.sleep(2000);
		while (!EventYear.getText().contains(selectYear)) {
			driver.findElement(By.xpath("//div[@class='bs-datepicker-head']//button[@class='next']")).click();
		}
		while (!AllMonth.getText().contains(selectMonth)) {
			driver.findElement(By.xpath("//div[@class='bs-datepicker-head']//button[@class='next']")).click();
		}

		// Select Specific Date
		Thread.sleep(3000);

		for (int i = 0; i < AllDates.size(); i++) {
			String text = AllDates.get(i).getText();
			if (text.equalsIgnoreCase(meetingDates)) {
				AllDates.get(i).click();
				break;
			}

		}

	}
	
	// Subject/Task Method
		public void taskName1(String name) throws InterruptedException {
			if (!name.equals("")) {
				visibilityOfAllElements(subjectortask);
				subjectortask.click();
				selectingNames(subjectortask, name);
				subjectortask.click();
			}
		}
		

	// Select Start Time
	@FindBy(xpath = "(//div//select)[2]")
	WebElement meetStartTime;

	// Select End Time
	@FindBy(xpath = "(//div//select)[3]")
	WebElement meetEndTime;

	public void startTime(String startTime) throws InterruptedException {
		visibilityOfAllElements(meetStartTime);
		meetStartTime.click();
		Select objSelect = new Select(meetStartTime);
		objSelect.selectByVisibleText(startTime);
	}
	
	// StartDate
		public void startTime1(String name) throws InterruptedException {
			if (!name.equals("")) {
				visibilityOfAllElements(meetStartTime);
				meetStartTime.click();
				selectingNames(meetStartTime, name);
				meetStartTime.click();
			}
		}

	public void EndTime(String endTime) throws InterruptedException {
		visibilityOfAllElements(meetEndTime);
		meetEndTime.click();
		Select objSelect1 = new Select(meetEndTime);
		objSelect1.selectByVisibleText(endTime);
	}
	
	// EndDate
		public void endTime1(String name) throws InterruptedException {
			if (!name.equals("")) {
				visibilityOfAllElements(meetEndTime);
				meetEndTime.click();
				selectingNames(meetEndTime, name);
				meetEndTime.click();
			}
		}
		
		// Date
		@FindBy(id = "drp")
		WebElement dates;
		
		// Date
		public void dateChoosen(String date) throws InterruptedException {
			if (!date.equals("")) {
				dates.click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[text()='" + date + "']")).click();
			}
		}
		
		// Repetition
		@FindBy(xpath = "//div //select[@formcontrolname='repeat_interval']")
		WebElement repetitionList;

		
		// Repetition
		public void repetition1(String name) throws InterruptedException {
			if (!name.equals("")) {
				visibilityOfAllElements(repetitionList);
				repetitionList.click();
				selectingNames(repetitionList, name);
				repetitionList.click();
			}
		}
		

	public void repetitionClick(String Repetition) throws InterruptedException {
		visibilityOfAllElements(repetition);
		repetition.click();
		Select objSelect = new Select(repetition);
		objSelect.selectByVisibleText(Repetition);

	}

	public void saveButtonClick() throws InterruptedException {

		visibilityOfAllElements(saveBtn);
		Thread.sleep(2000);
		saveBtn.click();
	}

	public void viewChangesBtnClick() throws InterruptedException {
		visibilityOfAllElements(viewChangesBtn);
		viewChangesBtn.click();
		Thread.sleep(2000);
		pageUp();
	}

	// Add to Timesheet
	@FindBy(id = "addtimesheet")
	WebElement addToTimesheet;

	public void unSelectAddtoTimesheet() {
		visibilityOfAllElements(addToTimesheet);
		addToTimesheet.click();
	}

//All Day
	@FindBy(id = "allday")
	WebElement allDay;

	public void allDayEvent() {
		visibilityOfAllElements(allDay);
		allDay.click();
	}

	// Add Notification button
	@FindBy(xpath = "//button[@class='btn btn-primary']")
	WebElement addNotificationBtn;

	public void addNotification() {
		visibilityOfAllElements(addNotificationBtn);
		addNotificationBtn.click();

	}

	// Notification Time
	@FindBy(xpath = "//input[@type='number']")
	WebElement notificationTime;

	// Notification Minutes/Hours/Days/Weeks
	@FindBy(xpath = "//div //select[@class='notificationRow form-control ng-pristine ng-valid ng-touched']")
	WebElement classficationOfNotifyTime;

	public void enterNotificationTime(String eventNotifyTime, String classifyTime) throws InterruptedException {
		visibilityOfAllElements(notificationTime);
		notificationTime.clear();
		notificationTime.sendKeys(eventNotifyTime);
		Thread.sleep(2000);
		visibilityOfAllElements(classficationOfNotifyTime);
		classficationOfNotifyTime.click();
		Select objSelect = new Select(classficationOfNotifyTime);
		objSelect.selectByVisibleText(classifyTime);
		Thread.sleep(2000);
	}

	// Insert Meeting Link

	@FindBy(id = "meeting-link")
	WebElement meetingLink;

	public void MeetingLink(String enterMeetingLink) {
		visibilityOfAllElements(meetingLink);
		meetingLink.sendKeys(enterMeetingLink);
	}
	
	// Meeting Link
		public void meetingLink1(String text) {
			if (!text.equals("")) {
				visibilityOfAllElements(meetingLink);
				meetingLink.clear();
				meetingLink.sendKeys(text);
			}
		}

	@FindBy(id = "number")
	WebElement dialInNumber;

	public void DailINNumber(String phoneNumber) {
		visibilityOfAllElements(dialInNumber);
		dialInNumber.sendKeys(phoneNumber);
	}
	
	// Dial-in Number
		public void dialNumber1(String text) {
			if (!text.equals("")) {
				visibilityOfAllElements(dialInNumber);
				dialInNumber.clear();
				dialInNumber.sendKeys(text);
			}
		}
	

	@FindBy(id = "location")
	WebElement locationOfMeeting;

	public void MeetingLocation(String meetLocation) {
		visibilityOfAllElements(locationOfMeeting);
		locationOfMeeting.sendKeys(meetLocation);
	}
	
	// Location
		public void location1(String text) {
			if (!text.equals("")) {
				visibilityOfAllElements(locationOfMeeting);
				locationOfMeeting.clear();
				locationOfMeeting.sendKeys(text);
			}
		}

	@FindBy(xpath = "//textarea[@name='meeting-agenda']")
	WebElement meetingAgenda;

	public void MeetingAgenda(String meetAgenda) {
		visibilityOfAllElements(meetingAgenda);
		meetingAgenda.sendKeys(meetAgenda);

	}
	
	// Meeting Agenda
		public void meetingAgenda1(String text) {
			if (!text.equals("")) {
				visibilityOfAllElements(meetingAgenda);
				meetingAgenda.clear();
				meetingAgenda.sendKeys(text);
			}
		}

	@FindBy(xpath = "//input[@placeholder='Search team member']")
	WebElement addTeamMember;

	@FindBy(xpath = "(//input[@type='button'])[1]")
	WebElement teamMemberAddBtn;

	// Add Team Member
	public void AddTeamMember(String text) {
		visibilityOfAllElements(addTeamMember);
		addTeamMember.click();
		addTeamMember.sendKeys(text);
		visibilityOfAllElements(teamMemberAddBtn);
		teamMemberAddBtn.click();
	}
	
	// Add Team Member
		public void addTeamMember1(String text) {
			if (!text.equals("")) {
				visibilityOfAllElements(addTeamMember);
				addTeamMember.click();
				addTeamMember.sendKeys(text);
				visibilityOfAllElements(teamMemberAddBtn);
				teamMemberAddBtn.click();
			}
		}
	
	

	@FindBy(xpath = "//select[@class='textbox form-control']")
	WebElement selectEntityBtn;

	@FindBy(xpath = "//input[@placeholder='Search client']")
	WebElement searchClientBtn;

	@FindBy(xpath = "(//input[@class='btnfile'])[2]")
	WebElement entityClientAddBtn;

	public void SelectEntity(String entityName, String clientName) throws InterruptedException {
		visibilityOfAllElements(selectEntityBtn);
		selectEntityBtn.click();
		Select objSelect = new Select(selectEntityBtn);
		objSelect.selectByVisibleText(entityName);
		visibilityOfAllElements(searchClientBtn);
		searchClientBtn.click();
		Thread.sleep(3000);
		searchClientBtn.sendKeys(clientName);
		entityClientAddBtn.click();
	}
	
	// Add Entity
		public void addEntityFirmSelect1(String name) throws InterruptedException {
			if (!name.equals("")) {
				visibilityOfAllElements(selectEntityBtn);
				selectEntityBtn.click();
				selectingNames(selectEntityBtn, name);
				selectEntityBtn.click();
			}
		}
		
		public void addEntityMemberSelect1(String text) {
			if (!text.equals("")) {
				visibilityOfAllElements(searchClientBtn);
				searchClientBtn.click();
				searchClientBtn.sendKeys(text);
				visibilityOfAllElements(entityClientAddBtn);
				entityClientAddBtn.click();
			}
		}

	@FindBy(xpath = "//input[@placeholder='Search Individual Clients']")
	WebElement addIndividualSearchBtn;

	@FindBy(xpath = "//div//input[@placeholder='Search Individual Clients']/following::input")
	WebElement individualAddBtn;

	public void AddIndividul(String text) {
		visibilityOfAllElements(addIndividualSearchBtn);
		addIndividualSearchBtn.click();
		addIndividualSearchBtn.sendKeys(text);
		visibilityOfAllElements(individualAddBtn);
		individualAddBtn.click();

	}
	
	// Add Individual
		public void addIndividuals1(String text) {
			if (!text.equals("")) {
				visibilityOfAllElements(addIndividualSearchBtn);
				addIndividualSearchBtn.click();
				addIndividualSearchBtn.sendKeys(text);
				visibilityOfAllElements(individualAddBtn);
				individualAddBtn.click();
			}
		}

	// Scrolldown
	public void scrollDown1() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,250)");
	}

	public void scrollDown2() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,400)");
	}

	public void scrollDown3() throws InterruptedException {
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	//	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		js.executeScript("window.scrollTo(0,1200)");

	}
	
	public void scrollDown4() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,1200)");

		
	}

	public void scrollUp() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,0)");
	}

	@FindBy(xpath = "//span //label[@class='lbltime']") 
	List<WebElement> EventNamesMonth;

	public void CalendarEventsSelectionMonths(String EventName) throws InterruptedException {
		Thread.sleep(3000);
		for(int i=0; i<EventNamesMonth.size();i++) {
			String EventColliections= EventNamesMonth.get(i).getText();
			Thread.sleep(3000);
			if(EventName.contains(EventColliections)) {
				Thread.sleep(1000);
				 WebElement EventClick1 = EventNamesMonth.get(i);
				 JavascriptExecutor executor = (JavascriptExecutor) driver;
				 executor.executeScript("arguments[0].click();", EventClick1);
			}
		}
	}

}
