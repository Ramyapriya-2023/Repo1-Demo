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

WebUI.navigateToUrl('https://packbacktest.usecology.com/pack-back/lightbulbs')

WebUI.maximizeWindow()

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Object Repository/Page_Pack Back/div_Create an Account_roundBtn roundBtnwhit_121ccf'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Pack Back/div_Add any one item to cart'))

WebUI.click(findTestObject('Object Repository/Page_Pack Back/span_Quantity_fa fa-plus qtyIcon'))

WebUI.click(findTestObject('Object Repository/Page_Pack Back/span_Quantity_fa fa-plus qtyIcon'))

WebUI.click(findTestObject('Object Repository/Page_Pack Back/button_Add to Cart'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Pack Back/div_Cart Updated'))

WebUI.click(findTestObject('Object Repository/Page_Pack Back/img_Create an Account_cart_ctBtn'))

WebUI.click(findTestObject('Object Repository/Page_Pack Back/i_285.00_fa fa-trash-o'))

WebUI.click(findTestObject('Object Repository/Page_Pack Back/button_Delete'))

WebUI.click(findTestObject('Object Repository/Page_Pack Back/p_Check Out'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Pack Back/div_Cart is empty. Any one item added to cart'))

WebUI.takeScreenshot()

WebUI.closeBrowser()

