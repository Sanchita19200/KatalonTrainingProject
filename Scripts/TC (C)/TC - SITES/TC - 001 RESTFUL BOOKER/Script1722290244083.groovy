import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

// Open browser and navigate to the site
WebUI.openBrowser('')

WebUI.navigateToUrl('https://automationintesting.online/')

WebUI.click(findTestObject('Object Repository/Page_Restful-booker-platform demo/h1_Welcome to Restful Booker Platform'))

WebUI.rightClick(findTestObject('Object Repository/Page_Restful-booker-platform demo/h1_Welcome to Restful Booker Platform'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Restful-booker-platform demo/h1_Welcome to Restful Booker Platform'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Restful-booker-platform demo/h1_Welcome to Restful Booker Platform'), 
    'Welcome to Restful Booker Platform')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Restful-booker-platform demo/button_Book this room'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Restful-booker-platform demo/button_Book this room'))

WebUI.click(findTestObject('Object Repository/Page_Restful-booker-platform demo/div_Sat_rbc-day-bg'))

WebUI.setText(findTestObject('Object Repository/Page_Restful-booker-platform demo/input_Sat_firstname'), 'User')

WebUI.setText(findTestObject('Object Repository/Page_Restful-booker-platform demo/input_Sat_lastname'), 'Doe')

WebUI.setText(findTestObject('Object Repository/Page_Restful-booker-platform demo/input_Sat_email'), 'UD@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Restful-booker-platform demo/input_Sat_phone'), '07107162479')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Restful-booker-platform demo/button_Book'), 0)

WebUI.click(findTestObject('Object Repository/Page_Restful-booker-platform demo/button_Book'))

WebUI.click(findTestObject('Object Repository/Page_Restful-booker-platform demo/button_Book'))

WebUI.click(findTestObject('Object Repository/Page_Restful-booker-platform demo/div_Sat_rbc-day-bg'))

WebUI.click(findTestObject('Object Repository/Page_Restful-booker-platform demo/div_27'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Restful-booker-platform demo/div_27'))

WebUI.click(findTestObject('Object Repository/Page_Restful-booker-platform demo/div_27'))

WebUI.click(findTestObject('Object Repository/Page_Restful-booker-platform demo/button_Book'))

WebUI.click(findTestObject('Object Repository/Page_Restful-booker-platform demo/button_Let me hack'))

WebUI.closeBrowser()


// Import necessary libraries
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// Open browser and navigate to the site
WebUI.openBrowser('')
WebUI.navigateToUrl('https://automationintesting.online/')

// Click on the welcome message
WebUI.click(findTestObject('Object Repository/Page_Restful-booker-platform demo/h1_Welcome to Restful Booker Platform'))

// Right click on the welcome message
WebUI.rightClick(findTestObject('Object Repository/Page_Restful-booker-platform demo/h1_Welcome to Restful Booker Platform'))

// Verify the presence of the welcome message
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Restful-booker-platform demo/h1_Welcome to Restful Booker Platform'), 0)

// Verify the text of the welcome message
WebUI.verifyElementText(findTestObject('Object Repository/Page_Restful-booker-platform demo/h1_Welcome to Restful Booker Platform'), 'Welcome to Restful Booker Platform')

// Verify the presence of the "Book this room" button
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Restful-booker-platform demo/button_Book this room'), 0)

// Click on the "Book this room" button
WebUI.click(findTestObject('Object Repository/Page_Restful-booker-platform demo/button_Book this room'))

// Select a date and fill in user details
WebUI.click(findTestObject('Object Repository/Page_Restful-booker-platform demo/div_Sat_rbc-day-bg'))
WebUI.setText(findTestObject('Object Repository/Page_Restful-booker-platform demo/input_Sat_firstname'), 'User')
WebUI.setText(findTestObject('Object Repository/Page_Restful-booker-platform demo/input_Sat_lastname'), 'Doe')
WebUI.setText(findTestObject('Object Repository/Page_Restful-booker-platform demo/input_Sat_email'), 'UD@gmail.com')
WebUI.setText(findTestObject('Object Repository/Page_Restful-booker-platform demo/input_Sat_phone'), '07107162479')

// Verify the presence of the "Book" button
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Restful-booker-platform demo/button_Book'), 0)

// Click on the "Book" button
WebUI.click(findTestObject('Object Repository/Page_Restful-booker-platform demo/button_Book'))

// Click on the "Book" button again
WebUI.click(findTestObject('Object Repository/Page_Restful-booker-platform demo/button_Book'))

// Select a date and book the room
WebUI.click(findTestObject('Object Repository/Page_Restful-booker-platform demo/div_Sat_rbc-day-bg'))
WebUI.click(findTestObject('Object Repository/Page_Restful-booker-platform demo/div_27'))
WebUI.doubleClick(findTestObject('Object Repository/Page_Restful-booker-platform demo/div_27'))
WebUI.click(findTestObject('Object Repository/Page_Restful-booker-platform demo/div_27'))
WebUI.click(findTestObject('Object Repository/Page_Restful-booker-platform demo/button_Book'))

// Click on "Let me hack" button
WebUI.click(findTestObject('Object Repository/Page_Restful-booker-platform demo/button_Let me hack'))

// Close the browser
WebUI.closeBrowser()
/*
*  Automates a series of actions on a website for booking a room.
*
*  1. Opens a browser and navigates to a specific site.
*  2. Clicks on elements, fills in user details, and verifies element presence and text.
*  3. Performs actions like right-click, double-click, and clicking on buttons.
*
*/