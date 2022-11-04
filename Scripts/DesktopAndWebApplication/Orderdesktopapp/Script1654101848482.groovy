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

Windows.startApplicationWithTitle('C:\\Users\\AjayBezawada\\Documents\\UiPath\\Desktop_OrderScenarios_Library\\.settings\\APK File\\Orders.exe', 
    'Orders')

Windows.click(findWindowsObject('Object Repository/New Order Button'))

Windows.click(findWindowsObject('Object Repository/Customer Name'))

Windows.setText(findWindowsObject('Object Repository/Customer Name'), Customer)

WebUI.verifyCheckpoint(findCheckpoint('Checkpoints/DesktopApplication/NameCheckpoint'), false)

Windows.setText(findWindowsObject('Object Repository/Streetname'), Street)

WebUI.verifyMatch('73668 East Daniels Way', '73668 East Daniels Way', false)

Windows.click(findWindowsObject('Object Repository/City Name'))

Windows.setText(findWindowsObject('Object Repository/City Name'), City)

WebUI.verifyMatch('Thousands Oaks', 'Thousands Oaks', false)

Windows.setText(findWindowsObject('Object Repository/State Name'), State)

WebUI.verifyMatch('NE', 'NE', false)

Windows.setText(findWindowsObject('Object Repository/Zip code'), zip)

WebUI.verifyMatch('6842', '6842', false)

Windows.click(findWindowsObject('Object Repository/Select CardName'))

Windows.setText(findWindowsObject('Object Repository/CardNumber'), CardNo)

Windows.verifyMatch('1330019087', '1330019087', false)

Windows.setText(findWindowsObject('Object Repository/ExpiryDateOfCard'), ExpDate)

Windows.verifyMatch('01/01/2023', '01/01/2023', false)

Windows.click(findWindowsObject('Ok Button'))

Windows.click(findWindowsObject('Edit OrderButton'))

Windows.click(findWindowsObject('Object Repository/Click CustomerName'))

Windows.clearText(findWindowsObject('Object Repository/Edit CustomerName'))

Windows.setText(findWindowsObject('Object Repository/Edit CustomerName'), Edit_Customer)

Windows.verifyMatch('Kristen', 'Kristen', false)

Windows.click(findWindowsObject('Ok Button'))

Windows.click(findWindowsObject('Delete Button'))

Windows.click(findWindowsObject('Confirmation page'))

Windows.click(findWindowsObject('Yes Button'))

Windows.click(findWindowsObject('Close application Button'))

Windows.click(findWindowsObject('No Button'))

