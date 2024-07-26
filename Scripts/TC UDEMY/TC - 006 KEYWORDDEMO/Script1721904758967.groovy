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

CustomKeywords.'MyKeywords.hello'()

CustomKeywords.'MyKeywords.helloUser'('Sanchita')

CustomKeywords.'MyKeywords.openBrowserAndNavigate'('https://parabank.parasoft.com/parabank/index.htm')

CustomKeywords.'MyKeywords.closeBrowser'()

CustomKeywords.'MyKeywords.customMessage'('This is a custom message')


// Import necessary libraries
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

// Call a custom keyword named 'hello'
CustomKeywords.'MyKeywords.hello'()

// Call a custom keyword named 'helloUser' with parameter 'Sanchita'
CustomKeywords.'MyKeywords.helloUser'('Sanchita')

// Call a custom keyword named 'openBrowserAndNavigate' with parameter 'https://parabank.parasoft.com/parabank/index.htm'
CustomKeywords.'MyKeywords.openBrowserAndNavigate'('https://parabank.parasoft.com/parabank/index.htm')

// Call a custom keyword named 'closeBrowser'
CustomKeywords.'MyKeywords.closeBrowser'()

// Call a custom keyword named 'customMessage' with parameter 'This is a custom message'
CustomKeywords.'MyKeywords.customMessage'('This is a custom message')
/*
*  Import necessary libraries and call custom keywords for test automation.
*
*  1. Import necessary libraries and custom keywords.
*  2. Call custom keyword 'hello' without parameters.
*  3. Call custom keyword 'helloUser' with parameter 'Sanchita'.
*  4. Call custom keyword 'openBrowserAndNavigate' with URL parameter.
*  5. Call custom keyword 'closeBrowser'.
*  6. Call custom keyword 'customMessage' with a custom message parameter.
*
*/