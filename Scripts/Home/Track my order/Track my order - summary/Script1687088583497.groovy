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

WebUI.click(findTestObject('Object Repository/Page_Pack Back/img_HOW IT WORKS_card-img-top ng-star-inserted'))

WebUI.click(findTestObject('Object Repository/Page_Pack Back/button_Submit Query (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Pack Back/input_Shipping Tracking_form-control form-c_3736a9'), '12345')

WebUI.click(findTestObject('Object Repository/Page_Pack Back/button_Submit Query (1)'))

WebUI.switchToWindowTitle('Tracking | UPS - United States')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Tracking  UPS - United States/img'), 0)

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Tracking  UPS - United States/h3_We are unable to complete your tracking _21d811'), 
    0)

WebUI.takeScreenshot()

WebUI.closeBrowser()

