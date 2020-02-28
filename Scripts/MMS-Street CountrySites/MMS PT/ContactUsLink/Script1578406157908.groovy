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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.m-ms.pt/')

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/MMS-Street CountrySites/MMS PT/AgeGate-DD'), '01')

WebUI.setText(findTestObject('Object Repository/MMS-Street CountrySites/MMS PT/AgeGate-MM'), '01')

WebUI.setText(findTestObject('Object Repository/MMS-Street CountrySites/MMS PT/AgeGate-YYYY'), '1990')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/MMS-Street CountrySites/MMS PT/AgeGate-Submit'))

WebUI.scrollToPosition(9999999, 9999999)

WebUI.click(findTestObject('Object Repository/MMS-Street CountrySites/MMS PT/ContactUsLink'))

WebUI.delay(2)

String URL = WebUI.getUrl()

WebUI.verifyMatch(URL, 'https://www.m-ms.pt/contact-us', false)

WebUI.closeBrowser()