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

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/profile.php#login')

WebUI.setText(findTestObject('HealthcareOR/username'), 'John Doe')

WebUI.setEncryptedText(findTestObject('HealthcareOR/password'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('HealthcareOR/loginButton'))

WebUI.verifyTextPresent('Make Appointment', false)

int dropdownCount = WebUI.getNumberOfTotalOption(findTestObject('HealthcareOR/dropdown'))

boolean optionsPresent = WebUI.verifyOptionsPresent(findTestObject('HealthcareOR/dropdown'), ['Hongkong CURA Healthcare Center'
        , 'Seoul CURA Healthcare Center', 'Tokyo CURA Healthcare Center'])

boolean optionPresent = WebUI.verifyOptionPresentByValue(findTestObject('HealthcareOR/dropdown'), 'Tokyo CURA Healthcare Center', 
    false, 5)

boolean option2Present = WebUI.verifyOptionPresentByLabel(findTestObject('HealthcareOR/dropdown'), 'Hongkong CURA Healthcare Center', 
    false, 5)

boolean optionNotPresent = WebUI.verifyOptionNotPresentByValue(findTestObject('HealthcareOR/dropdown'), 'India CURA Healthcare Center', 
    false, 5)

boolean option2NotPresent = WebUI.verifyOptionNotPresentByLabel(findTestObject('HealthcareOR/dropdown'), 'Singapore CURA Healthcare Center', 
    false, 5)

if (option2NotPresent == true) {
    System.out.println('Singapore option is not present in the facility drop-down & test-case has PASSED')
} else {
    System.out.println('Singapore option is still present in the facility drop-down & test-case has FAILED')
}

if (optionNotPresent == true) {
    System.out.println('India option is not present in the facility drop-down & test-case has PASSED')
} else {
    System.out.println('India option is still present in the facility drop-down & test-case has FAILED')
}

if (option2Present == true) {
    System.out.println('Hongkong option is present in the facility drop-down & test-case has PASSED')
} else {
    System.out.println('Hongkong option is not present in the facility drop-down & test-case has FAILED')
}

if (optionPresent == true) {
    System.out.println('Tokyo option is present in the facility drop-down & test-case has PASSED')
} else {
    System.out.println('Tokyo option is not present in the facility drop-down & test-case has FAILED')
}

if (optionsPresent == true) {
    System.out.println('The options in the facility drop-down are valid & test-case has PASSED')
} else {
    System.out.println('The options in the facility drop-down are invalid & test-case has FAILED')
}

if (dropdownCount == 3) {
    System.out.println('The facility drop-down list of options available are ' + dropdownCount)

    System.out.println('The test-case has PASSED')

    WebUI.selectOptionByValue(findTestObject('HealthcareOR/dropdown'), 'Hongkong CURA Healthcare Center', false)

    int selectedOption1Count = WebUI.getNumberOfSelectedOption(findTestObject('HealthcareOR/dropdown'))

    if (selectedOption1Count == 1) {
        System.out.println('The option selected in the facility drop-down is 1 & test-case has PASSED')
    } else {
        System.out.println('The option selected in the facility drop-down is not 1 & test-case has FAILED')
    }
    
    WebUI.selectOptionByIndex(findTestObject('HealthcareOR/dropdown'), 0)

    int selectedOption2Count = WebUI.getNumberOfSelectedOption(findTestObject('HealthcareOR/dropdown'))

    if (selectedOption2Count == 1) {
        System.out.println('The option selected in the facility drop-down is 1 & test-case has PASSED')
    } else {
        System.out.println('The option selected in the facility drop-down is not 1 & test-case has FAILED')
    }
    
    WebUI.selectOptionByLabel(findTestObject('HealthcareOR/dropdown'), 'Seoul CURA Healthcare Center', false)

    int selectedOption3Count = WebUI.getNumberOfSelectedOption(findTestObject('HealthcareOR/dropdown'))

    if (selectedOption3Count == 1) {
        System.out.println('The option selected in the facility drop-down is 1 & test-case has PASSED')
    } else {
        System.out.println('The option selected in the facility drop-down is not 1 & test-case has FAILED')
    }
    
    WebUI.check(findTestObject('HealthcareOR/checkbox'))

    boolean isChecked = WebUI.verifyElementChecked(findTestObject('HealthcareOR/checkbox'), 5)
	
	if (isChecked==true) {
		System.out.println("The checkbox got selected and TC=PASSED")
	}
	else {
		System.out.println("The checkbox did not got selected and TC=FAILED")
	}

    WebUI.uncheck(findTestObject('HealthcareOR/checkbox'))

    boolean isNotChecked = WebUI.verifyElementNotChecked(findTestObject('HealthcareOR/checkbox'), 5)
	
	if (isNotChecked==true) {
		System.out.println("The checkbox got de-selected and TC=PASSED")
	}
	else {
		System.out.println("The checkbox is still selected and TC=FAILED")
	}

    WebUI.check(findTestObject('HealthcareOR/checkbox'))

    WebUI.uncheck(findTestObject('HealthcareOR/checkbox'))

    WebUI.check(findTestObject('HealthcareOR/checkbox'))

    WebUI.uncheck(findTestObject('HealthcareOR/checkbox'))

    WebUI.click(findTestObject('HealthcareOR/Medicaid'))

    WebUI.click(findTestObject('HealthcareOR/Medicare'))

    WebUI.click(findTestObject('HealthcareOR/None'))

    WebUI.click(findTestObject('HealthcareOR/Medicaid'))

    WebUI.click(findTestObject('HealthcareOR/Medicare'))

    WebUI.click(findTestObject('HealthcareOR/None'))

    WebUI.setText(findTestObject('HealthcareOR/visitDate'), '31/01/2024')

    WebUI.setText(findTestObject('HealthcareOR/visitDate'), '01/02/2024')

    WebUI.setText(findTestObject('HealthcareOR/visitDate'), '08/02/2024')

    WebUI.setText(findTestObject('HealthcareOR/comment'), 'Body checkup')

    WebUI.setText(findTestObject('HealthcareOR/comment'), 'Regular checkup')

    WebUI.setText(findTestObject('HealthcareOR/comment'), 'Full body checkup')

    WebUI.click(findTestObject('HealthcareOR/bookAppointment'))

    WebUI.verifyTextPresent('Appointment Confirmation', false)

    WebUI.click(findTestObject('HealthcareOR/menu'))

    WebUI.click(findTestObject('HealthcareOR/logout'))

    WebUI.closeBrowser()
} else {
    System.out.println('The facility drop-down list of options available are ' + dropdownCount)

    System.out.println('The test-case has FAILED')

    WebUI.closeBrowser()
}

