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

WebUI.sendKeys(findTestObject('Page_Sign in to your account/input_Sign in_loginfmt'), 'Sharepointtest@m4o365.onmicrosoft.com')

WebUI.click(findTestObject('Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.sendKeys(findTestObject('Page_Sign in to your account/Password'), 'TestUser123')

WebUI.click(findTestObject('Page_Sign in to your account/input_Forgot my password_idSIButton9'))

WebUI.scrollToElement(findTestObject('curlMoreOptions/layer1/Page_Test/iframe__layer1MoreOptions'), 2)

WebUI.delay(15)

WebUI.waitForElementClickable(findTestObject('curlMoreOptions/layer2/Page_Test/button_layer2moreoptions'), 2)

WebUI.enhancedClick(findTestObject('curlMoreOptions/layer2/Page_Test/button_layer2moreoptions'))

WebUI.delay(5)

WebUI.waitForElementClickable(findTestObject('curlMoreOptions/layer2Zoom/Page_Test/button_layer2_zoom'), 2)

WebUI.enhancedClick(findTestObject('curlMoreOptions/layer2Zoom/Page_Test/button_layer2_zoom'))

WebUI.delay(5)

WebUI.waitForElementClickable(findTestObject('curlMoreOptions/layer1/Page_Test/iframe__layer1MoreOptions'), 0)

WebUI.enhancedClick(findTestObject('curlMoreOptions/layer1/Page_Test/button_layer1MoreOptions'))

WebUI.delay(5)

WebUI.waitForElementClickable(findTestObject('curlMoreOptions/layer1zoom/Page_Test/button_layer1Zoom'), 0)

WebUI.enhancedClick(findTestObject('curlMoreOptions/layer1zoom/Page_Test/button_layer1Zoom'))

WebUI.delay(5)

WebUI.enhancedClick(findTestObject('addData/Page_Test/button_addData'))

WebUI.delay(1)

WebUI.sendKeys(findTestObject('searchSP/Page_Test/input_searchSP'), 'Apiaries - State of Illinois')

WebUI.delay(5)

WebUI.enhancedClick(findTestObject('addFromSP/Page_Test/button_addfromSP'))

WebUI.delay(5)

WebUI.enhancedClick(findTestObject('homeButton/Page_Test/button_Home'))

WebUI.enhancedClick(findTestObject('closeAddfromSP/Page_Test/button_closeAddfromSP'))

