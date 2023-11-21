package com.test;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.BaseClass;

public class CreateMemberTest extends BaseClass {

	// Account creation without assigning groups
	@Test(dataProvider = "getData0")
	public void createMemberWithoutAssignGroups(HashMap<String, String> input) throws InterruptedException {
		dashBoard.groupsMenuClick();
		createMember.createMemberTab();
		createMember.enterAllFieldsInAccountCreation(input.get("Name"), input.get("Designation"), input.get("DefaultRate"),
				input.get("Email"), input.get("ConfirmEmail"), input.get("CurrencyName"));
		createMember.saveBtn();
		createMember.viewChangesBtn();
		
		
		//createMember.assertTeamMember(input.get("teamMemberAssert"));
		
	}
	// Account creation with groups
	@Test(dataProvider = "getData1")
	public void createMemberAccountCreatewithGroups(HashMap<String, String> input) throws InterruptedException {
		String[] selectGroups = { input.get("addGroups1"), input.get("addGroups2"), input.get("addGroups3") };
		dashBoard.groupsMenuClick();
		createMember.createMemberTab();
		createMember.createTeamMemberInfo(input.get("Name"), input.get("Designation"), input.get("DefaultRate"),
				input.get("Email"), input.get("ConfirmEmail"), input.get("CurrencyName"), selectGroups);
		createMember.saveBtn();
		createMember.viewChangesBtn();

	}
	
	//Negative Test cases
	// Check If mail and comfirm mail are mismatch, error message should appear.
	@Test(dataProvider = "getData2")
	public void checkMismatchError(HashMap<String, String> input) throws InterruptedException {
		dashBoard.groupsMenuClick();
		createMember.createMemberTab();
		createMember.enterAllFieldsInAccountCreation(input.get("Name"), input.get("Designation"), input.get("DefaultRate"),
				input.get("Email"), input.get("ConfirmEmail"), input.get("CurrencyName"));
		Thread.sleep(2000);
		createMember.pageDown();
		createMember.saveBtn();
		Thread.sleep(2000);
		createMember.assertMismatchErrorMessage(input.get("mismatchError"));

	
	}
	
	//Check If firm is already exist, error message should appear
	@Test(dataProvider = "getData3")
	public void checkFirmNameExistError(HashMap<String, String> input) throws InterruptedException {
		dashBoard.groupsMenuClick();
		createMember.createMemberTab();
		createMember.enterAllFieldsInAccountCreation(input.get("Name"), input.get("Designation"), input.get("DefaultRate"),
				input.get("Email"), input.get("ConfirmEmail"), input.get("CurrencyName"));
		Thread.sleep(1000);
		createMember.pageDown();
		createMember.saveBtn();
		Thread.sleep(1000);
		createMember.nameExistAssertErrorMessage(input.get("firmNameExistError"));
	}
	
	// Clicking on cancel after entering data, click on yes, Check weather navigating to view page or not
	
	@Test(dataProvider = "getData4")
	public void checkNavigationafterClickCancelWithYes(HashMap<String, String> input) throws InterruptedException {
		dashBoard.groupsMenuClick();
		createMember.createMemberTab();
		createMember.enterAllFieldsInAccountCreation(input.get("Name"), input.get("Designation"), input.get("DefaultRate"),
				input.get("Email"), input.get("ConfirmEmail"), input.get("CurrencyName"));
		Thread.sleep(1000);
		createMember.pageDown();
		createMember.cancelButton();
		createMember.CancelWithYes();
		Thread.sleep(2000);
		createMember.navigatingtoViewMemberPage(input.get("expectPage"));
		
	}
	
	// Clicking on cancel after entering data, click on No, Check weather still, the control is in the creation page
	
	@Test(dataProvider = "getData5")
	public void checkNavigationafterClickCancelWithNo(HashMap<String, String> input) throws InterruptedException {
		dashBoard.groupsMenuClick();
		createMember.createMemberTab();
		createMember.enterAllFieldsInAccountCreation(input.get("Name"), input.get("Designation"), input.get("DefaultRate"),
				input.get("Email"), input.get("ConfirmEmail"), input.get("CurrencyName"));
		Thread.sleep(1000);
		createMember.pageDown();
		createMember.cancelButton();
		createMember.CancelWithNo();
		Thread.sleep(2000);
		createMember.accountCreationPage(input.get("expectPage1"));
		
	}
	
	// Clicking on cancel after entering data, click on Close, Check weather still, the control is in the creation page
	@Test(dataProvider = "getData6")
	public void checkNavigationafterClickCancelWithClose(HashMap<String, String> input) throws InterruptedException {
		dashBoard.groupsMenuClick();
		createMember.createMemberTab();
		createMember.enterAllFieldsInAccountCreation(input.get("Name"), input.get("Designation"), input.get("DefaultRate"),
				input.get("Email"), input.get("ConfirmEmail"), input.get("CurrencyName"));
		Thread.sleep(1000);
		createMember.pageDown();
		createMember.cancelButton();
		createMember.closeBtnOnCancel();
		
	}

	
	
	
	
	//Enter all data in teamMember Info, Click on back button in assign to Group page
	@Test(dataProvider = "getData7")
	public void checkNavigationafterClickBackOnAssignGroupPage(HashMap<String, String> input) throws InterruptedException {
		String[] selectGroups = { input.get("addGroups1"), input.get("addGroups2"), input.get("addGroups3") };
		dashBoard.groupsMenuClick();
		createMember.createMemberTab();
		createMember.createTeamMemberInfo(input.get("Name"), input.get("Designation"), input.get("DefaultRate"),
				input.get("Email"), input.get("ConfirmEmail"), input.get("CurrencyName"), selectGroups);
		createMember.pageDown();
		Thread.sleep(3000);
		createMember.BackBtn();
		Thread.sleep(3000);
		createMember.accountCreationPage(input.get("expectPage1"));
		
	}
	
	//Click on cancel in Assign Group Page, Click on yes, 
	@Test(dataProvider = "getData8")
	public void checkNavigationafterClickCancelWithYesOnAssignGroupPage(HashMap<String, String> input) throws InterruptedException {
		String[] selectGroups = { input.get("addGroups1"), input.get("addGroups2"), input.get("addGroups3") };
		dashBoard.groupsMenuClick();
		createMember.createMemberTab();
		createMember.createTeamMemberInfo(input.get("Name"), input.get("Designation"), input.get("DefaultRate"),
				input.get("Email"), input.get("ConfirmEmail"), input.get("CurrencyName"), selectGroups);
		createMember.pageDown();
		Thread.sleep(3000);
		createMember.cancelButton();
		createMember.CancelWithYes();
		createMember.pageUp();
		createMember.navigatingtoViewMemberPage(input.get("expectPage"));
		
	}
	
	//Click on cancel in Assign Group Page, Click on No, 
		@Test(dataProvider = "getData9")
		public void checkNavigationafterClickCancelWithNoOnAssignGroupPage(HashMap<String, String> input) throws InterruptedException {
			String[] selectGroups = { input.get("addGroups1"), input.get("addGroups2"), input.get("addGroups3") };
			dashBoard.groupsMenuClick();
			createMember.createMemberTab();
			createMember.createTeamMemberInfo(input.get("Name"), input.get("Designation"), input.get("DefaultRate"),
					input.get("Email"), input.get("ConfirmEmail"), input.get("CurrencyName"), selectGroups);
			createMember.pageDown();
			Thread.sleep(3000);
			createMember.cancelButton();
			createMember.CancelWithNo();
			createMember.pageUp();
			Thread.sleep(2000);
			createMember.searchBarAppearance();
			
		}
			
			
	

		
	@DataProvider
	public Object[][] getData0() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\CreateMemberData.json");

		return new Object[][] { { data.get(0) } };

	}
	
	@DataProvider
	public Object[][] getData1() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\CreateMemberData.json");

		return new Object[][] { { data.get(1) } };

	}
	@DataProvider
	public Object[][] getData2() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\CreateMemberData.json");

		return new Object[][] { { data.get(2) } };

	}
	@DataProvider
	public Object[][] getData3() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\CreateMemberData.json");

		return new Object[][] { { data.get(3) } };

	}
	
	@DataProvider
	public Object[][] getData4() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\CreateMemberData.json");

		return new Object[][] { { data.get(4) } };

	}
	
	@DataProvider
	public Object[][] getData5() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\CreateMemberData.json");

		return new Object[][] { { data.get(5) } };

}
	
	@DataProvider
	public Object[][] getData6() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\CreateMemberData.json");

		return new Object[][] { { data.get(6) } };
}
	
	@DataProvider
	public Object[][] getData7() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\CreateMemberData.json");

		return new Object[][] { { data.get(7) } };
}
	
	@DataProvider
	public Object[][] getData8() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\CreateMemberData.json");

		return new Object[][] { { data.get(8) } };
}
}
