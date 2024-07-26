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

WebUI.click(findTestObject('Object Repository/Udemy Healthcare Site/Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.setText(findTestObject('Object Repository/Udemy Healthcare Site/Page_CURA Healthcare Service/input_Username_username'), 
    'John Doe')

WebUI.click(findTestObject('Object Repository/Udemy Healthcare Site/Page_CURA Healthcare Service/input_Username_username'))

WebUI.setEncryptedText(findTestObject('Object Repository/Udemy Healthcare Site/Page_CURA Healthcare Service/input_Password_password'), 
    'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('Object Repository/Udemy Healthcare Site/Page_CURA Healthcare Service/button_Login'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Udemy Healthcare Site/Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center        _5b4107'), 
    'Hongkong CURA Healthcare Center', true)

WebUI.click(findTestObject('Object Repository/Udemy Healthcare Site/Page_CURA Healthcare Service/input_Apply for hospital readmission_hospit_63901f'))

WebUI.click(findTestObject('Object Repository/Udemy Healthcare Site/Page_CURA Healthcare Service/input_Medicaid_programs'))

WebUI.click(findTestObject('Object Repository/Udemy Healthcare Site/Page_CURA Healthcare Service/span_Visit Date (Required)_glyphicon glyphi_cada34'))

WebUI.click(findTestObject('Object Repository/Udemy Healthcare Site/Page_CURA Healthcare Service/td_31'))

WebUI.setText(findTestObject('Object Repository/Udemy Healthcare Site/Page_CURA Healthcare Service/textarea_Comment_comment'), 
    'This is a sample comment.')

WebUI.click(findTestObject('Object Repository/Udemy Healthcare Site/Page_CURA Healthcare Service/button_Book Appointment'))

WebUI.verifyElementText(findTestObject('Object Repository/Udemy Healthcare Site/Page_CURA Healthcare Service/h2_Appointment Confirmation'), 
    'Appointment Confirmation')

WebUI.click(findTestObject('Object Repository/Udemy Healthcare Site/Page_CURA Healthcare Service/a_Go to Homepage'))

WebUI.closeBrowser()


/*
*  Automates a series of actions on a healthcare website using Katalon Studio.
*
*  1. Imports necessary classes and packages for Katalon Studio.
*  2. Opens a browser and navigates to a specific URL.
*  3. Performs a series of UI interactions like clicking buttons, setting text, selecting options, and verifying element text.
*  4. Closes the browser after completing the actions.
*
*/
// Open the browser
WebUI.openBrowser('')

// Navigate to the specified URL
WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

// Click on the "Make Appointment" link
WebUI.click(findTestObject('Object Repository/Udemy Healthcare Site/Page_CURA Healthcare Service/a_Make Appointment'))

// Set text in the username field
WebUI.setText(findTestObject('Object Repository/Udemy Healthcare Site/Page_CURA Healthcare Service/input_Username_username'), 'John Doe')

// Click on the username field
WebUI.click(findTestObject('Object Repository/Udemy Healthcare Site/Page_CURA Healthcare Service/input_Username_username'))

// Set encrypted text in the password field
WebUI.setEncryptedText(findTestObject('Object Repository/Udemy Healthcare Site/Page_CURA Healthcare Service/input_Password_password'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

// Click on the login button
WebUI.click(findTestObject('Object Repository/Udemy Healthcare Site/Page_CURA Healthcare Service/button_Login'))

// Select an option by value in the dropdown
WebUI.selectOptionByValue(findTestObject('Object Repository/Udemy Healthcare Site/Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center        _5b4107'), 'Hongkong CURA Healthcare Center', true)

// Click on the checkbox for hospital readmission
WebUI.click(findTestObject('Object Repository/Udemy Healthcare Site/Page_CURA Healthcare Service/input_Apply for hospital readmission_hospit_63901f'))

// Click on the checkbox for Medicaid programs
WebUI.click(findTestObject('Object Repository/Udemy Healthcare Site/Page_CURA Healthcare Service/input_Medicaid_programs'))

// Click on the calendar icon for visit date
WebUI.click(findTestObject('Object Repository/Udemy Healthcare Site/Page_CURA Healthcare Service/span_Visit Date (Required)_glyphicon glyphi_cada34'))

// Click on the date 31 in the calendar
WebUI.click(findTestObject('Object Repository/Udemy Healthcare Site/Page_CURA Healthcare Service/td_31'))

// Set text in the comment textarea
WebUI.setText(findTestObject('Object Repository/Udemy Healthcare Site/Page_CURA Healthcare Service/textarea_Comment_comment'), 'This is a sample comment.')

// Click on the "Book Appointment" button
WebUI.click(findTestObject('Object Repository/Udemy Healthcare Site/Page_CURA Healthcare Service/button_Book Appointment'))

// Verify the text of the element for appointment confirmation
WebUI.verifyElementText(findTestObject('Object Repository/Udemy Healthcare Site/Page_CURA Healthcare Service/h2_Appointment Confirmation'), 'Appointment Confirmation')

// Click on the "Go to Homepage" link
WebUI.click(findTestObject('Object Repository/Udemy Healthcare Site/Page_CURA Healthcare Service/a_Go to Homepage'))

// Close the browser
WebUI.closeBrowser()