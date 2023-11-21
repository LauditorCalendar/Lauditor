package com.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.BaseClass;

public class ViewGeneralMatterDeleteMatterTest  extends BaseClass{
	// DeleteMatterCancelTest
		@Test(dataProvider = "getData0", priority = 0)
		public void deleteMatterCancelTest(HashMap<String, String> input) throws InterruptedException
		{
			try {
				viewGeneralMatters.leftMatterTab();
				viewGeneralMatters.generalMatterIcon();
				viewGeneralMatters.searchBarFieldsandActionBtn("MatterName");
				viewGeneralMatterDeleteMatter.deleteMatterCancelBtn();
			}finally {
				viewGeneralMatters.leftMatterTab();
				viewGeneralMatters.generalMatterIcon();
			}
		}
		
		// DeleteMatterTest
		@Test(dataProvider = "getData1", priority = 1)
		public void deleteMatterTest(HashMap<String, String> input) throws InterruptedException
		{
			try {
				viewGeneralMatters.searchBarFieldsandActionBtn("MatterName");
				viewGeneralMatterDeleteMatter.deleteGeneralMatter();

			}finally {
				viewGeneralMatters.leftMatterTab();
				viewGeneralMatters.generalMatterIcon();
			}
}
		
		// DeleteMatterCancelTest
		@DataProvider
		public Object[][] getData0() throws IOException {

			List<HashMap<String, String>> data = getJsonDataToMap(
					"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\ViewGeneralMatterDeleteMatter.json");

			return new Object[][] { { data.get(0)} };

		}
		

		// DeleteMatterTest
		@DataProvider
		public Object[][] getData1() throws IOException {

			List<HashMap<String, String>> data = getJsonDataToMap(
					"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\ViewGeneralMatterDeleteMatter.json");

			return new Object[][] { { data.get(1)}};

		}
}
