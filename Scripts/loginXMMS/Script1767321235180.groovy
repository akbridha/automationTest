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
//import org.openqa.selenium.chrome.ChromeOptions
//import com.kms.katalon.core.webui.driver.DriverFactory
//
//ChromeOptions options = new ChromeOptions()
//
//Map<String, Object> prefs = new HashMap<>()
//prefs.put("credentials_enable_service", false)
//prefs.put("profile.password_manager_enabled", false)
//
//options.setExperimentalOption("prefs", prefs)
//options.addArguments("--disable-features=PasswordCheck")
//options.addArguments("--disable-features=SafetyCheck")
//options.addArguments("--disable-features=PasswordLeakDetection")
//
//// Optional tapi disarankan
//options.addArguments("--disable-save-password-bubble")
//options.addArguments("--disable-infobars")
//options.addArguments("--incognito")
//
//
//DriverFactory.changeWebDriver(
//	new org.openqa.selenium.chrome.ChromeDriver(options)
//)

WebUI.openBrowser("http://192.168.8.100/pltadmomp/login")
WebUI.click(findTestObject('Object Repository/loginPage/choicesjs_perusahaan'))
WebUI.click(findTestObject('Object Repository/loginPage/option_value'))
WebUI.setText(findTestObject('Object Repository/loginPage/field_login',["field":"nrp"]),"0115118")
WebUI.setText(findTestObject('Object Repository/loginPage/field_login',["field":"password-input"]),"Adr1@001")

WebUI.click(findTestObject('Object Repository/loginPage/form_title'))
WebUI.click(findTestObject('Object Repository/loginPage/button_login'))