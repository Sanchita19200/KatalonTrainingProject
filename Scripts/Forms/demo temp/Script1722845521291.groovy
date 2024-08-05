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

WebUI.navigateToUrl('https://themehunk.com/templates/amaze-mania/')

WebUI.rightClick(findTestObject('Object Repository/Page_Amaze Mania- Amazon Like Demo eCommerc_91ddb4/label_Unlimited Sites      Yearly      49.00 59.00'))

WebUI.mouseOver(findTestObject('Object Repository/Page_Amaze Mania- Amazon Like Demo eCommerc_91ddb4/button_Allow'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Amaze Mania- Amazon Like Demo eCommerc_91ddb4/button_Allow'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Amaze Mania- Amazon Like Demo eCommerc_91ddb4/button_Allow'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Amaze Mania- Amazon Like Demo eCommerc_91ddb4/label_Unlimited Sites      Yearly      49.00 59.00'), 
    0)

