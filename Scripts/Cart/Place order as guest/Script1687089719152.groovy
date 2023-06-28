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

WebUI.click(findTestObject('Object Repository/check out order/Page_Pack Back/img_LIGHT BULBS_card-img-top ng-star-inserted'))

WebUI.click(findTestObject('Object Repository/check out order/Page_Pack Back/button_Add to Cart'))

WebUI.click(findTestObject('Object Repository/check out order/Page_Pack Back/div_1'))

WebUI.click(findTestObject('Object Repository/check out order/Page_Pack Back/p_Continue to Shopping'))

WebUI.click(findTestObject('Object Repository/check out order/Page_Pack Back/img_Click here to learn more_card-img-top n_392060'))

WebUI.click(findTestObject('Object Repository/check out order/Page_Pack Back/button_Add to Cart'))

WebUI.click(findTestObject('Object Repository/check out order/Page_Pack Back/div_2'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/check out order/Page_Pack Back/p_Check Out'))

WebUI.click(findTestObject('Object Repository/check out order/Page_Pack Back/button_Continue as a guest'))

WebUI.click(findTestObject('Object Repository/check out order/Page_Pack Back/button_Proceed To Payment'))

WebUI.verifyElementVisible(findTestObject('Object Repository/check out order/Page_Pack Back/div_Please fill the Required fields'))

WebUI.setText(findTestObject('Object Repository/check out order/Page_Pack Back/input_First Name_fname'), 'Raj')

WebUI.setText(findTestObject('Object Repository/check out order/Page_Pack Back/input_Last Name_lname'), 'L')

WebUI.setText(findTestObject('Object Repository/check out order/Page_Pack Back/input_Email_emailid'), 'raj1@yopmail.com')

WebUI.setText(findTestObject('Object Repository/check out order/Page_Pack Back/input_Phone_cusphone'), '(989) 878-9878')

WebUI.setText(findTestObject('Object Repository/check out order/Page_Pack Back/input_Business Name_bussiness'), 'Smart Zone')

WebUI.click(findTestObject('Object Repository/check out order/Page_Pack Back/input_Shipping Address_checkbox-custom posi_83da50'))

WebUI.setText(findTestObject('Object Repository/check out order/Page_Pack Back/input_Attention_attension'), 'SZ')

WebUI.setText(findTestObject('Object Repository/check out order/Page_Pack Back/input_Invoice Address_address1'), 'Smith road')

WebUI.setText(findTestObject('Object Repository/check out order/Page_Pack Back/input_Zip Code_zipcode'), '')

WebUI.setText(findTestObject('Object Repository/check out order/Page_Pack Back/input_Invoice Address_address1'), '71, cherry court zat zone')

WebUI.setText(findTestObject('Object Repository/check out order/Page_Pack Back/input_City_city'), 'NY')

WebUI.selectOptionByValue(findTestObject('Object Repository/check out order/Page_Pack Back/select_Alabama Alaska Arizona Arkansas Cali_3f3d84'), 
    'HI', true)

WebUI.setText(findTestObject('Object Repository/check out order/Page_Pack Back/input_Zip Code_zipcode'), '98999')

WebUI.waitForPageLoad(15)

WebUI.click(findTestObject('Object Repository/check out order/Page_Pack Back/button_Proceed To Payment'))

WebUI.waitForPageLoad(15)

WebUI.click(findTestObject('Object Repository/check out order/Page_Pack Back/button_Confirm Order'))

WebUI.waitForPageLoad(10)

WebUI.waitForElementVisible(findTestObject('Object Repository/check out order/Page_Pack Back/div_Check Terms  Conditions'), 
    0)

WebUI.takeScreenshot()

WebUI.click(findTestObject('check out order/Page_Pack Back/Page_Pack Back/input_Louisiana sa212_checkbox-custom position-absolute ng-untouched ng-valid ng-dirty'))

WebUI.click(findTestObject('Object Repository/check out order/Page_Pack Back/button_Confirm Order'))

WebUI.setText(findTestObject('Object Repository/check out order/Page_Pack Back/input_Pay 265.00_card_number'), '4242')

WebUI.setText(findTestObject('Object Repository/check out order/Page_Pack Back/input_Pay 265.00_cc-exp'), '1225')

WebUI.setText(findTestObject('Object Repository/check out order/Page_Pack Back/input_Pay 265.00_cc-csc'), '123')

WebUI.click(findTestObject('Object Repository/check out order/Page_Pack Back/span_Pay 265.00'))

WebUI.takeScreenshot()

WebUI.closeBrowser()

