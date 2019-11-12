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

WebUI.click(findTestObject('Page_DataTakeW/input_Ingresar_userRequired (2)'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/div_Ingresar                               _f4eec6'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/div_Ingresar_mx-auto text-center'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/img_Ingresar_w-75'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/i_Ingresar_fas fa-envelope'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/span_Ingresar_input-group-text'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/span_Ingresar_input-group-text'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/i_Ingresar_fas fa-lock'))

WebUI.click(findTestObject('Page_DataTakeW/i_Ingresar_fas fa-sign-in-alt fa-3x (1)'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/div_OKCancel'))

WebUI.click(findTestObject('Page_DataTakeW/button_OK (1)'))

WebUI.click(findTestObject('Page_DataTakeW/input_Ingresar_userRequired (2)'))

WebUI.click(findTestObject('Page_DataTakeW/h1_Ingresar (1)'))

WebUI.click(findTestObject('Page_DataTakeW/button_OK (1)'))

WebUI.click(findTestObject('Page_DataTakeW/button_Ingresar (2)'))

WebUI.click(findTestObject('Page_DataTakeW/button_OK (1)'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/div_Ingresar                               _f04aa3'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/div_Recuperar Contrasea'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/i_Registrarse_fas fa-user-clock fa-2x'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/i_Aceptar_fab fa-d-and-d'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/div_Aceptar'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/span_Recuperar Contrasea'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/div_Recuperar Contrasea_1'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/span_Recuperar Contrasea_fa fa-fw fa-close'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/button_Recuperar Contrasea'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/span_Recuperar Contrasea_fa fa-fw fa-close_1'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/i_Ingresar_fas fa-users fa-3x'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/span_Registro Usuario'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/div_Registro Usuario'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/input_Correo_Email'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/label_Correo'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/label_Contrasea'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/label_Contrasea'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/div_Correo Es requerido'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/div_Contrasea Es requerido'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/label_Confirme contrasea'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/label_Empresa'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/label_Seleccione Empresa'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/label_Seleccione Empresa'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/div_Seleccione Empresa'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/span_Registrar'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/span_Cancelar'))

WebUI.setText(findTestObject('Page_DataTakeW/input_Ingresar_userRequired (2)'), 'aplicaciones@interedes.com.co')

WebUI.setEncryptedText(findTestObject('Page_DataTakeW/input_Ingresar_passwordText (2)'), 'NuZ2JUUU2/9IBT7KEKYRyA==')

WebUI.click(findTestObject('Page_DataTakeW/button_Ingresar (2)'))

WebUI.click(findTestObject('Page_DataTakeW/a_Productividad (1)'))

WebUI.click(findTestObject('Page_DataTakeW/ul_keyboard_arrow_down                     _dbc963 (1)'))

WebUI.click(findTestObject('Page_DataTakeW/i_keyboard_arrow_down (2)'))

WebUI.click(findTestObject('Page_DataTakeW/i_keyboard_arrow_down (2)'))

WebUI.click(findTestObject('Page_DataTakeW/span_Salir (2)'))

WebUI.closeBrowser()

