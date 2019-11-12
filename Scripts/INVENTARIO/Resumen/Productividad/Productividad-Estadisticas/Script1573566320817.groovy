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

WebUI.setText(findTestObject('Page_DataTakeW/input_Ingresar_userRequired (5)'), 'aplicaciones@interedes.com.co')

WebUI.setEncryptedText(findTestObject('Page_DataTakeW/input_Ingresar_passwordText (5)'), 'NuZ2JUUU2/9IBT7KEKYRyA==')

WebUI.sendKeys(findTestObject('Page_DataTakeW/input_Ingresar_passwordText (5)'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_DataTakeW/a_Productividad (4)'))

WebUI.click(findTestObject('Page_DataTakeW/a_Estadisticas (1)'))

WebUI.click(findTestObject('Page_DataTakeW/div_2019 (2)'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/span_2019'))

WebUI.click(findTestObject('Page_DataTakeW/label_2019 (1)'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/span_2019'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/div_2019_1'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/label_Nov'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/li_Nov'))

WebUI.click(findTestObject('Page_DataTakeW/div_Nov (2)'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/li_Nov'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/div_Nov_1'))

WebUI.click(findTestObject('Page_DataTakeW/div_Nov (2)'))

WebUI.click(findTestObject('Page_DataTakeW/li_Ago (1)'))

WebUI.click(findTestObject('Page_DataTakeW/button_Buscar (3)'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/div_Created with Highcharts 620TotalEstruct_9b5443'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/div_PRODUCTIVIDAD POR DIAS                 _07d9f2'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/tspan_Estructuras 2029'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/tspan_Total'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/text_800'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/path_Created with Highcharts 620_highcharts_c234f6'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/text_600'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/path_Created with Highcharts 620_highcharts_c234f6'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/text_400'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/path_Created with Highcharts 620_highcharts_c234f6'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/path_Created with Highcharts 620_highcharts_c234f6'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/text_200'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/path_Created with Highcharts 620_highcharts_c234f6'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/text_0'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/rect_Created with Highcharts 620_highcharts_5818f9'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/path_Created with Highcharts 620_highcharts_d1f2dd'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/tspan_ESTRUCTURAS'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/rect_Series 1_highcharts-point'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/tspan_Series 1'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/tspan_Series 1'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/rect_Series 1_highcharts-point'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/rect_Series 1_highcharts-point_1'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/rect_ESTRUCTURAS_highcharts-point highchart_7a15d8'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/rect_ESTRUCTURAS_highcharts-point highchart_e1f719'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/path_Created with Highcharts 620_highcharts_5d43ec'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/path_Created with Highcharts 620_highcharts_90b3fc'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/path_Created with Highcharts 620_highcharts_04ba5b'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/path_Created with Highcharts 620_highcharts_ac89da'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/path_Created with Highcharts 620_highcharts_ac69c5'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/path_Created with Highcharts 620_highcharts_34f6e0'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/path_Created with Highcharts 620_highcharts_a29961'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/path_Created with Highcharts 620_highcharts_5d43ec_1'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/tspan_Total'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/tspan_Tecnicos 9'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/rect_Dia 14_highcharts-button-box'))

WebUI.click(findTestObject('Page_DataTakeW/i_keyboard_arrow_down (5)'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/div_power_settings_new                    Salir'))

WebUI.click(findTestObject('Page_DataTakeW/span_Salir (5)'))

WebUI.closeBrowser()

