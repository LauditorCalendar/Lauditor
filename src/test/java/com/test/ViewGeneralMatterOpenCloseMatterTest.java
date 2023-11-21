package com.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.BaseClass;

public class ViewGeneralMatterOpenCloseMatterTest extends BaseClass{
	
	//CloseMatterwithCancelTest
	
	@Test(dataProvider = "getData0", priority = 0)
	public void closeMatterwithCancelTest(HashMap<String, String> input) throws InterruptedException {
	
			try {
				viewGeneralMatters.leftMatterTab();
				viewGeneralMatters.generalMatterIcon();
				viewGeneralMatters.searchBarFieldsandActionBtn(input.get("MatterName"));
				viewGeneralMatterOpenCloseMatter.closeMatterWithCancel();
				
			}finally {
				viewGeneralMatters.leftMatterTab();
				viewGeneralMatters.generalMatterIcon();
			}

}
	
	// CloseMattersTest
		@Test(dataProvider = "getData0", priority = 1)
		public void closeMattersTest(HashMap<String, String> input) throws InterruptedException {

			try {
				viewGeneralMatters.searchBarFieldsandActionBtn(input.get("MatterName"));
				viewGeneralMatterOpenCloseMatter.closeMatter();
				
			}finally {
				viewGeneralMatters.leftMatterTab();
			}
		}
		
		// ReOpenMatterwithCancelTest
		@Test(dataProvider = "getData0", priority = 2)
		public void reOpenMatterwithCancelTest(HashMap<String, String> input) throws InterruptedException {

			try {
				viewGeneralMatters.searchBarFieldsandActionBtn(input.get("MatterName"));
				viewGeneralMatterOpenCloseMatter.reOpenMatterWithCancel();

			}finally {
				viewGeneralMatters.leftMatterTab();
				viewGeneralMatters.generalMatterIcon();
			}
		}
		// ReOpenMatterTest
		@Test(dataProvider = "getData0", priority = 3)
		public void reOpenMatterTest(HashMap<String, String> input) throws InterruptedException {

			try {
				viewGeneralMatters.searchBarFieldsandActionBtn(input.get("MatterName"));
				viewGeneralMatterOpenCloseMatter.reOpenMatter();

			}finally {
				viewGeneralMatters.leftMatterTab();
				viewGeneralMatters.generalMatterIcon();
			}
		
}
		@DataProvider
		public Object[][] getData0() throws IOException {

			List<HashMap<String, String>> data = getJsonDataToMap(
					"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Matter\\ViewGeneralMatterOpenCloseMatter.json");

			return new Object[][] { { data.get(0) } };

		}
		
}
