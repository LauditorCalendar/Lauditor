package com.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pom.ViewGeneralMatterUpdateGroupsPOM;

public class ViewGeneralMatterUpdateGroupsTest extends BaseClass {
	
	//Select Groups and UnSelect Group and Save
	
	@Test(dataProvider = "getData0", priority= 0)
	public void selectGroupandUnSelectGroups(HashMap<String, String> input) throws InterruptedException {
		viewGeneralMatters.leftMatterTab();
		viewGeneralMatters.generalMatterIcon();
		viewGeneralMatterUpdateGroups.searchInputandUpdateGroupsMatter(input.get("CaseName"));
		String[] selectGroupNames = {input.get("selectgroupName1"), input.get("selectgroupName2")};
		viewGeneralMatterUpdateGroups.selectGrouponRightSide(selectGroupNames);
		viewGeneralMatterUpdateGroups.selectedGroupNameIsDisplay(selectGroupNames);
		String[] unSelectgroupNames = { input.get("unSelectgroupName1"), input.get("unSelectgroupName2") };
		viewGeneralMatterUpdateGroups.unselectedGroupsOnLeftSide(unSelectgroupNames);
		viewGeneralMatterUpdateGroups.pageDown();
		viewGeneralMatterUpdateGroups.submitUpdateGroup();
		viewGeneralMatterUpdateGroups.alertYesButton();
		viewGeneralMatterUpdateGroups.viewMatterButton();
	}
		
		
		// Reverse way of selection of groups - first unselect then select the groups
		
		@Test(dataProvider = "getData1", priority= 1)
		public void UnselectGroupandSelectGroups(HashMap<String, String> input) throws InterruptedException {
			viewGeneralMatters.leftMatterTab();
			viewGeneralMatters.generalMatterIcon();
			viewGeneralMatterUpdateGroups.searchInputandUpdateGroupsMatter(input.get("CaseName"));
			String[] unSelectgroupNames = { input.get("unSelectgroupName1"), input.get("unSelectgroupName2") };
			viewGeneralMatterUpdateGroups.unselectedGroupsOnLeftSide(unSelectgroupNames);
			String[] selectGroupNames = {input.get("selectgroupName1"), input.get("selectgroupName2")};
			viewGeneralMatterUpdateGroups.selectGrouponRightSide(selectGroupNames);
			viewGeneralMatterUpdateGroups.selectedGroupNameIsDisplay(selectGroupNames);
			viewGeneralMatterUpdateGroups.pageDown();
			viewGeneralMatterUpdateGroups.submitUpdateGroup();
			viewGeneralMatterUpdateGroups.alertYesButton();
			viewGeneralMatterUpdateGroups.viewMatterButton();

}
		
		// Select Multiple Groups and Save
		@Test(dataProvider = "getData2", priority= 2)
		public void selectMultipleGroups(HashMap<String, String> input) throws InterruptedException {
			viewGeneralMatters.leftMatterTab();
			viewGeneralMatters.generalMatterIcon();
			viewGeneralMatterUpdateGroups.searchInputandUpdateGroupsMatter(input.get("CaseName"));
			String[] selectGroupNames = {input.get("selectgroupName1"), input.get("selectgroupName2")};
			viewGeneralMatterUpdateGroups.selectGrouponRightSide(selectGroupNames);
			viewGeneralMatterUpdateGroups.selectedGroupNameIsDisplay(selectGroupNames);
			viewGeneralMatterUpdateGroups.pageDown();
			viewGeneralMatterUpdateGroups.submitUpdateGroup();
			viewGeneralMatterUpdateGroups.alertYesButton();
			viewGeneralMatterUpdateGroups.viewMatterButton();

}
		// UnSelect Multiple Groups and Save
		@Test(dataProvider = "getData3", priority= 3)
		public void unSelectMultipleGroups(HashMap<String, String> input) throws InterruptedException {
			viewGeneralMatters.leftMatterTab();
			viewGeneralMatters.generalMatterIcon();
			viewGeneralMatterUpdateGroups.searchInputandUpdateGroupsMatter(input.get("CaseName"));
			String[] unSelectgroupNames = {input.get("unSelectgroupName1"), input.get("unSelectgroupName2"), input.get("unSelectgroupName3"),input.get("unSelectgroupName3") };
			viewGeneralMatterUpdateGroups.unselectedGroupsOnLeftSide(unSelectgroupNames);
			viewGeneralMatterUpdateGroups.pageDown();
			viewGeneralMatterUpdateGroups.submitUpdateGroup();
			viewGeneralMatterUpdateGroups.alertYesButton();
			viewGeneralMatterUpdateGroups.viewMatterButton();
}
		
		// Alert message should display mandatory clients
		@Test(dataProvider = "getData4", priority = 4)
		public void alertMessageDisplayForClients(HashMap<String, String> input) throws InterruptedException {
			viewGeneralMatters.leftMatterTab();
			viewGeneralMatters.generalMatterIcon();
			viewGeneralMatterUpdateGroups.searchInputandUpdateGroupsMatter(input.get("CaseName"));
			viewGeneralMatterUpdateGroups.alertIsPresent(input.get("groupName"));
			viewGeneralMatterUpdateGroups.pageDown();
			viewGeneralMatterUpdateGroups.submitCancelGroup();

		}
		
		// Check GroupNames are Display Correct or not 
		@Test(dataProvider = "getData5", priority = 5)
		public void selectedGroupNamesareDisplay(HashMap<String, String> input) throws InterruptedException {
			viewGeneralMatters.leftMatterTab();
			viewGeneralMatters.generalMatterIcon();	
			viewGeneralMatterUpdateGroups.searchInputandUpdateGroupsMatter(input.get("CaseName"));
			String[] selectGroupNames = { input.get("selectgroupName1"), input.get("selectgroupName2") };
			viewGeneralMatterUpdateGroups.selectedGroupNameIsDisplay(selectGroupNames);
			viewGeneralMatterUpdateGroups.pageDown();
			viewGeneralMatterUpdateGroups.submitCancelGroup();




		}








		


	
	
	//Select Groups and unselect groups and Save
	@DataProvider
	public Object[][] getData0() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\ViewGeneralMatterUpdateGroups.json");

		return new Object[][] { { data.get(0) } };
	}
		
		//Select and UnSelect Groups and Save
		@DataProvider
		public Object[][] getData1() throws IOException {

			List<HashMap<String, String>> data = getJsonDataToMap(
					"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\ViewGeneralMatterUpdateGroups.json");

			return new Object[][] { { data.get(1) } };
		}
		//Select multiple Groups and Save
				@DataProvider
				public Object[][] getData2() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\ViewGeneralMatterUpdateGroups.json");

					return new Object[][] { { data.get(2) } };
				
	}
				//UnSelect multiple Groups and Save
				@DataProvider
				public Object[][] getData3() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\ViewGeneralMatterUpdateGroups.json");

					return new Object[][] { { data.get(3) } };
				
				
}
				//Alert is display or not
				@DataProvider
				public Object[][] getData4() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\ViewGeneralMatterUpdateGroups.json");

					return new Object[][] { { data.get(4) } };
				
				
}
				//Alert is display or not
				@DataProvider
				public Object[][] getData5() throws IOException {

					List<HashMap<String, String>> data = getJsonDataToMap(
							"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\ViewGeneralMatterUpdateGroups.json");

					return new Object[][] { { data.get(5) } };
				
				
}
}
