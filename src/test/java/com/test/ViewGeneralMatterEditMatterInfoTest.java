package com.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.BaseClass;

public class ViewGeneralMatterEditMatterInfoTest extends BaseClass{

	// Mandatory Fields with start Date
	@Test(dataProvider = "getData0", priority = 0)
	public void editMatterInfoMandatorywithSD(HashMap<String,String>input) throws InterruptedException {
		viewGeneralMatters.leftMatterTab();
		viewGeneralMatters.generalMatterIcon();
		viewGeneralMatters.searchBarFieldsandActionBtn(input.get("matterName"));
		viewGeneralMatters.clickActionBtn();
		Thread.sleep(3000);
		viewGeneralMatters.editMatterInfoPageBtn();
		viewGeneralMatters.editCaseTitle(input.get("caseTitle"));
		viewGeneralMatters.editCaseNumber(input.get("caseNumber"));
		viewGeneralMatters.startDate(input.get("startDate"));
		viewGeneralMatters.scrollDown();
		viewGeneralMatters.editMatterSave();
		viewGeneralMatters.successPopupEditMatterInfo();


	}

	// Mandatory Fields with Close Date
	@Test(dataProvider="getData1", priority = 1)
	public void editMatterInfoMandatorywithcD(HashMap<String,String>input) throws InterruptedException {
		viewGeneralMatters.leftMatterTab();
		viewGeneralMatters.generalMatterIcon();
		viewGeneralMatters.searchBarFieldsandActionBtn(input.get("matterName"));
		viewGeneralMatters.clickActionBtn();
		viewGeneralMatters.editMatterInfoPageBtn();
		viewGeneralMatters.editCaseTitle(input.get("caseTitle"));
		viewGeneralMatters.editCaseNumber(input.get("caseNumber"));
		viewGeneralMatters.closeDate(input.get("closeDate"));
		viewGeneralMatters.scrollDown();
		viewGeneralMatters.editMatterSave();
		viewGeneralMatters.successPopupEditMatterInfo();		
	}

	//Mandatory Fields with Description
	@Test(dataProvider="getData2", priority = 2)
	public void editMatterInfoMandatorywithDescription(HashMap<String,String>input) throws InterruptedException {
		viewGeneralMatters.leftMatterTab();
		viewGeneralMatters.generalMatterIcon();
		viewGeneralMatters.searchBarFieldsandActionBtn(input.get("matterName"));
		viewGeneralMatters.clickActionBtn();
		viewGeneralMatters.editMatterInfoPageBtn();
		viewGeneralMatters.editCaseTitle(input.get("caseTitle"));
		viewGeneralMatters.editCaseNumber(input.get("caseNumber"));
		viewGeneralMatters.scrollDown();
		viewGeneralMatters.editDescription(input.get("Description"));
		viewGeneralMatters.editMatterSave();
		viewGeneralMatters.successPopupEditMatterInfo();

	}

	//Mandatory Fields with Matter Type
	@Test(dataProvider="getData3", priority = 3)
	public void editMatterInfoMandatorywithMatterType(HashMap<String,String>input) throws InterruptedException {
		viewGeneralMatters.leftMatterTab();
		viewGeneralMatters.generalMatterIcon();
		viewGeneralMatters.searchBarFieldsandActionBtn(input.get("matterName"));
		viewGeneralMatters.clickActionBtn();
		viewGeneralMatters.editMatterInfoPageBtn();
		viewGeneralMatters.editCaseTitle(input.get("caseTitle"));
		viewGeneralMatters.editCaseNumber(input.get("caseNumber"));
		viewGeneralMatters.editMatterType(input.get("matterType"));
		viewGeneralMatters.scrollDown();
		viewGeneralMatters.editMatterSave();
		viewGeneralMatters.successPopupEditMatterInfo();

	}
	// Mandatory Fields with Priority
	@Test(dataProvider="getData4", priority = 4)
	public void editMatterInfoMandatorywithPriority(HashMap<String,String>input) throws InterruptedException {
		viewGeneralMatters.leftMatterTab();
		viewGeneralMatters.generalMatterIcon();
		viewGeneralMatters.searchBarFieldsandActionBtn(input.get("matterName"));
		viewGeneralMatters.clickActionBtn();
		viewGeneralMatters.editMatterInfoPageBtn();
		viewGeneralMatters.editCaseTitle(input.get("caseTitle"));
		viewGeneralMatters.editCaseNumber(input.get("caseNumber"));
		viewGeneralMatters.priorityChange(input.get("Priority"));
		viewGeneralMatters.scrollDown();
		viewGeneralMatters.editMatterSave();
		viewGeneralMatters.successPopupEditMatterInfo();

	}
	// Mandatory Fields with Status

	@Test(dataProvider="getData5", priority = 5)
	public void editMatterInfoMandatorywithStatus(HashMap<String,String>input) throws InterruptedException {
		viewGeneralMatters.leftMatterTab();
		viewGeneralMatters.generalMatterIcon();
		viewGeneralMatters.searchBarFieldsandActionBtn(input.get("matterName"));
		viewGeneralMatters.clickActionBtn();
		viewGeneralMatters.editMatterInfoPageBtn();
		viewGeneralMatters.editCaseTitle(input.get("caseTitle"));
		viewGeneralMatters.editCaseNumber(input.get("caseNumber"));
		viewGeneralMatters.statusPending();
		viewGeneralMatters.scrollDown();
		viewGeneralMatters.editMatterSave();
		viewGeneralMatters.successPopupEditMatterInfo();

	}
	// Mandatory Fields , Start Date with Close Date
	@Test(dataProvider="getData6", priority = 6)
	public void editMatterInfoMandatorywithSDandCD(HashMap<String,String>input) throws InterruptedException {
		viewGeneralMatters.leftMatterTab();
		viewGeneralMatters.generalMatterIcon();
		viewGeneralMatters.searchBarFieldsandActionBtn(input.get("matterName"));
		viewGeneralMatters.clickActionBtn();
		viewGeneralMatters.editMatterInfoPageBtn();
		viewGeneralMatters.editCaseTitle(input.get("caseTitle"));
		viewGeneralMatters.editCaseNumber(input.get("caseNumber"));
		viewGeneralMatters.startDate(input.get("startDate"));
		viewGeneralMatters.closeDate(input.get("closeDate"));
		viewGeneralMatters.scrollDown();
		viewGeneralMatters.editMatterSave();
		viewGeneralMatters.successPopupEditMatterInfo();


	}
	// Mandatory Fields , Start Date with Description
	@Test(dataProvider="getData7", priority = 7)
	public void editMatterInfoMandatorywithSDwithDescription(HashMap<String,String>input) throws InterruptedException {
		viewGeneralMatters.leftMatterTab();
		viewGeneralMatters.generalMatterIcon();
		viewGeneralMatters.searchBarFieldsandActionBtn(input.get("matterName"));
		viewGeneralMatters.clickActionBtn();
		viewGeneralMatters.editMatterInfoPageBtn();
		viewGeneralMatters.editCaseTitle(input.get("caseTitle"));
		viewGeneralMatters.editCaseNumber(input.get("caseNumber"));
		viewGeneralMatters.startDate(input.get("startDate"));
		viewGeneralMatters.editDescription(input.get("Description"));
		viewGeneralMatters.scrollDown();
		viewGeneralMatters.editMatterSave();
		viewGeneralMatters.successPopupEditMatterInfo();
	}
	// Mandatory Fields , Start Date with Matter Type
	@Test(dataProvider="getData8", priority = 8)
	public void editMatterInfoMandatorywithSDwithMatterType(HashMap<String,String>input) throws InterruptedException {
		viewGeneralMatters.leftMatterTab();
		viewGeneralMatters.generalMatterIcon();
		viewGeneralMatters.searchBarFieldsandActionBtn(input.get("matterName"));
		viewGeneralMatters.clickActionBtn();
		viewGeneralMatters.editMatterInfoPageBtn();
		viewGeneralMatters.editCaseTitle(input.get("caseTitle"));
		viewGeneralMatters.editCaseNumber(input.get("caseNumber"));
		viewGeneralMatters.startDate(input.get("startDate"));
		viewGeneralMatters.editMatterType(input.get("matterType"));
		viewGeneralMatters.scrollDown();
		viewGeneralMatters.editMatterSave();
		viewGeneralMatters.successPopupEditMatterInfo();

	}
	//Mandatory fields, Start Date with priority

	@Test(dataProvider="getData9", priority = 9)
	public void editMatterInfoMandatorywithSDwithPriority(HashMap<String,String>input) throws InterruptedException {
		viewGeneralMatters.leftMatterTab();
		viewGeneralMatters.generalMatterIcon();
		viewGeneralMatters.searchBarFieldsandActionBtn(input.get("matterName"));
		viewGeneralMatters.clickActionBtn();
		viewGeneralMatters.editMatterInfoPageBtn();
		viewGeneralMatters.editCaseTitle(input.get("caseTitle"));
		viewGeneralMatters.editCaseNumber(input.get("caseNumber"));
		viewGeneralMatters.startDate(input.get("startDate"));
		viewGeneralMatters.priorityChange(input.get("priority"));
		viewGeneralMatters.scrollDown();
		viewGeneralMatters.editMatterSave();
		viewGeneralMatters.successPopupEditMatterInfo();

	}
	//Mandatory fields, Start Date with Status
	@Test(dataProvider="getData10", priority = 10)
	public void editMatterInfoMandatorywithSDwithStatus(HashMap<String,String>input) throws InterruptedException {
		viewGeneralMatters.leftMatterTab();
		viewGeneralMatters.generalMatterIcon();
		viewGeneralMatters.searchBarFieldsandActionBtn(input.get("matterName"));
		viewGeneralMatters.clickActionBtn();
		viewGeneralMatters.editMatterInfoPageBtn();
		viewGeneralMatters.editCaseTitle(input.get("caseTitle"));
		viewGeneralMatters.editCaseNumber(input.get("caseNumber"));
		viewGeneralMatters.startDate(input.get("startDate"));
		viewGeneralMatters.statusActive();
		viewGeneralMatters.scrollDown();
		viewGeneralMatters.editMatterSave();
		viewGeneralMatters.successPopupEditMatterInfo();
	}
	//Mandatory fields, Close Date with Description
	@Test(dataProvider="getData11", priority = 11)
	public void editMatterInfoMandatorywithCDwithDes(HashMap<String,String>input) throws InterruptedException {
		viewGeneralMatters.leftMatterTab();
		viewGeneralMatters.generalMatterIcon();
		viewGeneralMatters.searchBarFieldsandActionBtn(input.get("matterName"));
		viewGeneralMatters.clickActionBtn();
		viewGeneralMatters.editMatterInfoPageBtn();
		viewGeneralMatters.editCaseTitle(input.get("caseTitle"));
		viewGeneralMatters.editCaseNumber(input.get("caseNumber"));
		viewGeneralMatters.closeDate(input.get("closeDate"));
		viewGeneralMatters.editDescription(input.get("Description"));
		viewGeneralMatters.scrollDown();
		viewGeneralMatters.editMatterSave();
		viewGeneralMatters.successPopupEditMatterInfo();
	}

	//Mandatory fields, Close Date with Matter Type
	@Test(dataProvider="getData12", priority = 12)
	public void editMatterInfoMandatorywithCDwithMatterType(HashMap<String,String>input) throws InterruptedException {
		viewGeneralMatters.leftMatterTab();
		viewGeneralMatters.generalMatterIcon();
		viewGeneralMatters.searchBarFieldsandActionBtn(input.get("matterName"));
		viewGeneralMatters.clickActionBtn();
		viewGeneralMatters.editMatterInfoPageBtn();
		viewGeneralMatters.editCaseTitle(input.get("caseTitle"));
		viewGeneralMatters.editCaseNumber(input.get("caseNumber"));
		viewGeneralMatters.closeDate(input.get("closeDate"));
		viewGeneralMatters.editMatterType(input.get("matterType"));
		viewGeneralMatters.scrollDown();
		viewGeneralMatters.editMatterSave();
		viewGeneralMatters.successPopupEditMatterInfo();
	}

	//Mandatory fields, Close Date with priority
	@Test(dataProvider="getData13", priority = 13)
	public void editMatterInfoMandatorywithCDwithPriority(HashMap<String,String>input) throws InterruptedException {
		viewGeneralMatters.leftMatterTab();
		viewGeneralMatters.generalMatterIcon();
		viewGeneralMatters.searchBarFieldsandActionBtn(input.get("matterName"));
		viewGeneralMatters.clickActionBtn();
		viewGeneralMatters.editMatterInfoPageBtn();
		viewGeneralMatters.editCaseTitle(input.get("caseTitle"));
		viewGeneralMatters.editCaseNumber(input.get("caseNumber"));
		viewGeneralMatters.closeDate(input.get("closeDate"));
		viewGeneralMatters.priorityChange(input.get("Priority"));
		viewGeneralMatters.scrollDown();
		viewGeneralMatters.editMatterSave();
		viewGeneralMatters.successPopupEditMatterInfo();
	}

	//Mandatory fields, Close Date with Status
	@Test(dataProvider="getData14", priority = 14)
	public void editMatterInfoMandatorywithCDwithStatus(HashMap<String,String>input) throws InterruptedException {
		viewGeneralMatters.leftMatterTab();
		viewGeneralMatters.generalMatterIcon();
		viewGeneralMatters.searchBarFieldsandActionBtn(input.get("matterName"));
		viewGeneralMatters.clickActionBtn();
		viewGeneralMatters.editMatterInfoPageBtn();
		viewGeneralMatters.editCaseTitle(input.get("caseTitle"));
		viewGeneralMatters.editCaseNumber(input.get("caseNumber"));
		viewGeneralMatters.closeDate(input.get("closeDate"));
		viewGeneralMatters.statusPending();
		viewGeneralMatters.scrollDown();
		viewGeneralMatters.editMatterSave();
		viewGeneralMatters.successPopupEditMatterInfo();
	}

	//Mandatory fields, Description with Matter Type
	@Test(dataProvider="getData15", priority = 15)
	public void editMatterInfoMandatorywithDeswithMatterType(HashMap<String,String>input) throws InterruptedException {
		viewGeneralMatters.leftMatterTab();
		viewGeneralMatters.generalMatterIcon();
		viewGeneralMatters.searchBarFieldsandActionBtn(input.get("matterName"));
		viewGeneralMatters.clickActionBtn();
		viewGeneralMatters.editMatterInfoPageBtn();
		viewGeneralMatters.editCaseTitle(input.get("caseTitle"));
		viewGeneralMatters.editCaseNumber(input.get("caseNumber"));
		viewGeneralMatters.editDescription(input.get("Description"));
		viewGeneralMatters.editMatterType(input.get("matterType"));
		viewGeneralMatters.scrollDown();
		viewGeneralMatters.editMatterSave();
		viewGeneralMatters.successPopupEditMatterInfo();
	}
	//Mandatory fields, Description with Priority
	@Test(dataProvider="getData16", priority = 16)
	public void editMatterInfoMandatorywithDeswithPriority(HashMap<String,String>input) throws InterruptedException {
		viewGeneralMatters.leftMatterTab();
		viewGeneralMatters.generalMatterIcon();
		viewGeneralMatters.searchBarFieldsandActionBtn(input.get("matterName"));
		viewGeneralMatters.clickActionBtn();
		viewGeneralMatters.editMatterInfoPageBtn();
		viewGeneralMatters.editCaseTitle(input.get("caseTitle"));
		viewGeneralMatters.editCaseNumber(input.get("caseNumber"));
		viewGeneralMatters.editDescription(input.get("Description"));
		viewGeneralMatters.priorityChange(input.get("Priority"));
		viewGeneralMatters.scrollDown();
		viewGeneralMatters.editMatterSave();
		viewGeneralMatters.successPopupEditMatterInfo();
	}
	//Mandatory fields, Description with Status
	@Test(dataProvider="getData17", priority = 17)
	public void editMatterInfoMandatorywithDeswithStatus(HashMap<String,String>input) throws InterruptedException {
		viewGeneralMatters.leftMatterTab();
		viewGeneralMatters.generalMatterIcon();
		viewGeneralMatters.searchBarFieldsandActionBtn(input.get("matterName"));
		viewGeneralMatters.clickActionBtn();
		viewGeneralMatters.editMatterInfoPageBtn();
		viewGeneralMatters.editCaseTitle(input.get("caseTitle"));
		viewGeneralMatters.editCaseNumber(input.get("caseNumber"));
		viewGeneralMatters.editDescription(input.get("Description"));
		viewGeneralMatters.statusActive();
		viewGeneralMatters.scrollDown();
		viewGeneralMatters.editMatterSave();
		viewGeneralMatters.successPopupEditMatterInfo();
	}

	//Mandatory fields, Matter Type with Priority
	@Test(dataProvider="getData18", priority = 18)
	public void editMatterInfoMandatorywithMatterTypewithPriority(HashMap<String,String>input) throws InterruptedException {
		viewGeneralMatters.leftMatterTab();
		viewGeneralMatters.generalMatterIcon();
		viewGeneralMatters.searchBarFieldsandActionBtn(input.get("matterName"));
		viewGeneralMatters.clickActionBtn();
		viewGeneralMatters.editMatterInfoPageBtn();
		viewGeneralMatters.editCaseTitle(input.get("caseTitle"));
		viewGeneralMatters.editCaseNumber(input.get("caseNumber"));
		viewGeneralMatters.editMatterType(input.get("matterType"));
		viewGeneralMatters.priorityChange(input.get("Priority"));
		viewGeneralMatters.scrollDown();
		viewGeneralMatters.editMatterSave();
		viewGeneralMatters.successPopupEditMatterInfo();
	}

	//Mandatory fields, Matter Type with Status
	@Test(dataProvider="getData19", priority = 19)
	public void editMatterInfoMandatorywithMatterTypewithStatus(HashMap<String,String>input) throws InterruptedException {
		viewGeneralMatters.leftMatterTab();
		viewGeneralMatters.generalMatterIcon();
		viewGeneralMatters.searchBarFieldsandActionBtn(input.get("matterName"));
		viewGeneralMatters.clickActionBtn();
		viewGeneralMatters.editMatterInfoPageBtn();
		viewGeneralMatters.editCaseTitle(input.get("caseTitle"));
		viewGeneralMatters.editCaseNumber(input.get("caseNumber"));
		viewGeneralMatters.editMatterType(input.get("matterType"));
		viewGeneralMatters.statusPending();
		viewGeneralMatters.scrollDown();
		viewGeneralMatters.editMatterSave();
		viewGeneralMatters.successPopupEditMatterInfo();
	}

	//Mandatory fields, Priority with Status
	@Test(dataProvider="getData20", priority = 20)
	public void editMatterInfoMandatorywithPrioritywithStatus(HashMap<String,String>input) throws InterruptedException {
		viewGeneralMatters.leftMatterTab();
		viewGeneralMatters.generalMatterIcon();
		viewGeneralMatters.searchBarFieldsandActionBtn(input.get("matterName"));
		viewGeneralMatters.clickActionBtn();
		viewGeneralMatters.editMatterInfoPageBtn();
		viewGeneralMatters.editCaseTitle(input.get("caseTitle"));
		viewGeneralMatters.editCaseNumber(input.get("caseNumber"));
		viewGeneralMatters.priorityChange(input.get("Priority"));
		viewGeneralMatters.statusActive();
		viewGeneralMatters.scrollDown();
		viewGeneralMatters.editMatterSave();
		viewGeneralMatters.successPopupEditMatterInfo();
	}

	//Mandatory fields, Start Date, close Date and Description
	@Test(dataProvider="getData21", priority = 21)
	public void editMatterInfoMandatorywithSDCDandDes(HashMap<String,String>input) throws InterruptedException {
		viewGeneralMatters.leftMatterTab();
		viewGeneralMatters.generalMatterIcon();
		viewGeneralMatters.searchBarFieldsandActionBtn(input.get("matterName"));
		viewGeneralMatters.clickActionBtn();
		viewGeneralMatters.editMatterInfoPageBtn();
		viewGeneralMatters.editCaseTitle(input.get("caseTitle"));
		viewGeneralMatters.editCaseNumber(input.get("caseNumber"));
		viewGeneralMatters.startDate(input.get("startDate"));
		viewGeneralMatters.closeDate(input.get("closeDate"));
		viewGeneralMatters.editDescription(input.get("Description"));
		viewGeneralMatters.scrollDown();
		viewGeneralMatters.editMatterSave();
		viewGeneralMatters.successPopupEditMatterInfo();
	}

	//Mandatory fields, Start Date, close Date and Matter Type 
	@Test(dataProvider="getData22", priority = 22)
	public void editMatterInfoMandatorywithSDCDandMatterType(HashMap<String,String>input) throws InterruptedException {
		viewGeneralMatters.leftMatterTab();
		viewGeneralMatters.generalMatterIcon();
		viewGeneralMatters.searchBarFieldsandActionBtn(input.get("matterName"));
		viewGeneralMatters.clickActionBtn();
		viewGeneralMatters.editMatterInfoPageBtn();
		viewGeneralMatters.editCaseTitle(input.get("caseTitle"));
		viewGeneralMatters.editCaseNumber(input.get("caseNumber"));
		viewGeneralMatters.startDate(input.get("startDate"));
		viewGeneralMatters.closeDate(input.get("closeDate"));
		viewGeneralMatters.editMatterType(input.get("matterType"));
		viewGeneralMatters.scrollDown();
		viewGeneralMatters.editMatterSave();
		viewGeneralMatters.successPopupEditMatterInfo();
	}

	//Mandatory fields, Start Date, close Date and Priority
	@Test(dataProvider="getData23", priority = 23)
	public void editMatterInfoMandatorywithSDCDandPriority(HashMap<String,String>input) throws InterruptedException {
		viewGeneralMatters.leftMatterTab();
		viewGeneralMatters.generalMatterIcon();
		viewGeneralMatters.searchBarFieldsandActionBtn(input.get("matterName"));
		viewGeneralMatters.clickActionBtn();
		viewGeneralMatters.editMatterInfoPageBtn();
		viewGeneralMatters.editCaseTitle(input.get("caseTitle"));
		viewGeneralMatters.editCaseNumber(input.get("caseNumber"));
		viewGeneralMatters.startDate(input.get("startDate"));
		viewGeneralMatters.closeDate(input.get("closeDate"));
		viewGeneralMatters.priorityChange(input.get("Priority"));
		viewGeneralMatters.scrollDown();
		viewGeneralMatters.editMatterSave();
		viewGeneralMatters.successPopupEditMatterInfo();
	}

	//Mandatory fields, Start Date, close Date and Description, Matter Type, Priority, Status
	@Test(dataProvider="getData24", priority = 24)
	public void editMatterInfoMandatorywithSDCDandDesMTypePriorityStatus(HashMap<String,String>input) throws InterruptedException {
		viewGeneralMatters.leftMatterTab();
		viewGeneralMatters.generalMatterIcon();
		viewGeneralMatters.searchBarFieldsandActionBtn(input.get("matterName"));
		viewGeneralMatters.clickActionBtn();
		viewGeneralMatters.editMatterInfoPageBtn();
		viewGeneralMatters.editCaseTitle(input.get("caseTitle"));
		viewGeneralMatters.editCaseNumber(input.get("caseNumber"));
		viewGeneralMatters.startDate(input.get("startDate"));
		viewGeneralMatters.closeDate(input.get("closeDate"));
		viewGeneralMatters.editDescription(input.get("Description"));
		viewGeneralMatters.priorityChange(input.get("Priority"));
		viewGeneralMatters.editMatterType(input.get("matterType"));
		viewGeneralMatters.statusActive();
		viewGeneralMatters.scrollDown();
		viewGeneralMatters.editMatterSave();
		viewGeneralMatters.successPopupEditMatterInfo();
	}

	//Mandatory fields only
	@Test(dataProvider="getData25", priority = 25)
	public void editMatterInfoMandatoryOnly(HashMap<String,String>input) throws InterruptedException {
		viewGeneralMatters.leftMatterTab();
		viewGeneralMatters.generalMatterIcon();
		viewGeneralMatters.searchBarFieldsandActionBtn(input.get("matterName"));
		viewGeneralMatters.clickActionBtn();
		viewGeneralMatters.editMatterInfoPageBtn();
		viewGeneralMatters.editCaseTitle(input.get("caseTitle"));
		viewGeneralMatters.editCaseNumber(input.get("caseNumber"));
	}











	// Mandatory Fields with start Date

	@DataProvider
	public Object[][] getData0() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\ViewGeneralMatterEditMatterInfo.json");

		return new Object[][] { { data.get(0) } };

	}
	//Mandatory fields with close date

	@DataProvider
	public Object[][] getData1() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\ViewGeneralMatterEditMatterInfo.json");

		return new Object[][] { { data.get(1) } };
	}

	//Mandatory fields with description
	@DataProvider
	public Object[][] getData2() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\ViewGeneralMatterEditMatterInfo.json");

		return new Object[][] { { data.get(2) } };
	}

	//Mandatory fields with Matter Type
	@DataProvider
	public Object[][] getData3() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\ViewGeneralMatterEditMatterInfo.json");

		return new Object[][] { { data.get(3) } };
	}

	//Mandatory fields with Priority
	@DataProvider
	public Object[][] getData4() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\ViewGeneralMatterEditMatterInfo.json");

		return new Object[][] { { data.get(4) } };
	}

	//Mandatory fields with Status
	@DataProvider
	public Object[][] getData5() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\ViewGeneralMatterEditMatterInfo.json");

		return new Object[][] { { data.get(5) } };
	}

	//Mandatory fields with Start Date and Close Date
	@DataProvider
	public Object[][] getData6() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\ViewGeneralMatterEditMatterInfo.json");

		return new Object[][] { { data.get(6) } };
	}

	//Mandatory fields with Start Date and Description
	@DataProvider
	public Object[][] getData7() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\ViewGeneralMatterEditMatterInfo.json");

		return new Object[][] { { data.get(7) } };
	}

	//Mandatory fields with Start Date and Matter Type
	@DataProvider
	public Object[][] getData8() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\ViewGeneralMatterEditMatterInfo.json");

		return new Object[][] { { data.get(8) } };
	}

	//Mandatory fields with Start Date and Matter Type
	@DataProvider
	public Object[][] getData9() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\ViewGeneralMatterEditMatterInfo.json");

		return new Object[][] { { data.get(9) } };
	}
	//Mandatory fields with Start Date and Status
	@DataProvider
	public Object[][] getData10() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\ViewGeneralMatterEditMatterInfo.json");

		return new Object[][] { { data.get(10) } };
	}
	//Mandatory fields with Close Date and Description
	@DataProvider
	public Object[][] getData11() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\ViewGeneralMatterEditMatterInfo.json");

		return new Object[][] { { data.get(11) } };
	}

	//Mandatory fields with Close Date and Matter Type
	@DataProvider
	public Object[][] getData12() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\ViewGeneralMatterEditMatterInfo.json");

		return new Object[][] { { data.get(12) } };
	}

	//Mandatory fields with Close Date and Priority
	@DataProvider
	public Object[][] getData13() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\ViewGeneralMatterEditMatterInfo.json");

		return new Object[][] { { data.get(13) } };
	}

	//Mandatory fields with Close Date and Status
	@DataProvider
	public Object[][] getData14() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\ViewGeneralMatterEditMatterInfo.json");

		return new Object[][] { { data.get(14) } };
	}

	//Mandatory fields with Description and Matter Type
	@DataProvider
	public Object[][] getData15() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\ViewGeneralMatterEditMatterInfo.json");

		return new Object[][] { { data.get(15) } };
	}

	//Mandatory fields with Description and Priority
	@DataProvider
	public Object[][] getData16() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\ViewGeneralMatterEditMatterInfo.json");

		return new Object[][] { { data.get(16) } };
	}


	//Mandatory fields with Description and Status
	@DataProvider
	public Object[][] getData17() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\ViewGeneralMatterEditMatterInfo.json");

		return new Object[][] { { data.get(17) } };
	}

	//Mandatory fields with MatterType and Priority
	@DataProvider
	public Object[][] getData18() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\ViewGeneralMatterEditMatterInfo.json");

		return new Object[][] { { data.get(18) } };
	}

	//Mandatory fields with MatterType and Status
	@DataProvider
	public Object[][] getData19() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\ViewGeneralMatterEditMatterInfo.json");

		return new Object[][] { { data.get(19) } };
	}

	//Mandatory fields with Priority and Status
	@DataProvider
	public Object[][] getData20() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\ViewGeneralMatterEditMatterInfo.json");

		return new Object[][] { { data.get(20) } };
	}

	//Mandatory fields with Start Date, Close Date and Description
	@DataProvider
	public Object[][] getData21() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\ViewGeneralMatterEditMatterInfo.json");

		return new Object[][] { { data.get(21) } };
	}

	//Mandatory fields with Start Date, Close Date and Matter Type
	@DataProvider
	public Object[][] getData22() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\ViewGeneralMatterEditMatterInfo.json");

		return new Object[][] { { data.get(22) } };
	}

	//Mandatory fields with Start Date, Close Date and Matter Type
	@DataProvider
	public Object[][] getData23() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\ViewGeneralMatterEditMatterInfo.json");

		return new Object[][] { { data.get(23) } };
	}

	//Mandatory fields with All Fields
	@DataProvider
	public Object[][] getData24() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\ViewGeneralMatterEditMatterInfo.json");

		return new Object[][] { { data.get(24) } };
	}

	//Mandatory fields with All Fields
	@DataProvider
	public Object[][] getData25() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\ViewGeneralMatterEditMatterInfo.json");

		return new Object[][] { { data.get(25) } };
	}
}
