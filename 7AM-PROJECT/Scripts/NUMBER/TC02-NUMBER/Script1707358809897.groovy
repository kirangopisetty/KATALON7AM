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


boolean ve = WebUI.verifyEqual(10, 8)

println("VERIFY EQUAL : "+ve)

boolean vne = WebUI.verifyNotEqual(8, 8)

println("VERIFY NOT EQUAL : "+vne)

boolean veb = WebUI.verifyEqual(true, false)

println("VERIFY EQUAL FOR BOOLEAN : "+veb)

boolean vgt = WebUI.verifyGreaterThan(5, 14)

println("VERIFY GREATER THAN: "+vgt)

boolean vgte = WebUI.verifyGreaterThanOrEqual(10, 16)

println("VERIFY GREATER THAN OR EQUAL TO: "+vgte)

boolean vlt = WebUI.verifyLessThan(15, 8)

println("VERIFY LESS THAN: "+vlt)

boolean vlte = WebUI.verifyLessThanOrEqual(15, 5)

println("VERIFY LESS THAN OR EQUAL TO: "+vlte)

