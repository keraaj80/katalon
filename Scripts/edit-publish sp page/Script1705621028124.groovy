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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://m4o365.sharepoint.com/sites/raaj2/SitePages/Test(13).aspx')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Testrun1/input_Sign in_loginfmt'), 'SharePointTest@m4o365.onmicrosoft.com')

WebUI.delay(2)

WebUI.click(findTestObject('Testrun1/input_Sign in_idSIButton9'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Testrun1/Password'), 'TestUser123')

WebUI.click(findTestObject('Testrun1/input_Forgot my password_idSIButton9'))

WebUI.delay(2)

WebUI.click(findTestObject('initStaySignedIn/Page_Sign in to your account/input_staysignedin'))

WebUI.delay(2)

WebUI.click(findTestObject('Testrun1/span_testSPEditPage'))

WebUI.delay(2)

WebUI.click(findTestObject('testCloseWelcomeScreen/Page_Test/span_closeWelcomeScreen'))

WebUI.delay(5)

WebUI.click(findTestObject('Testrun1/span_Republish'))

WebUI.delay(5)

WebUI.enhancedClick(findTestObject('Testrun1/button_expandLayerbutton'))

