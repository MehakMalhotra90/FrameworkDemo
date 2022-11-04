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
    'Orders - Untitled')

Windows.clickElementOffset(findWindowsObject('Object Repository/Button'), 228, 83)

Windows.clickElementOffset(findWindowsObject('Object Repository/Customer Name'), 196, 104)

Windows.setText(findWindowsObject('Object Repository/Customer Name'), 'Daniel Vazquez')

Windows.clickElementOffset(findWindowsObject('Object Repository/Streetname'), 223, 110)

Windows.setText(findWindowsObject('Object Repository/Streetname'), 'Hyderabad')

Windows.clickElementOffset(findWindowsObject('Object Repository/City Name'), 273, 119)

Windows.setText(findWindowsObject('Object Repository/City Name'), 'Telengana')

Windows.clickElementOffset(findWindowsObject('Object Repository/State Name'), 197, 147)

Windows.setText(findWindowsObject('Object Repository/State Name'), '1234567890')

Windows.clickElementOffset(findWindowsObject('Object Repository/New Order Button'), 262, 169)

Windows.clickElementOffset(findWindowsObject('Object Repository/Text'), 178, 93)

Windows.clickElementOffset(findWindowsObject('Object Repository/Click CustomerName'), 170, 82)

Windows.clickElementOffset(findWindowsObject('Object Repository/Button(3)'), 234, 139)

Windows.clickElementOffset(findWindowsObject('Object Repository/Button(4)'), 285, 80)

Windows.clickElementOffset(findWindowsObject('Object Repository/Button(5)'), 221, 138)

