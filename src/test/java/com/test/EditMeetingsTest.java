package com.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.BaseClass;

public class EditMeetingsTest extends BaseClass {

	@Test(dataProvider = "getData0", priority = 0)
	public void editMeetingWithRepetation(HashMap<String, String> input) throws InterruptedException {

		try {
			createMeetings.leftSideMeetingsTab();
			Thread.sleep(3000);
			createMeetings.viewDayTab();
			viewMeetings.viewDay(input.get("date1"));
			viewMeetings.meetingCheck(input.get("scrollTime"), input.get("meetingName"));
			viewMeetings.scrollUp();
			Thread.sleep(2000);
			viewMeetings.assertMeetingName(input.get("meetingnameAssert"));
			viewMeetings.editMeetingBtn();
			createMeetings.scrollDown2();				
			Thread.sleep(2000);
			createMeetings.meetingLink1(input.get("meetingLink"));
			createMeetings.dialNumber1(input.get("dialNumber"));
			Thread.sleep(2000);
			createMeetings.location1(input.get("location"));
			createMeetings.meetingAgenda1(input.get("meetingagenda"));
			createMeetings.scrollDown3();
			Thread.sleep(2000);
			createMeetings.addTeamMember1(input.get("teamMember1"));
			createMeetings.addEntityFirmSelect1(input.get("entityFirmName"));
			createMeetings.addEntityMemberSelect1(input.get("entityMember1"));
			Thread.sleep(2000);
			createMeetings.addIndividuals1(input.get("individualMember1"));
			Thread.sleep(2000);
			createMeetings.scrollDown3();
			Thread.sleep(2000);
			createMeetings.saveButtonClick();
			Thread.sleep(3000);
			viewMeetings.editRecurringEventBtn();
			Thread.sleep(2000);

			createMeetings.viewChangesBtnClick();
			createMeetings.scrollUp();
			Thread.sleep(3000);
			viewMeetings.monthTab();
			Thread.sleep(2000);
			viewMeetings.reptitionTextVerify2(input.get("date"), input.get("currentYear"), input.get("currentMonth"),
					input.get("repetationCount"), input.get("meetingName"), input.get("meetingnameAssert"),
					input.get("monthAndTime"), input.get("meetingagenda"), input.get("meetingLink"),
					input.get("dialNumber"), input.get("teamMember1"), input.get("entityFirmAssert"),
					input.get("entityMember1"), input.get("individualsAssert"));

		} finally {
			createMeetings.leftSideMeetingsTab();

		}
	}
	
	@Test(dataProvider = "getData1", priority=1)
	public void editMeeting(HashMap<String,String> input) throws InterruptedException {
		try {
			createMeetings.leftSideMeetingsTab();
			Thread.sleep(3000);
			createMeetings.viewDayTab();
			viewMeetings.viewDay(input.get("date1"));
			viewMeetings.meetingCheck(input.get("scrollTime"), input.get("meetingName"));
			viewMeetings.scrollUp();
			Thread.sleep(2000);
			viewMeetings.assertMeetingName(input.get("meetingnameAssert"));
			viewMeetings.editMeetingBtn();
			createMeetings.scrollDown2();
			Thread.sleep(2000);
			createMeetings.meetingLink1(input.get("meetingLink"));
			createMeetings.dialNumber1(input.get("dialNumber"));
			createMeetings.location1(input.get("location"));
			createMeetings.meetingAgenda1(input.get("meetingagenda"));
			createMeetings.scrollDown3();
		    Thread.sleep(2000);
		    createMeetings.addTeamMember1(input.get("teamMember1"));
		    createMeetings.addEntityFirmSelect1(input.get("entityFirmName"));
		    createMeetings.addEntityMemberSelect1(input.get("entityMember1"));
		    Thread.sleep(2000);
		    createMeetings.addIndividuals1(input.get("individualMember1"));
		    Thread.sleep(2000);
		    createMeetings.scrollDown3();
		    Thread.sleep(2000);
		    createMeetings.saveButtonClick();
		    Thread.sleep(3000);
		    viewMeetings.editRecurringEventBtn();
		    Thread.sleep(3000);
		    createMeetings.viewChangesBtnClick();
		    Thread.sleep(1000);
		    viewMeetings.scrollUp();
		    Thread.sleep(3000);
		    viewMeetings.viewDay(input.get("date1"));
		    Thread.sleep(1000);
		    viewMeetings.meetingCheck(input.get("scrollTime"), input.get("meetingName"));
		    viewMeetings.scrollUp();
		    Thread.sleep(1000);
		    viewMeetings.assertMeetingName1(input.get("meetingnameAssert"));
		    viewMeetings.assertMonthandTime2(input.get("date"), input.get("month"), input.get("year"), input.get("monthAndTime"));
		    viewMeetings.assertMeetingLink1(input.get("meetingLink"));
		    viewMeetings.assertPhoneNumber1(input.get("dialNumber"));
		    viewMeetings.assertMeetingAgenda1(input.get("meetingagenda"));
		    viewMeetings.assertTeamMember1(input.get("teamMember1"));
		    //viewMeetings.assertEntityandIndividual1(input.get("entityFirmName1"));
		    //viewMeetings.assertEntityandIndividual1(input.get("entityMember2"));
		    //viewMeetings.assertEntityandIndividual1("individualsAssert");
		    
			
		}finally {
			createMeetings.leftSideMeetingsTab();
	}
}

	@DataProvider
	public Object[][] getData0() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\editMeeting.json");

		return new Object[][] {//{ data.get(0) }, { data.get(1) },{ data.get(2) },{ data.get(3) }, { data.get(4) },
		//{ data.get(5) }, { data.get(6) }, { data.get(7) }, { data.get(8) }, { data.get(9) }, { data.get(10) },
			//{ data.get(11) }, { data.get(12) }, { data.get(13) }, { data.get(14) }, { data.get(15) },
			//{ data.get(16) }, { data.get(17) }, { data.get(18) }, { data.get(19) }, { data.get(20) },
			//{ data.get(21) }, { data.get(22) }, { data.get(23) }, { data.get(24) }, { data.get(25) },
			//{ data.get(26) }, { data.get(27) }, { data.get(28) }, { data.get(29) }, { data.get(30) },
			//{ data.get(31) }, { data.get(32) }, { data.get(33) }, { data.get(34) }, { data.get(35) },
			//{ data.get(36) }, { data.get(37) }, { data.get(38) }, { data.get(39) }, { data.get(40) },
			//{ data.get(41) }, { data.get(42) }, { data.get(43) }, 
			{ data.get(44) }}; //{ data.get(45) },
			//{ data.get(46) }, { data.get(47) }, { data.get(48) }, { data.get(49) }};
			
			}
	
	@DataProvider
	public Object[][] getData1() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\editMeeting.json");

		return new Object[][] {//{ data.get(50) }, { data.get(51) }, { data.get(52) }, { data.get(53) }, { data.get(54) },{ data.get(55) },
			{ data.get(56) }}; //{ data.get(57) }, { data.get(58) }, { data.get(59) }};
		
	
	
}
}
