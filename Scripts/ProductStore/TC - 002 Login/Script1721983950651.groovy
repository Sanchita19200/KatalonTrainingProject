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

WebUI.navigateToUrl('https://www.demoblaze.com/index.html')

WebUI.click(findTestObject('Object Repository/ProductStore/PageStoreLogin/Page_STORE/a_Log in'))

WebUI.setText(findTestObject('Object Repository/ProductStore/PageStoreLogin/Page_STORE/input_Username_loginusername'), 'user1920')

WebUI.setEncryptedText(findTestObject('Object Repository/ProductStore/PageStoreLogin/Page_STORE/input_Password_loginpassword'), 
    'b5pCQTWVtVj6IgmQbLgxsg==')

WebUI.verifyElementText(findTestObject('Object Repository/ProductStore/PageStoreLogin/Page_STORE/h5_Log in'), 'Log in')

WebUI.verifyElementPresent(findTestObject('Object Repository/ProductStore/PageStoreLogin/Page_STORE/button_Log in'), 0)

WebUI.click(findTestObject('Object Repository/ProductStore/PageStoreLogin/Page_STORE/button_Log in'))

WebUI.rightClick(findTestObject('Object Repository/ProductStore/PageStoreLogin/Page_STORE/a_Welcome user1920'))

WebUI.verifyElementPresent(findTestObject('Object Repository/ProductStore/PageStoreLogin/Page_STORE/a_Welcome user1920'), 
    0)

WebUI.closeBrowser()


// Import necessary libraries
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// Open a browser
WebUI.openBrowser('')

// Navigate to a specific URL
WebUI.navigateToUrl('https://www.demoblaze.com/index.html')

// Click on the 'Log in' link
WebUI.click(findTestObject('Object Repository/ProductStore/PageStoreLogin/Page_STORE/a_Log in'))

// Set text in the username field
WebUI.setText(findTestObject('Object Repository/ProductStore/PageStoreLogin/Page_STORE/input_Username_loginusername'), 'user1920')

// Set encrypted text in the password field
WebUI.setEncryptedText(findTestObject('Object Repository/ProductStore/PageStoreLogin/Page_STORE/input_Password_loginpassword'), 'b5pCQTWVtVj6IgmQbLgxsg==')

// Verify the element text is 'Log in'
WebUI.verifyElementText(findTestObject('Object Repository/ProductStore/PageStoreLogin/Page_STORE/h5_Log in'), 'Log in')

// Verify the presence of the 'Log in' button
WebUI.verifyElementPresent(findTestObject('Object Repository/ProductStore/PageStoreLogin/Page_STORE/button_Log in'), 0)

// Click on the 'Log in' button
WebUI.click(findTestObject('Object Repository/ProductStore/PageStoreLogin/Page_STORE/button_Log in'))

// Right click on the 'Welcome user1920' link
WebUI.rightClick(findTestObject('Object Repository/ProductStore/PageStoreLogin/Page_STORE/a_Welcome user1920'))

// Verify the presence of the 'Welcome user1920' link
WebUI.verifyElementPresent(findTestObject('Object Repository/ProductStore/PageStoreLogin/Page_STORE/a_Welcome user1920'), 0)

// Close the browser
WebUI.closeBrowser()
/*
*  The code opens a browser, navigates to a specific URL, performs login actions, and closes the browser.
*
*  1. Import necessary libraries for web UI automation.
*  2. Open a browser and navigate to a specific URL.
*  3. Perform login actions such as clicking on 'Log in' link, setting username and password, verifying elements, and right-clicking on a link.
*  4. Close the browser.
*
*/