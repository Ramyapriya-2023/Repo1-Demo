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

WebUI.navigateToUrl('https://packbacktest.usecology.com/')

WebUI.maximizeWindow()

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Object Repository/Page_Pack Back/div_TRACK MY ORDER  ORDER HISTORY'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Object Repository/Page_Pack Back/button_Submit Query'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Pack Back/div_Please enter the Order ID'), 'Please enter the Order ID')

WebUI.waitForPageLoad(15)

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Page_Pack Back/input_Order ID_form-control form-control-sm_90fb7f'), '1234')

WebUI.click(findTestObject('Object Repository/Page_Pack Back/button_Submit Query'))

WebUI.takeScreenshot()

WebUI.verifyElementText(findTestObject('Object Repository/Page_Pack Back/div_No records found'), 'No records found')

WebUI.waitForPageLoad(10)

WebUI.closeBrowser()

