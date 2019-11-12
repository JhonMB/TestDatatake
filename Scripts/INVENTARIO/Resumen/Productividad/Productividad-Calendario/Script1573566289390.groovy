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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://datatakedev.interedes.com.co:85/login?redirectUrl=%2Fgraficos')

WebUI.setText(findTestObject('Page_DataTakeW/input_Ingresar_userRequired (4)'), 'aplicaciones@interedes.com.co')

WebUI.setEncryptedText(findTestObject('Page_DataTakeW/input_Ingresar_passwordText (4)'), 'NuZ2JUUU2/9IBT7KEKYRyA==')

WebUI.sendKeys(findTestObject('Page_DataTakeW/input_Ingresar_passwordText (4)'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_DataTakeW/span_Productividad (3)'))

WebUI.click(findTestObject('Page_DataTakeW/a_Calendario (2)'))

WebUI.click(findTestObject('Page_DataTakeW/a_Productividad (3)'))

WebUI.click(findTestObject('Page_DataTakeW/span_Productividad (3)'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/label_2019'))

WebUI.click(findTestObject('Page_DataTakeW/div_2019 (1)'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/span_PRODUCTIVIDAD POR DIAS_ui-clickable fa_5008cb'))

WebUI.click(findTestObject('Page_DataTakeW/li_2019 (1)'))

WebUI.click(findTestObject('Page_DataTakeW/div_Nov (1)'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/li_Ago'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/h2_PRODUCTIVIDAD POR DIAS'))

WebUI.click(findTestObject('Page_DataTakeW/i_Buscar_fab fa-searchengin fa-lg (2)'))

WebUI.click(findTestObject('Page_DataTakeW/button_Buscar (2)'))

WebUI.click(findTestObject('Page_DataTakeW/button_Buscar (2)'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/div_Ago'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/li_Sep'))

WebUI.click(findTestObject('Page_DataTakeW/button_Buscar (2)'))

WebUI.click(findTestObject('Page_DataTakeW/th_Tecnico                                 _d659ca (1)'))

WebUI.click(findTestObject('Page_DataTakeW/th_Tecnico                                 _d659ca (1)'))

WebUI.click(findTestObject('Page_DataTakeW/th_Total                                   _4438ef (1)'))

WebUI.click(findTestObject('Page_DataTakeW/input_search_ng-untouched ng-pristine ng-valid (1)'))

WebUI.click(findTestObject('Page_DataTakeW/input_search_ng-untouched ng-pristine ng-valid (1)'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/i_search'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/div_search'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/i_search'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/div_search'))

WebUI.click(findTestObject('Page_DataTakeW/div_Tecnico                                _826e70 (1)'))

WebUI.click(findTestObject('Page_DataTakeW/td_Tecnico                                 _3365e4 (1)'))

WebUI.click(findTestObject('Page_DataTakeW/span_Andres Felipe Murcia Rivera (1)'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/td_Total                                   _4e15b2'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/span_284'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/div_todaymonthweekdayNovember 2019SunMonTue_c8f1e0'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/div_todaymonthweekdayNovember 2019'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/span_T2880_ui-icon ui-icon-circle-triangle-w'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/span_T2880_ui-icon ui-icon-circle-triangle-w'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/div_todaymonthweekdaySeptember 2019SunMonTu_830e07'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/th_Sun'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/span_Sun'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/td_Sat_fc-day ui-widget-content fc-sun fc-past'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/span_1'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/td_1'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/span_2 Elemen'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/div_2 Elemen'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/td_Sat_fc-day ui-widget-content fc-mon fc-past'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/button_week'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/button_day'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/button_month'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/td_Total_ui-state-default ng-star-inserted'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/td_T2880'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/b_T2880'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/div_Sep'))

WebUI.click(findTestObject('Page_DataTakeW/li_Oct (1)'))

WebUI.click(findTestObject('Page_DataTakeW/button_Buscar (2)'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/span_T3367_ui-icon ui-icon-circle-triangle-e'))

WebUI.click(findTestObject('Page_DataTakeW/span_Andres Felipe Murcia Rivera (1)'))

WebUI.click(findTestObject('Page_DataTakeW/i_keyboard_arrow_down (4)'))

WebUI.click(findTestObject('Page_DataTakeW/span_Salir (4)'))

WebUI.closeBrowser()

