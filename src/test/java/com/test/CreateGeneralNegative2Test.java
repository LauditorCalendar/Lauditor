package com.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.BaseClass;

public class CreateGeneralNegative2Test extends BaseClass {
	
	// Enter the All Details and Click on Cancel button
	@Test(dataProvider = "getData0", priority = 0)
	public void enterDetailsandClickCancel(HashMap<String, String> input) throws InterruptedException {
		try {
			createGeneralMatters.leftMatterTab();
			createGeneralMatters.generalMatterTab();
			createGeneralMatters.createGeneralAllFieldEnter(input.get("caseTitle"), input.get("matterNumber"),
					input.get("startDate"),input.get("closeDate"), input.get("description"), input.get("matterType"), 
					input.get("prioritySelect"));
			createGeneralMatters.cancelButton();
			createGeneralMatters.checkAllFieldsareEmptyinMatterinfoPage();
			
			
			}finally {
				createGeneralMatters.generalMatterTab();
		}

}
	// Select the Groups and Click on Cancel
	@Test(dataProvider = "getData1", priority = 1)
	public void selectGroupsandClickCancel(HashMap<String, String> input) throws InterruptedException {
		try {
			createGeneralMatters.createGeneralAllFieldEnter(input.get("caseTitle"), input.get("matterNumber"),
					input.get("startDate"),input.get("closeDate"), input.get("description"), input.get("matterType"), 
					input.get("prioritySelect"));
			createGeneralMatters.nextPage();
			String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
			createGeneralMatters.selecting(groupNames);
			createGeneralMatters.cancelButton();
			createGeneralMatters.checkLeftSideSelectedNameareEmpty();
		}finally {
			createGeneralMatters.leftMatterTab();
			createGeneralMatters.generalMatterTab();
		}
}
	// Select the Groups and Select All Click on Cancel

		@Test(dataProvider = "getData2", priority = 2)
		public void selectGroupSeletAllandClickCancel(HashMap<String, String> input) throws InterruptedException {
			try {
				
				createGeneralMatters.createGeneralAllFieldEnter(input.get("caseTitle"), input.get("matterNumber"),
						input.get("startDate"),input.get("closeDate"), input.get("description"), input.get("matterType"), 
						input.get("prioritySelect"));
				createGeneralMatters.nextPage();
				createGeneralMatters.selectAllBtn();
				createGeneralMatters.cancelButton();
				createGeneralMatters.checkLeftSideSelectedNameareEmpty();
				createGeneralMatters.checkSelectAllCheckboxIsUnSelected();

			}finally {
				createGeneralMatters.leftMatterTab();
				createGeneralMatters.generalMatterTab();
			}
		}
		// Select the Clients and Click on Cancel

		@Test(dataProvider = "getData3", priority = 3)
		public void selectClientsandClickCancel(HashMap<String, String> input) throws InterruptedException {
			try {
				createGeneralMatters.createGeneralAllFieldEnter(input.get("caseTitle"), input.get("matterNumber"),
						input.get("startDate"),input.get("closeDate"), input.get("description"), input.get("matterType"), 
						input.get("prioritySelect"));
				createGeneralMatters.nextPage();
				String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
				createGeneralMatters.selecting(groupNames);
				createGeneralMatters.nextPage();
				String[] clientNamesIndividuals = { input.get("individualsClientName1"),
						input.get("individualsClientName2") };
				createGeneralMatters.selecting(clientNamesIndividuals);
				createGeneralMatters.cancelButton();
				createGeneralMatters.checkLeftSideSelectedNameareEmpty();

			}finally {
				createGeneralMatters.leftMatterTab();
				createGeneralMatters.generalMatterTab();
			}
		}
		
		// Select the Clients and Select All Click on Cancel

		@Test(dataProvider = "getData4", priority = 4)
		public void selectClientsSeletAllandClickCancel(HashMap<String, String> input) throws InterruptedException {
			try {
				
				createGeneralMatters.createGeneralAllFieldEnter(input.get("caseTitle"), input.get("matterNumber"),
						input.get("startDate"),input.get("closeDate"), input.get("description"), input.get("matterType"), 
						input.get("prioritySelect"));
				createGeneralMatters.nextPage();
				String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
				createGeneralMatters.selecting(groupNames);
				createGeneralMatters.nextPage();
				createGeneralMatters.selectAllBtn();
				createGeneralMatters.cancelButton();
				createGeneralMatters.checkLeftSideSelectedNameareEmpty();
				createGeneralMatters.checkSelectAllCheckboxIsUnSelected();
			}finally {
				createGeneralMatters.leftMatterTab();
				createGeneralMatters.generalMatterTab();
			}
		}
		// selectTeamMemberandClickCancel

		@Test(dataProvider = "getData5", priority = 5)
		public void selectTeamMemberandClickCancel(HashMap<String, String> input) throws InterruptedException {
			try {
				
				createGeneralMatters.createGeneralAllFieldEnter(input.get("caseTitle"), input.get("matterNumber"),
						input.get("startDate"),input.get("closeDate"), input.get("description"), input.get("matterType"), 
						input.get("prioritySelect"));
				createGeneralMatters.nextPage();
				String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
				createGeneralMatters.selecting(groupNames);
				createGeneralMatters.nextPage();
				String[] clientNamesIndividuals = { input.get("individualsClientName1"),
						input.get("individualsClientName2") };
				createGeneralMatters.selecting(clientNamesIndividuals);
				createGeneralMatters.nextPage();
				String[] teamMemberNames = { input.get("memberName1"), input.get("memberName2") };
				createGeneralMatters.selecting(teamMemberNames);
				createGeneralMatters.cancelButton();
				createGeneralMatters.checkLeftSideSelectedNameareEmpty();

			}finally {
				createGeneralMatters.leftMatterTab();
				createGeneralMatters.generalMatterTab();
			}
		}
		// selectTeamMeberSeletAllandClickCancel

		@Test(dataProvider = "getData6", priority = 6)
		public void selectTeamMeberSeletAllandClickCancel(HashMap<String, String> input) throws InterruptedException {
			try {
				
				createGeneralMatters.createGeneralAllFieldEnter(input.get("caseTitle"), input.get("matterNumber"),
						input.get("startDate"),input.get("closeDate"), input.get("description"), input.get("matterType"), 
						input.get("prioritySelect"));
				createGeneralMatters.nextPage();
				String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
				createGeneralMatters.selecting(groupNames);
				createGeneralMatters.nextPage();
				String[] clientNamesIndividuals = { input.get("individualsClientName1"),
						input.get("individualsClientName2") };
				createGeneralMatters.selecting(clientNamesIndividuals);
				createGeneralMatters.nextPage();
				createGeneralMatters.selectAllBtn();
				createGeneralMatters.cancelButton();
				createGeneralMatters.checkLeftSideSelectedNameareEmpty();
				createGeneralMatters.checkSelectAllCheckboxIsUnSelected();
				
				
			}finally {
				createGeneralMatters.leftMatterTab();
				createGeneralMatters.generalMatterTab();
			}
		}
		
		// selectDocumentandClickCancel

		@Test(dataProvider = "getData7", priority = 7)
		public void selectDocumentandClickCancel(HashMap<String, String> input) throws InterruptedException {
			try {
				
				createGeneralMatters.createGeneralAllFieldEnter(input.get("caseTitle"), input.get("matterNumber"),
						input.get("startDate"),input.get("closeDate"), input.get("description"), input.get("matterType"), 
						input.get("prioritySelect"));
				createGeneralMatters.nextPage();
				String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
				createGeneralMatters.selecting(groupNames);
				createGeneralMatters.nextPage();
				String[] clientNamesIndividuals = { input.get("individualsClientName1"),
						input.get("individualsClientName2") };
				createGeneralMatters.selecting(clientNamesIndividuals);
				createGeneralMatters.nextPage();
				String[] teamMemberNames = { input.get("memberName1"), input.get("memberName2") };
				createGeneralMatters.selecting(teamMemberNames);
				createGeneralMatters.nextPage();
				String[] documentNames = { input.get("documentName1"), input.get("documentName2") };
				createGeneralMatters.selecting(documentNames);
				createGeneralMatters.cancelButton();
				createGeneralMatters.checkLeftSideSelectedNameareEmpty();

				
			}finally {
				createGeneralMatters.leftMatterTab();
				createGeneralMatters.generalMatterTab();
			}
		}
		
		// selectDocumentsSeletAllandClickCancel

		@Test(dataProvider = "getData8", priority = 8)
		public void selectDocumentsSeletAllandClickCancel(HashMap<String, String> input) throws InterruptedException {
			try {
				
				createGeneralMatters.createGeneralAllFieldEnter(input.get("caseTitle"), input.get("matterNumber"),
						input.get("startDate"),input.get("closeDate"), input.get("description"), input.get("matterType"), 
						input.get("prioritySelect"));
				createGeneralMatters.nextPage();
				String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
				createGeneralMatters.selecting(groupNames);
				createGeneralMatters.nextPage();
				String[] clientNamesIndividuals = { input.get("individualsClientName1"),
						input.get("individualsClientName2") };
				createGeneralMatters.selecting(clientNamesIndividuals);
				createGeneralMatters.nextPage();
				String[] teamMemberNames = { input.get("memberName1"), input.get("memberName2") };
				createGeneralMatters.selecting(teamMemberNames);
				createGeneralMatters.nextPage();
				createGeneralMatters.selectAllBtn();
				createGeneralMatters.cancelButton();
				createGeneralMatters.checkLeftSideSelectedNameareEmpty();
				createGeneralMatters.checkLeftSideSelectedNameareEmpty();
			}finally {
				createGeneralMatters.leftMatterTab();
				createGeneralMatters.generalMatterTab();
			}
		}
		
		// enterAllDetailsandConfirmPopupClickNO

		@Test(dataProvider = "getData9", priority = 9)
		public void enterAllDetailsandConfirmPopupClickNO(HashMap<String, String> input) throws InterruptedException {
			try {
				
				createGeneralMatters.createGeneralAllFieldEnter(input.get("caseTitle"), input.get("matterNumber"),
						input.get("startDate"),input.get("closeDate"), input.get("description"), input.get("matterType"), 
						input.get("prioritySelect"));
				createGeneralMatters.nextPage();
				String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
				createGeneralMatters.selecting(groupNames);
				createGeneralMatters.nextPage();
				String[] clientNamesIndividuals = { input.get("individualsClientName1"),
						input.get("individualsClientName2") };
				createGeneralMatters.selecting(clientNamesIndividuals);
				createGeneralMatters.nextPage();
				String[] teamMemberNames = { input.get("memberName1"), input.get("memberName2") };
				createGeneralMatters.selecting(teamMemberNames);
				createGeneralMatters.nextPage();
				String[] documentNames = { input.get("documentName1"), input.get("documentName2") };
				createGeneralMatters.selecting(documentNames);
				createGeneralMatters.nextPage();
				createGeneralMatters.alertPopupNo();
				createGeneralMatters.selectedDocumentNameTextVerification();
			}finally {
				createGeneralMatters.leftMatterTab();
				createGeneralMatters.generalMatterTab();
				
			}
		}
		
		// enterAllDetailsandViewMatter

		@Test(dataProvider = "getData10", priority = 10)
		public void enterAllDetailsandViewMatterPopup(HashMap<String, String> input) throws InterruptedException {
			try {
				
				createGeneralMatters.createGeneralAllFieldEnter(input.get("caseTitle"), input.get("matterNumber"),
						input.get("startDate"),input.get("closeDate"), input.get("description"), input.get("matterType"), 
						input.get("prioritySelect"));
				createGeneralMatters.nextPage();
				String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
				createGeneralMatters.selecting(groupNames);
				createGeneralMatters.nextPage();
				String[] clientNamesIndividuals = { input.get("individualsClientName1"),
						input.get("individualsClientName2") };
				createGeneralMatters.selecting(clientNamesIndividuals);
				createGeneralMatters.nextPage();
				String[] teamMemberNames = { input.get("memberName1"), input.get("memberName2") };
				createGeneralMatters.selecting(teamMemberNames);
				createGeneralMatters.nextPage();
				String[] documentNames = { input.get("documentName1"), input.get("documentName2") };
				createGeneralMatters.selecting(documentNames);
				createGeneralMatters.nextPage();
				createGeneralMatters.alertPopupYes();
				createGeneralMatters.viewMatterListSuccess();
			}finally {
				createGeneralMatters.leftMatterTab();
				createGeneralMatters.generalMatterTab();
			}
		}
		
		// enterAllDetailsWithoutTeamMemberandViewMatterPopup

		@Test(dataProvider = "getData11", priority = 11)
		public void enterAllDetailsWithoutTeamMemberandViewMatterPopup(HashMap<String, String> input)
				throws InterruptedException {
			try {
				
				createGeneralMatters.createGeneralAllFieldEnter(input.get("caseTitle"), input.get("matterNumber"),
						input.get("startDate"),input.get("closeDate"), input.get("description"), input.get("matterType"), 
						input.get("prioritySelect"));
				createGeneralMatters.nextPage();
				String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
				createGeneralMatters.selecting(groupNames);
				createGeneralMatters.nextPage();
				String[] clientNamesIndividuals = { input.get("individualsClientName1"),
						input.get("individualsClientName2") };
				createGeneralMatters.selecting(clientNamesIndividuals);
				createGeneralMatters.nextPage();
				createGeneralMatters.nextPage();
				String[] documentNames = { input.get("documentName1"), input.get("documentName2") };
				createGeneralMatters.selecting(documentNames);
				createGeneralMatters.nextPage();
				createGeneralMatters.alertPopupYes();
				createGeneralMatters.viewMatterListSuccess();
			}finally {
				createGeneralMatters.leftMatterTab();
				createGeneralMatters.generalMatterTab();
			}
		}
		
		// enterAllDetailsWithoutDocumentandViewMatterPopup

		@Test(dataProvider = "getData12", priority = 12)
		public void enterAllDetailsWithoutDocumentandViewMatterPopup(HashMap<String, String> input)
				throws InterruptedException {
			try {
				
				createGeneralMatters.createGeneralAllFieldEnter(input.get("caseTitle"), input.get("matterNumber"),
						input.get("startDate"),input.get("closeDate"), input.get("description"), input.get("matterType"), 
						input.get("prioritySelect"));
				createGeneralMatters.nextPage();
				String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
				createGeneralMatters.selecting(groupNames);
				createGeneralMatters.nextPage();
				String[] clientNamesIndividuals = { input.get("individualsClientName1"),
						input.get("individualsClientName2") };
				createGeneralMatters.selecting(clientNamesIndividuals);
				createGeneralMatters.nextPage();
				String[] teamMemberNames = { input.get("memberName1"), input.get("memberName2") };
				createGeneralMatters.selecting(teamMemberNames);
				createGeneralMatters.nextPage();
				createGeneralMatters.nextPage();
				createGeneralMatters.alertPopupYes();
				createGeneralMatters.viewMatterListSuccess();

			}finally {
				createGeneralMatters.leftMatterTab();
				createGeneralMatters.generalMatterTab();
			}
		}
		// enterAllDetailsWithoutTMandDocumentandViewMatterPopup

		@Test(dataProvider = "getData13", priority = 13)
		public void enterAllDetailsWithoutTMandDocumentandViewMatterPopup(HashMap<String, String> input)
				throws InterruptedException {
			try {
				
				createGeneralMatters.createGeneralAllFieldEnter(input.get("caseTitle"), input.get("matterNumber"),
						input.get("startDate"),input.get("closeDate"), input.get("description"), input.get("matterType"), 
						input.get("prioritySelect"));
				createGeneralMatters.nextPage();
				String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
				createGeneralMatters.selecting(groupNames);
				createGeneralMatters.nextPage();
				String[] clientNamesIndividuals = { input.get("individualsClientName1"),
						input.get("individualsClientName2") };
				createGeneralMatters.selecting(clientNamesIndividuals);
				createGeneralMatters.nextPage();
				createGeneralMatters.nextPage();
				createGeneralMatters.nextPage();
				createGeneralMatters.alertPopupYes();
				createGeneralMatters.viewMatterListSuccess();
			}finally {
				createGeneralMatters.leftMatterTab();
				createGeneralMatters.generalMatterTab();
			}
		}
		
		// enterAllDetailsandSelectAllNames

		@Test(dataProvider = "getData14", priority = 14)
		public void enterAllDetailsandSelectAllNames(HashMap<String, String> input) throws InterruptedException {
			try {
				createGeneralMatters.leftMatterTab();
				createGeneralMatters.generalMatterTab();
				createGeneralMatters.createGeneralAllFieldEnter(input.get("caseTitle"), input.get("matterNumber"),
						input.get("startDate"),input.get("closeDate"), input.get("description"), input.get("matterType"), 
						input.get("prioritySelect"));
				createGeneralMatters.nextPage();
				createGeneralMatters.selectAllBtn();
				createGeneralMatters.nextPage();
				createGeneralMatters.selectAllBtn();
				createGeneralMatters.nextPage();
				createGeneralMatters.selectAllBtn();
				createGeneralMatters.nextPage();
				createGeneralMatters.selectAllBtn();
				createGeneralMatters.nextPage();
				createGeneralMatters.alertPopupYes();
				createGeneralMatters.viewMatterListSuccess();
				
			}finally {
				createGeneralMatters.leftMatterTab();
				createGeneralMatters.generalMatterTab();
			}
		}
		
/*		//selectTempClientIndividualsandClickCancel
		
		@Test(dataProvider = "getData15", priority = 15)
		public void selectTempClientIndividualsandClickCancel(HashMap<String, String> input) throws InterruptedException {
			try {
				createGeneralMatters.leftMatterTab();
				createGeneralMatters.generalMatterTab();
				createGeneralMatters.createGeneralAllFieldEnter(input.get("caseTitle"), input.get("matterNumber"),
						input.get("startDate"),input.get("closeDate"), input.get("description"), input.get("matterType"), 
						input.get("prioritySelect"));
				createGeneralMatters.nextPage();
				String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
				createGeneralMatters.selecting(groupNames);
				createGeneralMatters.nextPage();
				createGeneralMatters.tempClientIndividuals(input.get("searchTextIndividuals"), input.get("firstName"),
						input.get("lastName"), input.get("email"), input.get("confirmEmail"), input.get("country"),
						input.get("phoneNumber"));
				createGeneralMatters.cancelTempClientBtn();
				createGeneralMatters.scrollUpnearbySearchbox();
				createGeneralMatters.InputSearchBoxTempClients("searchTextIndividuals");
				createGeneralMatters.checkAllFieldsareEmptyinTempClients();
			}finally {
				createGeneralMatters.leftMatterTab();
				createGeneralMatters.generalMatterTab();
			}
}
		// selectTempClientEntityandClickCancel

		@Test(dataProvider = "getData16", priority = 16)
		public void selectTempClientEntityandClickCancel(HashMap<String, String> input) throws InterruptedException {
			try {
				createGeneralMatters.leftMatterTab();
				createGeneralMatters.generalMatterTab();
				createGeneralMatters.createGeneralAllFieldEnter(input.get("caseTitle"), input.get("matterNumber"),
						input.get("startDate"),input.get("closeDate"), input.get("description"), input.get("matterType"), 
						input.get("prioritySelect"));
				createGeneralMatters.nextPage();
				String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
				createGeneralMatters.selecting(groupNames);
				createGeneralMatters.nextPage();
				createGeneralMatters.tempClientEntity(input.get("searchTextEntity"), input.get("firmName"),
						input.get("contactPerson"), input.get("emailId"), input.get("confirmEmailId"),
						input.get("countryEntitys"), input.get("mobileNumber"));
				createGeneralMatters.cancelTempClientBtn();
				createGeneralMatters.scrollUpnearbySearchbox();
				createGeneralMatters.InputSearchBoxTempClients(input.get("searchTextEntity"));
				createGeneralMatters.checkAllFieldsareEmptyinTempEntity();
			}finally {
				createGeneralMatters.leftMatterTab();
				createGeneralMatters.generalMatterTab();
			}
		}
		// unselectAllandSearchNameandSelect

		@Test(dataProvider = "getData17", priority = 17,enabled=false)
		public void unselectAllandSearchNameandSelect(HashMap<String, String> input) throws InterruptedException {
			try {
				createGeneralMatters.leftMatterTab();
				createGeneralMatters.generalMatterTab();
				createGeneralMatters.createGeneralAllFieldEnter(input.get("caseTitle"), input.get("matterNumber"),
						input.get("startDate"),input.get("closeDate"), input.get("description"), input.get("matterType"), 
						input.get("prioritySelect"));
				createGeneralMatters.nextPage();
				
			}finally {
				
			}
		}*/
		
//Enter the All Details and Click on Cancel button

	@DataProvider
	public Object[][] getData0() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\CreateGeneralNegative2.json");

		return new Object[][] { { data.get(0) } };

	}
	// Select the Groups and Click on Cancel

		@DataProvider
		public Object[][] getData1() throws IOException {

			List<HashMap<String, String>> data = getJsonDataToMap(
					"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\CreateGeneralNegative2.json");

			return new Object[][] { { data.get(1) } };

		}
		
		//Select the groups and select All and Click on cancel
		@DataProvider
		 Object[][] getData2() throws IOException {

			List<HashMap<String, String>> data = getJsonDataToMap(
					"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\CreateGeneralNegative2.json");

			return new Object[][] { { data.get(2) } };

		}
		// Select the Clients and Click on Cancel
		@DataProvider
		 Object[][] getData3() throws IOException {

			List<HashMap<String, String>> data = getJsonDataToMap(
					"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\CreateGeneralNegative2.json");

			return new Object[][] { { data.get(3) } };

}
		// Select the Clients and Select All Click on Cancel
		@DataProvider
		 Object[][] getData4() throws IOException {

			List<HashMap<String, String>> data = getJsonDataToMap(
					"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\CreateGeneralNegative2.json");

			return new Object[][] { { data.get(4) } };

}
		// selectTeamMemberandClickCancel
		@DataProvider
		 Object[][] getData5() throws IOException {

			List<HashMap<String, String>> data = getJsonDataToMap(
					"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\CreateGeneralNegative2.json");

			return new Object[][] { { data.get(5) } };

}
		@DataProvider
		 Object[][] getData6() throws IOException {

			List<HashMap<String, String>> data = getJsonDataToMap(
					"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\CreateGeneralNegative2.json");

			return new Object[][] { { data.get(6) } };

}
		// selectDocumentandClickCancel
		@DataProvider
		 Object[][] getData7() throws IOException {

			List<HashMap<String, String>> data = getJsonDataToMap(
					"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\CreateGeneralNegative2.json");

			return new Object[][] { { data.get(7) } };

}
		// selectDocumentandClickCancel
				@DataProvider
				 Object[][] getData8() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\CreateGeneralNegative2.json");

					return new Object[][] { { data.get(8) } };

		}
				
				// enterAllDetailsandConfirmPopupClickNO
				@DataProvider
				 Object[][] getData9() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\CreateGeneralNegative2.json");

					return new Object[][] { { data.get(9) } };

		}
				// enterAllDetailsandViewMatter
				@DataProvider
				 Object[][] getData10() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\CreateGeneralNegative2.json");

					return new Object[][] { { data.get(10) } };
				}
				
				// enterAllDetailsWithoutTeamMemberandViewMatterPopup
				@DataProvider
				 Object[][] getData11() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\CreateGeneralNegative2.json");

					return new Object[][] { { data.get(11) } };
				}
				
				// enterAllDetailsWithoutDocuments andViewMatterPopup
				@DataProvider
				 Object[][] getData12() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\CreateGeneralNegative2.json");

					return new Object[][] { { data.get(12) } };
				}
				// enterAllDetailsWithoutTMandDocumentandViewMatterPopup
				@DataProvider
				 Object[][] getData13() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\CreateGeneralNegative2.json");

					return new Object[][] { { data.get(13) } };
				}
				// enterAllDetailsandSelectAllNames
				@DataProvider
				 Object[][] getData14() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\CreateGeneralNegative2.json");

					return new Object[][] { { data.get(14) } };
				}
				// enterAllDetailsandSelectAllNames
				@DataProvider
				 Object[][] getData15() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\CreateGeneralNegative2.json");

					return new Object[][] { { data.get(15) } };
				}
				// enterAllDetailsandSelectAllNames
				@DataProvider
				 Object[][] getData16() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\CreateGeneralNegative2.json");

					return new Object[][] { { data.get(16) } };
				}
				// enterAllDetailsandSelectAllNames
				@DataProvider
				 Object[][] getData17() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\CreateGeneralNegative2.json");

					return new Object[][] { { data.get(17) } };
				}
}