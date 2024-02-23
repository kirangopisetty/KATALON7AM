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

WebUI.navigateToUrl('https://katalonorg-dev-ed.develop.my.salesforce.com/?ec=302&startURL=%2Fvisualforce%2Fsession%3Furl%3Dhttps%253A%252F%252Fkatalonorg-dev-ed.develop.lightning.force.com%252Flightning%252Fr%252FCase%252F500Hp00001eUsZlIAK%252Fview')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Page_Login  Salesforce/input_username'), 'gopika.kongala@appsassociates.com.katalon')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login  Salesforce/input_pw'), '+CbnBpC63blm7OBx9eXa3Q==')

WebUI.click(findTestObject('Object Repository/Page_Login  Salesforce/input_rememberUn'))

WebUI.click(findTestObject('Object Repository/Page_Login  Salesforce/input_Login'))

WebUI.scrollToElement(findTestObject('Page_00001300  Case  Salesforce/ActivityTab'), 5)

WebUI.enhancedClick(findTestObject('Object Repository/Page_00001300  Case  Salesforce/span_Write an email'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_00001300  Case  Salesforce/span_Send'))

WebUI.takeScreenshot()

WebUI.closeBrowser()

