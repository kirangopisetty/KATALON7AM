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

WebUI.openBrowser('https://practice.expandtesting.com/login')

WebUI.maximizeWindow()

String unText = WebUI.getText(findTestObject('TEXTBOX/un'))

println('The label text present for UN is ' + unText)

String pwdText = WebUI.getText(findTestObject('TEXTBOX/pwd'))

println('The label text present for PWD is ' + pwdText)

boolean isMatch = WebUI.verifyMatch(unText, 'Username', false)

if (isMatch == true) {
    println('The label test for UN has PASSED')

    println('Now, the user can login to the AUT')
} else {
    println('The label test for UN has FAILED')

    println('The user cannot login to the AUT and now the browser shall be closed')

    WebUI.closeBrowser()
}

boolean isPwdMatch = WebUI.verifyMatch(pwdText, 'Password', false)

if (isPwdMatch == true) {
    println('The label test for PASSWORD has PASSED')

    println('Now, the user can login to the AUT')
} else {
    println('The label test for PASSWORD has FAILED')

    println('The user cannot login to the AUT and now the browser shall be closed')

    WebUI.closeBrowser()
}

boolean isNotMatch = WebUI.verifyNotMatch(pwdText, 'Username', false)

if (isNotMatch == true) {
    println('Verify Not Match has PASSED')

    String fullWord = WebUI.concatenate(((['Katalon', 'Studio', 'Automation Tool']) as String[]))

    println('The concatenated word is ' + fullWord)

    WebUI.closeBrowser()
} else {
    println('Verify Not Match has FAILED')
}

