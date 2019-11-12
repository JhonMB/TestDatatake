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

WebUI.setText(findTestObject('Page_DataTakeW/input_Ingresar_userRequired (3)'), 'aplicaciones@interedes.com.co')

WebUI.setEncryptedText(findTestObject('Page_DataTakeW/input_Ingresar_passwordText (3)'), 'NuZ2JUUU2/9IBT7KEKYRyA==')

WebUI.click(findTestObject('Page_DataTakeW/button_Ingresar (3)'))

WebUI.click(findTestObject('Page_DataTakeW/a_Productividad (2)'))

WebUI.click(findTestObject('Page_DataTakeW/span_Productividad (2)'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/a_Dispositivos'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/span_Dispositivos'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/span_Estadisticas_ui-button-icon-left ui-cl_28177a'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_DataTakeW/select_JanuaryFebruaryMarchAprilMayJuneJuly_566629'), 
    '7', true)

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/a_13'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/span_ui-btn'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/input_Estadisticas_datepickerUser'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/div_ui-btn                                 _18a4cc'))

WebUI.click(findTestObject('Page_DataTakeW/ul_Dispositivos                            _91e8db (1)'))

WebUI.click(findTestObject('Page_DataTakeW/i_Buscar_fab fa-searchengin fa-lg (1)'))

WebUI.click(findTestObject('Page_DataTakeW/button_Buscar (1)'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/div_tecnico                                _7f92a4'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/th_tecnico'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/th_Dispositivo'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/th_Fecha Actualizacion'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/th_Estado'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/th_Ruta'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/span_tecnico'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/span_tecnico'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/span_Dispositivo'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/span_Fecha Actualizacion'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/span_Estado'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/span_Ruta'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/div_10Datos de mapasDatos de mapas 2019Dato_0930eb'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/div_10Datos de mapasDatos de mapas 2019Dato_0930eb_1'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/td_tecnico                                 _a6e5bd'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/td_Dispositivo                             _c934fc'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/td_Fecha Actualizacion                     _dac722'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/td_Estado'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/td_Ruta                                    _70478e'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/span_Ruta_ui-sortable-column-icon fa fa-fw _37c0f9'))

WebUI.click(findTestObject('Page_DataTakeW/p_Andres Felipe Murcia Rivera (1)'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/div_Detalle Del Mvil                       _47d9e7'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/th_Pendientes'))

WebUI.click(findTestObject('Page_DataTakeW/div_Total Postes (1)'))

WebUI.click(findTestObject('Page_DataTakeW/div_Total Cables (1)'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/div_Total Novedades'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/div_Total Fotos'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/div_Total Equipos'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/th_Movil'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/div_perm_identity Usuario'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/div_Modulo'))

WebUI.click(findTestObject('Page_DataTakeW/div_Ubicacion De Trabajo Seleccionada (1)'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/div_Imei'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/div_Aplicacion'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/div_Gps'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/th_Ubicacion'))

WebUI.click(findTestObject('Page_DataTakeW/th_Direccion Aproximada Actual (1)'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/div_Longitud'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/div_Latitud'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/td_29103532'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/td_-752802601'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/td_a 7-250 Cl 19 Sur 7-40 Neiva Huila Colombia'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/td_Activo'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/td_Inactivo'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/td_863166030736396'))

WebUI.click(findTestObject('Page_DataTakeW/td_1152 PRODUCTTION (1)'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/td_null'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/td_Inventario'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/td_Andres Felipe Murcia Rivera'))

WebUI.click(findTestObject('Page_DataTakeW/td_0 (1)'))

WebUI.click(findTestObject('Page_DataTakeW/td_0 (1)'))

WebUI.click(findTestObject('Page_DataTakeW/td_0 (1)'))

WebUI.click(findTestObject('Page_DataTakeW/td_0 (1)'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/div_Detalle Del Mvil'))

WebUI.click(findTestObject('Page_DataTakeW/span_Detalle Del Mvil_fa fa-fw fa-close (1)'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/h6_HUAWEI PRA-LX3'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/small_863166030736396'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/button_Andres Felipe Murcia Rivera'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/span_Detalle Del Mvil_fa fa-fw fa-close_1'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/h6_HUAWEI PRA-LX3'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/small_863166030736396'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/span_08-nov-19 33908'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/button_Estado_btn btn-outline-light ng-star_5ff1d9'))

WebUI.click(findTestObject('Page_DataTakeW/img_Estado_img-responsive (1)'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/button_near_me'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/div_11Datos de mapasDatos de mapas 2019Dato_fd35a2'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/div_11Datos de mapasDatos de mapas 2019Dato_fd35a2_1'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/div_11'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/div_11'))

WebUI.click(findTestObject('Page_DataTakeW/img (1)'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/a_Hoja de                    vida'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/a_Hoja de                    vida'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/div_Hoja de                    vida'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/a_Hoja de                    vida'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/a_Hoja de                    vida'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/div_Hoja de                    vida'))

WebUI.click(findTestObject('Page_DataTakeW/img (1)'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/button_Hoja de                    vida_gm-u_47bef5'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/button_Hoja de                    vida_gm-u_47bef5'))

WebUI.click(findTestObject('Page_DataTakeW/img_Estado_img-responsive (1)'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/img_1'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/p_Usuario Andres Felipe Murcia Rivera'))

WebUI.click(findTestObject('Page_DataTakeW/p_Estado Inactivo (1)'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/p_Fecha 08-nov-19 33908'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/button_Hoja de                    vida_gm-u_47bef5'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/div'))

WebUI.click(findTestObject('Page_DataTakeW/i_near_me (1)'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/div_11'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/button_limpiar'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/i_limpiar_fas fa-broom'))

WebUI.click(findTestObject('Object Repository/Page_DataTakeW/img_1_2'))

WebUI.click(findTestObject('Page_DataTakeW/i_keyboard_arrow_down (3)'))

WebUI.click(findTestObject('Page_DataTakeW/span_Salir (3)'))

WebUI.closeBrowser()

