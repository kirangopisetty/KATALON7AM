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

WebUI.openBrowser('https://jqueryui.com/demos/')

WebUI.maximizeWindow()

int pageHeight = WebUI.getPageHeight()

String myURL = WebUI.getUrl()

String myTitle = WebUI.getWindowTitle()

println("The title of the window is >>> "+myTitle)

println('The URL of the website is >>> ' + myURL)

int pageWidth = WebUI.getPageWidth()

System.out.println('The pageHeight is ' + pageHeight)

System.out.println('The pageWidth is ' + pageWidth)

WebUI.setViewPortSize(560, 850)

int vpHeight = WebUI.getViewportHeight()

int vpWidth = WebUI.getViewportWidth()

System.out.println('The view port Height is ' + vpHeight)

System.out.println('The view port Width is ' + vpWidth)

WebUI.takeScreenshot()

WebUI.setViewPortSize(650, 740)

int voLeftPosition = WebUI.getViewportLeftPosition()

int voTopPosition = WebUI.getViewportTopPosition()

System.out.println('The view port voLeftPosition is ' + voLeftPosition)

System.out.println('The view port voTopPosition is ' + voTopPosition)

WebUI.takeScreenshot()

WebUI.setViewPortSize(750, 650)

WebUI.takeScreenshot()

WebUI.setViewPortSize(870, 760)

WebUI.takeScreenshot()

WebUI.setViewPortSize(320, 420)

WebUI.takeScreenshot()

WebUI.setViewPortSize(999, 333)

WebUI.takeScreenshot()

WebUI.setViewPortSize(444, 850)

WebUI.takeScreenshot()

WebUI.setViewPortSize(555, 999)

WebUI.takeScreenshot()

WebUI.setViewPortSize(455, 1020)

WebUI.takeScreenshot()

WebUI.maximizeWindow()

WebUI.closeBrowser()

