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

WebUI.openBrowser('http://www.theTestingWorld.com/testings')

WebUI.setText(findTestObject('RegistrationPageYT/Page_Login  Sign Up Forms/input_Address type HomeOffice_fld_username'), 
    'Testing99')

WebUI.setText(findTestObject('RegistrationPageYT/Page_Login  Sign Up Forms/input_Address type HomeOffice_fld_email'), 'testing99@gmail.com')

WebUI.click(findTestObject('RegistrationPageYT/Page_Login  Sign Up Forms/input_Address type HomeOffice_add_type'))

WebUI.click(findTestObject('RegistrationPageYT/Page_Login  Sign Up Forms/input_Address type HomeOffice_terms'))

WebUI.click(findTestObject('RegistrationPageYT/Page_Login  Sign Up Forms/input_submit'))


// Importing necessary libraries for the script
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// Opening the browser and navigating to the specified URL
WebUI.openBrowser('http://www.theTestingWorld.com/testings')

// Entering text into the username field on the registration page
WebUI.setText(findTestObject('RegistrationPageYT/Page_Login  Sign Up Forms/input_Address type HomeOffice_fld_username'), 'Testing99')

// Entering email into the email field on the registration page
WebUI.setText(findTestObject('RegistrationPageYT/Page_Login  Sign Up Forms/input_Address type HomeOffice_fld_email'), 'testing99@gmail.com')

// Clicking on the address type dropdown on the registration page
WebUI.click(findTestObject('RegistrationPageYT/Page_Login  Sign Up Forms/input_Address type HomeOffice_add_type'))

// Clicking on the terms checkbox on the registration page
WebUI.click(findTestObject('RegistrationPageYT/Page_Login  Sign Up Forms/input_Address type HomeOffice_terms'))

// Clicking on the submit button on the registration page
WebUI.click(findTestObject('RegistrationPageYT/Page_Login  Sign Up Forms/input_submit'))
/*
*  Importing necessary libraries and performing registration on a website.
*
*  1. Importing necessary libraries for the script.
*  2. Opening the browser and navigating to the specified URL.
*  3. Entering text into the username field, email field, clicking on dropdown and checkboxes, and submitting the form on the registration page.
*
*/
/*
*  Importing necessary libraries for the script and performing registration on a website.
*
*  1. Importing necessary libraries for the script.
*  2. Opening the browser and navigating to the specified URL.
*  3. Entering text into the username field, email field, clicking on dropdown and checkboxes, and submitting the form on the registration page.
*
*/