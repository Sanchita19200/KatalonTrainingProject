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

WebUI.navigateToUrl('https://www.usertesting.com/get-paid-to-test')

WebUI.rightClick(findTestObject('Object Repository/Page_Get Paid to Test  Make Money Online  S_84d4cb/img_Get started_lazyloaded'))

WebUI.rightClick(findTestObject('Object Repository/Page_Get Paid to Test  Make Money Online  S_84d4cb/h1_Boost your monthly income in your free time'))

WebUI.rightClick(findTestObject('Object Repository/Page_Get Paid to Test  Make Money Online  S_84d4cb/p_Try the ultimate side hustle. Its easy, f_9b9a41'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Get Paid to Test  Make Money Online  S_84d4cb/h1_Boost your monthly income in your free time'), 
    'Boost your monthly income in your free time')

WebUI.verifyElementText(findTestObject('Object Repository/Page_(2) New Messages/p_Try the ultimate side hustle. Its easy, f_9b9a41'), 
    'Try the ultimate side hustle. It’s easy, fast, and simple. Share your perspective on products and experiences and make money online from the comfort of your home.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Get Paid to Test  Make Money Online  S_84d4cb/button_Get started'), 
    0)

WebUI.rightClick(findTestObject('Object Repository/Page_(2) New Messages/img_Learn more_ls-is-cached lazyloaded'))

WebUI.click(findTestObject('Object Repository/Page_(2) New Messages/div_Learn more_vertical-tab-right-content-2'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Get Paid to Test  Make Money Online  S_84d4cb/a_Sign In'))

WebUI.closeBrowser()

