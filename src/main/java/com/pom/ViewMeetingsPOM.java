package com.pom;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.abst.Reusable;

public class ViewMeetingsPOM  extends Reusable{
	
  WebDriver driver;
  
	public ViewMeetingsPOM(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	// Left Arrow in day view
		@FindBy(xpath = "//img[@class='lefticon']")
		WebElement LeftArrowClick;

		// Right Arrow in day view
		@FindBy(xpath = "//img[@class='righticon']")
		WebElement RightArrowClick;

		public void RightArrow_LeftArrow_Date(String EDate) throws InterruptedException {

			Thread.sleep(1000);
			int EventDates = Integer.parseInt(EDate);
			String DateLabel = driver.findElement(By.xpath("//label[@class='tdate']")).getText();
			String DLable1 = DateLabel.split(",")[1];
			String DLabel2 = DLable1.trim();
			String EventDate = DLabel2.split(" ")[1];
			int Todaydate = Integer.parseInt(EventDate);
			// while (!(Todaydate == EventDates )) {
			// Todaydate++;
			// RightArrowClick.click();
			int DateDiff = EventDates - Todaydate;
			boolean flag=true;
			if (DateDiff < 0) {
				flag = false;
				DateDiff = -1 * DateDiff;
			}
			for (int i = 0; i < DateDiff; i++) {
				if (flag == false) {
					Thread.sleep(1000);
					LeftArrowClick.click();

				} else {
					Thread.sleep(1000);
					RightArrowClick.click();

				}
			}

		}

		// Collection of all events in day view
		@FindBy(xpath = "//div //div [@role='application']")
		List<WebElement> EventNames;

		public void CollectionofEvents(String Eventname) throws InterruptedException {

			Thread.sleep(2000);
			for (int i = 0; i < EventNames.size(); i++) {
				String EventCollections = EventNames.get(i).getText();
				Thread.sleep(1000);
				// System.out.println("All Group Name Text "+allCalendarTextName);
				if (Eventname.equals(EventCollections)) {
					Thread.sleep(1000);
					WebElement EventClick = EventNames.get(i);
					JavascriptExecutor executor = (JavascriptExecutor) driver;
					executor.executeScript("arguments[0].click();", EventClick);
				}

			}

		}
		
		public void InnerScrollAllDay() throws InterruptedException {
			 Thread.sleep(3000);
			 JavascriptExecutor js = (JavascriptExecutor) driver;
			 WebElement InnerScroll = driver.findElement(By.xpath("//div //div[contains(text(),'all-day')]"));
			 js.executeScript("arguments[0].scrollIntoView();", InnerScroll);
			}
		
		public void scrollUp() throws InterruptedException
		{
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0,0)");
		}
		
		@FindBy(xpath="//div[@class='d-inline float-right'] //img[1]")
		WebElement editMeetingBtn;
		
		public void editMeetingBtn() {
			visibilityOfAllElements(editMeetingBtn);
			editMeetingBtn.click();
		}
		@FindBy(xpath="//div[@class='modal-body'] //form //div[3] //input")
		WebElement editRecurringEvent;
		
		@FindBy(xpath="//div[@class='btn-align center'] //button[@type='submit']")
		WebElement okEditRecurringPopup;
		
		public void editRecurringEventBtn() throws InterruptedException
		{
			visibilityOfAllElements(editRecurringEvent);
			editRecurringEvent.click();
			visibilityOfAllElements(okEditRecurringPopup);
			okEditRecurringPopup.click();
		}
		
		@FindBy(xpath="//div //a[text()='Month']")
		WebElement monthbtn;
		
		public void monthTab()
		{
			visibilityOfAllElements(monthbtn);
			monthbtn.click();
		}
		
		@FindBy(xpath="//img[@class='lefticon']")
		WebElement leftArrow;
		
		@FindBy(xpath="//img[@class='righticon']")
		WebElement rightArrow;
		
		public static String dateTrim(String text)
		{
			String string = text.split(",")[1].substring(1)+","+text.split(",")[2];
			return string;
		}
		
		public static LocalDate dateParse(String text)
		{
		        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
		        LocalDate date = LocalDate.parse(text, formatter);
		        return date;
		}
		
		public void viewDay(String string) throws InterruptedException
		{
			Thread.sleep(3000);
			String text = driver.findElement(By.xpath("//label[@class='tdate']")).getText();
			LocalDate date = dateParse(dateTrim(text));
			LocalDate date1 = dateParse(string);

			long diff = ChronoUnit.DAYS.between(date, date1);
			int flag=1;
			int dd=(int) diff;
			if(dd<0)
			{
				flag =0;
				dd = -1 * dd;
			}
			for(int i=0;i<dd;i++)
			{
				if(flag==0)
				{
					Thread.sleep(1000);
					leftArrow.click();
				}
				else
				{
					Thread.sleep(1000);
					rightArrow.click();
				}
			}
		
		}
		
		@FindBy(xpath="//div //div[@role='application']")
		List<WebElement> allCalendarName; 
		
		
		public void meetingCheck(String number,String meetingNames ) throws InterruptedException
		{
			Thread.sleep(2000);
			EventFiringWebDriver eventFiringWebDriver = new EventFiringWebDriver(driver);
			
			//int num = 7;
			
			int num = Integer.parseInt(number);
			
			if(num>=2)
			{
				eventFiringWebDriver.executeScript("document.querySelector('.mainmargin.scroll-container').scrollTop = 0");
			}
			
			if(num>=6)
			{
				eventFiringWebDriver.executeScript("document.querySelector('.mainmargin.scroll-container').scrollTop = 150");
			}
			if(num>=10)
			{
				eventFiringWebDriver.executeScript("document.querySelector('.mainmargin.scroll-container').scrollTop = 400");
			}
			if(num>=14)
			{
				eventFiringWebDriver.executeScript("document.querySelector('.mainmargin.scroll-container').scrollTop = 650");
			}
			if(num>=18)
			{
				eventFiringWebDriver.executeScript("document.querySelector('.mainmargin.scroll-container').scrollTop = 900");
			}
			if(num>=23)
			{
				eventFiringWebDriver.executeScript("document.querySelector('.mainmargin.scroll-container').scrollTop = 1150");
			}
		
		//	String meetingNames ="7:30 PM Contract Breach - Creating legal briefs";
			
			Thread.sleep(1000);
			
			for (int i = 0; i < allCalendarName.size(); i++) {
				String	allCalendarTextName = allCalendarName.get(i).getText();
				Thread.sleep(1000);
				//System.out.println("All Group Name Text "+allCalendarTextName);
				if(meetingNames.equals(allCalendarTextName))
				{
					Thread.sleep(2000);
					WebElement clickOnMeeting = allCalendarName.get(i);
					JavascriptExecutor executor = (JavascriptExecutor) driver;
					executor.executeScript("arguments[0].click();", clickOnMeeting);
				}
				
			}
			
		}
		
		// All days Meeting
		
		@FindBy(xpath="//div[@class='cal-all-day-events'] //div[@class='cal-event']")
		List<WebElement>  allDayMeetingNames;
		
		public void alldaysMeetingCheck(String number,String names) throws InterruptedException
		{
			Thread.sleep(2000);
			EventFiringWebDriver eventFiringWebDriver = new EventFiringWebDriver(driver);
			
			//int num = 7;
			
			int num = Integer.parseInt(number);
			
			if(num>=2)
			{
				eventFiringWebDriver.executeScript("document.querySelector('.mainmargin.scroll-container').scrollTop = 0");
			}
			
			// all day meeting name select
			
			//String names ="Legal Case 5 - Hearing";
			Thread.sleep(2000);
			for(int i=0;i<allDayMeetingNames.size();i++)
			{
				String text = allDayMeetingNames.get(i).getText();
				System.out.println("All meeting names "+text);
				if(names.equals(text))
				{
					WebElement clickOnMeeting = allDayMeetingNames.get(i);
					JavascriptExecutor executor = (JavascriptExecutor) driver;
					executor.executeScript("arguments[0].click();", clickOnMeeting);
				}
				
			}
			
		}
		
		

		
		
		//Assert Validation
		
		//Meeting name assert
		 @FindBy(xpath="//div //p[@class='casestudy1']")
		 WebElement meetingNameText;
		 
		 public void assertMeetingName(String actual) {
			 String expMeetingName = meetingNameText.getText();
			 assertEquals(actual,expMeetingName);
		 }
		 
		 public void assertMeetingName1(String actual)
			{
				if(!actual.equals(""))
				{
				//String actual ="Legal Case 5 - Creating legal briefs";
				String expMatterName = meetingNameText.getText();
				assertEquals(actual, expMatterName);
			}
			}
		
		 //Verify Month and Time
		 @FindBy(xpath="//div //p[@class='monthtitle']")
		 WebElement monthTimeText;
		 
		 public void assertMonthandTime(String name) throws InterruptedException
			{
				Thread.sleep(2000);
				String text = monthTimeText.getText();
				String[] name2 = text.split("Fri");
				System.out.println("name"+name2[1]);
				Thread.sleep(2000);
				assertEquals(name, name2[1]);
			}
		 
		 public void assertMonthandTime1(String name) throws InterruptedException
			{
				if(!name.equals(""))
				{
					String monthIndex[]= {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
					Thread.sleep(2000);
					//String [] name1 = {"Sun","Mon","","","","",""};
					String text = monthTimeText.getText();
					String substring = text.substring(4);
					System.out.println("name"+substring);
					Thread.sleep(2000);
					assertEquals(name, substring);
				}
			}
		 
		 public void assertMonthandTime2(String date, String month, String year,String name) throws InterruptedException
			{
				if(!name.equals(""))
				{
					int dt= Integer.parseInt(date);
					if (dt<10)
						date="0"+date;
					int month1 = Integer.parseInt(month);
				
					String monthIndex[]= {"","Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
					String name1 = monthIndex[month1]+" "+date+" "+year+name;
					Thread.sleep(2000);
					//String [] name1 = {"Sun","Mon","","","","",""};
					String text = monthTimeText.getText();
					String substring = text.substring(4);
					System.out.println("name"+substring);
					Thread.sleep(2000);
					assertEquals(name1, substring);
			}
			}
		 
		 
		//Meeting Agenda
			@FindBy(xpath="//div[@class='col-sm-7'] //p[1]")
			WebElement meetingAgendaText;

			public void assertMeetingAgenda(String actMeetingAgenda)
			{
				String expMeetingAgenda = meetingAgendaText.getText();
				assertEquals(actMeetingAgenda, expMeetingAgenda);
			}
			
			public void assertMeetingAgenda1(String actMeetingAgenda)
			{
				if(!actMeetingAgenda.equals(""))
				{
					String expMeetingAgenda = meetingAgendaText.getText();
					assertEquals(actMeetingAgenda, expMeetingAgenda);
				}
			}
		 
			//Meeting Link
			@FindBy(xpath="//div[@class='col-sm-5'] //p[2]")
			WebElement meetingLinkText;
			
			public void assertMeetingLink(String actMeetingLink) {
				String expMeetingLink = meetingLinkText.getText();
				assertEquals(actMeetingLink, expMeetingLink);

	}
			
			public void assertMeetingLink1(String actMeetinglink)
			{
				if(!actMeetinglink.equals(""))
				{
				//String actMeetinglink ="https:///zoom.com";
				String expMeetinglink = meetingLinkText.getText();	
				assertEquals(actMeetinglink, expMeetinglink);
			}
			}
			//Phone Number
			@FindBy(xpath="//div[@class='col-sm-5'] //p[4]")
			WebElement phoneNumberText;
			
			public void phoneNumber(String actPhoneNumber) {
				String expPhoneNumber = phoneNumberText.getText();
				assertEquals(actPhoneNumber,expPhoneNumber );
			}
			
			public void assertPhoneNumber1(String actNumber)
			{
				if(!actNumber.equals(""))
				{
				//String actNumber ="9876543210";
				String expNumber = phoneNumberText.getText();
				assertEquals(actNumber, expNumber);
			}
			}
			
			//Team Member
			@FindBy(xpath="(//div[2]) //label[2]")
			List<WebElement> teamMemberNameSelected;

			public void assertTeamMember(String names) throws InterruptedException
			{		
					Thread.sleep(2000);
					boolean nameTeamMatched = teamMemberNameSelected.stream().anyMatch(selectedAllName-> selectedAllName.getText().equalsIgnoreCase(names));
					assertTrue(nameTeamMatched);
			}
			
			public void assertTeamMember1(String names) throws InterruptedException
			{		
				if(!names.equals(""))
				{
					Thread.sleep(2000);
					boolean nameTeamMatched = teamMemberNameSelected.stream().anyMatch(selectedAllName-> selectedAllName.getText().equalsIgnoreCase(names));
					assertTrue(nameTeamMatched);
			}}
			
			// Entity and Individuals
			@FindBy(xpath="(//div[2]) //label[2]")
			List<WebElement> entityandIndividualSelected;

			public void assertEntityandIndividual(String names) throws InterruptedException
			{		
					Thread.sleep(2000);
					boolean nameMatched = entityandIndividualSelected.stream().anyMatch(selectedAllName-> selectedAllName.getText().equalsIgnoreCase(names));
					assertTrue(nameMatched);
			}
			
			public void assertEntityandIndividual1(String names) throws InterruptedException
			{		
				if(!names.equals(""))
				{
					Thread.sleep(2000);
					boolean nameMatched = entityandIndividualSelected.stream().anyMatch(selectedAllName-> selectedAllName.getText().equalsIgnoreCase(names));
					assertTrue(nameMatched);
			}}

			//Month 
			
			//Daily 
			
			
			@FindBy(xpath="//div[@role='row'] //span[@class='cal-day-number']")
			List<WebElement> listOfallDateName;
			
			@FindBy(xpath="//div[@role='row'] //td")
			List<WebElement> allCells;
			
			@FindBy(xpath="//td //span //label[@class='lbltime']")
			List<WebElement> allmeetingLabelText;
			// Daily , Week , Bi-Weekly
			public void reptitionTextVerify2(String day1,String year1,String month1,String repeat1,String nameVerify,String meetName,String monthTime,String meetingAgen,String meetingLink,String PhoneNum,String TM,String EntityFirm,String EntityMemb,String Individual) throws InterruptedException
			{

				int dateOneLoc;
				//int day = 3; int year = 2023; int month = 8,repeat=1;
				int monthDayCount;
				int day =Integer.parseInt(day1);
				int year =Integer.parseInt(year1);
				int month =Integer.parseInt(month1);
				int cmonth = month;
				int rpt =Integer.parseInt(repeat1);
				int repeatCount[]= {1,7,14,0,0};
				int repeat = repeatCount[rpt];	
				int week = 0, vCount=0;
				int monthLoop = (rpt<4)?1:12;
				int monthInc= (rpt<4)?1:0;
				int yearInc= (rpt<4)?0:1;
				
				for (int j=0; j<2; j++)
				{
					int i,timeLabelCount = 0;
					//Finding total days of the month provided
					YearMonth ym = YearMonth.of(year,month);
					monthDayCount = ym.lengthOfMonth();
				   // System.out.println("Month : "+month+"\tmonthDayCount : "+monthDayCount); 
				    if((rpt>2) && (day>monthDayCount))
					{
				    	for(int l = 0; l<monthLoop;l++)
						{
							rightArrow.click();
							Thread.sleep(2000);
						}
							month = month +monthInc;
							year = year + yearInc;
							if(month==13)
							{
								year++;
								month = 1;
							}
				    	continue;
					}
				    
					// Day one count
					// dateOneLoc--> Cell Location of day 1 of current month
					dateOneLoc = findDateOneLoc(listOfallDateName);
					Thread.sleep(2000);
					int monthStart = dateOneLoc;
					monthStart = (j==0) ? (dateOneLoc+day-1) : monthStart+week;
					
				//	System.out.println("Week : "+week+" MonthStart : "+monthStart);
					
					for(i=0; i<(dateOneLoc+monthDayCount);i++)
					{
						if(i==monthStart)
						{
							String[] oneCell = allCells.get(i).getText().split("[\\r\\n]+");
							//r --> split with enter
						//	System.out.println("Date "+oneCell[0]);
				
							int flag = 0;
							for(int k = 0; k<oneCell.length;k++)
							{
								String a = oneCell[k];
								//System.out.println("a : "+a+" nameVerify : "+nameVerify);
								//11:30 AM Legal Case 5 - Case filling
								if(a.equals(nameVerify))
								{
									//System.out.println("Matched :  "+a);
									flag = 1;
									if(vCount<2)
									{
									//	System.out.println("Matched :  "+a+" vCount : "+vCount+"k: "+k+"TimeLoc : "+(timeLabelCount+k-1));
										Thread.sleep(2000);
										WebElement clickOnMeeting = allmeetingLabelText.get(timeLabelCount+k-1);
										JavascriptExecutor executor = (JavascriptExecutor) driver;
										executor.executeScript("arguments[0].click();", clickOnMeeting);
										Thread.sleep(2000);
										scrollUp();
										Thread.sleep(2000);
										assertMeetingName1(meetName);
										assertMonthandTime2(oneCell[0],String.valueOf(month),String.valueOf(year),monthTime);
										assertMeetingAgenda1(meetingAgen);
										assertMeetingLink1(meetingLink);
									    assertPhoneNumber1(PhoneNum);
										assertTeamMember1(TM);
										assertEntityandIndividual1(EntityFirm);
										assertEntityandIndividual1(EntityMemb);
										assertEntityandIndividual1(Individual);
										Thread.sleep(2000);
										driver.navigate().back();
										Thread.sleep(4000);
										for(int z = cmonth;z<month;z++)
										{
											rightArrow.click();
											Thread.sleep(4000);
										}
										
									}
								break;
								}
							}
								if(flag==0)
								{
									System.out.println("flag is  "+flag);
									//assertion fail
									assertFalse(true);
								}
								vCount++;
								if(rpt<3) //Daily, Weekly, BiWeek
								{
									repeat = repeatCount[rpt];
									if((i+repeat)<(dateOneLoc+monthDayCount))
									{
										monthStart = i + repeat;
									//	System.out.println("i = "+i+" repeat = "+ monthStart);
									}
									else
									{
										week = i+repeat-(dateOneLoc+monthDayCount);
										break;
									}
								}
								
								else // Monthly & Yearly
								{
									week = day -1;
									break;
								}
							}
								
								String[] cellOne = allCells.get(i).getText().split("[\\r\\n]+");
						//		System.out.println("x = "+i+"Data : " + allCells.get(i).getText() + "Length : "+ cellOne.length);
								timeLabelCount =timeLabelCount + (cellOne.length-1);
						//		System.out.println("Cell : "+i+"Length : "+ cellOne.length + "Total Count : "+timeLabelCount);
									
							}
						
					//	System.out.println("week : "+week);
					
					for(int l = 0; l<monthLoop;l++)
					{
						rightArrow.click();
						Thread.sleep(2000);
					}
						month = month +monthInc;
						year = year + yearInc;
						Thread.sleep(5000);
						if(month==13)
						{
							year++;
							month = 1;
						}
					}	
			
			}
			public int findDateOneLoc(List<WebElement> allDates) {

				int temp = 36;
				// Date one Found
				for (int i = 0; i < allDates.size(); i++) {
					if (allDates.get(i).getText().equals("1")) {
						//System.out.println("location of 1 : " + i);
						temp = i;
						break;
					}
				}
				return temp;	
			
			
					
}
}
