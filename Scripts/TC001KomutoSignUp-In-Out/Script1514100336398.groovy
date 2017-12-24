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

WebUI.navigateToUrl('https://mobiledev.komuto.com/')

WebUI.click(findTestObject('SignUp-in-Out/Page_Pasar Grobogan/a_Profil'))

WebUI.doubleClick(findTestObject('SignUp-in-Out/Page_Pasar Grobogan/a_Profil'))

WebUI.click(findTestObject('SignUp-in-Out/Page_Pasar Grobogan/a_Daftar'))

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('SignUp-in-Out/Page_Pasar Grobogan/input_nama'), 'Tester Skyshi')

WebUI.setText(findTestObject('SignUp-in-Out/Page_Pasar Grobogan/input_handphone'), '081393121317')

WebUI.setText(findTestObject('SignUp-in-Out/Page_Pasar Grobogan/input_email'), '20171224@mailinator.com')

WebUI.setText(findTestObject('SignUp-in-Out/Page_Pasar Grobogan/input_password'), 'katakmati')

WebUI.setText(findTestObject('SignUp-in-Out/Page_Pasar Grobogan/input_passwordRetype'), 'katakmati')

WebUI.selectOptionByLabel(findTestObject('SignUp-in-Out/Page_Pasar Grobogan/label_Pria'), 'pria', false)

WebUI.click(findTestObject('SignUp-in-Out/Page_Pasar Grobogan/button_Daftar'))

WebUI.setText(findTestObject('SignUp-in-Out/Page_Pasar Grobogan/input_email_1'), '20171224@mailinator.com')

WebUI.setText(findTestObject('SignUp-in-Out/Page_Pasar Grobogan/input_password'), 'katakmati')

WebUI.click(findTestObject('SignUp-in-Out/Page_Pasar Grobogan/button_Masuk'))

WebUI.click(findTestObject('SignUp-in-Out/Page_Pasar Grobogan/li'))

WebUI.click(findTestObject('SignUp-in-Out/Page_Pasar Grobogan/li_1'))

WebUI.closeBrowser()

