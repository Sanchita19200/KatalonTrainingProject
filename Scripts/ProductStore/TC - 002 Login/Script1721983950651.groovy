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

