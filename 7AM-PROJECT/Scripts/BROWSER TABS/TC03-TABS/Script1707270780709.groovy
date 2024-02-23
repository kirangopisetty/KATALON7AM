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

WebUI.navigateToMaskedUrl('https://mindmajix.com/')

WebUI.click(findTestObject('MINDMAJIX/corpTraining'))

WebUI.delay(1)

WebUI.switchToWindowIndex(0)

String varURL = WebUI.getUrl()

WebUI.delay(1)

WebUI.click(findTestObject('MINDMAJIX/instructor'))

WebUI.switchToWindowIndex(2)

String varTitle = WebUI.getWindowTitle()

WebUI.scrollToPosition(0, 630)

WebUI.setText(findTestObject('MINDMAJIX/name'), 'Kiran')

WebUI.setMaskedText(findTestObject('MINDMAJIX/email'), 'testing@gmail.com')

WebUI.setEncryptedText(findTestObject('MINDMAJIX/phone'), 'JLUk53bLsjnfxbSaM5SQ8A==')

WebUI.sendKeys(findTestObject('MINDMAJIX/message'), 'I\'M A TRAINER IN KATALON STUDIO')

WebUI.click(findTestObject('MINDMAJIX/submit'))

WebUI.delay(1)

WebUI.switchToWindowUrl(varURL)

WebUI.switchToWindowTitle(varTitle)

WebUI.delay(1)

WebUI.closeWindowUrl(varURL)

WebUI.closeWindowTitle(varTitle)

WebUI.closeWindowIndex(0)

