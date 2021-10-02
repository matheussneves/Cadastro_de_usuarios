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

WebUI.setText(findTestObject('Object Repository/Page_Cadastro de usurios/input_Nome_name'), nome)

WebUI.setText(findTestObject('Object Repository/Page_Cadastro de usurios/input_E-mail_email'), email)

WebUI.setText(findTestObject('Object Repository/Page_Cadastro de usurios/input_Senha_password'), senha)

WebUI.click(findTestObject('Object Repository/Page_Cadastro de usurios/button_Cadastrar'))

WebUI.waitForElementNotPresent(findTestObject('Page_Cadastro de usurios/h2_Usurios cadastrados'), 0)

if (WebUI.waitForElementPresent(findTestObject('Page_Cadastro de usurios/h2_Usurios cadastrados'), 1, FailureHandling.OPTIONAL)) {
    WebUI.comment('Usuario cadastrado e exibido na tabela de usuarios cadastrados"')
} else if (WebUI.verifyElementText(findTestObject('Page_Cadastro de usurios/input_Nome_name'), '') && WebUI.waitForElementPresent(
    findTestObject('Page_Cadastro de usurios/p_O campo Nome  obrigatrio'), 1, FailureHandling.OPTIONAL)) {
    if (WebUI.waitForElementPresent(findTestObject('Page_Cadastro de usurios/p_O campo E-mail  obrigatrio'), 1, FailureHandling.OPTIONAL) && 
    WebUI.waitForElementPresent(findTestObject('Page_Cadastro de usurios/p_O campo Senha  obrigatrio'), 1, FailureHandling.OPTIONAL)) {
        WebUI.comment('Tela exibe mensagem informativa em vermelho indicando que os campos são obrigatórios ')
    } else {
        WebUI.comment('Tela exibe mensagem informativa em vermelho "O campo Nome é obrigatório."')
    }
} else if (WebUI.verifyElementText(findTestObject('Page_Cadastro de usurios/input_E-mail_email'), '', FailureHandling.OPTIONAL) && 
WebUI.waitForElementPresent(findTestObject('Page_Cadastro de usurios/p_O campo E-mail  obrigatrio'), 1, FailureHandling.OPTIONAL)) {
    WebUI.comment('Tela exibe mensagem informativa em vermelho "O campo E-mail é obrigatório."')
} else if (WebUI.verifyElementText(findTestObject('Page_Cadastro de usurios/input_Senha_password'), '', FailureHandling.OPTIONAL) && 
WebUI.waitForElementPresent(findTestObject('Page_Cadastro de usurios/p_O campo Senha  obrigatrio'), 1, FailureHandling.OPTIONAL)) {
    WebUI.comment('Tela exibe mensagem informativa em vermelho "O campo Senha é obrigatório."')
} else if (WebUI.verifyElementText(findTestObject('Page_Cadastro de usurios/input_Nome_name'), 'nome', FailureHandling.OPTIONAL) && 
WebUI.waitForElementPresent(findTestObject('Page_Cadastro de usurios/p_Por favor, insira um nome completo'), 1, FailureHandling.OPTIONAL)) {
    WebUI.comment('Tela exibe mensagem informativa em vermelho "Por favor, insira um nome completo."')
} else if (WebUI.verifyElementText(findTestObject('Page_Cadastro de usurios/input_E-mail_email'), 'email', FailureHandling.OPTIONAL) && 
WebUI.waitForElementPresent(findTestObject('Page_Cadastro de usurios/p_Por favor, insira um e-mail vlido'), 1, FailureHandling.OPTIONAL)) {
    WebUI.comment('Tela exibe mensagem informativa em vermelho "Por favor, insira um e-mail válido."')
} else {
    WebUI.comment('Tela exibe mensagem informativa em vermelho "A senha deve conter ao menos 8 caracteres."')
}

