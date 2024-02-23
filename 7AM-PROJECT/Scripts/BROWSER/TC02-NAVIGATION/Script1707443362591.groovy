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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.hermanmiller.com/en_in/')

WebUI.waitForPageLoad(8)

WebUI.delay(2)

String attributeReceived = WebUI.getAttribute(findTestObject('HERMAN-MILLER/discoverNow'), 'class')

WebUI.doubleClick(findTestObject('HERMAN-MILLER/discoverNow'))

println('The attribute received for discoverNow button is ' + attributeReceived)

WebUI.waitForAngularLoad(6)

WebUI.back()

WebUI.delay(2)

String attReceived = WebUI.getAttribute(findTestObject('HERMAN-MILLER/sculptingPlay'), 'class')

WebUI.click(findTestObject('HERMAN-MILLER/sculptingPlay'))

println('The attribute received for sculptingPlay button is ' + attReceived)

WebUI.waitForJQueryLoad(5)

WebUI.refresh()

WebUI.back()

WebUI.delay(2)

WebUI.forward()

WebUI.closeBrowser()

