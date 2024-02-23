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

WebUI.openBrowser('https://jqueryui.com/droppable/')

WebUI.maximizeWindow()

WebUI.switchToFrame(findTestObject('FRAMES/frame'), 5)

WebUI.dragAndDropToObject(findTestObject('FRAMES/source'), findTestObject('FRAMES/destination'))

WebUI.comment('Now, the drag & drop is completed');

String filePath = WebUI.takeScreenshot()

WebUI.comment('Now, the screenshot is taken');

System.out.println('The screenshot is taken and located here ' + filePath)

WebUI.delay(5)

WebUI.switchToDefaultContent()

WebUI.deleteAllCookies()

WebUI.comment('Now, the browser cookies are deleted');

WebUI.closeBrowser()

WebUI.comment('Now, the browser is closed');




