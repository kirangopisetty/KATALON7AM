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

WebUI.openBrowser('https://practice.expandtesting.com/inputs')

WebUI.maximizeWindow()

WebUI.enableSmartWait()

WebUI.focus(findTestObject('ELEMENT/number'))

WebUI.delay(2)

WebUI.setMaskedText(findTestObject('ELEMENT/number'), '12345')

WebUI.delay(2)

WebUI.clearText(findTestObject('ELEMENT/number'))

List allLinks = WebUI.getAllLinksOnCurrentPage(false, [])

println('The links found on the website are ' + allLinks)

String varWidth = WebUI.getCSSValue(findTestObject('ELEMENT/number'), 'width')

println('The width of the NUMBER textbox is ' + varWidth)

String varHeight = WebUI.getCSSValue(findTestObject('ELEMENT/number'), 'height')

println('The height of the NUMBER textbox is ' + varHeight)

String padLeft = WebUI.getCSSValue(findTestObject('ELEMENT/number'), 'padding-left')

println('The padding left position of the NUMBER textbox is ' + padLeft)

String height1 = WebUI.getElementHeight(findTestObject('ELEMENT/number'))

println('The height of the NUMBER textbox is ' + height1)

String width1 = WebUI.getElementWidth(findTestObject('ELEMENT/number'))

println('The width of the NUMBER textbox is ' + width1)

WebUI.closeBrowser()

