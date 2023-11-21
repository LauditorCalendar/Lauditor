package com.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.BaseClass;

public class CreateAllDayEventWithMonthlyRepetitionTest extends BaseClass {

	@Test(dataProvider = "getData0", priority = 0)
	public void allFieldsEntered(HashMap<String, String> input) throws InterruptedException {

		try {
			createMeetings.leftSideMeetingsTab();
			createMeetings.createMeetingTab();
			createMeetings.scrollDown1();
			Thread.sleep(2000);
			createMeetings.taskName1(input.get("taskName"));
			createMeetings.dateChoosen(input.get("date"));
			createMeetings.startTime1(input.get("startTime"));
			createMeetings.allDayEvent();
			createMeetings.repetition1(input.get("repetition"));
			createMeetings.scrollDown2();
			Thread.sleep(2000);
			createMeetings.meetingLink1(input.get("meetingLink"));
			createMeetings.dialNumber1(input.get("dialNumber"));
			createMeetings.location1(input.get("location"));
			createMeetings.meetingAgenda1(input.get("meetingAgenda"));
			createMeetings.scrollDown3();
			Thread.sleep(2000);
			createMeetings.addTeamMember1(input.get("teamMember1"));
			createMeetings.addEntityFirmSelect1(input.get("entityFirmName"));
			createMeetings.addEntityMemberSelect1(input.get("entityMember1"));
			createMeetings.addIndividuals1(input.get("individualMember1"));
			createMeetings.scrollDown3();
			Thread.sleep(2000);
			createMeetings.saveButtonClick();
			Thread.sleep(2000);
			createMeetings.viewChangesBtnClick();
			createMeetings.scrollUp();
			Thread.sleep(2000);
			viewMeetings.monthTab();
			Thread.sleep(2000);
			viewMeetings.reptitionTextVerify2(input.get("date"), input.get("currentYear"), input.get("currentMonth"),
					input.get("repetationCount"), input.get("EventName"), input.get("EventName1"),
					input.get("monthAndTime"), input.get("assertmeetingAgenda"), input.get("assertmeetingLink"),
					input.get("phoneNumber"), input.get("assertteamMember1"), input.get("firmName"),
					input.get("entityClient1"), input.get("assertindividualMember1"));

		} finally {
			createMeetings.leftSideMeetingsTab();

		}
	}

	@DataProvider
	public Object[][] getData0() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\AllDayWithMonthlyRep.json");

		return new Object[][] {//{ data.get(0) }, { data.get(1) },{ data.get(2) }, { data.get(3) }, { data.get(4) }};
{ data.get(5) }, { data.get(6) }}; //{ data.get(7) }, { data.get(8) }, { data.get(9) }, { data.get(10) }};
	

	}
}
