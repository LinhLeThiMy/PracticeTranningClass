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

//def firstname = 'test1'
//def lastname = 'Linh'
//def email = new string[3]
//	email[0] = 'test0@gmail.com'
//	email[1] = 'test1@gmail.com'
//	email[2] = 'test2@gmail.com'
//	
//def password = 'o+tS4OuGt32RmpAjBjQt4Q=='
//
//
//
//	WebUI.openBrowser(GlobalVariable.url)
//	
//	WebUI.maximizeWindow()
//	
//	WebUI.setText(input_firstname, firstname)
//	
//	WebUI.setText(input_lastname, lastname)
//	
//	WebUI.setText(input_email, email[0])
//	
//	WebUI.setText(input_password, password)
//	
//	WebUI.click(btn_create)
//	
//	WebUI.closeBrowser()
	
	
////////////////////////////////
	
//	def password = 'o+tS4OuGt32RmpAjBjQt4Q=='
//	
//	def customer =	[
//					customer1:[
//							firstname: "test1",
//							lastname: "Linh1",
//							email: "test0@gmail.com",
//							],
//					customer2:[
//							firstname: "test1",
//							lastname: "Linh1",
//							email: "test0@gmail.com",
//								]
//					]
//	
//	
//		WebUI.openBrowser(GlobalVariable.url)
//		
//		WebUI.maximizeWindow()
//		
//		WebUI.setText(input_firstname, customer.customer1.firstname)
//		
//		WebUI.setText(input_lastname, customer.customer1.lastname)
//		
//		WebUI.setText(input_email, customer.customer1.email)
//		
//		WebUI.setText(input_password, password)
//		
//		WebUI.click(btn_create)
//		
//		WebUI.closeBrowser()
		
//////////////////////////////////	Using [For]	
		def firstname = 'test1'
		def lastname = 'Linh'
		def email = "test123@gmail.com"
		
		def password = 'o+tS4OuGt32RmpAjBjQt4Q=='
	
			WebUI.openBrowser(GlobalVariable.url)
		
			WebUI.maximizeWindow()
		
			WebUI.setText(input_firstname, firstname)
		
			WebUI.setText(input_lastname, lastname)
			
			enterEmail(email)
					
			WebUI.setText(input_password, password)
		
			WebUI.click(btn_create)
		
			WebUI.closeBrowser()
			
		def enterEmail(def email)
			{
				for (def i = 0; i<=5; i++)
					{
						WebUI.setText(input_email, email)
					}
			}