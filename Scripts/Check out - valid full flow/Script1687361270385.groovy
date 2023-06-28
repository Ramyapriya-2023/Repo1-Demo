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

WebUI.click(findTestObject('Object Repository/check out order/Page_Pack Back/Page_Pack Back/Guest - valid check out flow/Page_Pack Back/img_BATTERIES_card-img-top ng-star-inserted'))

WebUI.click(findTestObject('Object Repository/check out order/Page_Pack Back/Page_Pack Back/Guest - valid check out flow/Page_Pack Back/span_Quantity_fa fa-plus qtyIcon'))

WebUI.click(findTestObject('Object Repository/check out order/Page_Pack Back/Page_Pack Back/Guest - valid check out flow/Page_Pack Back/button_Buy Now'))

WebUI.click(findTestObject('Object Repository/check out order/Page_Pack Back/Page_Pack Back/Guest - valid check out flow/Page_Pack Back/p_Check Out'))

WebUI.click(findTestObject('Object Repository/check out order/Page_Pack Back/Page_Pack Back/Guest - valid check out flow/Page_Pack Back/button_Continue as a guest'))

WebUI.setText(findTestObject('Object Repository/check out order/Page_Pack Back/Page_Pack Back/Guest - valid check out flow/Page_Pack Back/input_First Name_fname'), 
    'Ram')

WebUI.setText(findTestObject('Object Repository/check out order/Page_Pack Back/Page_Pack Back/Guest - valid check out flow/Page_Pack Back/input_Last Name_lname'), 
    'K')

WebUI.setText(findTestObject('Object Repository/check out order/Page_Pack Back/Page_Pack Back/Guest - valid check out flow/Page_Pack Back/input_Email_emailid'), 
    'rq@yopmail.com')

WebUI.setText(findTestObject('Object Repository/check out order/Page_Pack Back/Page_Pack Back/Guest - valid check out flow/Page_Pack Back/input_Phone_cusphone'), 
    '(999) 909-0909')

WebUI.setText(findTestObject('Object Repository/check out order/Page_Pack Back/Page_Pack Back/Guest - valid check out flow/Page_Pack Back/input_Purchase Order_purchase_order'), 
    '1111')

WebUI.setText(findTestObject('Object Repository/check out order/Page_Pack Back/Page_Pack Back/Guest - valid check out flow/Page_Pack Back/input_Business Name_bussiness'), 
    'ram')

WebUI.click(findTestObject('Object Repository/check out order/Page_Pack Back/Page_Pack Back/Guest - valid check out flow/Page_Pack Back/input_Shipping Address_checkbox-custom posi_83da50'))

WebUI.setText(findTestObject('Object Repository/check out order/Page_Pack Back/Page_Pack Back/Guest - valid check out flow/Page_Pack Back/input_Attention_attension'), 
    'ram')

WebUI.setText(findTestObject('Object Repository/check out order/Page_Pack Back/Page_Pack Back/Guest - valid check out flow/Page_Pack Back/input_Invoice Address_address1'), 
    'ram@yopmail.com')

WebUI.setText(findTestObject('Object Repository/check out order/Page_Pack Back/Page_Pack Back/Guest - valid check out flow/Page_Pack Back/input_City_city'), 
    'NY')

WebUI.selectOptionByValue(findTestObject('Object Repository/check out order/Page_Pack Back/Page_Pack Back/Guest - valid check out flow/Page_Pack Back/select_Alabama Alaska Arizona Arkansas Cali_3f3d84'), 
    'ME', true)

WebUI.setText(findTestObject('Object Repository/check out order/Page_Pack Back/Page_Pack Back/Guest - valid check out flow/Page_Pack Back/input_Zip Code_zipcode'), 
    '12343')

WebUI.click(findTestObject('Object Repository/check out order/Page_Pack Back/Page_Pack Back/Guest - valid check out flow/Page_Pack Back/button_Proceed To Payment'))

WebUI.click(findTestObject('Object Repository/check out order/Page_Pack Back/Page_Pack Back/Guest - valid check out flow/Page_Pack Back/input_Shipping Address_checkbox-custom posi_83da50'))

WebUI.click(findTestObject('Object Repository/check out order/Page_Pack Back/Page_Pack Back/Guest - valid check out flow/Page_Pack Back/button_Confirm Order'))

WebUI.setText(findTestObject('Object Repository/check out order/Page_Pack Back/Page_Pack Back/Guest - valid check out flow/Page_Pack Back/input_Pay 220.00_card_number'), 
    '4242 4242 4242 4242')

WebUI.setText(findTestObject('Object Repository/check out order/Page_Pack Back/Page_Pack Back/Guest - valid check out flow/Page_Pack Back/input_Pay 220.00_cc-exp'), 
    '11 / 25')

WebUI.setText(findTestObject('Object Repository/check out order/Page_Pack Back/Page_Pack Back/Guest - valid check out flow/Page_Pack Back/input_Pay 220.00_cc-csc'), 
    '123')

WebUI.click(findTestObject('Object Repository/check out order/Page_Pack Back/Page_Pack Back/Guest - valid check out flow/Page_Pack Back/span_Pay 220.00'))

WebUI.waitForPageLoad(5)

WebUI.takeScreenshot()

WebUI.closeBrowser()

