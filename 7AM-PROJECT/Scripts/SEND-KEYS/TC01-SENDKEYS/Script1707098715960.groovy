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

WebUI.openBrowser('https://practice.expandtesting.com/form-validation')

WebUI.maximizeWindow()

WebUI.deleteAllCookies()

WebUI.sendKeys(findTestObject('FormValidation-OR/ContactName'), Keys.chord(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, 
        Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('FormValidation-OR/ContactName'), Keys.chord(Keys.NUMPAD1, Keys.SEMICOLON, Keys.SEPARATOR, 
        Keys.BACK_SPACE))

WebUI.delay(3)

WebUI.sendKeys(findTestObject('FormValidation-OR/contactnumber'), '001-1234567')

WebUI.setText(findTestObject('FormValidation-OR/pickupdate'), '30-12-2024')

WebUI.selectOptionByValue(findTestObject('FormValidation-OR/dropdown'), 'card', false)

WebUI.enhancedClick(findTestObject('FormValidation-OR/button_Register'))

WebUI.closeBrowser()

