package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pom.CreateGeneralMatterPOM;
import com.pom.CreateGroup;
import com.pom.CreateMeetingsPOM;
import com.pom.CreateMember;
import com.pom.Dashboard;
import com.pom.LoginPage;
import com.pom.ViewGeneralMatterDeleteMatterPOM;
import com.pom.ViewGeneralMatterOpenCloseMatterPOM;
import com.pom.ViewGeneralMatterPOM;
import com.pom.ViewGeneralMatterUpdateGroupsPOM;
import com.pom.ViewGroups;
import com.pom.ViewMeetingsPOM;
import com.pom.ViewMembers;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public WebDriver driver;

	public Properties prop;
	public LoginPage loginPage;
	public Dashboard dashBoard;
	public ViewGroups viewGroups;
	public CreateGroup createGroup;
	public CreateMember createMember;
	public ViewMembers viewMembers;
	public CreateGeneralMatterPOM createGeneralMatters;
	public ViewGeneralMatterPOM viewGeneralMatters;
	public ViewGeneralMatterUpdateGroupsPOM viewGeneralMatterUpdateGroups;
	public ViewGeneralMatterOpenCloseMatterPOM viewGeneralMatterOpenCloseMatter;
	public  ViewGeneralMatterDeleteMatterPOM viewGeneralMatterDeleteMatter;
	public CreateMeetingsPOM createMeetings;
	public ViewMeetingsPOM viewMeetings;

	public WebDriver initalize() throws IOException {

		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\main\\java\\com\\resour\\Data.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		if (browserName.equalsIgnoreCase("chrome")) {
			ChromeOptions ops = new ChromeOptions();
			ops.addArguments("--remote-allow-origins=*");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(ops);
		} else if (browserName.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (browserName.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		return driver;
	}

	public List<HashMap<String, String>> getJsonDataToMap(String filePath) throws IOException

	{
		// read json to string
		String jsonContent = FileUtils.readFileToString(new File(filePath), StandardCharsets.UTF_8);

		// String to HashMap Jackson Datbind
		ObjectMapper mapper = new ObjectMapper();
		List<HashMap<String, String>> data = mapper.readValue(jsonContent,
				new TypeReference<List<HashMap<String, String>>>() {

				});
		return data;
	}

	
	
	@BeforeClass
	public LoginPage launchApplication() throws IOException, InterruptedException {
		driver = initalize();
		// driver.get("https://app.lauditor.com/login");
		loginPage = new LoginPage(driver);
		loginPage.goTo();
		//Thread.sleep(10000);
		loginPage.loginApplication(prop.getProperty("name"), prop.getProperty("password"));
		dashBoard = new Dashboard(driver);
		createGroup = new CreateGroup(driver);
		viewGroups = new ViewGroups(driver);
		createMember = new CreateMember(driver);
		viewMembers = new ViewMembers(driver);
		createGeneralMatters = new CreateGeneralMatterPOM(driver);
		viewGeneralMatters = new ViewGeneralMatterPOM(driver);
		viewGeneralMatterUpdateGroups = new ViewGeneralMatterUpdateGroupsPOM(driver);
		viewGeneralMatterOpenCloseMatter = new ViewGeneralMatterOpenCloseMatterPOM(driver);
		viewGeneralMatterDeleteMatter= new ViewGeneralMatterDeleteMatterPOM(driver);
		createMeetings=new CreateMeetingsPOM(driver);
		viewMeetings = new  ViewMeetingsPOM(driver);
		return loginPage;
	}

	@AfterClass
	public void down() {
		driver.close();
	}

	public String getScreenshot(String testCaseName, WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File file = new File(System.getProperty("user.dir") + "//reports//" + testCaseName + ".png");
		FileUtils.copyFile(source, file);
		return System.getProperty("user.dir") + "//reports//" + testCaseName + ".png";

	}

}

