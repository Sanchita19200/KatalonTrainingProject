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

WebUI.click(findTestObject('Object Repository/Page_STORE/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_STORE/input_Username_loginusername'), 'user1920')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_STORE/input_Password_loginpassword'), 'b5pCQTWVtVj6IgmQbLgxsg==')

WebUI.click(findTestObject('Object Repository/Page_STORE/button_Log in'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_STORE/a_Welcome user1920'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_STORE/a_Home (current)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_STORE/a_Contact'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_STORE/a_About us'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_STORE/a_Cart'), 0)

WebUI.click(findTestObject('Object Repository/Page_STORE/a_Samsung galaxy s6'))

WebUI.click(findTestObject('Object Repository/Page_STORE/a_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_STORE/a_Cart_1'))

WebUI.closeBrowser()


// Open the browser
WebUI.openBrowser('')

// Navigate to the specified URL
WebUI.navigateToUrl('https://www.demoblaze.com/index.html')

// Click on the 'Log in' link
WebUI.click(findTestObject('Object Repository/Page_STORE/a_Log in'))

// Set text in the username field
WebUI.setText(findTestObject('Object Repository/Page_STORE/input_Username_loginusername'), 'user1920')

// Set encrypted text in the password field
WebUI.setEncryptedText(findTestObject('Object Repository/Page_STORE/input_Password_loginpassword'), 'b5pCQTWVtVj6IgmQbLgxsg==')

// Click on the 'Log in' button
WebUI.click(findTestObject('Object Repository/Page_STORE/button_Log in'))

// Verify the presence of the 'Welcome user1920' element
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_STORE/a_Welcome user1920'), 0)

// Verify the presence of the 'Home' element
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_STORE/a_Home (current)'), 0)

// Verify the presence of the 'Contact' element
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_STORE/a_Contact'), 0)

// Verify the presence of the 'About us' element
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_STORE/a_About us'), 0)

// Verify the presence of the 'Cart' element
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_STORE/a_Cart'), 0)

// Click on the 'Samsung galaxy s6' link
WebUI.click(findTestObject('Object Repository/Page_STORE/a_Samsung galaxy s6'))

// Click on the 'Add to cart' link
WebUI.click(findTestObject('Object Repository/Page_STORE/a_Add to cart'))

// Click on the 'Cart' link
WebUI.click(findTestObject('Object Repository/Page_STORE/a_Cart_1'))

// Close the browser
WebUI.closeBrowser()
// Open the browser
WebUI.openBrowser('')

// Navigate to the specified URL
WebUI.navigateToUrl('https://www.demoblaze.com/index.html')

// Click on the 'Log in' link
WebUI.click(findTestObject('Object Repository/Page_STORE/a_Log in'))

// Set text in the username field
WebUI.setText(findTestObject('Object Repository/Page_STORE/input_Username_loginusername'), 'user1920')

// Set encrypted text in the password field
WebUI.setEncryptedText(findTestObject('Object Repository/Page_STORE/input_Password_loginpassword'), 'b5pCQTWVtVj6IgmQbLgxsg==')

// Click on the 'Log in' button
WebUI.click(findTestObject('Object Repository/Page_STORE/button_Log in'))

// Verify the presence of the 'Welcome user1920' element
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_STORE/a_Welcome user1920'), 0)

// Verify the presence of the 'Home' element
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_STORE/a_Home (current)'), 0)

// Verify the presence of the 'Contact' element
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_STORE/a_Contact'), 0)

// Verify the presence of the 'About us' element
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_STORE/a_About us'), 0)

// Verify the presence of the 'Cart' element
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_STORE/a_Cart'), 0)

// Click on the 'Samsung galaxy s6' link
WebUI.click(findTestObject('Object Repository/Page_STORE/a_Samsung galaxy s6'))

// Click on the 'Add to cart' link
WebUI.click(findTestObject('Object Repository/Page_STORE/a_Add to cart'))

// Click on the 'Cart' link
WebUI.click(findTestObject('Object Repository/Page_STORE/a_Cart_1'))

// Close the browser
WebUI.closeBrowser()
/*
*  This code performs a series of actions on a web application using Katalon Studio.
*
*  1. Import necessary classes and static methods for Katalon Studio operations.
*  2. Set up aliases for different Katalon Studio keywords and classes.
*  3. Open a browser and navigate to a specific URL.
*  4. Perform a series of actions like clicking on elements, setting text, verifying element presence, and closing the browser.
*/