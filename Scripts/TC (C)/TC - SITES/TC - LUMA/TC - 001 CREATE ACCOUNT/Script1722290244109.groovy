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

WebUI.navigateToUrl('https://magento.softwaretestingboard.com/')

WebUI.verifyElementClickable(findTestObject('Object Repository/Luma/Page_Home Page/a_Create an Account'))

WebUI.click(findTestObject('Object Repository/Luma/Page_Home Page/a_Create an Account'))

WebUI.click(findTestObject('Object Repository/Luma/Page_Create New Customer Account/span_Create New Customer Account'))

WebUI.verifyElementText(findTestObject('Object Repository/Luma/Page_Create New Customer Account/span_Create New Customer Account'), 
    'Create New Customer Account')

WebUI.click(findTestObject('Object Repository/Luma/Page_Create New Customer Account/span_First Name'))

WebUI.verifyElementText(findTestObject('Object Repository/Luma/Page_Create New Customer Account/span_First Name'), 'First Name')

WebUI.click(findTestObject('Object Repository/Luma/Page_Create New Customer Account/input_First Name_firstname'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Luma/Page_Create New Customer Account/input_First Name_firstname'), 
    0)

WebUI.setText(findTestObject('Object Repository/Luma/Page_Create New Customer Account/input_First Name_firstname'), 'Sanchita')

WebUI.click(findTestObject('Object Repository/Luma/Page_Create New Customer Account/span_Last Name'))

WebUI.verifyElementText(findTestObject('Object Repository/Luma/Page_Create New Customer Account/span_Last Name'), 'Last Name')

WebUI.click(findTestObject('Object Repository/Luma/Page_Create New Customer Account/input_Last Name_lastname'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Luma/Page_Create New Customer Account/input_Last Name_lastname'), 
    0)

WebUI.setText(findTestObject('Object Repository/Luma/Page_Create New Customer Account/input_Last Name_lastname'), 'Singh')

WebUI.click(findTestObject('Object Repository/Luma/Page_Create New Customer Account/main_Create New Customer Account         wi_6aa9df'))

WebUI.click(findTestObject('Object Repository/Luma/Page_Create New Customer Account/span_Email'))

WebUI.verifyElementText(findTestObject('Object Repository/Luma/Page_Create New Customer Account/span_Email'), 'Email')

WebUI.verifyElementPresent(findTestObject('Object Repository/Luma/Page_Create New Customer Account/input_Email_email'), 
    0)

WebUI.setText(findTestObject('Object Repository/Luma/Page_Create New Customer Account/input_Email_email'), 'user@gmail.com')

WebUI.click(findTestObject('Object Repository/Luma/Page_Create New Customer Account/span_Password'))

WebUI.verifyElementText(findTestObject('Object Repository/Luma/Page_Create New Customer Account/span_Password'), 'Password')

WebUI.verifyElementPresent(findTestObject('Object Repository/Luma/Page_Create New Customer Account/input_Password_password'), 
    0)

WebUI.setEncryptedText(findTestObject('Object Repository/Luma/Page_Create New Customer Account/input_Password_password'), 
    'lsdNNXlVAZI=')

WebUI.click(findTestObject('Object Repository/Luma/Page_Create New Customer Account/html_var BASE_URL  httpsmagento.softwaretes_ef48b2'))

WebUI.setEncryptedText(findTestObject('Object Repository/Luma/Page_Create New Customer Account/input_Password_password'), 
    '9KzOjDimb7wxi8ZIyzeqeg==')

WebUI.click(findTestObject('Object Repository/Luma/Page_Create New Customer Account/html_var BASE_URL  httpsmagento.softwaretes_ef48b2_1'))

WebUI.setEncryptedText(findTestObject('Object Repository/Luma/Page_Create New Customer Account/input_Password_password'), 
    'iPtotzgp2tWAeu4gdopE3g==')

WebUI.click(findTestObject('Object Repository/Luma/Page_Create New Customer Account/span_Confirm Password'))

WebUI.verifyElementText(findTestObject('Object Repository/Luma/Page_Create New Customer Account/span_Confirm Password'), 
    'Confirm Password')

WebUI.verifyElementPresent(findTestObject('Object Repository/Luma/Page_Create New Customer Account/input_Confirm Password_password_confirmation'), 
    0)

WebUI.setEncryptedText(findTestObject('Object Repository/Luma/Page_Create New Customer Account/input_Confirm Password_password_confirmation'), 
    'iPtotzgp2tWAeu4gdopE3g==')

WebUI.verifyElementPresent(findTestObject('Object Repository/Luma/Page_Create New Customer Account/span_Create an Account'), 
    0)

WebUI.click(findTestObject('Object Repository/Luma/Page_Create New Customer Account/span_Create an Account'))

WebUI.setText(findTestObject('Object Repository/Luma/Page_Create New Customer Account/input_Email_email'), 'user1920@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Luma/Page_Create New Customer Account/input_Password_password'), 
    'NSwbypqZFMoM+mh/qdkl2Q==')

WebUI.setEncryptedText(findTestObject('Object Repository/Luma/Page_Create New Customer Account/input_Confirm Password_password_confirmation'), 
    '+kxG8kHOm0vVbXDyXcrgAA==')

WebUI.click(findTestObject('Object Repository/Luma/Page_Create New Customer Account/span_Create an Account'))

WebUI.click(findTestObject('Object Repository/Luma/Page_Create New Customer Account/span_Create an Account'))

WebUI.click(findTestObject('Object Repository/Luma/Page_Create New Customer Account/span_Create an Account'))

WebUI.setEncryptedText(findTestObject('Object Repository/Luma/Page_Create New Customer Account/input_Confirm Password_password_confirmation'), 
    '+kxG8kHOm0vVbXDyXcrgAA==')

WebUI.setEncryptedText(findTestObject('Object Repository/Luma/Page_Create New Customer Account/input_Password_password'), 
    '+kxG8kHOm0vVbXDyXcrgAA==')

WebUI.click(findTestObject('Object Repository/Luma/Page_Create New Customer Account/span_Create an Account'))

WebUI.doubleClick(findTestObject('Object Repository/Luma/Page_My Account/span_My Account'))

WebUI.verifyElementText(findTestObject('Object Repository/Luma/Page_My Account/span_My Account'), 'My Account')

WebUI.doubleClick(findTestObject('Object Repository/Luma/Page_My Account/p_Sanchita Singhuser1920gmail.com'))

WebUI.click(findTestObject('Object Repository/Luma/Page_My Account/p_Sanchita Singhuser1920gmail.com'))

WebUI.verifyElementText(findTestObject('Object Repository/Luma/Page_My Account/p_Sanchita Singhuser1920gmail.com'), 'Sanchita Singh\nuser1920@gmail.com')

WebUI.doubleClick(findTestObject('Object Repository/Luma/Page_My Account/p_Sanchita Singhuser1920gmail.com'))

WebUI.verifyElementText(findTestObject('Object Repository/Luma/Page_My Account/p_Sanchita Singhuser1920gmail.com'), 'Sanchita Singh\nuser1920@gmail.com')


/*
*  Automates the process of creating a new customer account on a website.
*
*  1. Opens a browser and navigates to a specific URL.
*  2. Fills out the necessary information to create a new customer account.
*  3. Verifies the elements and texts on the page.
*/