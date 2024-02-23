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

WebUI.openBrowser('https://katalonorg-dev-ed.develop.my.salesforce.com/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('SalesForceOR/UN'), 'gopika.kongala@appsassociates.com.katalon')

WebUI.setText(findTestObject('SalesForceOR/PWD'), 'Sam$2023')

WebUI.click(findTestObject('SalesForceOR/loginButton'))

not_run: WebUI.setText(findTestObject('SalesForceOR/verificationCode'), '12345')

not_run: WebUI.click(findTestObject('SalesForceOR/verifyButton'))

WebUI.click(findTestObject('SalesForceOR/accountsLink'))

WebUI.click(findTestObject('SalesForceOR/userToClick'))

WebUI.click(findTestObject('SalesForceOR/addTeamMembersButton'))

WebUI.waitForAlert(5)

