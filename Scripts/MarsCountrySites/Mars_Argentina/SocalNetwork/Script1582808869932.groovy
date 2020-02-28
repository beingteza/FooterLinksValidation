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
WebUI.navigateToUrl('https://arg.mars.com/')
WebUI.delay(1)
WebUI.scrollToPosition(9999999, 9999999)
WebUI.click(findTestObject('Object Repository/MarsCountrySites/Mars_Argentina/Facebook'))
WebUI.delay(2)
WebUI.switchToWindowIndex(1)
String URL = WebUI.getUrl()
WebUI.verifyMatch(URL, 'https://www.facebook.com/Mars', false)



WebUI.openBrowser('')
WebUI.maximizeWindow()
WebUI.navigateToUrl('https://arg.mars.com/')
WebUI.delay(1)
WebUI.scrollToPosition(9999999, 9999999)
WebUI.click(findTestObject('Object Repository/MarsCountrySites/Mars_Argentina/LinkedIn'))
WebUI.delay(2)
WebUI.switchToWindowIndex(1)
String URL = WebUI.getUrl()
WebUI.verifyMatch(URL, 'https://www.linkedin.com/company/mars', false)




WebUI.maximizeWindow()
WebUI.navigateToUrl('https://arg.mars.com/')
WebUI.delay(1)
WebUI.scrollToPosition(9999999, 9999999)
WebUI.click(findTestObject('Object Repository/MarsCountrySites/Mars_Argentina/Instagram'))
WebUI.delay(2)
WebUI.switchToWindowIndex(1)
String URL = WebUI.getUrl()
WebUI.verifyMatch(URL, 'https://www.instagram.com/marsglobal/', false)
WebUI.closeBrowser()




WebUI.openBrowser('')
WebUI.maximizeWindow()
WebUI.navigateToUrl('https://arg.mars.com/')
WebUI.delay(1)
WebUI.scrollToPosition(9999999, 9999999)
WebUI.click(findTestObject('Object Repository/MarsCountrySites/Mars_Argentina/Youtube'))
WebUI.delay(2)
WebUI.switchToWindowIndex(1)
String URL = WebUI.getUrl()
WebUI.verifyMatch(URL, 'https://www.youtube.com/user/Mars', false)
WebUI.closeBrowser()

WebUI.openBrowser('')
WebUI.maximizeWindow()
WebUI.navigateToUrl('https://arg.mars.com/')
WebUI.delay(1)
WebUI.scrollToPosition(9999999, 9999999)
WebUI.click(findTestObject('Object Repository/MarsCountrySites/Mars_Argentina/Twitter'))
WebUI.delay(2)
WebUI.switchToWindowIndex(1)
String URL = WebUI.getUrl()
WebUI.verifyMatch(URL, 'https://twitter.com/Marsglobal', false)
WebUI.closeBrowser()