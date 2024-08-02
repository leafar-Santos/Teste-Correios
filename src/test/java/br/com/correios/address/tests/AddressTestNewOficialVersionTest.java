package br.com.correios.address.tests;

import br.com.correios.address.dataAddressPage.DataAddress;
import br.com.correios.core.BaseTestClass;
import br.com.correios.pages.AddressPage;
import io.qameta.allure.*;
import org.junit.jupiter.api.*;

import static br.com.correios.dataTestes.epics.AddressEpic.createAddressPage;
import static br.com.correios.dataTestes.histories.AddressHistories.validateAddressScreen;
import static br.com.correios.pages.AddressPage.accessScreenSearchZipCode;

@DisplayName("Validation new post office address search page")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class AddressTestNewOficialVersionTest extends BaseTestClass {

	private static AddressPage addresPage;

	@BeforeEach
	public void starTest(){
		addresPage = new AddressPage();
		accessScreenSearchZipCode();
	}

	/**
	 * Execução de dos testes e validação por ID

	 */


	@Test
	@Epic(createAddressPage)
	@Story(validateAddressScreen)
	@Description("Validate BY ID"  +
			"Enter the post office website; " +
			"Look for an invalid Zip Code; " +
			"Confirm that captcha is not informed")
	@DisplayName("Deve buscar e validar CEP por ID")
	@Severity(SeverityLevel.CRITICAL)
	public void mustSearchValidZipCodeSelectingOptionLogradouroByID() throws InterruptedException {
		addresPage.informZipCodeById(DataAddress.INVALID_ZIP_CODE);
		addresPage.validateZipCodeInformedById(DataAddress.INVALID_ZIP_CODE);
		addresPage.selectOptionLocationAddressbyId();
		addresPage.clickSearchById();
		addresPage.validateToastMessageErrorByClassName();
	}

	/**
	 * Execução de dos testes e validação por CSS SELECTOR
	 */


	@Test
	@Epic(createAddressPage)
	@Story(validateAddressScreen)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Validate BY CSS SELECTOR" +
			"Enter the post office website; " +
			"Look for an invalid Zip Code; " +
			"Confirm that captcha is not informed")
	@DisplayName("Deve buscar e validar CEP por CSS Selector")
	public void mustSearchValidZipCodeSelectingOptionLogradouroByCssSelector() throws InterruptedException {
		addresPage.informZipCodeByCssSelector(DataAddress.INVALID_ZIP_CODE);
		addresPage.validateZipCodeInformedByCssSelector(DataAddress.INVALID_ZIP_CODE);
		addresPage.selectOptionLocationAddressByCssSelector();
		addresPage.clickSearchByCsselector();
		addresPage.validateToastMessageErrorByClassName();

	}

	/**
	 * Execução de dos testes e validação por XPATH

	 */
	@Test
	@Epic(createAddressPage)
	@Story(validateAddressScreen)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Validate BY XPATH" +
			"Enter the post office website; " +
			"Look for an invalid Zip Code; " +
			"Confirm that captcha is not informed")
	@DisplayName("Deve buscar e validar CEP por XPATH")
	public void mustSearchValidZipCodeSelectingOptionLogradouroByXpath() throws InterruptedException {
		addresPage.informZipCodeByXpath(DataAddress.INVALID_ZIP_CODE);
		addresPage.validateZipCodeInformedByXpath(DataAddress.INVALID_ZIP_CODE);
		addresPage.selectOptionLocationAddressbyXpath();
		addresPage.clickSearchByXpath();
		addresPage.validateToastMessageErrorByClassName();
	}


	/**
	 * VAlidação de testes aternativos e validação por ID
	 */


	@Test
	@Epic(createAddressPage)
	@Story(validateAddressScreen)
	@Severity(SeverityLevel.NORMAL)
	@Description("Validate BY ID" +
			"Enter a valid zip code; " +
			"Selects the promotional Zip Code; " +
			"Click to seek zip code and Confirm that captcha is not informed")
	@DisplayName("Deve buscar e validar CEP por ID selecionando CEP Promocional")
	public void mustSearchValidZipCodeWithTypePromotionalZipCodeById() throws InterruptedException {
		addresPage.informZipCodeById(DataAddress.VALID_ZIP_CODE);
		addresPage.validateZipCodeInformedById(DataAddress.VALID_ZIP_CODE);
		addresPage.selectPromotionalZipCodeOptionById();
		addresPage.clickSearchById();
		addresPage.validateToastMessageErrorByClassName();

	}

	@Test
	@Epic(createAddressPage)
	@Story(validateAddressScreen)
	@Severity(SeverityLevel.NORMAL)
	@Description("Validate BY ID" +
			"Enter a valid zip code; " +
			"Selects Community Mailbox Option; " +
			"Click to seek zip code and Confirm that captcha is not informed")
	@DisplayName("Deve buscar e validar CEP por ID selecionando Caixa Postal Comunitária")
	public void mustSearchValidZipCodeWithCommunityMailboxById()throws InterruptedException {
		addresPage.informZipCodeById(DataAddress.VALID_ZIP_CODE);
		addresPage.validateZipCodeInformedById(DataAddress.VALID_ZIP_CODE);
		addresPage.selectCommunityMailboxOption();
		addresPage.clickSearchById();
		addresPage.validateToastMessageErrorByClassName();

	}

	@Test
	@Epic(createAddressPage)
	@Story(validateAddressScreen)
	@Severity(SeverityLevel.NORMAL)
	@Description("Validate BY ID" +
			"Enter a valid zip code; " +
			"Selects BigUser Option Option; " +
			"Click to seek zip code and Confirm that captcha is not informed")
	@DisplayName("Deve buscar e validar CEP por ID selecionando Grande Usuário")
	public void mustSearchValidZipCodeSelectingBigUserOptionById() throws InterruptedException {
		addresPage.informZipCodeById(DataAddress.VALID_ZIP_CODE);
		addresPage.validateZipCodeInformedById(DataAddress.VALID_ZIP_CODE);
		addresPage.selectBigUserOption();
		addresPage.clickSearchById();
		addresPage.validateToastMessageErrorByClassName();
	}

	@Test
	@Epic(createAddressPage)
	@Story(validateAddressScreen)
	@Severity(SeverityLevel.NORMAL)
	@Description("Validate BY ID" +
			"Enter a valid zip code; " +
			"Selects Operating Unit Option; " +
			"Click to seek zip code and Confirm that captcha is not informed")
	@DisplayName("Deve buscar e validar CEP por ID selecionando Unidade Operacional")
	public void mustSearchValidZipCodeWithOperatingUnitOptionById() throws InterruptedException {
		addresPage.informZipCodeById(DataAddress.VALID_ZIP_CODE);
		addresPage.validateZipCodeInformedById(DataAddress.VALID_ZIP_CODE);
		addresPage.selectOperatingUnitOption();
		addresPage.clickSearchById();
		addresPage.validateToastMessageErrorByClassName();

	}

	@Test
	@Epic(createAddressPage)
	@Story(validateAddressScreen)
	@Severity(SeverityLevel.NORMAL)
	@Description("Validate BY ID" +
			"Enter a valid zip code; " +
			"Selects Community All Options; " +
			"Click to seek zip code and Confirm that captcha is not informed")
	@DisplayName("Deve buscar e validar CEP por ID selecionando Todas as Opções ")
	public void mustSearchValidZipCodeWithAllOptionsById() throws InterruptedException {
		addresPage.informZipCodeById(DataAddress.VALID_ZIP_CODE);
		addresPage.validateZipCodeInformedById(DataAddress.VALID_ZIP_CODE);
		addresPage.selectAllOptions();
		addresPage.clickSearchById();
		addresPage.validateToastMessageErrorByClassName();
	}

	/**
	 * VAlidação de testes aternativos e validação por CSS SELECTOR
	 */

	@Test
	@Epic(createAddressPage)
	@Story(validateAddressScreen)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Validate CSS SELECTOR" +
			"Enter a valid zip code; " +
			"Selects the promotional Zip Code; " +
			"Click to seek zip code and Confirm that captcha is not informed")
	@DisplayName("Deve buscar e validar CEP por CSS Selector selecionando CEP Promocional")
	public void mustSearchValidZipCodeWithTypePromotionalZipCodeByCssSelector() throws InterruptedException {
		addresPage.informZipCodeByCssSelector(DataAddress.VALID_ZIP_CODE);
		addresPage.validateZipCodeInformedByCssSelector(DataAddress.VALID_ZIP_CODE);
		addresPage.selectPromotionalZipCodeOptionByCssSelector();
		addresPage.clickSearchByCsselector();
		addresPage.validateToastMessageErrorByClassName();

	}
	@Test
	@Epic(createAddressPage)
	@Story(validateAddressScreen)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Validate CSS SELECTOR" +
			"Enter a valid zip code; " +
			"Selects Community Mailbox Option; " +
			"Click to seek zip code and Confirm that captcha is not informed")
	@DisplayName("Deve buscar e validar CEP por CSS Selector selecionando Caixa Postal Comunitária")
	public void mustSearchValidZipCodeWithCommunityMailboxByCssSelector()throws InterruptedException {
		addresPage.informZipCodeByCssSelector(DataAddress.VALID_ZIP_CODE);
		addresPage.validateZipCodeInformedByCssSelector(DataAddress.VALID_ZIP_CODE);
		addresPage.selectCommunityMailboxOptionByCssSelector();
		addresPage.clickSearchByCsselector();
		addresPage.validateToastMessageErrorByClassName();

	}

	@Test
	@Epic(createAddressPage)
	@Story(validateAddressScreen)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Validate CSS SELECTOR" +
			"Enter a valid zip code; " +
			"Selects BigUser Option Option; " +
			"Click to seek zip code and vConfirm that captcha is not informed")
	@DisplayName("Deve buscar e validar CEP por CSS Selector selecionando Grande Usuário")
	public void mustSearchValidZipCodeSelectingBigUserOptionByCssSelector() throws InterruptedException {
		addresPage.informZipCodeByCssSelector(DataAddress.VALID_ZIP_CODE);
		addresPage.validateZipCodeInformedByCssSelector(DataAddress.VALID_ZIP_CODE);
		addresPage.selectBigUserOptionByCssSelector();
		addresPage.clickSearchByCsselector();
		addresPage.validateToastMessageErrorByClassName();

	}

	@Test
	@Epic(createAddressPage)
	@Story(validateAddressScreen)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Validate CSS SELECTOR" +
			"Enter a valid zip code; " +
			"Selects Operating Unit Option; " +
			"Click to seek zip code and Confirm that captcha is not informed")
	@DisplayName("Deve buscar e validar CEP por Css Slector selecionando Unidade Operacional")
	public void mustSearchValidZipCodeWithOperatingUnitOptionByCssSelector() throws InterruptedException {
		addresPage.informZipCodeByCssSelector(DataAddress.VALID_ZIP_CODE);
		addresPage.validateZipCodeInformedByCssSelector(DataAddress.VALID_ZIP_CODE);
		addresPage.selectOperatingUnitOptionByCssSelector();
		addresPage.clickSearchByCsselector();
		addresPage.validateToastMessageErrorByClassName();

	}

	@Test
	@Epic(createAddressPage)
	@Story(validateAddressScreen)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Validate CSS SELECTOR" +
			"Enter a valid zip code; " +
			"Selects Community All Options; " +
			"Click to seek zip code and Confirm that captcha is not informed")
	@DisplayName("Deve buscar e validar CEP por ID selecionando Todas as Opções")
	public void mustSearchValidZipCodeWithAllOptionsByCssSelector() throws InterruptedException {
		addresPage.informZipCodeByCssSelector(DataAddress.VALID_ZIP_CODE);
		addresPage.validateZipCodeInformedByCssSelector(DataAddress.VALID_ZIP_CODE);
		addresPage.selectAllOptionsByCssSelector();
		addresPage.clickSearchByCsselector();
		addresPage.validateToastMessageErrorByClassName();


	}

	/**
	 * VAlidação de testes aternativos e validação por XPATH
	 */

	@Test
	@Epic(createAddressPage)
	@Story(validateAddressScreen)
	@Severity(SeverityLevel.MINOR)
	@Description("Validate BY XPATH" +
			"Enter a valid zip code; " +
			"Selects the promotional Zip Code; " +
			"Click to seek zip code and Confirm that captcha is not informed")
	@DisplayName("Deve buscar e validar CEP por XPATH selecionando CEP Promocional")
	public void mustSearchValidZipCodeWithTypePromotionalZipCodeByXpath() throws InterruptedException {
		addresPage.informZipCodeByXpath(DataAddress.VALID_ZIP_CODE);
		addresPage.validateZipCodeInformedByXpath(DataAddress.VALID_ZIP_CODE);
		addresPage.selectPromotionalZipCodeOptionByXPath();
		addresPage.clickSearchByXpath();
		addresPage.validateToastMessageErrorByClassName();

	}

	@Test
	@Epic(createAddressPage)
	@Story(validateAddressScreen)
	@Severity(SeverityLevel.MINOR)
	@Description("Validate BY XPATH" +
			"Enter a valid zip code; " +
			"Selects Community Mailbox Option; " +
			"Click to seek zip code and Confirm that captcha is not informed")
	@DisplayName("Deve buscar e validar CEP por XPATH selecionando Caixa Postal Comunitária")
	public void mustSearchValidZipCodeWithCommunityMailboxByXpath()throws InterruptedException {
		addresPage.informZipCodeByXpath(DataAddress.VALID_ZIP_CODE);
		addresPage.validateZipCodeInformedByXpath(DataAddress.VALID_ZIP_CODE);
		addresPage.selectCommunityMailboxOptionByXPath();
		addresPage.clickSearchByXpath();
		addresPage.validateToastMessageErrorByClassName();

	}

	@Test
	@Epic(createAddressPage)
	@Story(validateAddressScreen)
	@Severity(SeverityLevel.TRIVIAL)
	@Description("Validate BY XPATH" +
			"Enter a valid zip code; " +
			"Selects BigUser Option Option; " +
			"Click to seek zip code and Confirm that captcha is not informed")
	@DisplayName("Deve buscar e validar CEP por XPATH selecionando Grande Usuário")
	public void mustSearchValidZipCodeSelectingBigUserOptionByXpath() throws InterruptedException {
		addresPage.informZipCodeById(DataAddress.VALID_ZIP_CODE);
		addresPage.validateZipCodeInformedByXpath(DataAddress.VALID_ZIP_CODE);
		addresPage.selectBigUserOptionByXPath();
		addresPage.clickSearchByXpath();
		addresPage.validateToastMessageErrorByClassName();

	}

	@Test
	@Epic(createAddressPage)
	@Story(validateAddressScreen)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Validate BY XPATH" +
			"Enter a valid zip code; " +
			"Selects Operating Unit Option; " +
			"Click to seek zip code and Confirm that captcha is not informed")
	@DisplayName("Deve buscar e validar CEP por XPATH selecionando Unidade Operacional")
	public void mustSearchValidZipCodeWithOperatingUnitOptionByXpath() throws InterruptedException {
		addresPage.informZipCodeById(DataAddress.VALID_ZIP_CODE);
		addresPage.validateZipCodeInformedByXpath(DataAddress.VALID_ZIP_CODE);
		addresPage.selectOperatingUnitOptionByXPath();
		addresPage.clickSearchByXpath();
		addresPage.validateToastMessageErrorByClassName();

	}

	@Test
	@Epic(createAddressPage)
	@Story(validateAddressScreen)
	@Severity(SeverityLevel.MINOR)
	@Description("Validate BY XPATH" +
			"Enter a valid zip code; " +
			"Selects Community All Options; " +
			"Click to seek zip code and Confirm that captcha is not informed")
	@DisplayName("Deve buscar e validar CEP por XPATH selecionando Todos")
	public void mustSearchValidZipCodeWithAllOptionsByXpath() throws InterruptedException {
		addresPage.informZipCodeById(DataAddress.VALID_ZIP_CODE);
		addresPage.validateZipCodeInformedByXpath(DataAddress.VALID_ZIP_CODE);
		addresPage.selectAllOptionsByXPath();
		addresPage.clickSearchByXpath();
		addresPage.validateToastMessageErrorByClassName();
	}


}


