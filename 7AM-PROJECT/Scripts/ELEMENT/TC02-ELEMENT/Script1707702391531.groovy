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

WebUI.openBrowser('https://katalon-demo-cura.herokuapp.com/profile.php#login')

WebUI.maximizeWindow()

boolean linksTest = WebUI.verifyAllLinksOnCurrentPageAccessible(false, [])

System.out.println('Are all the links accessible ? The answer is ' + linksTest)

boolean linksAccessible = WebUI.verifyLinksAccessible([])

System.out.println('Are all the links accessible ? The answer is ' + linksAccessible)

boolean attributeCheckUN = WebUI.verifyElementAttributeValue(findTestObject('HealthcareOR/username'), 'id', 'txt-username', 
    4)

println('The id=txt-username for username text box and this is ' + attributeCheckUN)

boolean attributeCheckLogin = WebUI.verifyElementAttributeValue(findTestObject('HealthcareOR/loginButton'), 'class', 'btn btn-default', 
    4)

println('The class=btn btn-default for login button and this is ' + attributeCheckLogin)

boolean loginClickable = WebUI.verifyElementClickable(findTestObject('HealthcareOR/loginButton'))

println('Is the login clickable ? Then answer is ' + loginClickable)

boolean loginNotClickable = WebUI.verifyElementNotClickable(findTestObject('HealthcareOR/loginButton'), FailureHandling.CONTINUE_ON_FAILURE)

println('Is the login not clickable ? Then answer is ' + loginNotClickable)

boolean loginNameAttribute = WebUI.verifyElementNotHasAttribute(findTestObject('HealthcareOR/loginButton'), 'name', 4, FailureHandling.CONTINUE_ON_FAILURE)

println('Is the name attribute present for Login button ? Then answer is ' + loginNameAttribute)

WebUI.setViewPortSize(600, 800)

boolean unInViewPort = WebUI.verifyElementInViewport(findTestObject('HealthcareOR/username'), 4)

println('Verify element in viewport for username & the answer is ' + unInViewPort)

boolean pwdVisibleInVP = WebUI.verifyElementVisibleInViewport(findTestObject('HealthcareOR/password'), 4)

println('Verify element visible in viewport for password & the answer is ' + pwdVisibleInVP)

WebUI.maximizeWindow()

boolean unElementPresent = WebUI.verifyElementPresent(findTestObject('HealthcareOR/unLabel'), 4)

println('Verify element present UN-lable & the answer is ' + unElementPresent)

WebUI.setMaskedText(findTestObject('HealthcareOR/username'), 'Kiran')

boolean unElementText = WebUI.verifyElementText(findTestObject('HealthcareOR/unLabel'), 'Username', FailureHandling.CONTINUE_ON_FAILURE)

println('Verify element text for UN = Username & the answer is ' + unElementText)

boolean loginVisible = WebUI.verifyElementVisible(findTestObject('HealthcareOR/loginButton'))

println('Verify element visible Login & the answer is ' + loginVisible)

WebUI.submit(findTestObject('HealthcareOR/loginButton'))

WebUI.closeBrowser()

