package com.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.BaseClass;

public class CreateGeneralMatterNewTest extends BaseClass 
{

	// Mandatory Fields with start Date
		@Test(dataProvider = "getData0", priority = 0)
		public void matter1(HashMap<String,String>input) throws InterruptedException {
			//createGeneral.leftMatterTab();
			//createGeneral.generalMatterTab();
			//createGeneral.createGeneralMatter(input.get("caseTitle"), input.get("matterNumber"));


		}

		// Mandatory Fields with start Date

		@DataProvider
		public Object[][] getData0() throws IOException {

			List<HashMap<String, String>> data = getJsonDataToMap(
					"/Users/saima/Eclipse-Workspace/Lauditor2/src/test/java/file/data/Matter/CreateGeneral1.json");

			return new Object[][] { { data.get(0) } };

		}
	
	
}
