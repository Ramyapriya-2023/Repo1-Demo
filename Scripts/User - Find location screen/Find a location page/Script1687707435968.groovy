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

WebUI.navigateToUrl('https://www.usecology.com/locations')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Find Location - user/Page_Locations  US Ecology/span_United States'))

WebUI.setText(findTestObject('Object Repository/Find Location - user/Page_Locations  US Ecology/input_Search Location_field_geocode_proximi_d80d32'), 
    'NY')

WebUI.click(findTestObject('Object Repository/Find Location - user/Page_Locations  US Ecology/ul_Filter by Service_chosen-choices'))

WebUI.click(findTestObject('Object Repository/Find Location - user/Page_Locations  US Ecology/li_Field Services'))

WebUI.click(findTestObject('Object Repository/Find Location - user/Page_Locations  US Ecology/ul_Field Services'))

WebUI.click(findTestObject('Object Repository/Find Location - user/Page_Locations  US Ecology/li_Industrial Services'))

WebUI.click(findTestObject('Object Repository/Find Location - user/Page_Locations  US Ecology/ul_Field ServicesIndustrial Services'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Find Location - user/Page_Locations  US Ecology/ul_Field ServicesIndustrial Services'))

WebUI.click(findTestObject('Object Repository/Find Location - user/Page_Locations  US Ecology/li_Recycling Services'))

WebUI.click(findTestObject('Object Repository/Find Location - user/Page_Locations  US Ecology/button_Find a Location'))

WebUI.waitForPageLoad(10)

WebUI.scrollToPosition(3, 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Find Location - user/Page_Locations  US Ecology/div_US Ecology Tilbury22153 King  Whittle R_b6353b_1'))

WebUI.takeScreenshot()

WebUI.waitForPageLoad(10)

WebUI.closeBrowser()

