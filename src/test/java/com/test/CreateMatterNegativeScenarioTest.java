package com.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.BaseClass;
public class  CreateMatterNegativeScenarioTest extends BaseClass{
@Test(dataProvider = "getData1", priority = 0)
	public void clientsIndividuals(HashMap<String, String> input) throws InterruptedException {
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
			String[] clientNamesIndividuals = { input.get("individualsClientName1"),
					input.get("individualsClientName2") };
			createGeneralMatters.selecting(clientNamesIndividuals);
			createGeneralMatters.nextPage();
			createGeneralMatters.nextPage();
			createGeneralMatters.nextPage();
			createGeneralMatters.alertPopupYes();
			createGeneralMatters.addMatterSuccess();			
		}finally {
			createGeneralMatters.generalMatterTab();;
		}
}
	@Test(dataProvider = "getData2", priority = 1)
	public void clientsIndividualsWithTeamMembers(HashMap<String, String> input) throws InterruptedException {

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
			String[] clientNamesIndividuals = { input.get("individualsClientName1"),
					input.get("individualsClientName2") };
			createGeneralMatters.selecting(clientNamesIndividuals);
			createGeneralMatters.nextPage();
			String[] teamMemberNames = { input.get("memberName1"), input.get("memberName2") };
			createGeneralMatters.selecting(teamMemberNames);
			createGeneralMatters.nextPage();
			createGeneralMatters.nextPage();
			createGeneralMatters.alertPopupYes();
			createGeneralMatters.addMatterSuccess();	
		}finally {
			createGeneralMatters.generalMatterTab();
		}
	}
	
	@Test(dataProvider = "getData3", priority = 2)
	public void clientsIndividualsWithDocuments(HashMap<String, String> input) throws InterruptedException {
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
			String[] clientNamesIndividuals = { input.get("individualsClientName1"),
					input.get("individualsClientName2") };
			createGeneralMatters.selecting(clientNamesIndividuals);
			createGeneralMatters.nextPage();
			createGeneralMatters.nextPage();
			String[] documentNames = { input.get("documentName1"), input.get("documentName2") };
			createGeneralMatters.selecting(documentNames);
			createGeneralMatters.nextPage();
			createGeneralMatters.alertPopupYes();
			createGeneralMatters.addMatterSuccess();	
		}finally {
			createGeneralMatters.generalMatterTab();
		}
	}
	@Test(dataProvider = "getData4", priority = 3)
	public void clientsIndividualsWithTMandDocuments(HashMap<String, String> input) throws InterruptedException {
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
			createGeneralMatters.addMatterSuccess();	
		}finally {
			createGeneralMatters.generalMatterTab();
		}
	}
	// All Fields with Groups and Clients [Entity]

		@Test(dataProvider = "getData5", priority = 4)
		public void clientsEntity(HashMap<String, String> input) throws InterruptedException {
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
				String[] clientNamesIndividuals = { input.get("entityClientName1"),
						input.get("entityClientName2") };
				createGeneralMatters.selecting(clientNamesIndividuals);
				createGeneralMatters.nextPage();
				createGeneralMatters.nextPage();
				createGeneralMatters.nextPage();
				createGeneralMatters.alertPopupYes();
				createGeneralMatters.addMatterSuccess();
			}finally {
				createGeneralMatters.generalMatterTab();
			}
		}
		@Test(dataProvider = "getData6", priority = 5)
		public void clientsEntityWithTeamMembers(HashMap<String, String> input) throws InterruptedException {
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
				String[] clientNamesIndividuals = { input.get("entityClientName1"),
						input.get("entityClientName2") };
				createGeneralMatters.selecting(clientNamesIndividuals);
				createGeneralMatters.nextPage();
				String[] teamMemberNames = { input.get("memberName1"), input.get("memberName2") };
				createGeneralMatters.selecting(teamMemberNames);
				createGeneralMatters.nextPage();
				createGeneralMatters.nextPage();
				createGeneralMatters.alertPopupYes();
				createGeneralMatters.addMatterSuccess();
			}finally {
				createGeneralMatters.generalMatterTab();
			}
		}
		@Test(dataProvider = "getData7", priority = 6)
		public void clientsEntityWithDocuments(HashMap<String, String> input) throws InterruptedException {
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
			String[] clientNamesIndividuals = { input.get("entityClientName1"),
					input.get("entityClientName2") };
			createGeneralMatters.selecting(clientNamesIndividuals);
			createGeneralMatters.nextPage();
			createGeneralMatters.nextPage();
			String[] documentNames = { input.get("documentName1"), input.get("documentName2") };
			createGeneralMatters.selecting(documentNames);
			createGeneralMatters.nextPage();
			createGeneralMatters.alertPopupYes();
			createGeneralMatters.addMatterSuccess();
			}finally {
				createGeneralMatters.generalMatterTab();
			}
		}
		@Test(dataProvider = "getData8", priority = 7)
		public void clientsEntityWithTMandDocuments(HashMap<String, String> input) throws InterruptedException {
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
				String[] clientNamesIndividuals = { input.get("entityClientName1"),
						input.get("entityClientName2") };
				createGeneralMatters.selecting(clientNamesIndividuals);
				createGeneralMatters.nextPage();
				String[] teamMemberNames = { input.get("memberName1"), input.get("memberName2") };
				createGeneralMatters.selecting(teamMemberNames);
				createGeneralMatters.nextPage();
				String[] documentNames = { input.get("documentName1"), input.get("documentName2") };
				createGeneralMatters.selecting(documentNames);
				createGeneralMatters.nextPage();
				createGeneralMatters.alertPopupYes();
				createGeneralMatters.addMatterSuccess();
			}finally {
				createGeneralMatters.generalMatterTab();
			}
		}
		@Test(dataProvider = "getData9", priority = 8)
		public void clientsIndividualsandEntity(HashMap<String, String> input) throws InterruptedException {
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
				String[] clientNamesIndividuals = { input.get("individualsClientName1"),
						input.get("entityClientName1") };
				createGeneralMatters.selecting(clientNamesIndividuals);
				createGeneralMatters.nextPage();
				createGeneralMatters.nextPage();
				createGeneralMatters.nextPage();
				createGeneralMatters.alertPopupYes();
				createGeneralMatters.addMatterSuccess();
			}finally {
				createGeneralMatters.generalMatterTab();
			}
		}
		@Test(dataProvider = "getData10", priority = 9)
		public void clientsIndividualsandEntityWithTeamMembers(HashMap<String, String> input) throws InterruptedException {
			
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
				String[] clientNamesIndividuals = { input.get("individualsClientName1"),
						input.get("entityClientName1") };
				createGeneralMatters.selecting(clientNamesIndividuals);
				createGeneralMatters.nextPage();
				String[] teamMemberNames = { input.get("memberName1"), input.get("memberName2") };
				createGeneralMatters.selecting(teamMemberNames);
				createGeneralMatters.nextPage();
				createGeneralMatters.nextPage();
				createGeneralMatters.alertPopupYes();
				createGeneralMatters.addMatterSuccess();
			}finally {
				createGeneralMatters.generalMatterTab();
			}
		}
		
		@Test(dataProvider = "getData11", priority = 10)
		public void clientsIndividualsandEntityWithDocuments(HashMap<String, String> input) throws InterruptedException {
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
				String[] clientNamesIndividuals = { input.get("individualsClientName1"),
						input.get("entityClientName1") };
				createGeneralMatters.selecting(clientNamesIndividuals);
				createGeneralMatters.nextPage();
				createGeneralMatters.nextPage();
				String[] documentNames = { input.get("documentName1"), input.get("documentName2") };
				createGeneralMatters.selecting(documentNames);
				createGeneralMatters.nextPage();
				createGeneralMatters.alertPopupYes();
				createGeneralMatters.addMatterSuccess();
			}finally {
				createGeneralMatters.generalMatterTab();
			}
		}
		@Test(dataProvider = "getData12", priority = 11)
		public void clientsIndividualsandEntityWithTMandDocuments(HashMap<String, String> input)
				throws InterruptedException {
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
				String[] clientNamesIndividuals = { input.get("individualsClientName1"),
						input.get("entityClientName1") };
				createGeneralMatters.selecting(clientNamesIndividuals);
				createGeneralMatters.nextPage();
				String[] teamMemberNames = { input.get("memberName1"), input.get("memberName2") };
				createGeneralMatters.selecting(teamMemberNames);
				createGeneralMatters.nextPage();
				String[] documentNames = { input.get("documentName1"), input.get("documentName2") };
				createGeneralMatters.selecting(documentNames);
				createGeneralMatters.nextPage();
				createGeneralMatters.alertPopupYes();
				createGeneralMatters.addMatterSuccess();
			}finally {
				createGeneralMatters.generalMatterTab();
			}
		}
		//All fields, Clients[Individuals] and Temp clients[individuals and enity]

		@Test(dataProvider = "getData13", priority = 12)
		public void clientsIndividualsandTempClients(HashMap<String, String> input) throws InterruptedException {
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
		createGeneralMatters.addTemporaryButton();
		createGeneralMatters.addTeamMembersTempClientsBtn();
		createGeneralMatters.tempClientEntity(input.get("searchTextEntity"), input.get("firmName"),
				input.get("contactPerson"), input.get("emailId"), input.get("confirmEmailId"),
				input.get("countryEntitys"), input.get("mobileNumber"));
		createGeneralMatters.addTemporaryButton();
		createGeneralMatters.addTeamMembersTempClientsBtn();
		String[] clientNamesIndividuals = { input.get("individualsClientName1"),
				input.get("individualsClientName1") };
		createGeneralMatters.selecting(clientNamesIndividuals);
		createGeneralMatters.nextPage();
		createGeneralMatters.nextPage();
		createGeneralMatters.nextPage();
		createGeneralMatters.alertPopupYes();
		createGeneralMatters.addMatterSuccess();
     }finally {
    	 createGeneralMatters.generalMatterTab(); 
     }

		}
		@Test(dataProvider = "getData14", priority = 13)
		public void clientsIndividualsandTempClientsWithTeamMembers(HashMap<String, String> input)
				throws InterruptedException {
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
				createGeneralMatters.addTemporaryButton();
				createGeneralMatters.addTeamMembersTempClientsBtn();
				createGeneralMatters.tempClientEntity(input.get("searchTextEntity"), input.get("firmName"),
						input.get("contactPerson"), input.get("emailId"), input.get("confirmEmailId"),
						input.get("countryEntitys"), input.get("mobileNumber"));
				createGeneralMatters.addTemporaryButton();
				createGeneralMatters.addTeamMembersTempClientsBtn();
				String[] clientNamesIndividuals = { input.get("individualsClientName1"),
						input.get("individualsClientName1") };
				createGeneralMatters.selecting(clientNamesIndividuals);
				createGeneralMatters.nextPage();
				String[] teamMemberNames = { input.get("memberName1"), input.get("memberName2") };
				createGeneralMatters.selecting(teamMemberNames);
				createGeneralMatters.nextPage();
				createGeneralMatters.nextPage();
				createGeneralMatters.alertPopupYes();
				createGeneralMatters.addMatterSuccess();
			}finally {
				createGeneralMatters.generalMatterTab();
			}
		}
		@Test(dataProvider = "getData15", priority = 14)
		public void clientsIndividualsandTempClientsWithDocuments(HashMap<String, String> input)
				throws InterruptedException {
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
				createGeneralMatters.addTemporaryButton();
				createGeneralMatters.addTeamMembersTempClientsBtn();
				createGeneralMatters.tempClientEntity(input.get("searchTextEntity"), input.get("firmName"),
						input.get("contactPerson"), input.get("emailId"), input.get("confirmEmailId"),
						input.get("countryEntitys"), input.get("mobileNumber"));
				createGeneralMatters.addTemporaryButton();
				createGeneralMatters.addTeamMembersTempClientsBtn();
				String[] clientNamesIndividuals = { input.get("individualsClientName1"),
						input.get("individualsClientName1") };
				createGeneralMatters.selecting(clientNamesIndividuals);
				createGeneralMatters.nextPage();
				createGeneralMatters.nextPage();
				String[] documentNames = { input.get("documentName1"), input.get("documentName2") };
				createGeneralMatters.selecting(documentNames);
				createGeneralMatters.nextPage();
				createGeneralMatters.alertPopupYes();
				createGeneralMatters.addMatterSuccess();
			}finally {
				createGeneralMatters.generalMatterTab();
			}
		}
		
		@Test(dataProvider = "getData16", priority = 15)
		public void clientsIndividualsandTempClientsWithTMandDocuments(HashMap<String, String> input)
				throws InterruptedException {
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
				createGeneralMatters.addTemporaryButton();
				createGeneralMatters.addTeamMembersTempClientsBtn();
				createGeneralMatters.tempClientEntity(input.get("searchTextEntity"), input.get("firmName"),
						input.get("contactPerson"), input.get("emailId"), input.get("confirmEmailId"),
						input.get("countryEntitys"), input.get("mobileNumber"));
				createGeneralMatters.addTemporaryButton();
				createGeneralMatters.addTeamMembersTempClientsBtn();
				String[] clientNamesIndividuals = { input.get("individualsClientName1"),
						input.get("individualsClientName1") };
				createGeneralMatters.selecting(clientNamesIndividuals);
				createGeneralMatters.nextPage();
				String[] teamMemberNames = { input.get("memberName1"), input.get("memberName2") };
				createGeneralMatters.selecting(teamMemberNames);
				createGeneralMatters.nextPage();
				String[] documentNames = { input.get("documentName1"), input.get("documentName2") };
				createGeneralMatters.selecting(documentNames);
				createGeneralMatters.nextPage();
				createGeneralMatters.alertPopupYes();
				createGeneralMatters.addMatterSuccess();
			}finally {
				createGeneralMatters.generalMatterTab();
			}
		}
		// All  Fields , Groups, Clients [Entity] and
		// TempClients[IndividualsandEntity]

		@Test(dataProvider = "getData17", priority = 16)
		public void clientsEntityandTempClients(HashMap<String, String> input) throws InterruptedException {
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
			createGeneralMatters.addTemporaryButton();
			createGeneralMatters.addTeamMembersTempClientsBtn();
			createGeneralMatters.tempClientEntity(input.get("searchTextEntity"), input.get("firmName"),
					input.get("contactPerson"), input.get("emailId"), input.get("confirmEmailId"),
					input.get("countryEntitys"), input.get("mobileNumber"));
			createGeneralMatters.addTemporaryButton();
			createGeneralMatters.addTeamMembersTempClientsBtn();
			String[] clientNamesIndividuals = { input.get("entityClientName1"),
					input.get("entityClientName2") };
			createGeneralMatters.selecting(clientNamesIndividuals);
			createGeneralMatters.nextPage();
			createGeneralMatters.nextPage();
			createGeneralMatters.nextPage();
			createGeneralMatters.alertPopupYes();
			createGeneralMatters.addMatterSuccess();
		
		}finally {
			createGeneralMatters.generalMatterTab();
		}
}
		
		// All Fields , Groups, Clients [Entity] and Temp Clients with TM

		@Test(dataProvider = "getData18", priority = 17)
		public void clientsEntityandTempClientsWithTeamMembers(HashMap<String, String> input) throws InterruptedException {
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
				createGeneralMatters.addTemporaryButton();
				createGeneralMatters.addTeamMembersTempClientsBtn();
				createGeneralMatters.tempClientEntity(input.get("searchTextEntity"), input.get("firmName"),
						input.get("contactPerson"), input.get("emailId"), input.get("confirmEmailId"),
						input.get("countryEntitys"), input.get("mobileNumber"));
				createGeneralMatters.addTemporaryButton();
				createGeneralMatters.addTeamMembersTempClientsBtn();
				String[] clientNamesIndividuals = { input.get("entityClientName1"),
						input.get("entityClientName2") };
				createGeneralMatters.selecting(clientNamesIndividuals);
				createGeneralMatters.nextPage();
				String[] teamMemberNames = { input.get("memberName1"), input.get("memberName2") };
				createGeneralMatters.selecting(teamMemberNames);
				createGeneralMatters.nextPage();
				createGeneralMatters.nextPage();
				createGeneralMatters.alertPopupYes();
				createGeneralMatters.addMatterSuccess();
			
				
			}finally {
				createGeneralMatters.generalMatterTab();
			}
		}
		// All Fields , Groups, Clients [Entity] and Temp Clients with Document

		@Test(dataProvider = "getData19", priority = 18)
		public void clientsEntityandTempClientsWithDocuments(HashMap<String, String> input) throws InterruptedException {
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
				createGeneralMatters.addTemporaryButton();
				createGeneralMatters.addTeamMembersTempClientsBtn();
				createGeneralMatters.tempClientEntity(input.get("searchTextEntity"), input.get("firmName"),
						input.get("contactPerson"), input.get("emailId"), input.get("confirmEmailId"),
						input.get("countryEntitys"), input.get("mobileNumber"));
				createGeneralMatters.addTemporaryButton();
				createGeneralMatters.addTeamMembersTempClientsBtn();
				String[] clientNamesIndividuals = { input.get("entityClientName1"),
						input.get("entityClientName2") };
				createGeneralMatters.selecting(clientNamesIndividuals);
				createGeneralMatters.nextPage();
				createGeneralMatters.nextPage();
				String[] documentNames = { input.get("documentName1"), input.get("documentName2") };
				createGeneralMatters.selecting(documentNames);
				createGeneralMatters.nextPage();
				createGeneralMatters.alertPopupYes();
				createGeneralMatters.addMatterSuccess();
			
			}finally {
				createGeneralMatters.generalMatterTab();	
			}
		}
		
		// Mandatory Fields , Groups, Clients [Entity] and Temp Clients with TM and
		// Document

		@Test(dataProvider = "getData20", priority = 19)
		public void clientsEntityandTempClientsWithTMandDocuments(HashMap<String, String> input)
				throws InterruptedException {
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
				createGeneralMatters.addTemporaryButton();
				createGeneralMatters.addTeamMembersTempClientsBtn();
				createGeneralMatters.tempClientEntity(input.get("searchTextEntity"), input.get("firmName"),
						input.get("contactPerson"), input.get("emailId"), input.get("confirmEmailId"),
						input.get("countryEntitys"), input.get("mobileNumber"));
				createGeneralMatters.addTemporaryButton();
				createGeneralMatters.addTeamMembersTempClientsBtn();
				String[] clientNamesIndividuals = { input.get("entityClientName1"),
						input.get("entityClientName2") };
				createGeneralMatters.selecting(clientNamesIndividuals);
				createGeneralMatters.nextPage();
				String[] teamMemberNames = { input.get("memberName1"), input.get("memberName2") };
				createGeneralMatters.selecting(teamMemberNames);
				createGeneralMatters.nextPage();
				String[] documentNames = { input.get("documentName1"), input.get("documentName2") };
				createGeneralMatters.selecting(documentNames);
				createGeneralMatters.nextPage();
				createGeneralMatters.alertPopupYes();
				createGeneralMatters.addMatterSuccess();
			}finally {
				createGeneralMatters.generalMatterTab();
			}
		}
		
		// All Fields , Groups, Clients [IndividualsandEntity] and
		// TempClients[IndividualsandEntity]

		@Test(dataProvider = "getData21", priority = 20)
		public void clientsIndividualsandEntityandTempClients(HashMap<String, String> input) throws InterruptedException {
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
				createGeneralMatters.addTemporaryButton();
				createGeneralMatters.addTeamMembersTempClientsBtn();
				createGeneralMatters.tempClientEntity(input.get("searchTextEntity"), input.get("firmName"),
						input.get("contactPerson"), input.get("emailId"), input.get("confirmEmailId"),
						input.get("countryEntitys"), input.get("mobileNumber"));
				createGeneralMatters.addTemporaryButton();
				createGeneralMatters.addTeamMembersTempClientsBtn();
				String[] clientNamesIndividuals = { input.get("individualsClientName1"),
						input.get("entityClientName1") };
				createGeneralMatters.selecting(clientNamesIndividuals);
				createGeneralMatters.nextPage();
				createGeneralMatters.nextPage();
				createGeneralMatters.nextPage();
				createGeneralMatters.alertPopupYes();
				createGeneralMatters.addMatterSuccess();

			}finally {
				createGeneralMatters.generalMatterTab();
			}
		}
		
		// All Fields , Groups, Clients [Individuals and Entity] and Temp Clients
		// with TM

		@Test(dataProvider = "getData22", priority = 21)
		public void clientsIndividualsandEntityandTempClientsWithTeamMembers(HashMap<String, String> input)
				throws InterruptedException {
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
				createGeneralMatters.addTemporaryButton();
				createGeneralMatters.addTeamMembersTempClientsBtn();
				createGeneralMatters.tempClientEntity(input.get("searchTextEntity"), input.get("firmName"),
						input.get("contactPerson"), input.get("emailId"), input.get("confirmEmailId"),
						input.get("countryEntitys"), input.get("mobileNumber"));
				createGeneralMatters.addTemporaryButton();
				createGeneralMatters.addTeamMembersTempClientsBtn();
				String[] clientNamesIndividuals = { input.get("individualsClientName1"),
						input.get("entityClientName1") };
				createGeneralMatters.selecting(clientNamesIndividuals);
				createGeneralMatters.nextPage();
				String[] teamMemberNames = { input.get("memberName1"), input.get("memberName2") };
				createGeneralMatters.selecting(teamMemberNames);
				createGeneralMatters.nextPage();
				createGeneralMatters.nextPage();
				createGeneralMatters.alertPopupYes();
				createGeneralMatters.addMatterSuccess();

			}finally {
				createGeneralMatters.generalMatterTab();
			}
		}
		
		// All Fields , Groups, Clients [Individuals and Entity] and Temp Clients
		// with Document

		@Test(dataProvider = "getData23", priority = 22)
		public void clientsIndividualsandEntityandTempClientsWithDocuments(HashMap<String, String> input)
				throws InterruptedException {
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
				createGeneralMatters.addTemporaryButton();
				createGeneralMatters.addTeamMembersTempClientsBtn();
				createGeneralMatters.tempClientEntity(input.get("searchTextEntity"), input.get("firmName"),
						input.get("contactPerson"), input.get("emailId"), input.get("confirmEmailId"),
						input.get("countryEntitys"), input.get("mobileNumber"));
				createGeneralMatters.addTemporaryButton();
				createGeneralMatters.addTeamMembersTempClientsBtn();
				String[] clientNamesIndividuals = { input.get("individualsClientName1"),
						input.get("entityClientName1") };
				createGeneralMatters.selecting(clientNamesIndividuals);
				createGeneralMatters.nextPage();
				createGeneralMatters.nextPage();
				String[] documentNames = { input.get("documentName1"), input.get("documentName2") };
				createGeneralMatters.selecting(documentNames);
				createGeneralMatters.nextPage();
				createGeneralMatters.alertPopupYes();
				createGeneralMatters.addMatterSuccess();

			}finally {
				createGeneralMatters.generalMatterTab();
			}
		}
		// all Fields , Groups, Clients [Individuals and Entity] and Temp Clients
		// with TM and Document

		@Test(dataProvider = "getData24", priority = 23)
		public void clientsIndividualsandEntityandTempClientsWithTMandDocuments(HashMap<String, String> input)
				throws InterruptedException {
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
				createGeneralMatters.addTemporaryButton();
				createGeneralMatters.addTeamMembersTempClientsBtn();
				createGeneralMatters.tempClientEntity(input.get("searchTextEntity"), input.get("firmName"),
						input.get("contactPerson"), input.get("emailId"), input.get("confirmEmailId"),
						input.get("countryEntitys"), input.get("mobileNumber"));
				createGeneralMatters.addTemporaryButton();
				createGeneralMatters.addTeamMembersTempClientsBtn();
				String[] clientNamesIndividuals = { input.get("individualsClientName1"),
						input.get("entityClientName1") };
				createGeneralMatters.selecting(clientNamesIndividuals);
				createGeneralMatters.nextPage();
				String[] teamMemberNames = { input.get("memberName1"), input.get("memberName2") };
				createGeneralMatters.selecting(teamMemberNames);
				createGeneralMatters.nextPage();
				String[] documentNames = { input.get("documentName1"), input.get("documentName2") };
				createGeneralMatters.selecting(documentNames);
				createGeneralMatters.nextPage();
				createGeneralMatters.alertPopupYes();
				createGeneralMatters.addMatterSuccess();
			}finally {
				createGeneralMatters.generalMatterTab();
			}
		}
		
		// Mandatory Fields , Groups , Clients[Individuals] and Temp Clients
		// [Individuals]

		@Test(dataProvider = "getData25", priority = 24)
		public void clientsIndividualsandTempClientsIndividuals(HashMap<String, String> input) throws InterruptedException {
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
				createGeneralMatters.addTemporaryButton();
				createGeneralMatters.addTeamMembersTempClientsBtn();
				String[] clientNamesIndividuals = { input.get("individualsClientName1"),
						input.get("individualsClientName2") };
				createGeneralMatters.selecting(clientNamesIndividuals);
				createGeneralMatters.nextPage();
				createGeneralMatters.nextPage();
				createGeneralMatters.nextPage();
				createGeneralMatters.alertPopupYes();
				createGeneralMatters.addMatterSuccess();
			}finally {
				createGeneralMatters.generalMatterTab();
			}
		}
		// All Fields , Groups , Clients[Individuals] and Temp Clients
		// [Individuals] With TM

		@Test(dataProvider = "getData26", priority = 25)
		public void clientsIndividualsandTempClientsIndividualsWithTeamMembers(HashMap<String, String> input)
				throws InterruptedException {
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
				createGeneralMatters.addTemporaryButton();
				createGeneralMatters.addTeamMembersTempClientsBtn();
				String[] clientNamesIndividuals = { input.get("individualsClientName1"),
						input.get("individualsClientName2") };
				createGeneralMatters.selecting(clientNamesIndividuals);
				createGeneralMatters.nextPage();
				String[] teamMemberNames = { input.get("memberName1"), input.get("memberName2") };
				createGeneralMatters.selecting(teamMemberNames);
				createGeneralMatters.nextPage();
				createGeneralMatters.nextPage();
				createGeneralMatters.alertPopupYes();
				createGeneralMatters.addMatterSuccess();
			}finally {
				createGeneralMatters.generalMatterTab();
			}
		}
		
		// All  Fields , Groups, Clients[Individuals] and Temp Clients
		// [Individuals] With Document

		@Test(dataProvider = "getData27", priority = 26)
		public void clientsIndividualsandTempClientsIndividualsWithDocuments(HashMap<String, String> input)
				throws InterruptedException {
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
				createGeneralMatters.addTemporaryButton();
				createGeneralMatters.addTeamMembersTempClientsBtn();
				String[] clientNamesIndividuals = { input.get("individualsClientName1"),
						input.get("individualsClientName2") };
				createGeneralMatters.selecting(clientNamesIndividuals);
				createGeneralMatters.nextPage();
				createGeneralMatters.nextPage();
				String[] documentNames = { input.get("documentName1"), input.get("documentName2") };
				createGeneralMatters.selecting(documentNames);
				createGeneralMatters.nextPage();
				createGeneralMatters.alertPopupYes();
				createGeneralMatters.addMatterSuccess();
			}finally {
				createGeneralMatters.generalMatterTab();
			}
		}
		
		
		

		// Mandatory Fields , Groups, Clients[Individuals] and Temp Clients
		// [Individuals] With TM and Document

		@Test(dataProvider = "getData28", priority = 27)
		public void clientsIndividualsandTempClientsIndividualsWithTMandDocuments(HashMap<String, String> input)
				throws InterruptedException {

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
				createGeneralMatters.addTemporaryButton();
				createGeneralMatters.addTeamMembersTempClientsBtn();
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
				createGeneralMatters.addMatterSuccess();
			} finally {
				createGeneralMatters.generalMatterTab();
			}
		}

		// All  Fields , Groups , Clients[Entity] and Temp Clients [Individuals]

		@Test(dataProvider = "getData29", priority = 28)
		public void clientsEntityandTempClientsIndividuals(HashMap<String, String> input) throws InterruptedException {

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
				createGeneralMatters.addTemporaryButton();
				createGeneralMatters.addTeamMembersTempClientsBtn();
				String[] clientNamesIndividuals = { input.get("entityClientName1"), input.get("entityClientName2") };
				createGeneralMatters.selecting(clientNamesIndividuals);
				createGeneralMatters.nextPage();
				createGeneralMatters.nextPage();
				createGeneralMatters.nextPage();
				createGeneralMatters.alertPopupYes();
				createGeneralMatters.addMatterSuccess();
			} finally {
				createGeneralMatters.generalMatterTab();
			}
		}

		// All Fields , Groups , Clients[Entity] and Temp Clients [Individuals]
		// With TM

		@Test(dataProvider = "getData30", priority = 29)
		public void clientsEntityandTempClientsIndividualsWithTeamMembers(HashMap<String, String> input)
				throws InterruptedException {

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
				createGeneralMatters.addTemporaryButton();
				createGeneralMatters.addTeamMembersTempClientsBtn();
				String[] clientNamesIndividuals = { input.get("entityClientName1"), input.get("entityClientName2") };
				createGeneralMatters.selecting(clientNamesIndividuals);
				createGeneralMatters.nextPage();
				String[] teamMemberNames = { input.get("memberName1"), input.get("memberName2") };
				createGeneralMatters.selecting(teamMemberNames);
				createGeneralMatters.nextPage();
				createGeneralMatters.nextPage();
				createGeneralMatters.alertPopupYes();
				createGeneralMatters.addMatterSuccess();
			} finally {
				createGeneralMatters.generalMatterTab();
			}
		}

		// Mandatory Fields , Groups, Clients[Entity] and Temp Clients [Individuals]
		// With Document

		@Test(dataProvider = "getData31", priority = 30)
		public void clientsEntityandTempClientsIndividualsWithDocuments(HashMap<String, String> input)
				throws InterruptedException {

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
				createGeneralMatters.addTemporaryButton();
				createGeneralMatters.addTeamMembersTempClientsBtn();
				String[] clientNamesIndividuals = { input.get("entityClientName1"), input.get("entityClientName2") };
				createGeneralMatters.selecting(clientNamesIndividuals);
				createGeneralMatters.nextPage();
				createGeneralMatters.nextPage();
				String[] documentNames = { input.get("documentName1"), input.get("documentName2") };
				createGeneralMatters.selecting(documentNames);
				createGeneralMatters.nextPage();
				createGeneralMatters.alertPopupYes();
				createGeneralMatters.addMatterSuccess();
			} finally {
				createGeneralMatters.generalMatterTab();
			}
		}

		// Mandatory Fields , Groups, Clients[Entity] and Temp Clients [Individuals]
		// With TM and Document

		@Test(dataProvider = "getData32", priority = 31)
		public void clientsEntityandTempClientsIndividualsWithTMandDocuments(HashMap<String, String> input)
				throws InterruptedException {

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
				createGeneralMatters.addTemporaryButton();
				createGeneralMatters.addTeamMembersTempClientsBtn();
				String[] clientNamesIndividuals = { input.get("entityClientName1"), input.get("entityClientName2") };
				createGeneralMatters.selecting(clientNamesIndividuals);
				createGeneralMatters.nextPage();
				String[] teamMemberNames = { input.get("memberName1"), input.get("memberName2") };
				createGeneralMatters.selecting(teamMemberNames);
				createGeneralMatters.nextPage();
				String[] documentNames = { input.get("documentName1"), input.get("documentName2") };
				createGeneralMatters.selecting(documentNames);
				createGeneralMatters.nextPage();
				createGeneralMatters.alertPopupYes();
				createGeneralMatters.addMatterSuccess();
			} finally {
				createGeneralMatters.generalMatterTab();
			}
		}
		// Mandatory Fields , Groups , Clients[Both] and Temp Clients [Individuals]

		@Test(dataProvider = "getData33", priority = 32)
		public void clientsIndividualsandEntityandTempClientsIndividuals(HashMap<String, String> input)
				throws InterruptedException {
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
				createGeneralMatters.addTemporaryButton();
				createGeneralMatters.addTeamMembersTempClientsBtn();
				String[] clientNamesIndividuals = { input.get("individualsClientName1"), input.get("entityClientName1") };
				createGeneralMatters.selecting(clientNamesIndividuals);	;
				createGeneralMatters.nextPage();
				createGeneralMatters.nextPage();
				createGeneralMatters.nextPage();
				createGeneralMatters.alertPopupYes();
				createGeneralMatters.addMatterSuccess();

			} finally {
				createGeneralMatters.generalMatterTab();

			}
		}
		// Mandatory Fields , Groups , Clients[Both] and Temp Clients [Individuals] With
		// TM

		@Test(dataProvider = "getData34", priority = 33)
		public void clientsIndividualsandEntityandTempClientsIndividualsWithTeamMembers(HashMap<String, String> input)
				throws InterruptedException {
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
				createGeneralMatters.addTemporaryButton();
				createGeneralMatters.addTeamMembersTempClientsBtn();
				String[] clientNamesIndividuals = { input.get("individualsClientName1"), input.get("entityClientName1") };
				createGeneralMatters.selecting(clientNamesIndividuals);
				createGeneralMatters.nextPage();
				String[] teamMemberNames = { input.get("memberName1"), input.get("memberName2") };
				createGeneralMatters.selecting(teamMemberNames);
				createGeneralMatters.nextPage();
				createGeneralMatters.nextPage();
				createGeneralMatters.alertPopupYes();
				createGeneralMatters.addMatterSuccess();
			} finally {
				createGeneralMatters.generalMatterTab();
			}
		}

		// Mandatory Fields , Groups, Clients[Both] and Temp Clients [Individuals] With
		// Document

		@Test(dataProvider = "getData35", priority = 34)
		public void clientsIndividualsandEntityandTempClientsIndividualsWithDocuments(HashMap<String, String> input)
				throws InterruptedException {
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
				createGeneralMatters.addTemporaryButton();
				createGeneralMatters.addTeamMembersTempClientsBtn();
				String[] clientNamesIndividuals = { input.get("individualsClientName1"), input.get("entityClientName1") };
				createGeneralMatters.selecting(clientNamesIndividuals);
				createGeneralMatters.nextPage();
				createGeneralMatters.nextPage();
				String[] documentNames = { input.get("documentName1"), input.get("documentName2") };
				createGeneralMatters.selecting(documentNames);
				createGeneralMatters.nextPage();
				createGeneralMatters.alertPopupYes();
				createGeneralMatters.addMatterSuccess();

			} finally {
				createGeneralMatters.generalMatterTab();

			}
		}

		// All Fields , Groups, Clients[Both] and Temp Clients [Individuals] With
		// TM and Document
		@Test(dataProvider = "getData36", priority = 35)
		public void clientsIndividualsandEntityandTempClientsIndividualsWithTMandDocuments(HashMap<String, String> input)
				throws InterruptedException {
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
				createGeneralMatters.addTemporaryButton();
				createGeneralMatters.addTeamMembersTempClientsBtn();
				String[] clientNamesIndividuals = { input.get("individualsClientName1"), input.get("entityClientName1") };
				createGeneralMatters.selecting(clientNamesIndividuals);
				createGeneralMatters.nextPage();
				String[] teamMemberNames = { input.get("memberName1"), input.get("memberName2") };
				createGeneralMatters.selecting(teamMemberNames);
				createGeneralMatters.nextPage();
				String[] documentNames = { input.get("documentName1"), input.get("documentName2") };
				createGeneralMatters.selecting(documentNames);
				createGeneralMatters.nextPage();
				createGeneralMatters.alertPopupYes();
				createGeneralMatters.addMatterSuccess();

			} finally {
				createGeneralMatters.generalMatterTab();
			}
		}

		// All Fields , Groups, Clients[Individuals] and Temp Clients [Entity]

		@Test(dataProvider = "getData37", priority = 36)
		public void clientsIndividualsandTempClientsEntity(HashMap<String, String> input) throws InterruptedException {
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
				createGeneralMatters.addTemporaryButton();
				createGeneralMatters.addTeamMembersTempClientsBtn();
				String[] clientNamesIndividuals = { input.get("individualsClientName1"),
						input.get("individualsClientName2") };
				createGeneralMatters.selecting(clientNamesIndividuals);
				createGeneralMatters.nextPage();
				createGeneralMatters.nextPage();
				createGeneralMatters.nextPage();
				createGeneralMatters.alertPopupYes();
				createGeneralMatters.addMatterSuccess();
			} finally {
				createGeneralMatters.generalMatterTab();
			}
		}
		// All Fields , Groups, Clients [Individuals] and Temp Clients [Entity]
		// With TM

		@Test(dataProvider = "getData38", priority = 37)
		public void clientsIndividualsandTempClientsEntityWithTeamMembers(HashMap<String, String> input)
				throws InterruptedException {
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
				createGeneralMatters.addTemporaryButton();
				createGeneralMatters.addTeamMembersTempClientsBtn();
				String[] clientNamesIndividuals = { input.get("individualsClientName1"),
						input.get("individualsClientName2") };
				createGeneralMatters.selecting(clientNamesIndividuals);
				createGeneralMatters.nextPage();
				String[] teamMemberNames = { input.get("memberName1"), input.get("memberName2") };
				createGeneralMatters.selecting(teamMemberNames);
				createGeneralMatters.nextPage();
				createGeneralMatters.nextPage();
				createGeneralMatters.alertPopupYes();
				createGeneralMatters.addMatterSuccess();
			} finally {
				createGeneralMatters.generalMatterTab();
			}
		}

		// Mandatory Fields , Groups, Clients [Individuals] and Temp Clients [Entity]
		// With Document
		@Test(dataProvider = "getData39", priority = 38)
		public void clientsIndividualsandTempClientsEntityWithDocuments(HashMap<String, String> input)
				throws InterruptedException {
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
				createGeneralMatters.addTemporaryButton();
				createGeneralMatters.addTeamMembersTempClientsBtn();
				String[] clientNamesIndividuals = { input.get("individualsClientName1"),
						input.get("individualsClientName2") };
				createGeneralMatters.selecting(clientNamesIndividuals);
				createGeneralMatters.nextPage();
				createGeneralMatters.nextPage();
				String[] documentNames = { input.get("documentName1"), input.get("documentName2") };
				createGeneralMatters.selecting(documentNames);
				createGeneralMatters.nextPage();
				createGeneralMatters.alertPopupYes();
				createGeneralMatters.addMatterSuccess();
			} finally {
				createGeneralMatters.generalMatterTab();
			}
		}
		// Mandatory Fields , Groups, Clients [Individuals] and Temp Clients [Entity]
		// With TM and Document

		@Test(dataProvider = "getData40", priority = 39)
		public void clientsIndividualsandTempClientsEntityWithTMandDocuments(HashMap<String, String> input)
				throws InterruptedException {
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
				createGeneralMatters.addTemporaryButton();
				createGeneralMatters.addTeamMembersTempClientsBtn();
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
				createGeneralMatters.addMatterSuccess();
			} finally {
				createGeneralMatters.generalMatterTab();
			}
		}

		// Mandatory Fields , Groups, Clients[Entity] and Temp Clients [Entity]

		@Test(dataProvider = "getData41", priority = 40)
		public void clientsEntitysandTempClientsEntity(HashMap<String, String> input) throws InterruptedException {
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
				createGeneralMatters.addTemporaryButton();
				createGeneralMatters.addTeamMembersTempClientsBtn();
				String[] clientNamesEntities = { input.get("entityClientName1"), input.get("entityClientName2") };
				createGeneralMatters.selecting(clientNamesEntities);
				createGeneralMatters.nextPage();
				createGeneralMatters.nextPage();
				createGeneralMatters.nextPage();
				createGeneralMatters.alertPopupYes();
				createGeneralMatters.addMatterSuccess();
			} finally {
				createGeneralMatters.generalMatterTab();
			}
		}
		// Mandatory Fields , Groups, Clients [Entity] and Temp Clients [Entity] With TM

		@Test(dataProvider = "getData42", priority = 41)
		public void clientsEntityandTempClientsEntityWithTeamMembers(HashMap<String, String> input)
				throws InterruptedException {
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
				createGeneralMatters.addTemporaryButton();
				createGeneralMatters.addTeamMembersTempClientsBtn();
				String[] clientNamesEntities = { input.get("entityClientName1"), input.get("entityClientName2") };
				createGeneralMatters.selecting(clientNamesEntities);
				createGeneralMatters.nextPage();
				String[] teamMemberNames = { input.get("memberName1"), input.get("memberName2") };
				createGeneralMatters.selecting(teamMemberNames);
				createGeneralMatters.nextPage();
				createGeneralMatters.nextPage();
				createGeneralMatters.alertPopupYes();
				createGeneralMatters.addMatterSuccess();
			} finally {
				createGeneralMatters.generalMatterTab();
			}
		}
		// Mandatory Fields , Groups, Clients [Entity] and Temp Clients [Entity] With
		// Document

		@Test(dataProvider = "getData43", priority = 42)
		public void clientsEntityandTempClientsEntityWithDocuments(HashMap<String, String> input)
				throws InterruptedException {
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
				createGeneralMatters.addTemporaryButton();
				createGeneralMatters.addTeamMembersTempClientsBtn();
				String[] clientNamesEntities = { input.get("entityClientName1"), input.get("entityClientName2") };
				createGeneralMatters.selecting(clientNamesEntities);
				createGeneralMatters.nextPage();
				createGeneralMatters.nextPage();
				String[] documentNames = { input.get("documentName1"), input.get("documentName2") };
				createGeneralMatters.selecting(documentNames);
				createGeneralMatters.nextPage();
				createGeneralMatters.alertPopupYes();
				createGeneralMatters.addMatterSuccess();
			} finally {
				createGeneralMatters.generalMatterTab();
			}
		}
		// Mandatory Fields , Groups, Clients [Entity] and Temp Clients [Entity] With TM
		// and Document

		@Test(dataProvider = "getData44", priority = 43)
		public void clientsEntityandTempClientsEntityWithTMandDocuments(HashMap<String, String> input)
				throws InterruptedException {
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
				createGeneralMatters.addTemporaryButton();
				createGeneralMatters.addTeamMembersTempClientsBtn();
				String[] clientNamesEntities = { input.get("entityClientName1"), input.get("entityClientName2") };
				createGeneralMatters.selecting(clientNamesEntities);
				createGeneralMatters.nextPage();
				String[] teamMemberNames = { input.get("memberName1"), input.get("memberName2") };
				createGeneralMatters.selecting(teamMemberNames);
				createGeneralMatters.nextPage();
				String[] documentNames = { input.get("documentName1"), input.get("documentName2") };
				createGeneralMatters.selecting(documentNames);
				createGeneralMatters.nextPage();
				createGeneralMatters.alertPopupYes();
				createGeneralMatters.addMatterSuccess();
			} finally {
				createGeneralMatters.generalMatterTab();
			}
		}
		// Mandatory Fields , Groups, Clients[Both] and Temp Clients [Entity]

		@Test(dataProvider = "getData45", priority = 44)
		public void clientsIndividualsandEntityandTempClientsEntity(HashMap<String, String> input)
				throws InterruptedException {
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
				createGeneralMatters.addTemporaryButton();
				createGeneralMatters.addTeamMembersTempClientsBtn();
				String[] clientNamesIndividuals = { input.get("individualsClientName1"), input.get("entityClientName1") };
				createGeneralMatters.selecting(clientNamesIndividuals);
				createGeneralMatters.nextPage();
				createGeneralMatters.nextPage();
				createGeneralMatters.nextPage();
				createGeneralMatters.alertPopupYes();
				createGeneralMatters.addMatterSuccess();
			} finally {
				createGeneralMatters.generalMatterTab();
			}
		}
		// Mandatory Fields , Groups, Clients [Both] and Temp Clients [Entity] With TM

		@Test(dataProvider = "getData46", priority = 45)
		public void clientsIndividualsandEntityandTempClientsEntityWithTeamMembers(HashMap<String, String> input)
				throws InterruptedException {
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
				createGeneralMatters.addTemporaryButton();
				createGeneralMatters.addTeamMembersTempClientsBtn();
				String[] clientNamesIndividuals = { input.get("individualsClientName1"), input.get("entityClientName1") };
				createGeneralMatters.selecting(clientNamesIndividuals);
				createGeneralMatters.nextPage();
				String[] teamMemberNames = { input.get("memberName1"), input.get("memberName2") };
				createGeneralMatters.selecting(teamMemberNames);
				createGeneralMatters.nextPage();
				createGeneralMatters.nextPage();
				createGeneralMatters.alertPopupYes();
				createGeneralMatters.addMatterSuccess();
			} finally {
				createGeneralMatters.generalMatterTab();
			}
		}
		// Mandatory Fields , Groups, Clients [Both] and Temp Clients [Entity] With
		// Document

		@Test(dataProvider = "getData47", priority = 46)
		public void clientsIndividualsandEntityandTempClientsEntityWithDocuments(HashMap<String, String> input)
				throws InterruptedException {
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
				createGeneralMatters.addTemporaryButton();
				createGeneralMatters.addTeamMembersTempClientsBtn();
				String[] clientNamesIndividuals = { input.get("individualsClientName1"), input.get("entityClientName1") };
				createGeneralMatters.selecting(clientNamesIndividuals);
				createGeneralMatters.nextPage();
				createGeneralMatters.nextPage();
				String[] documentNames = { input.get("documentName1"), input.get("documentName2") };
				createGeneralMatters.selecting(documentNames);
				createGeneralMatters.nextPage();
				createGeneralMatters.alertPopupYes();
				createGeneralMatters.addMatterSuccess();
			} finally {
				createGeneralMatters.nextPage();
			}
		}
		// Mandatory Fields , Groups, Clients [Both] and Temp Clients [Entity] With TM
		// and Document

		@Test(dataProvider = "getData48", priority = 47)
		public void clientsIndividualsandEntityandTempClientsEntityWithTMandDocuments(HashMap<String, String> input)
				throws InterruptedException {
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
				createGeneralMatters.addTemporaryButton();
				createGeneralMatters.addTeamMembersTempClientsBtn();
				String[] clientNamesIndividuals = { input.get("individualsClientName1"), input.get("entityClientName1") };
				createGeneralMatters.selecting(clientNamesIndividuals);
				createGeneralMatters.nextPage();
				String[] teamMemberNames = { input.get("memberName1"), input.get("memberName2") };
				createGeneralMatters.selecting(teamMemberNames);
				createGeneralMatters.nextPage();
				String[] documentNames = { input.get("documentName1"), input.get("documentName2") };
				createGeneralMatters.selecting(documentNames);
				createGeneralMatters.nextPage();
				createGeneralMatters.alertPopupYes();
				createGeneralMatters.addMatterSuccess();
			} finally {
				createGeneralMatters.nextPage();
			}
		}
		// All Fields , Groups and Temp Clients [Individuals]

		@Test(dataProvider = "getData49", priority = 48)
		public void tempClientsIndividuals(HashMap<String, String> input) throws InterruptedException {
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

				// Temp Client Individuals
				createGeneralMatters.tempClientIndividuals(input.get("searchTextIndividuals"), input.get("firstName"),
						input.get("lastName"), input.get("email"), input.get("confirmEmail"), input.get("country"),
						input.get("phoneNumber"));
				createGeneralMatters.addTemporaryButton();
				createGeneralMatters.addTeamMembersTempClientsBtn();
				createGeneralMatters.nextPage();
				createGeneralMatters.nextPage();
				createGeneralMatters.nextPage();
				createGeneralMatters.alertPopupYes();
				createGeneralMatters.addMatterSuccess();
			} finally {
				createGeneralMatters.generalMatterTab();
			}
		}
		
		// All  Fields , Groups and Temp Clients [Individuals] With TM

		@Test(dataProvider = "getData50", priority = 49)
		public void tempClientsIndividualsWithTeamMembers(HashMap<String, String> input) throws InterruptedException {
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
				// Temp Client Individuals
				createGeneralMatters.tempClientIndividuals(input.get("searchTextIndividuals"), input.get("firstName"),
						input.get("lastName"), input.get("email"), input.get("confirmEmail"), input.get("country"),
						input.get("phoneNumber"));
				createGeneralMatters.addTemporaryButton();
				createGeneralMatters.addTeamMembersTempClientsBtn();
				createGeneralMatters.nextPage();
				String[] teamMemberNames = { input.get("memberName1"), input.get("memberName2") };
				createGeneralMatters.selecting(teamMemberNames);
				createGeneralMatters.nextPage();
				createGeneralMatters.nextPage();
				createGeneralMatters.alertPopupYes();
				createGeneralMatters.addMatterSuccess();
			} finally {
				createGeneralMatters.generalMatterTab();
			}
		}
		// All  Fields , Groups and Temp Clients [Individuals] With Document

		@Test(dataProvider = "getData51", priority = 50)
		public void tempClientsIndividualsWithDocuments(HashMap<String, String> input) throws InterruptedException {
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
				// Temp Client Individuals
				createGeneralMatters.tempClientIndividuals(input.get("searchTextIndividuals"), input.get("firstName"),
						input.get("lastName"), input.get("email"), input.get("confirmEmail"), input.get("country"),
						input.get("phoneNumber"));
				createGeneralMatters.addTemporaryButton();
				createGeneralMatters.addTeamMembersTempClientsBtn();
				createGeneralMatters.nextPage();
				createGeneralMatters.nextPage();
				String[] documentNames = { input.get("documentName1"), input.get("documentName2") };
				createGeneralMatters.selecting(documentNames);
				createGeneralMatters.nextPage();
				createGeneralMatters.alertPopupYes();
				createGeneralMatters.addMatterSuccess();
			} finally {
				createGeneralMatters.generalMatterTab();

			}
		}
		// Mandatory Fields , Groups and Temp Clients [Individuals] With TM and Document

		@Test(dataProvider = "getData52", priority = 51)
		public void tempClientsIndividualsWithTMandDocuments(HashMap<String, String> input) throws InterruptedException {
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
				// Temp Client Individuals
				createGeneralMatters.tempClientIndividuals(input.get("searchTextIndividuals"), input.get("firstName"),
						input.get("lastName"), input.get("email"), input.get("confirmEmail"), input.get("country"),
						input.get("phoneNumber"));
				createGeneralMatters.addTemporaryButton();
				createGeneralMatters.addTeamMembersTempClientsBtn();
				createGeneralMatters.nextPage();
				String[] teamMemberNames = { input.get("memberName1"), input.get("memberName2") };
				createGeneralMatters.selecting(teamMemberNames);
				createGeneralMatters.nextPage();
				String[] documentNames = { input.get("documentName1"), input.get("documentName2") };
				createGeneralMatters.selecting(documentNames);
				createGeneralMatters.nextPage();
				createGeneralMatters.alertPopupYes();
				createGeneralMatters.addMatterSuccess();
			} finally {
				createGeneralMatters.generalMatterTab();
			}
		}

		// Mandatory Fields , Groups and Temp Clients [Entity]

		@Test(dataProvider = "getData53", priority = 52)
		public void tempClientsEntity(HashMap<String, String> input) throws InterruptedException {
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
				createGeneralMatters.addTemporaryButton();
				createGeneralMatters.addTeamMembersTempClientsBtn();
				createGeneralMatters.nextPage();
				createGeneralMatters.nextPage();
				createGeneralMatters.nextPage();
				createGeneralMatters.alertPopupYes();
				createGeneralMatters.addMatterSuccess();
			} finally {
				createGeneralMatters.generalMatterTab();
			}
		}
		// Mandatory Fields , Groups and Temp Clients [Entity] With TM

		@Test(dataProvider = "getData54", priority = 53)
		public void tempClientsEntityWithTeamMembers(HashMap<String, String> input) throws InterruptedException {
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
				createGeneralMatters.addTemporaryButton();
				createGeneralMatters.addTeamMembersTempClientsBtn();
				createGeneralMatters.nextPage();
				String[] teamMemberNames = { input.get("memberName1"), input.get("memberName2") };
				createGeneralMatters.selecting(teamMemberNames);
				createGeneralMatters.nextPage();
				createGeneralMatters.nextPage();
				createGeneralMatters.alertPopupYes();
				createGeneralMatters.addMatterSuccess();
			} finally {
				createGeneralMatters.generalMatterTab();
			}
		}
		// Mandatory Fields , Groups and Temp Clients [Entity] With Document

		@Test(dataProvider = "getData55", priority = 54)
		public void tempClientsEntityWithDocuments(HashMap<String, String> input) throws InterruptedException {

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
				createGeneralMatters.addTemporaryButton();
				createGeneralMatters.addTeamMembersTempClientsBtn();
				createGeneralMatters.nextPage();
				createGeneralMatters.nextPage();
				String[] documentNames = { input.get("documentName1"), input.get("documentName2") };
				createGeneralMatters.selecting(documentNames);
				createGeneralMatters.nextPage();
				createGeneralMatters.alertPopupYes();
				createGeneralMatters.addMatterSuccess();
			} finally {
				createGeneralMatters.generalMatterTab();
			}
		}
		// Mandatory Fields , Groups and Temp Clients [Entity] With TM and Document

		@Test(dataProvider = "getData56", priority = 55)
		public void tempClientsEntityWithTMandDocuments(HashMap<String, String> input) throws InterruptedException {
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
				createGeneralMatters.addTemporaryButton();
				createGeneralMatters.addTeamMembersTempClientsBtn();
				createGeneralMatters.nextPage();
				String[] teamMemberNames = { input.get("memberName1"), input.get("memberName2") };
				createGeneralMatters.selecting(teamMemberNames);
				createGeneralMatters.nextPage();
				String[] documentNames = { input.get("documentName1"), input.get("documentName2") };
				createGeneralMatters.selecting(documentNames);
				createGeneralMatters.nextPage();
				createGeneralMatters.alertPopupYes();
				createGeneralMatters.addMatterSuccess();
			} finally {
				createGeneralMatters.generalMatterTab();
			}
		}
		
		// Mandatory Fields , Groups and Temp Clients

			@Test(dataProvider = "getData57", priority = 56)
			public void tempClientsIndividualsandEntity(HashMap<String, String> input) throws InterruptedException {
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
					createGeneralMatters.addTemporaryButton();
					createGeneralMatters.addTeamMembersTempClientsBtn();
					createGeneralMatters.tempClientEntity(input.get("searchTextEntity"), input.get("firmName"),
							input.get("contactPerson"), input.get("emailId"), input.get("confirmEmailId"),
							input.get("countryEntitys"), input.get("mobileNumber"));
					createGeneralMatters.addTemporaryButton();
					createGeneralMatters.addTeamMembersTempClientsBtn();
					createGeneralMatters.nextPage();
					createGeneralMatters.nextPage();
					createGeneralMatters.nextPage();
					createGeneralMatters.alertPopupYes();
					createGeneralMatters.addMatterSuccess();
					
					
				}finally {
					createGeneralMatters.generalMatterTab();
				}
			}
			// Mandatory Fields , Groups and Temp Clients With TM

			@Test(dataProvider = "getData58", priority = 57)
			public void tempClientsIndividualsandEntityWithTeamMembers(HashMap<String, String> input)
					throws InterruptedException {
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
					createGeneralMatters.addTemporaryButton();
					createGeneralMatters.addTeamMembersTempClientsBtn();
					createGeneralMatters.tempClientEntity(input.get("searchTextEntity"), input.get("firmName"),
							input.get("contactPerson"), input.get("emailId"), input.get("confirmEmailId"),
							input.get("countryEntitys"), input.get("mobileNumber"));
					createGeneralMatters.addTemporaryButton();
					createGeneralMatters.addTeamMembersTempClientsBtn();
					createGeneralMatters.nextPage();
					String[] teamMemberNames = { input.get("memberName1"), input.get("memberName2") };
					createGeneralMatters.selecting(teamMemberNames);
					createGeneralMatters.nextPage();
					createGeneralMatters.nextPage();
					createGeneralMatters.alertPopupYes();
					createGeneralMatters.addMatterSuccess();
					
				}finally {
					createGeneralMatters.generalMatterTab();
				}
			}
			// Mandatory Fields , Groups and Temp Clients With Document

			@Test(dataProvider = "getData59", priority = 58)
			public void tempClientsIndividualsandEntityWithDocuments(HashMap<String, String> input)
					throws InterruptedException {
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
					createGeneralMatters.addTemporaryButton();
					createGeneralMatters.addTeamMembersTempClientsBtn();
					createGeneralMatters.tempClientEntity(input.get("searchTextEntity"), input.get("firmName"),
							input.get("contactPerson"), input.get("emailId"), input.get("confirmEmailId"),
							input.get("countryEntitys"), input.get("mobileNumber"));
					createGeneralMatters.addTemporaryButton();
					createGeneralMatters.addTeamMembersTempClientsBtn();
					createGeneralMatters.nextPage();
					createGeneralMatters.nextPage();
					String[] documentNames = { input.get("documentName1"), input.get("documentName2") };
					createGeneralMatters.selecting(documentNames);
					createGeneralMatters.nextPage();
					createGeneralMatters.alertPopupYes();
					createGeneralMatters.addMatterSuccess();
				}finally {
					createGeneralMatters.generalMatterTab();
				}
			}
			// Mandatory Fields , Groups and Temp Clients With TM and Document

			@Test(dataProvider = "getData60", priority = 59)
			public void tempClientsIndividualsandEntityWithTMandDocuments(HashMap<String, String> input)
					throws InterruptedException {
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
					createGeneralMatters.addTemporaryButton();
					createGeneralMatters.addTeamMembersTempClientsBtn();
					createGeneralMatters.tempClientEntity(input.get("searchTextEntity"), input.get("firmName"),
							input.get("contactPerson"), input.get("emailId"), input.get("confirmEmailId"),
							input.get("countryEntitys"), input.get("mobileNumber"));
					createGeneralMatters.addTemporaryButton();
					createGeneralMatters.addTeamMembersTempClientsBtn();
					createGeneralMatters.nextPage();
					String[] teamMemberNames = { input.get("memberName1"), input.get("memberName2") };
					createGeneralMatters.selecting(teamMemberNames);
					createGeneralMatters.nextPage();
					String[] documentNames = { input.get("documentName1"), input.get("documentName2") };
					createGeneralMatters.selecting(documentNames);
					createGeneralMatters.nextPage();
					createGeneralMatters.alertPopupYes();
					createGeneralMatters.addMatterSuccess();
				}finally {
					createGeneralMatters.generalMatterTab();
				}
			}








	



	// All FieldswithGroupsandClientsIndividuals
		@DataProvider
		public Object[][] getData1() throws IOException {

			List<HashMap<String, String>> data = getJsonDataToMap(
					"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\NegativeScenarioCreateGeneralMatter.json");

			return new Object[][] { { data.get(0) } };

		}
		// All FieldswithGroupsandClientsIndividuals with TM
				@DataProvider
				public Object[][] getData2() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\NegativeScenarioCreateGeneralMatter.json");

					return new Object[][] { { data.get(1) } };

				}
				// All FieldswithGroupsandClientsIndividuals with Documents
				@DataProvider
				public Object[][] getData3() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\NegativeScenarioCreateGeneralMatter.json");

					return new Object[][] { { data.get(2) } };

				}
				// All FieldswithGroupsandClientsIndividuals withTM and  Documents
				@DataProvider
				public Object[][] getData4() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\NegativeScenarioCreateGeneralMatter.json");

					return new Object[][] { { data.get(3) } };

				}
				// All fields with groups and Entity clients
				@DataProvider
				public Object[][] getData5() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\NegativeScenarioCreateGeneralMatter.json");

					return new Object[][] { { data.get(4) } };

				}
				
				// All fields with groups and Entity clients with TM
				@DataProvider
				public Object[][] getData6() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\NegativeScenarioCreateGeneralMatter.json");

					return new Object[][] { { data.get(5) } };

				}
				// All fields with groups and Entity clients with Documents
				@DataProvider
				public Object[][] getData7() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\NegativeScenarioCreateGeneralMatter.json");

					return new Object[][] { { data.get(6) } };

				}
				
				// All fields with groups and Entity clients with Tm and Documents
				@DataProvider
				public Object[][] getData8() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\NegativeScenarioCreateGeneralMatter.json");

					return new Object[][] { { data.get(7) } };

				}
				// All fields with groups and Entity and Individual clients
				@DataProvider
				public Object[][] getData9() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\NegativeScenarioCreateGeneralMatter.json");

					return new Object[][] { { data.get(8) } };

				}
				//All fields with Individual and Entity with TM
				@DataProvider
				public Object[][] getData10() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\NegativeScenarioCreateGeneralMatter.json");

					return new Object[][] { { data.get(9) } };

				}
				
				//All fields with Individual and Entity with TM
				@DataProvider
				public Object[][] getData11() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\NegativeScenarioCreateGeneralMatter.json");

					return new Object[][] { { data.get(10) } };

				}
				
				//All fields with Individual and Entity with Documents
				@DataProvider
				public Object[][] getData12() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\NegativeScenarioCreateGeneralMatter.json");

					return new Object[][] { { data.get(11) } };

				}
				//All fields with Individual and Temp clients[both]
				@DataProvider
				public Object[][] getData13() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\NegativeScenarioCreateGeneralMatter.json");

					return new Object[][] { { data.get(12) } };

				}
				
				//All fields with Individual and Temp clients[both] with TM
				@DataProvider
				public Object[][] getData14() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\NegativeScenarioCreateGeneralMatter.json");

					return new Object[][] { { data.get(13) } };

				}
				//All fields with Individual and Temp clients[both] with documents
				@DataProvider
				public Object[][] getData15() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\NegativeScenarioCreateGeneralMatter.json");

					return new Object[][] { { data.get(14) } };

				}
				//All fields with Individual and Temp clients[both] with documents
				@DataProvider
				public Object[][] getData16() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\NegativeScenarioCreateGeneralMatter.json");

					return new Object[][] { { data.get(15) } };

				}
				
				//All fields with Individual and Temp client[Individual and Entity]
				@DataProvider
				public Object[][] getData17() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\NegativeScenarioCreateGeneralMatter.json");

					return new Object[][] { { data.get(16) } };

				}
				
				//All fields with Individual and Temp client[Individual and Entity] with TM
				@DataProvider
				public Object[][] getData18() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\NegativeScenarioCreateGeneralMatter.json");

					return new Object[][] { { data.get(17) } };

				}
				

				//All fields with Individual and Temp client[Individual and Entity] with Documents
				@DataProvider
				public Object[][] getData19() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\NegativeScenarioCreateGeneralMatter.json");

					return new Object[][] { { data.get(18) } };

				}
				//All fields with Individual and Temp client[Individual and Entity] with Documents
				@DataProvider
				public Object[][] getData20() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\NegativeScenarioCreateGeneralMatter.json");

					return new Object[][] { { data.get(19) } };

				}
				
				//All fields with Individual and Entity and Temp client[Individual and Entity] 
				@DataProvider
				public Object[][] getData21() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\NegativeScenarioCreateGeneralMatter.json");

					return new Object[][] { { data.get(20) } };

				}
				//All fields with Individual and Entity and Temp client[Individual and Entity] with TM
				@DataProvider
				public Object[][] getData22() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\NegativeScenarioCreateGeneralMatter.json");

					return new Object[][] { { data.get(21) } };

				}
				
				//All fields with Individual and Entity and Temp client[Individual and Entity] with Documents
				@DataProvider
				public Object[][] getData23() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\NegativeScenarioCreateGeneralMatter.json");

					return new Object[][] { { data.get(22) } };

				}
				
				//All fields with Individual and Entity and Temp client[Individual and Entity] with TM and Documents
				@DataProvider
				public Object[][] getData24() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\NegativeScenarioCreateGeneralMatter.json");

					return new Object[][] { { data.get(23) } };

				}
				//All fields with Individual   and Temp client[Individual ] 
				@DataProvider
				public Object[][] getData25() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\NegativeScenarioCreateGeneralMatter.json");

					return new Object[][] { { data.get(24) } };

				}
				
				//All fields with Individual   and Temp client[Individual ] with TM
				@DataProvider
				public Object[][] getData26() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\NegativeScenarioCreateGeneralMatter.json");

					return new Object[][] { { data.get(25) } };

			}
				//All fields with Individual   and Temp client[Individual ] with TM
				@DataProvider
				public Object[][] getData27() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\NegativeScenarioCreateGeneralMatter.json");

					return new Object[][] { { data.get(26) } };
				}
				
				@DataProvider
				public Object[][] getData28() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\NegativeScenarioCreateGeneralMatter.json");

					return new Object[][] { { data.get(27) } };
				}
				@DataProvider
				public Object[][] getData29() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\NegativeScenarioCreateGeneralMatter.json");

					return new Object[][] { { data.get(28) } };
				}
				@DataProvider
				public Object[][] getData30() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\NegativeScenarioCreateGeneralMatter.json");

					return new Object[][] { { data.get(29) } };
				}
				@DataProvider
				public Object[][] getData31() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\NegativeScenarioCreateGeneralMatter.json");

					return new Object[][] { { data.get(30) } };
				}
				@DataProvider
				public Object[][] getData32() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\NegativeScenarioCreateGeneralMatter.json");

					return new Object[][] { { data.get(31) } };
				}
				@DataProvider
				public Object[][] getData33() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\NegativeScenarioCreateGeneralMatter.json");

					return new Object[][] { { data.get(32) } };
				}
				
				@DataProvider
				public Object[][] getData34() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\NegativeScenarioCreateGeneralMatter.json");

					return new Object[][] { { data.get(33) } };
				}
				
				@DataProvider
				public Object[][] getData35() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\NegativeScenarioCreateGeneralMatter.json");

					return new Object[][] { { data.get(34) } };
				}
				
				@DataProvider
				public Object[][] getData36() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\NegativeScenarioCreateGeneralMatter.json");

					return new Object[][] { { data.get(35) } };
				}
				
				@DataProvider
				public Object[][] getData37() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\NegativeScenarioCreateGeneralMatter.json");

					return new Object[][] { { data.get(36) } };
				}
				
				@DataProvider
				public Object[][] getData38() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\NegativeScenarioCreateGeneralMatter.json");

					return new Object[][] { { data.get(37) } };
				}
				
				@DataProvider
				public Object[][] getData39() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\NegativeScenarioCreateGeneralMatter.json");

					return new Object[][] { { data.get(38) } };
				}
				
				@DataProvider
				public Object[][] getData40() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\NegativeScenarioCreateGeneralMatter.json");

					return new Object[][] { { data.get(39) } };
				}
				
				@DataProvider
				public Object[][] getData42() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\NegativeScenarioCreateGeneralMatter.json");

					return new Object[][] { { data.get(41) } };
				}
				
				@DataProvider
				public Object[][] getData43() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\NegativeScenarioCreateGeneralMatter.json");

					return new Object[][] { { data.get(42) } };
				}
				
				@DataProvider
				public Object[][] getData44() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\NegativeScenarioCreateGeneralMatter.json");

					return new Object[][] { { data.get(43) } };
				}
				
				
				@DataProvider
				public Object[][] getData45() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\NegativeScenarioCreateGeneralMatter.json");

					return new Object[][] { { data.get(44) } };
				}
				
				
				@DataProvider
				public Object[][] getData46() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\NegativeScenarioCreateGeneralMatter.json");

					return new Object[][] { { data.get(45) } };
				}
				
				@DataProvider
				public Object[][] getData47() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\NegativeScenarioCreateGeneralMatter.json");

					return new Object[][] { { data.get(46) } };
				}
				
				
				@DataProvider
				public Object[][] getData48() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\NegativeScenarioCreateGeneralMatter.json");

					return new Object[][] { { data.get(47) } };
				}
				
				
				@DataProvider
				public Object[][] getData49() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\NegativeScenarioCreateGeneralMatter.json");

					return new Object[][] { { data.get(48) } };
				}
				
				@DataProvider
				public Object[][] getData50() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\NegativeScenarioCreateGeneralMatter.json");

					return new Object[][] { { data.get(49) } };
				}
				
				@DataProvider
				public Object[][] getData51() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\NegativeScenarioCreateGeneralMatter.json");

					return new Object[][] { { data.get(50) } };
				}
				
				@DataProvider
				public Object[][] getData52() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\NegativeScenarioCreateGeneralMatter.json");

					return new Object[][] { { data.get(51) } };
				}
				
				@DataProvider
				public Object[][] getData53() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\NegativeScenarioCreateGeneralMatter.json");

					return new Object[][] { { data.get(52) } };
				}
				
				@DataProvider
				public Object[][] getData54() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\NegativeScenarioCreateGeneralMatter.json");

					return new Object[][] { { data.get(53) } };
				}
				
				@DataProvider
				public Object[][] getData55() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\NegativeScenarioCreateGeneralMatter.json");

					return new Object[][] { { data.get(54) } };
				}
				
				@DataProvider
				public Object[][] getData56() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\NegativeScenarioCreateGeneralMatter.json");

					return new Object[][] { { data.get(55) } };
				}
				
				@DataProvider
				public Object[][] getData57() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\NegativeScenarioCreateGeneralMatter.json");

					return new Object[][] { { data.get(56) } };
				}
				
				@DataProvider
				public Object[][] getData58() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\NegativeScenarioCreateGeneralMatter.json");

					return new Object[][] { { data.get(57) } };
				}
				
				@DataProvider
				public Object[][] getData59() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\NegativeScenarioCreateGeneralMatter.json");

					return new Object[][] { { data.get(58) } };
				}
				
				@DataProvider
				public Object[][] getData60() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\NegativeScenarioCreateGeneralMatter.json");

					return new Object[][] { { data.get(50) } };
				}
}
