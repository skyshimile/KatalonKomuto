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

WebUI.setText(findTestObject('Saldo/Page_Pasar Grobogan/input_email'), '20171224@mailinator.com')

WebUI.setText(findTestObject('Saldo/Page_Pasar Grobogan/input_password'), 'katakmati')

WebUI.sendKeys(findTestObject('Saldo/Page_Pasar Grobogan/input_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Saldo/Page_Pasar Grobogan/p_Kelola Akun'))

WebUI.click(findTestObject('Saldo/Page_Pasar Grobogan/span_icon-arrow-left'))

WebUI.click(findTestObject('Saldo/Page_Pasar Grobogan/li'))

WebUI.click(findTestObject('Saldo/Page_Pasar Grobogan/li_1'))

WebUI.click(findTestObject('Saldo/Page_Pasar Grobogan/a_Rp 400.000'))

WebUI.click(findTestObject('Saldo/Page_Pasar Grobogan/a_button-main-content'))

WebUI.click(findTestObject('Saldo/Page_Pasar Grobogan/div_Kartu Kredit'))

WebUI.setText(findTestObject('Saldo/Page_Pasar Grobogan/input_cardnumber'), '5211 1111 1111 1117')

WebUI.setText(findTestObject('Saldo/Page_Pasar Grobogan/input'), '01 / 20')

WebUI.setText(findTestObject('Saldo/Page_Pasar Grobogan/input_1'), '123')

WebUI.click(findTestObject('Saldo/Page_Pasar Grobogan/a_button-main-content_1'))

WebUI.click(findTestObject('Saldo/Page_Pasar Grobogan/a_button-main-content_1'))

WebUI.click(findTestObject('Saldo/Page_Pasar Grobogan/a_Lihat balance status'))

WebUI.click(findTestObject('Saldo/Page_Pasar Grobogan/strong_Sukses'))

WebUI.rightClick(findTestObject('Saldo/Page_Pasar Grobogan/strong_Sukses'))

WebUI.closeBrowser()

