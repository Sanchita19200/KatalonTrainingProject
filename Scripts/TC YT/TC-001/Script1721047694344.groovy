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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.doubleClick(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Demo account_form-control'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Demo account_form-control'))

WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Username_username'), 'John Doe')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Password_password'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CURA Healthcare Service/button_Login'), 0)

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/button_Login'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center        _5b4107'), 
    'Hongkong CURA Healthcare Center', true)

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/div_Visit Date (Required)_input-group-addon'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/td_15'))

WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/textarea_Comment_comment'), 'This is  a comment.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CURA Healthcare Service/button_Book Appointment'), 0)

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/button_Book Appointment'))

WebUI.doubleClick(findTestObject('Object Repository/Page_CURA Healthcare Service/p_Hongkong CURA Healthcare Center'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_CURA Healthcare Service/p_Hongkong CURA Healthcare Center'), 
    'Hongkong CURA Healthcare Center')

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Go to Homepage'))

WebUI.closeBrowser()


/*
*  Automates a series of actions on a healthcare service website using Katalon Studio.
*
*  1. Imports necessary classes and packages for Katalon Studio.
*  2. Opens a browser and navigates to a specific URL.
*  3. Performs a sequence of UI interactions like clicking, double-clicking, setting text, selecting options, and verifying elements.
*  4. Closes the browser after completing the actions.
*
*/
// Open the browser
WebUI.openBrowser('')

// Navigate to the specified URL
WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

// Click on the "Make Appointment" link
WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Make Appointment'))

// Double click on the input field for the demo account
WebUI.doubleClick(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Demo account_form-control'))

// Click on the input field for the demo account
WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Demo account_form-control'))

// Set text in the username field
WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Username_username'), 'John Doe')

// Set encrypted text in the password field
WebUI.setEncryptedText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Password_password'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

// Verify the presence of the login button
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CURA Healthcare Service/button_Login'), 0)

// Click on the login button
WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/button_Login'))

// Select an option by value in the dropdown
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center        _5b4107'),
'Hongkong CURA Healthcare Center', true)

// Click on the visit date input field
WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/div_Visit Date (Required)_input-group-addon'))

// Click on the 15th day in the calendar
WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/td_15'))

// Set text in the comment textarea
WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/textarea_Comment_comment'), 'This is  a comment.')

// Verify the presence of the "Book Appointment" button
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CURA Healthcare Service/button_Book Appointment'), 0)

// Click on the "Book Appointment" button
WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/button_Book Appointment'))

// Double click on the selected healthcare center
WebUI.doubleClick(findTestObject('Object Repository/Page_CURA Healthcare Service/p_Hongkong CURA Healthcare Center'))

// Verify the text of the selected healthcare center
WebUI.verifyElementText(findTestObject('Object Repository/Page_CURA Healthcare Service/p_Hongkong CURA Healthcare Center'),
'Hongkong CURA Healthcare Center')

// Click on the "Go to Homepage" link
WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Go to Homepage'))

// Close the browser
WebUI.closeBrowser()