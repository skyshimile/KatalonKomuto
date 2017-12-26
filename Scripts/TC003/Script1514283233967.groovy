import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.setText(findTestObject('Page_Pasar Grobogan/input_email'), '20171224@mailinator.com')

WebUI.setText(findTestObject('Page_Pasar Grobogan/input_password'), 'katakmati')

WebUI.sendKeys(findTestObject('Page_Pasar Grobogan/input_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Pasar Grobogan/div_main main user bg-grey'))

WebUI.click(findTestObject('Page_Pasar Grobogan/li'))

WebUI.click(findTestObject('Page_Pasar Grobogan/li_1'))

WebUI.click(findTestObject('Page_Pasar Grobogan/a_Ganti Foto Profil'))

WebUI.click(findTestObject('Page_Pasar Grobogan/span_icon-arrow-left'))

WebUI.click(findTestObject('Page_Pasar Grobogan/li_2'))

WebUI.click(findTestObject('Page_Pasar Grobogan/span_icon-arrow-left_1'))

WebUI.click(findTestObject('Page_Pasar Grobogan/li_3'))

WebUI.click(findTestObject('Page_Pasar Grobogan/span_icon-arrow-left_2'))

WebUI.click(findTestObject('Page_Pasar Grobogan/li_4'))

WebUI.click(findTestObject('Page_Pasar Grobogan/a_sticky-button'))

WebUI.closeBrowser()

