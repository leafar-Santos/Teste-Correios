package br.com.correios.addressTest;
import br.com.correios.addressTest.dataAddressPage.DataAddress;
import br.com.correios.core.BaseTestClass;
import io.qameta.allure.*;
import br.com.correios.pages.AddresPage;
import org.junit.jupiter.api.*;
import static br.com.correios.pages.AddresPage.accessScreenSearchZipCode;

@DisplayName("Performs validations search screen for zip code Post Office")
public class AddresTest extends BaseTestClass {

	private static AddresPage addresPage;
	@BeforeEach
	public void starTest(){
		addresPage = new AddresPage();
		accessScreenSearchZipCode();
	}
	/**
	 * Execução de dos testes e validação por ID
	 * @throws InterruptedException
	 */






	@Test
	@Description("Validate BY ID"  +
			"Enter the post office website; " +
			"Look for an invalid Zip Code; " +
			"Confirms that zip code does not exist; " +
			"Return to the home screen; " +
			"Search for a valid zip code " +
			"Confirm that the result is: Rua Quinze de Novembro - odd side, São Paulo/SP; " +
			"Returns to the home screen; ")
	@DisplayName("Busca e valida CEP por ID")
	@Severity(SeverityLevel.CRITICAL)
	public void mustSearchValidZipCodeSelectingOptionLogradouroByID() throws InterruptedException {
		addresPage.informZipCodeById(DataAddress.INVALID_ZIP_CODE);
		addresPage.validateZipCodeInformedById(DataAddress.INVALID_ZIP_CODE);
		addresPage.selectOptionLocationAddressbyId();
		addresPage.clickSearchById();
		addresPage.validateFirstMessageErrorById();
		addresPage.validateSecondMessageErrorById();
		addresPage.newSearchById();
		addresPage.informZipCodeById(DataAddress.VALID_ZIP_CODE);
		addresPage.validateZipCodeInformedById(DataAddress.VALID_ZIP_CODE);
		addresPage.selectOptionLocationAddressbyId();
		addresPage.clickSearchById();

		//Não possui ID
		addresPage.validateStreetByXpath();
		addresPage.validateNeighborhoodByXpath();
		addresPage.validateStateCityByXpath();
	}

	/**
	 * Execução de dos testes e validação por CSS SELECTOR
	 * @throws InterruptedException
	 */

	@Test
	@Severity(SeverityLevel.CRITICAL)
	@Description("Validate BY CSS SELECTOR" +
			"Enter the post office website; " +
			"Look for an invalid Zip Code; " +
			"Confirms that zip code does not exist; " +
			"Return to the home screen; " +
			"Search for a valid zip code " +
			"Confirm that the result is: Rua Quinze de Novembro - odd side, São Paulo/SP; " +
			"Returns to the home screen; ")
	@DisplayName("Busca e valida CEP por CSS Selector")
	public void mustSearchValidZipCodeSelectingOptionLogradouroByCssSelector() throws InterruptedException {
		addresPage.informZipCodeByCssSelector(DataAddress.INVALID_ZIP_CODE);
		addresPage.validateZipCodeInformedByCssSelector(DataAddress.INVALID_ZIP_CODE);
		addresPage.selectOptionLocationAddressByCssSelector();
		addresPage.clickSearchByCsselector();
		addresPage.validateFirstMessageErrorByCssSelector();
		addresPage.validateSecondMessageErrorByCssSelector();
		addresPage.clickNewSearchByCsselector();
		addresPage.informZipCodeByCssSelector(DataAddress.VALID_ZIP_CODE);
		addresPage.validateZipCodeInformedByCssSelector(DataAddress.VALID_ZIP_CODE);
		addresPage.selectOptionLocationAddressByCssSelector();
		addresPage.clickSearchByCsselector();

		//Não possui ID
		addresPage.validateStreetByXpath();
		addresPage.validateNeighborhoodByXpath();
		addresPage.validateStateCityByXpath();
	}

	/**
	 * Execução de dos testes e validação por XPATH
	 * @throws InterruptedException
	 */

	@Test
	@Severity(SeverityLevel.CRITICAL)
	@Description("Validate BY XPATH" +
			"Enter the post office website; " +
			"Look for an invalid Zip Code; " +
			"Confirms that zip code does not exist; " +
			"Return to the home screen; " +
			"Search for a valid zip code " +
			"Confirm that the result is: Rua Quinze de Novembro - odd side, São Paulo/SP; " +
			"Returns to the home screen; ")
	@DisplayName("Busca e valida CEP por XPATH")
	public void mustSearchValidZipCodeSelectingOptionLogradouroByXpath() throws InterruptedException {
		addresPage.informZipCodeByXpath(DataAddress.INVALID_ZIP_CODE);
		addresPage.validateZipCodeInformedByXpath(DataAddress.INVALID_ZIP_CODE);
		addresPage.selectOptionLocationAddressbyXpath();
		addresPage.clickSearchByXpath();
		addresPage.validateFirstMessageErroByXpath();
		addresPage.validateSecondMessageErroByXpath();
		addresPage.newSearchByXPath();
		addresPage.informZipCodeByXpath(DataAddress.VALID_ZIP_CODE);
		addresPage.validateZipCodeInformedByXpath(DataAddress.VALID_ZIP_CODE);
		addresPage.selectOptionLocationAddressbyXpath();
		addresPage.clickSearchByXpath();

		//Não possui ID
		addresPage.validateStreetByXpath();
		addresPage.validateNeighborhoodByXpath();
		addresPage.validateStateCityByXpath();
	}


	/**
	 * VAlidação de testes aternativos e validação por ID
	 * @throws InterruptedException
	 */


	@Test
	@Severity(SeverityLevel.NORMAL)
	@Description("Validate BY ID" +
			"Enter a valid zip code; " +
			"Selects the promotional Zip Code; " +
			"Click to seek zip code and valid non-existing zip code;")
	@DisplayName("Busca e valida CEP por ID selecionando CEP Promocional")
	public void mustSearchValidZipCodeWithTypePromotionalZipCodeById() throws InterruptedException {
		addresPage.informZipCodeById(DataAddress.VALID_ZIP_CODE);
		addresPage.validateZipCodeInformedById(DataAddress.VALID_ZIP_CODE);
		addresPage.selectPromotionalZipCodeOptionById();
		addresPage.clickSearchById();
		addresPage.validateFirstMessageErrorById();
		addresPage.validateSecondMessageErrorByCssSelector();

	}

	@Test
	@Severity(SeverityLevel.NORMAL)
	@Description("Validate BY ID" +
			"Enter a valid zip code; " +
			"Selects Community Mailbox Option; " +
			"Click to seek zip code and valid non-existing zip code;")
	@DisplayName("Busca e valida CEP por ID selecionando Caixa Postal Comunitária")
	public void mustSearchValidZipCodeWithCommunityMailboxById()throws InterruptedException {
		addresPage.informZipCodeById(DataAddress.VALID_ZIP_CODE);
		addresPage.validateZipCodeInformedById(DataAddress.VALID_ZIP_CODE);
		addresPage.selectCommunityMailboxOption();
		addresPage.clickSearchById();
		addresPage.validateFirstMessageErrorById();
		addresPage.validateSecondMessageErrorByCssSelector();

	}

	@Test
	@Severity(SeverityLevel.NORMAL)
	@Description("Validate BY ID" +
			"Enter a valid zip code; " +
			"Selects BigUser Option Option; " +
			"Click to seek zip code and valid non-existing zip code;")
	@DisplayName("Busca e valida CEP por ID selecionando Grande Usuário")
	public void mustSearchValidZipCodeSelectingBigUserOptionById() throws InterruptedException {
		addresPage.informZipCodeById(DataAddress.VALID_ZIP_CODE);
		addresPage.validateZipCodeInformedById(DataAddress.VALID_ZIP_CODE);
		addresPage.selectBigUserOption();
		addresPage.clickSearchById();
		addresPage.validateFirstMessageErrorById();
		addresPage.validateSecondMessageErrorByCssSelector();

	}

	@Test
	@Severity(SeverityLevel.NORMAL)
	@Description("Validate BY ID" +
			"Enter a valid zip code; " +
			"Selects Operating Unit Option; " +
			"Click to seek zip code and valid non-existing zip code;")
	@DisplayName("Busca e valida CEP por ID selecionando Unidade Operacional")
	public void mustSearchValidZipCodeWithOperatingUnitOptionById() throws InterruptedException {
		addresPage.informZipCodeById(DataAddress.VALID_ZIP_CODE);
		addresPage.validateZipCodeInformedById(DataAddress.VALID_ZIP_CODE);
		addresPage.selectOperatingUnitOption();
		addresPage.clickSearchById();
		addresPage.validateFirstMessageErrorById();
		addresPage.validateSecondMessageErrorByCssSelector();

	}

	@Test
	@Severity(SeverityLevel.NORMAL)
	@Description("Validate BY ID" +
			"Enter a valid zip code; " +
			"Selects Community All Options; " +
			"Click to seek zip code and valid non-existing zip code;")
	@DisplayName("Busca e valida CEP por ID selecionando Todas as Opções ")
	public void mustSearchValidZipCodeWithAllOptionsById() throws InterruptedException {
		addresPage.informZipCodeById(DataAddress.VALID_ZIP_CODE);
		addresPage.validateZipCodeInformedById(DataAddress.VALID_ZIP_CODE);
		addresPage.selectAllOptions();
		addresPage.clickSearchById();

		//Não possui ID
		addresPage.validateStreetByXpath();
		addresPage.validateNeighborhoodByXpath();
		addresPage.validateStateCityByXpath();
	}


	/**
	 * VAlidação de testes aternativos e validação por CSS SELECTOR
	 * @throws InterruptedException
	 */

	@Test
	@Severity(SeverityLevel.BLOCKER)
	@Description("Validate CSS SELECTOR" +
			"Enter a valid zip code; " +
			"Selects the promotional Zip Code; " +
			"Click to seek zip code and valid non-existing zip code;")
	@DisplayName("Busca e valida CEP por CSS Selector selecionando CEP Promocional")
	public void mustSearchValidZipCodeWithTypePromotionalZipCodeByCssSelector() throws InterruptedException {
		addresPage.informZipCodeByCssSelector(DataAddress.VALID_ZIP_CODE);
		addresPage.validateZipCodeInformedByCssSelector(DataAddress.VALID_ZIP_CODE);
		addresPage.selectPromotionalZipCodeOptionByCssSelector();
		addresPage.clickSearchByCsselector();
		addresPage.validateFirstMessageErrorByCssSelector();
		addresPage.validateSecondMessageErrorByCssSelector();

	}

	@Test
	@Severity(SeverityLevel.BLOCKER)
	@Description("Validate CSS SELECTOR" +
			"Enter a valid zip code; " +
			"Selects Community Mailbox Option; " +
			"Click to seek zip code and valid non-existing zip code;")
	@DisplayName("Busca e valida CEP por CSS Selector selecionando Caixa Postal Comunitária")
	public void mustSearchValidZipCodeWithCommunityMailboxByCssSelector()throws InterruptedException {
		addresPage.informZipCodeByCssSelector(DataAddress.VALID_ZIP_CODE);
		addresPage.validateZipCodeInformedByCssSelector(DataAddress.VALID_ZIP_CODE);
		addresPage.selectCommunityMailboxOptionByCssSelector();
		addresPage.clickSearchByCsselector();
		addresPage.validateFirstMessageErrorByCssSelector();
		addresPage.validateSecondMessageErrorByCssSelector();

	}

	@Test
	@Severity(SeverityLevel.BLOCKER)
	@Description("Validate CSS SELECTOR" +
			"Enter a valid zip code; " +
			"Selects BigUser Option Option; " +
			"Click to seek zip code and valid non-existing zip code;")
	@DisplayName("Busca e valida CEP por CSS Selector selecionando Grande Usuário")
	public void mustSearchValidZipCodeSelectingBigUserOptionByCssSelector() throws InterruptedException {
		addresPage.informZipCodeByCssSelector(DataAddress.VALID_ZIP_CODE);
		addresPage.validateZipCodeInformedByCssSelector(DataAddress.VALID_ZIP_CODE);
		addresPage.selectBigUserOptionByCssSelector();
		addresPage.clickSearchByCsselector();
		addresPage.validateFirstMessageErrorByCssSelector();
		addresPage.validateSecondMessageErrorByCssSelector();



	}

	@Test
	@Severity(SeverityLevel.BLOCKER)
	@Description("Validate CSS SELECTOR" +
			"Enter a valid zip code; " +
			"Selects Operating Unit Option; " +
			"Click to seek zip code and valid non-existing zip code;")
	@DisplayName("Busca e valida CEP por Css Slector selecionando Unidade Operacional")
	public void mustSearchValidZipCodeWithOperatingUnitOptionByCssSelector() throws InterruptedException {
		addresPage.informZipCodeByCssSelector(DataAddress.VALID_ZIP_CODE);
		addresPage.validateZipCodeInformedByCssSelector(DataAddress.VALID_ZIP_CODE);
		addresPage.selectOperatingUnitOptionByCssSelector();
		addresPage.clickSearchByCsselector();
		addresPage.validateFirstMessageErrorByCssSelector();
		addresPage.validateSecondMessageErrorByCssSelector();

	}

	@Test
	@Severity(SeverityLevel.BLOCKER)
	@Description("Validate CSS SELECTOR" +
			"Enter a valid zip code; " +
			"Selects Community All Options; " +
			"Click to seek zip code and valid non-existing zip code;")
	@DisplayName("Busca e valida CEP por ID selecionando Todas as Opções")
	public void mustSearchValidZipCodeWithAllOptionsByCssSelector() throws InterruptedException {
		addresPage.informZipCodeByCssSelector(DataAddress.VALID_ZIP_CODE);
		addresPage.validateZipCodeInformedByCssSelector(DataAddress.VALID_ZIP_CODE);
		addresPage.selectAllOptionsByCssSelector();
		addresPage.clickSearchByCsselector();
		addresPage.validateStreetByCssSelector();
		addresPage.validateNeighborhoodCssSelector();
		addresPage.validateStateCityCssSelector();


	}

	/**
	 * VAlidação de testes aternativos e validação por XPATH
	 * @throws InterruptedException
	 */

	@Test

	@Severity(SeverityLevel.MINOR)
	@Description("Validate BY XPATH" +
			"Enter a valid zip code; " +
			"Selects the promotional Zip Code; " +
			"Click to seek zip code and valid non-existing zip code;")
	@DisplayName("Busca e valida CEP por XPATH selecionando CEP Promocional")
	public void mustSearchValidZipCodeWithTypePromotionalZipCodeByXpath() throws InterruptedException {
		addresPage.informZipCodeByXpath(DataAddress.VALID_ZIP_CODE);
		addresPage.validateZipCodeInformedByXpath(DataAddress.VALID_ZIP_CODE);
		addresPage.selectPromotionalZipCodeOptionByXPath();
		addresPage.clickSearchByXpath();
		addresPage.validateFirstMessageErroByXpath();
		addresPage.validateSecondMessageErroByXpath();
	}

	@Test
	@Severity(SeverityLevel.MINOR)
	@Description("Validate BY XPATH" +
			"Enter a valid zip code; " +
			"Selects Community Mailbox Option; " +
			"Click to seek zip code and valid non-existing zip code;")
	@DisplayName("Busca e valida CEP por XPATH selecionando Caixa Postal Comunitária")
	public void mustSearchValidZipCodeWithCommunityMailboxByXpath()throws InterruptedException {
		addresPage.informZipCodeByXpath(DataAddress.VALID_ZIP_CODE);
		addresPage.validateZipCodeInformedByXpath(DataAddress.VALID_ZIP_CODE);
		addresPage.selectCommunityMailboxOptionByXPath();
		addresPage.clickSearchByXpath();
		addresPage.validateFirstMessageErroByXpath();
		addresPage.validateSecondMessageErroByXpath();

	}

	@Test
	@Severity(SeverityLevel.TRIVIAL)
	@Description("Validate BY XPATH" +
			"Enter a valid zip code; " +
			"Selects BigUser Option Option; " +
			"Click to seek zip code and valid non-existing zip code;")
	@DisplayName("Busca e valida CEP por XPATH selecionando Grande Usuário")
	public void mustSearchValidZipCodeSelectingBigUserOptionByXpath() throws InterruptedException {
		addresPage.informZipCodeById(DataAddress.VALID_ZIP_CODE);
		addresPage.validateZipCodeInformedByXpath(DataAddress.VALID_ZIP_CODE);
		addresPage.selectBigUserOptionByXPath();
		addresPage.clickSearchByXpath();
		addresPage.validateFirstMessageErroByXpath();
		addresPage.validateSecondMessageErroByXpath();

	}

	@Test
	@Severity(SeverityLevel.BLOCKER)
	@Description("Validate BY XPATH" +
			"Enter a valid zip code; " +
			"Selects Operating Unit Option; " +
			"Click to seek zip code and valid non-existing zip code;")
	@DisplayName("Busca e valida CEP por XPATH selecionando Unidade Operacional")
	public void mustSearchValidZipCodeWithOperatingUnitOptionByXpath() throws InterruptedException {
		addresPage.informZipCodeById(DataAddress.VALID_ZIP_CODE);
		addresPage.validateZipCodeInformedByXpath(DataAddress.VALID_ZIP_CODE);
		addresPage.selectOperatingUnitOptionByXPath();
		addresPage.clickSearchByXpath();
		addresPage.validateFirstMessageErroByXpath();
		addresPage.validateSecondMessageErroByXpath();

	}

	@Test
	@Severity(SeverityLevel.MINOR)
	@Description("Validate BY XPATH" +
			"Enter a valid zip code; " +
			"Selects Community All Options; " +
			"Click to seek zip code and valid non-existing zip code;")
	@DisplayName("Busca e valida CEP por XPATH selecionando Todos")
	public void mustSearchValidZipCodeWithAllOptionsByXpath() throws InterruptedException {
		addresPage.informZipCodeById(DataAddress.VALID_ZIP_CODE);
		addresPage.validateZipCodeInformedByXpath(DataAddress.VALID_ZIP_CODE);
		addresPage.selectAllOptionsByXPath();
		addresPage.clickSearchByXpath();
		addresPage.validateStreetByXpath();
		addresPage.validateNeighborhoodByXpath();
		addresPage.validateStateCityByXpath();
	}


}


