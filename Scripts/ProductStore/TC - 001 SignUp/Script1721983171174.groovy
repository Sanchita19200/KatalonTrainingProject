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

WebUI.openBrowser('https://www.demoblaze.com/index.html')

WebUI.doubleClick(findTestObject('ProductStore/Page_STORE/a_Sign up'))

WebUI.setText(findTestObject('ProductStore/Page_STORE/input_Username_sign-username'), Username)

WebUI.setEncryptedText(findTestObject('ProductStore/Page_STORE/input_Password_sign-password'), Password)

WebUI.click(findTestObject('ProductStore/Page_STORE/button_Sign up'))


// Importing necessary libraries
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// Open the browser and navigate to the specified URL
WebUI.openBrowser('https://www.demoblaze.com/index.html')

// Perform a double click on the "Sign up" link
WebUI.doubleClick(findTestObject('ProductStore/Page_STORE/a_Sign up'))

// Set text in the "Username" input field
WebUI.setText(findTestObject('ProductStore/Page_STORE/input_Username_sign-username'), Username)

// Set encrypted text in the "Password" input field
WebUI.setEncryptedText(findTestObject('ProductStore/Page_STORE/input_Password_sign-password'), Password)

// Click on the "Sign up" button
WebUI.click(findTestObject('ProductStore/Page_STORE/button_Sign up'))
/*
*  Importing necessary libraries and performing actions on a web page.
*
*  1. Importing necessary libraries for interacting with web elements.
*  2. Opening a browser and navigating to a specific URL.
*  3. Performing actions like double click, setting text, setting encrypted text, and clicking on elements on the web page.
*
*/