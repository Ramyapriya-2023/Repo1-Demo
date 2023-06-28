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

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Object Repository/Page_Pack Back/span_Create an Account'))

WebUI.setText(findTestObject('Object Repository/Page_Pack Back/input_First Name_fname'), 'Razal')

WebUI.setText(findTestObject('Object Repository/Page_Pack Back/input_Last Name_lname'), 'K')

WebUI.setText(findTestObject('Object Repository/Page_Pack Back/input_User Name_uname'), 'Goral')

WebUI.setText(findTestObject('Object Repository/Page_Pack Back/input_Phone_cusphone'), '(998) 719-8109')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Pack Back/input_Password_password'), 'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Pack Back/input_Confirm Password_cpassword'), 'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.setText(findTestObject('Object Repository/Page_Pack Back/input_Email_emailid'), 'r01@yopmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Pack Back/input_Business Name_bussiness'), 'Glow Trans Lmt')

WebUI.setText(findTestObject('Object Repository/Page_Pack Back/input_Attention_attension'), 'A1')

WebUI.setText(findTestObject('Object Repository/Page_Pack Back/input_Invoice Address_address1'), 'no,112 Howard Street')

WebUI.setText(findTestObject('Object Repository/Page_Pack Back/input_City_city'), 'NY')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Pack Back/select_Alabama Alaska Arizona Arkansas Cali_3f3d84'), 
    'AL', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Pack Back/select_Alabama Alaska Arizona Arkansas Cali_3f3d84'), 
    'FL', true)

WebUI.setText(findTestObject('Object Repository/Page_Pack Back/input_Zip Code_zipcode'), '987862')

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Object Repository/Page_Pack Back/button_Register'))

WebUI.waitForPageLoad(5)

WebUI.takeScreenshot()

WebUI.closeBrowser()

