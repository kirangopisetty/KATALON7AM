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

WebUI.navigateToUrl('https://blazedemo.com/')

WebUI.selectOptionByValue(findTestObject('BLAZEDEMO/from'), from, false)

WebUI.selectOptionByValue(findTestObject('BLAZEDEMO/to'), to, false)

WebUI.click(findTestObject('BLAZEDEMO/findFlightsButton'))

WebUI.enhancedClick(findTestObject('BLAZEDEMO/chooseThisFlight'))

WebUI.verifyTextPresent('Please submit the form below to purchase the flight', false)

WebUI.takeScreenshot()

WebUI.setText(findTestObject('BLAZEDEMO/name'), name)

WebUI.setText(findTestObject('BLAZEDEMO/address'), address)

WebUI.setText(findTestObject('BLAZEDEMO/city'), city)

WebUI.setText(findTestObject('BLAZEDEMO/state'), state)

WebUI.setText(findTestObject('BLAZEDEMO/zipcode'), zipcode)

WebUI.selectOptionByIndex(findTestObject('BLAZEDEMO/cardType'), cardtype)

WebUI.setText(findTestObject('BLAZEDEMO/creditcardnumber'), creditcardnumber)

WebUI.setText(findTestObject('BLAZEDEMO/month'), month)

WebUI.setText(findTestObject('BLAZEDEMO/year'), year)

WebUI.setText(findTestObject('BLAZEDEMO/nameoncard'), nameonthecard)

WebUI.click(findTestObject('BLAZEDEMO/purchaseFlightButton'))

WebUI.verifyTextPresent('Thank you for your purchase today', false)

WebUI.takeScreenshot()

WebUI.deleteAllCookies()

WebUI.closeBrowser()

