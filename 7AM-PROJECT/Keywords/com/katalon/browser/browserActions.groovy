package com.katalon.browser

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class browserActions {

	@Keyword
	def browserInit() {
		WebUI.openBrowser(null);
		WebUI.maximizeWindow();
		WebUI.deleteAllCookies()
	}

	@Keyword
	def browserExit() {
		WebUI.deleteAllCookies()
		WebUI.closeBrowser()
	}

	@Keyword
	def browserRefresh() {
		WebUI.back();
		WebUI.forward();
		WebUI.refresh()
	}

	@Keyword
	def browserResize() {
		WebUI.setViewPortSize(500, 600)
		WebUI.setViewPortSize(600, 500)
		WebUI.setViewPortSize(700, 400)
		WebUI.setViewPortSize(800, 300)
		WebUI.setViewPortSize(900, 200)
	}
}
