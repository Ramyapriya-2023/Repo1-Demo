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

WebUI.setText(findTestObject('Object Repository/Home page/Page_Pack Back/input_Click here to learn more_search'), 'certifi')

WebUI.click(findTestObject('Object Repository/Home page/Page_Pack Back/img_Click here to learn more_card-img-top n_392060'))

WebUI.click(findTestObject('Object Repository/Home page/Page_Pack Back/input_Order ID_form-control form-control-sm_90fb7f'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Home page/Page_Pack Back/div_Order ID Submit Query'), 0)

WebUI.waitForPageLoad(10)

WebUI.closeBrowser()

