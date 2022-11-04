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

WebUI.navigateToUrl('https://www.amazon.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_Amazon.com. Spend less. Smile more/a_Hello, Sign in  Account  Lists'))

WebUI.setText(findTestObject('Object Repository/Page_Amazon Sign-In/input_Email or mobile phone number_email'), Username)

WebUI.verifyMatch(Username, Username, false)

WebUI.click(findTestObject('Object Repository/Page_Amazon Sign-In/input_Enter your email or mobile phone numb_fc7402'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Amazon Sign-In/input_Forgot your password_password'), Password)

WebUI.verifyMatch(Password, Password, false)

WebUI.click(findTestObject('Object Repository/Page_Amazon Sign-In/div_Please Enable Cookies to Continue      _8c8bcd'))

WebUI.click(findTestObject('Object Repository/Page_Amazon Sign-In/div_Sign-In                      testingtx2_9ecf4f'))

WebUI.click(findTestObject('Object Repository/Page_Amazon Sign-In/input_Enter your password_signInSubmit'))

WebUI.setText(findTestObject('Object Repository/Page_Amazon.com. Spend less. Smile more/input_All_field-keywords'), BookName)

WebUI.verifyMatch(BookName, BookName, false)

WebUI.click(findTestObject('Object Repository/Page_Amazon.com. Spend less. Smile more/input_All_nav-search-submit-button'))

WebUI.click(findTestObject('Object Repository/Page_Amazon.com  Alchemist/img_Best Seller_s-image'))

WebUI.click(findTestObject('Object Repository/Page_The Alchemist, 25th Anniversary A Fabl_ebcfbb/input_Shipping cost, delivery date, and ord_223673'))

WebUI.click(findTestObject('Object Repository/Page_Amazon.com Shopping Cart/span_Orders_nav-cart-icon nav-sprite'))

WebUI.click(findTestObject('Object Repository/Page_Amazon.com Shopping Cart/i_View fullhistory_hm-icon nav-sprite'))

WebUI.click(findTestObject('Object Repository/Page_Amazon.com Shopping Cart/a_Sign Out'))

WebUI.closeBrowser()

