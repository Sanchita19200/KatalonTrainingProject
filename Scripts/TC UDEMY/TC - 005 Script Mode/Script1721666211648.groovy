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

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.setText(findTestObject('Object Repository/Udemy Orange HRM/Page_OrangeHRM/input_Username_username'), username)

WebUI.setEncryptedText(findTestObject('Object Repository/Udemy Orange HRM/Page_OrangeHRM/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Udemy Orange HRM/Page_OrangeHRM/button_Login'))

WebUI.verifyTextPresent('Dashboard', false)

WebUI.closeBrowser()


// Import necessary libraries
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// Open a browser
WebUI.openBrowser('')

// Navigate to the specified URL
WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

// Set text in the username field using the provided test object
WebUI.setText(findTestObject('Object Repository/Udemy Orange HRM/Page_OrangeHRM/input_Username_username'), username)

// Set encrypted text in the password field using the provided test object
WebUI.setEncryptedText(findTestObject('Object Repository/Udemy Orange HRM/Page_OrangeHRM/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

// Click on the login button using the provided test object
WebUI.click(findTestObject('Object Repository/Udemy Orange HRM/Page_OrangeHRM/button_Login'))

// Verify that the text 'Dashboard' is not present on the page
WebUI.verifyTextPresent('Dashboard', false)

// Close the browser
WebUI.closeBrowser()
/*
*  The code opens a browser, navigates to a specific URL, performs login actions on a website, verifies the absence of a text, and then closes the browser.
*
*  1. Imports necessary libraries and defines aliases for built-in keywords and objects.
*  2. Opens a browser and navigates to a specified URL.
*  3. Sets text in the username and password fields, clicks on the login button, and verifies the absence of the text 'Dashboard'.
*/