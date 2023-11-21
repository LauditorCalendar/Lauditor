package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.abst.Reusable;

public class ViewGeneralMatterOpenCloseMatterPOM extends Reusable{
	WebDriver driver;

	public ViewGeneralMatterOpenCloseMatterPOM(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}	
		
	
		// SearchBar
		@FindBy(xpath="//input[@placeholder='Search Group']")
		WebElement searchBarViewMatter;
		
		//Action Button
		@FindBy(xpath="//button[@data-bs-toggle='dropdown']")
		WebElement actionBtnViewGeneral;
		
		//CloseMatterBtn
		@FindBy(xpath="//ul[@class='dropdown-menu custom-dropdown show'] //li[4]")
		WebElement closeMatterbtn;
		
		//OpenMatterBtn
		@FindBy(xpath="//ul[@class='dropdown-menu custom-dropdown show'] //li[4]")
		WebElement openMatterbtn;
		
		//alertBtnYes
		@FindBy(xpath="//button[@class='btn btn-default alertbtn alertbtnyes']")
		WebElement alertBtnYes;
		
		//alertBtnCancel
		@FindBy(xpath="//button[@class='btn btn-default alertbtn alertbtnno ng-star-inserted']")
		WebElement alertBtnCancel;
		
		//View matter success
		@FindBy(xpath="//button[@class='btn btn-default alertbtn']")
		WebElement viewMatterSuccess;
		
		//Text pending check
		@FindBy(xpath="//td[text()='Closed']")
		WebElement closedNameCheck;
		
		
		public void closeMatter() throws InterruptedException {
			Thread.sleep(3000);
			visibilityOfElementWait(closeMatterbtn);
			Actions action = new Actions(driver);
			action.moveToElement(closeMatterbtn).click().perform();
			visibilityOfElementWait(alertBtnYes);
			alertBtnYes.click();
			visibilityOfElementWait(viewMatterSuccess);
			viewMatterSuccess.click();
			visibilityOfElementWait(closedNameCheck);
			boolean displayed = closedNameCheck.isDisplayed();
			System.out.println("Closed Name is displayed: " + displayed);


		}
		
		@FindBy(xpath="//ul[@class='dropdown-menu custom-dropdown show'] //li[4]")
		WebElement reOpenMatterbtn;
		
		@FindBy(xpath="//td[text()='Active']")
		WebElement activeNameCheck;
		
		public void reOpenMatter() throws InterruptedException{
			Thread.sleep(3000);
			visibilityOfElementWait(reOpenMatterbtn);
			Actions action = new Actions(driver);
			action.moveToElement(reOpenMatterbtn).click().perform();
			visibilityOfElementWait(alertBtnYes);
			alertBtnYes.click();
			visibilityOfElementWait(viewMatterSuccess);
			viewMatterSuccess.click();
			visibilityOfElementWait(activeNameCheck);
			boolean displayed = activeNameCheck.isDisplayed();
			System.out.println("Active Name is displayed: " + displayed);	
		}
		
		public void closeMatterWithCancel() throws InterruptedException
		{
			Thread.sleep(3000);
			visibilityOfElementWait(closeMatterbtn);
			Actions action = new Actions(driver);
			action.moveToElement(closeMatterbtn).click().perform();
			visibilityOfElementWait(alertBtnCancel);
			alertBtnCancel.click();
			visibilityOfElementWait(activeNameCheck);
			boolean displayed = activeNameCheck.isDisplayed();
			System.out.println("Active Name is displayed: " + displayed);	
		}
		
		public void reOpenMatterWithCancel() throws InterruptedException
		{
			Thread.sleep(3000);
			visibilityOfElementWait(reOpenMatterbtn);
			Actions action = new Actions(driver);
			action.moveToElement(reOpenMatterbtn).click().perform();
			visibilityOfElementWait(alertBtnCancel);
			alertBtnCancel.click();
			visibilityOfElementWait(closedNameCheck);
			boolean displayed = closedNameCheck.isDisplayed();
			System.out.println("Closed Name is displayed: " + displayed);
		}

	}


