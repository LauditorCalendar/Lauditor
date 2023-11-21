package com.test;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.base.BaseClass;

public class ViewMembersTest extends BaseClass {

	@Test(dataProvider = "getData0", priority = 0)
	public void viewMemberEditGroup(HashMap<String, String> input) throws InterruptedException {

		dashBoard.groupsMenuClick();
		viewMembers.viewMemberTab(input.get("memberEmailId"));
		viewMembers.renameeditmemberinfo(input.get("changedName"), input.get("changedDesignation"),
				input.get("changedDefaultRate"), input.get("changedEmail"), input.get("changedConfirmEmail"),
				input.get("currencyNames"));
	}

	@Test(dataProvider = "getData1", priority = 1)
	public void viewMemberUpdateGroupAccess(HashMap<String, String> input) throws InterruptedException {
		dashBoard.groupsMenuClick();
		viewMembers.viewMemberTab(input.get("memberEmailId1"));
		String[] updategroupsnamedAdd = { input.get("UpdateGroup1"), input.get("UpdateGroup2"),
				input.get("UpdateGroup3") };
		viewMembers.updateGroupAccess(updategroupsnamedAdd);

	}
//click on Yes in alert popup for  reset password 
	@Test(dataProvider = "getData2", priority = 2)
	public void newRestPasswords(HashMap<String, String> input) throws InterruptedException {
		dashBoard.groupsMenuClick();
		viewMembers.viewMemberTab(input.get("memberEmailId2"));
		viewMembers.resetPassword();

	}
	
	//click on No in alert popup for  reset password 

	@Test(dataProvider = "getData3", priority = 3)
	public void alertPopupNoInnewRestPasswords(HashMap<String, String> input) throws InterruptedException {
		dashBoard.groupsMenuClick();
		viewMembers.viewMemberTab(input.get("memberEmailId2"));
		viewMembers.resetPasswordNoBtn();
		viewMembers.navigatingtoViewMemberPage(input.get("expectPage"));
	}
	
	//click on close button in alert popup for  reset password 


	@Test(dataProvider = "getData4", priority = 4)
	public void alertPopupCloseInnewRestPasswords(HashMap<String, String> input) throws InterruptedException {
		dashBoard.groupsMenuClick();
		viewMembers.viewMemberTab(input.get("memberEmailId2"));
		viewMembers.resetPasswordCloseBtn();
		viewMembers.navigatingtoViewMemberPage(input.get("expectPage"));

	}
	
// Delete team member
	@Test(dataProvider = "getData5", priority = 5)
	public void newdeleteMemberAccount(HashMap<String, String> input) throws InterruptedException {
		dashBoard.groupsMenuClick();
		viewMembers.viewMemberTab(input.get("memberEmailId3"));
		viewMembers.deleteMember();
		viewMembers.CheckDeletedMemberVerification(input.get("memberEmailId3"));
	}
	//Click on No in alert popup for delete team member
	@Test(dataProvider = "getData6", priority = 6)
	public void newdeleteMemberAccountalertWithNo(HashMap<String, String> input) throws InterruptedException {
		dashBoard.groupsMenuClick();
		viewMembers.viewMemberTab(input.get("memberEmailId3"));
		viewMembers.deleteMemberNoclick();
		viewMembers.navigatingtoViewMemberPage(input.get("expectPage"));

	}
	
	//Click on close button in alert popup for delete team member
		@Test(dataProvider = "getData7", priority = 7)
		public void newdeleteMemberAccountalertWithCloseBtn(HashMap<String, String> input) throws InterruptedException {
			dashBoard.groupsMenuClick();
			viewMembers.viewMemberTab(input.get("memberEmailId3"));
			viewMembers.deleteMemberCloseBtnclick();
			viewMembers.navigatingtoViewMemberPage(input.get("expectPage"));

		}
	

	// viewMemberEditGroup
	@DataProvider
	public Object[][] getData0() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\ViewMemberEditMemberData.json");

		return new Object[][] { { data.get(0) } };

	}

	// viewMemberUpdateGroupAccess
	@DataProvider
	public Object[][] getData1() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\ViewMemberUpdateGroupData.json");

		return new Object[][] { { data.get(0) } };

	}

	// restPasswords
	@DataProvider
	public Object[][] getData2() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\ViewMemberResetPasswordData.json");

		return new Object[][] { { data.get(0) } };

	}
	
	// restPasswords with No
		@DataProvider
		public Object[][] getData3() throws IOException {

			List<HashMap<String, String>> data = getJsonDataToMap(
					"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\ViewMemberResetPasswordData.json");

			return new Object[][] { { data.get(1) } };

		}
		
		// restPasswords with yes
				@DataProvider
				public Object[][] getData4() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\ViewMemberResetPasswordData.json");

					return new Object[][] { { data.get(2) } };

				}

	// deleteMemberAccount
	@DataProvider
	public Object[][] getData5() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\ViewMemberDeleteMemberData.json");

		return new Object[][] { { data.get(0) } };

	}
	
	// deleteMemberAccount with No
		@DataProvider
		public Object[][] getData6() throws IOException {

			List<HashMap<String, String>> data = getJsonDataToMap(
					"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\ViewMemberDeleteMemberData.json");

			return new Object[][] { { data.get(1) } };

		}
		// deleteMemberAccount with Close
		@DataProvider
		public Object[][] getData7() throws IOException {

			List<HashMap<String, String>> data = getJsonDataToMap(
					"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\ViewMemberDeleteMemberData.json");

			return new Object[][] { { data.get(2) } };

		}

}
