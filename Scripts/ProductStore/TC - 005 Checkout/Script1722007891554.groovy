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

WebUI.navigateToUrl('https://www.demoblaze.com/cart.html')

WebUI.click(findTestObject('Object Repository/ProductStore/Checkout/Page_STORE/button_Place Order'))

WebUI.setText(findTestObject('Object Repository/ProductStore/Checkout/Page_STORE/input_Name_name'), 'sanchita')

WebUI.setText(findTestObject('Object Repository/ProductStore/Checkout/Page_STORE/input_Country_country'), 'south africa')

WebUI.setText(findTestObject('Object Repository/ProductStore/Checkout/Page_STORE/input_City_city'), 'Johannesburg')

WebUI.setText(findTestObject('Object Repository/ProductStore/Checkout/Page_STORE/input_Credit card_card'), '56789087654535678')

WebUI.setText(findTestObject('Object Repository/ProductStore/Checkout/Page_STORE/input_Month_month'), '8')

WebUI.setText(findTestObject('Object Repository/ProductStore/Checkout/Page_STORE/input_Year_year'), '2009')

WebUI.click(findTestObject('Object Repository/ProductStore/Checkout/Page_STORE/button_Purchase'))

WebUI.verifyElementText(findTestObject('Object Repository/ProductStore/Checkout/Page_STORE/h2_Thank you for your purchase'), 'Thank you for your purchase!')

WebUI.click(findTestObject('Object Repository/ProductStore/Checkout/Page_STORE/p_Id 1785939Amount 360 USDCard Number 56789_d8cda5'))

WebUI.verifyElementPresent(findTestObject('Object Repository/ProductStore/Checkout/Page_STORE/p_Id 1785939Amount 360 USDCard Number 56789_d8cda5'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/ProductStore/Checkout/Page_STORE/button_OK'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/ProductStore/Checkout/Page_STORE/p_Id 1785939Amount 360 USDCard Number 56789_d8cda5'), 
    'Id: 1785939Amount: 360 USDCard Number: 56789087654535678Name: sanchitaDate: 26/6/2024')

WebUI.verifyElementPresent(findTestObject('Object Repository/ProductStore/Checkout/Page_STORE/button_OK'), 0)

WebUI.click(findTestObject('Object Repository/ProductStore/Checkout/Page_STORE/button_OK'))

WebUI.click(findTestObject('Object Repository/ProductStore/Checkout/Page_STORE/a_Welcome user1920'))

WebUI.closeBrowser()

