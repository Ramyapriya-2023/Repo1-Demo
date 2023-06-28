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

WebUI.waitForPageLoad(5)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_Pack Back/span_Login'))

WebUI.setText(findTestObject('Object Repository/Page_Pack Back/input_Login_user'), 'manand84')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Pack Back/input_User name_passwrd'), 'txM1IAQ7a9o5149Gnc87pA==')

WebUI.click(findTestObject('Object Repository/Page_Pack Back/mat-icon_visibility'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('Object Repository/Page_Pack Back/button_Login'))

WebUI.waitForPageLoad(5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Pack Back/div_Anand Manickam'), 0)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Page_Pack Back/img_(800) 592-5489_mainImg'))

WebUI.click(findTestObject('Object Repository/Page_Pack Back/button_Keep me logged in'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Object Repository/Page_Pack Back/img_(800) 592-5489_mainImg'))

WebUI.click(findTestObject('Object Repository/Page_Pack Back/button_Log me out'))

WebUI.enableSmartWait()

WebUI.closeBrowser()

