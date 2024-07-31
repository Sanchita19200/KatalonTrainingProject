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

WebUI.setText(findTestObject('Object Repository/GITUSER9/Page_Github user search/input_Search for a user_searchInput'), 
    'Kritika')

WebUI.sendKeys(findTestObject('Object Repository/GITUSER9/Page_Github user search/input_Search for a user_searchInput'), 
    Keys.chord(Keys.ENTER))

WebUI.verifyElementText(findTestObject('Object Repository/GITUSER9/Page_Kritika - Page 1 - Github user search/p_kritika-srivastava'), 
    'kritika-srivastava')

WebUI.verifyElementPresent(findTestObject('Object Repository/GITUSER9/Page_Kritika - Page 1 - Github user search/p_kritika-srivastava'), 
    0)

WebUI.rightClick(findTestObject('Object Repository/GITUSER9/Page_Kritika - Page 1 - Github user search/p_kritika-srivastava'))

WebUI.click(findTestObject('Object Repository/GITUSER9/Page_Kritika - Page 1 - Github user search/p_Kritikalcoder'))

WebUI.click(findTestObject('Object Repository/GITUSER9/Page_Kritikalcoders profile - Github user search/a_ground_up_basics_trust_ml'))

WebUI.doubleClick(findTestObject('Object Repository/GITUSER9/Page_GitHub - Kritikalcoderground_up_basics_3249b6/strong_Ground Up Basics for Trustworthy Mac_909278'))

WebUI.verifyElementText(findTestObject('Object Repository/GITUSER9/Page_GitHub - Kritikalcoderground_up_basics_3249b6/strong_Ground Up Basics for Trustworthy Mac_909278'), 
    'Ground Up Basics for Trustworthy Machine Learning')

WebUI.closeBrowser()

