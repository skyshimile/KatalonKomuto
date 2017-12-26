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

WebUI.setText(findTestObject('Page_Pasar Grobogan (1)/input_email'), '20171224@mailinator.com')

WebUI.setText(findTestObject('Page_Pasar Grobogan (1)/input_password'), 'katakmati')

WebUI.click(findTestObject('Page_Pasar Grobogan (1)/button_Masuk'))

WebUI.click(findTestObject('Page_Pasar Grobogan (1)/li'))

WebUI.click(findTestObject('Page_Pasar Grobogan (1)/li_1'))

WebUI.click(findTestObject('Page_Pasar Grobogan (1)/span_icon-arrow-left'))

WebUI.click(findTestObject('Page_Pasar Grobogan (1)/li_2'))

WebUI.click(findTestObject('Page_Pasar Grobogan (1)/a_Ganti Password'))

WebUI.click(findTestObject('Page_Pasar Grobogan (1)/span_icon-arrow-left_1'))

WebUI.click(findTestObject('Page_Pasar Grobogan (1)/li_3'))

WebUI.click(findTestObject('Page_Pasar Grobogan (1)/span_back'))

WebUI.click(findTestObject('Page_Pasar Grobogan (1)/span_icon-arrow-left_2'))

WebUI.click(findTestObject('Page_Pasar Grobogan (1)/li_4'))

WebUI.click(findTestObject('Page_Pasar Grobogan (1)/article_media'))

WebUI.click(findTestObject('Page_Pasar Grobogan (1)/a_Rp 100.000'))

WebUI.click(findTestObject('Page_Pasar Grobogan (1)/div_modal-iframe'))

WebUI.click(findTestObject('Page_Pasar Grobogan (1)/div_text-button-main'))

WebUI.click(findTestObject('Page_Pasar Grobogan (1)/div_Kartu Kredit'))

WebUI.setText(findTestObject('Page_Pasar Grobogan (1)/input_cardnumber'), '5211 1111 1111 1117')

WebUI.setText(findTestObject('Page_Pasar Grobogan (1)/input'), '01 / 20')

WebUI.setText(findTestObject('Page_Pasar Grobogan (1)/input_1'), '123')

WebUI.click(findTestObject('Page_Pasar Grobogan (1)/div_text-button-main'))

WebUI.click(findTestObject('Page_Pasar Grobogan (1)/a_button-main-content'))

WebUI.click(findTestObject('Page_Pasar Grobogan (1)/a_Lihat balance status'))

WebUI.click(findTestObject('Page_Pasar Grobogan (1)/span_icon-arrow-left_3'))

WebUI.click(findTestObject('Page_Pasar Grobogan (1)/li_5'))

WebUI.click(findTestObject('Page_Pasar Grobogan (1)/span_icon-arrow-left_3'))

WebUI.click(findTestObject('Page_Pasar Grobogan (1)/p'))

WebUI.click(findTestObject('Page_Pasar Grobogan (1)/span_icon-arrow-left_3'))

WebUI.click(findTestObject('Page_Pasar Grobogan (1)/li_6'))

WebUI.click(findTestObject('Page_Pasar Grobogan (1)/span_Pilih Rekening'))

WebUI.click(findTestObject('Page_Pasar Grobogan (1)/div_sort-option sortButton'))

WebUI.click(findTestObject('Page_Pasar Grobogan (1)/label_Nominal Penarikan Dana'))

WebUI.setText(findTestObject('Page_Pasar Grobogan (1)/input_amount'), '100000')

WebUI.click(findTestObject('Page_Pasar Grobogan (1)/a_Tarik Saldo'))

WebUI.click(findTestObject('Page_Pasar Grobogan (1)/span_Pilih Rekening'))

WebUI.click(findTestObject('Page_Pasar Grobogan (1)/a_ Tambah Rekening Baru'))

WebUI.click(findTestObject('Page_Pasar Grobogan (1)/button_delete icon-close'))

WebUI.click(findTestObject('Page_Pasar Grobogan (1)/span_Pilih Rekening'))

WebUI.click(findTestObject('Page_Pasar Grobogan (1)/a_ Tambah Rekening Baru'))

WebUI.click(findTestObject('Page_Pasar Grobogan (1)/span_Pilih Bank Tujuan'))

WebUI.click(findTestObject('Page_Pasar Grobogan (1)/strong_Mandiri'))

WebUI.setText(findTestObject('Page_Pasar Grobogan (1)/input_bank_branch_office_name'), '42')

WebUI.setText(findTestObject('Page_Pasar Grobogan (1)/input_holder_account_number'), '4222')

WebUI.setText(findTestObject('Page_Pasar Grobogan (1)/input_holder_name'), '4222')

WebUI.click(findTestObject('Page_Pasar Grobogan (1)/a_Tambah Data Rekening'))

WebUI.setText(findTestObject('Page_Pasar Grobogan (1)/input_digit1'), '8')

WebUI.setText(findTestObject('Page_Pasar Grobogan (1)/input_digit2'), '8')

WebUI.setText(findTestObject('Page_Pasar Grobogan (1)/input_digit3'), '3')

WebUI.setText(findTestObject('Page_Pasar Grobogan (1)/input_digit4'), '5')

WebUI.setText(findTestObject('Page_Pasar Grobogan (1)/input_digit5'), '4')

WebUI.click(findTestObject('Page_Pasar Grobogan (1)/a_Verifikasi Kode OTP'))

WebUI.click(findTestObject('Page_Pasar Grobogan (1)/li_5'))

WebUI.click(findTestObject('Page_Pasar Grobogan (1)/span_back_1'))

WebUI.click(findTestObject('Page_Pasar Grobogan (1)/li_6'))

WebUI.click(findTestObject('Page_Pasar Grobogan (1)/span_icon-arrow-left_3'))

WebUI.click(findTestObject('Page_Pasar Grobogan (1)/p_1'))

WebUI.click(findTestObject('Page_Pasar Grobogan (1)/span_back_2'))

WebUI.click(findTestObject('Page_Pasar Grobogan (1)/strong_Status Penarikan Saldo'))

WebUI.click(findTestObject('Page_Pasar Grobogan (1)/span_back_1'))

WebUI.click(findTestObject('Page_Pasar Grobogan (1)/strong_Riwayat Saldo'))

WebUI.click(findTestObject('Page_Pasar Grobogan (1)/span_icon-arrow-right'))

WebUI.click(findTestObject('Page_Pasar Grobogan (1)/span_icon-arrow-left_4'))

WebUI.click(findTestObject('Page_Pasar Grobogan (1)/span_icon-arrow-left_5'))

WebUI.click(findTestObject('Page_Pasar Grobogan (1)/span_back_1'))

WebUI.click(findTestObject('Page_Pasar Grobogan (1)/li_7'))

WebUI.click(findTestObject('Page_Pasar Grobogan (1)/span_icon-arrow-left_6'))

WebUI.click(findTestObject('Page_Pasar Grobogan (1)/li'))

WebUI.click(findTestObject('Page_Pasar Grobogan (1)/p_2'))

WebUI.click(findTestObject('Page_Pasar Grobogan (1)/button_Verifikasi Sekarang'))

WebUI.setText(findTestObject('Page_Pasar Grobogan (1)/input_digit1'), '3')

WebUI.setText(findTestObject('Page_Pasar Grobogan (1)/input_digit2'), '1')

WebUI.setText(findTestObject('Page_Pasar Grobogan (1)/input_digit3'), '6')

WebUI.setText(findTestObject('Page_Pasar Grobogan (1)/input_digit4'), '4')

WebUI.setText(findTestObject('Page_Pasar Grobogan (1)/input_digit5'), '5')

WebUI.click(findTestObject('Page_Pasar Grobogan (1)/a_Verifikasi Nomor Telepon'))

WebUI.click(findTestObject('Page_Pasar Grobogan (1)/span_icon-arrow-left_7'))

WebUI.closeBrowser()

