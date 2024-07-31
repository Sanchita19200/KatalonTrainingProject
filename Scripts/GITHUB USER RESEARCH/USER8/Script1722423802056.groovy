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

WebUI.navigateToUrl('https://simonsmith.github.io/github-user-search/#/search')

WebUI.setText(findTestObject('Object Repository/USER8/Page_Github user search/input_Search for a user_searchInput'), 'Rohit ')

WebUI.sendKeys(findTestObject('Object Repository/USER8/Page_Github user search/input_Search for a user_searchInput'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/USER8/Page_Rohit - Page 1 - Github user search/p_jrohitofficial'))

WebUI.click(findTestObject('Object Repository/USER8/Page_jrohitofficials profile - Github user search/a_Doctor-Portfolio'))

WebUI.verifyElementText(findTestObject('Object Repository/USER8/Page_GitHub - jrohitofficialDoctor-Portfolio/a_first commit'), 
    'first commit')

WebUI.closeBrowser()

