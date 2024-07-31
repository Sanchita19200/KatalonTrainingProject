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

WebUI.setText(findTestObject('Object Repository/USER10/Page_Github user search/input_Search for a user_searchInput'), 'Kaleb')

WebUI.sendKeys(findTestObject('Object Repository/USER10/Page_Github user search/input_Search for a user_searchInput'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/USER10/Page_Kaleb - Page 1 - Github user search/p_Kaleb47'))

WebUI.rightClick(findTestObject('Object Repository/USER10/Page_Kaleb47s profile - Github user search/img_Submit_Avatar_1pcpsid u-imgResponsive'))

WebUI.rightClick(findTestObject('Object Repository/USER10/Page_Kaleb47s profile - Github user search/p_Bails is a Bitcoin solution protecting ag_456d58'))

WebUI.click(findTestObject('Object Repository/USER10/Page_Kaleb47s profile - Github user search/div_KalebKaleb47Cypherpunks write Code orga_2d4011'))

WebUI.click(findTestObject('Object Repository/USER10/Page_Kaleb47s profile - Github user search/a_Bails'))

WebUI.closeBrowser()

