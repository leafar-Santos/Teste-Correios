package br.com.correios.addressTest;

import br.com.correios.addressTest.dataAddressPage.DataAddress;
import br.com.correios.core.BaseTestClass;
import br.com.correios.pages.AddresPage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static br.com.correios.pages.AddresPage.accessScreenSearchZipCode;

@DisplayName("Performs validations search screen for zip code Post Office")
public class AllureTest{
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


	}

	@Test
	@Severity(SeverityLevel.NORMAL)
	@Description("Validate BY ID" +
			"Enter a valid zip code; " +
			"Selects Community Mailbox Option; " +
			"Click to seek zip code and valid non-existing zip code;")
	@DisplayName("Busca e valida CEP por ID selecionando Caixa Postal Comunitária")
	public void mustSearchValidZipCodeWithCommunityMailboxById()throws InterruptedException {

	}

	@Test
	@Severity(SeverityLevel.NORMAL)
	@Description("Validate BY ID" +
			"Enter a valid zip code; " +
			"Selects BigUser Option Option; " +
			"Click to seek zip code and valid non-existing zip code;")
	@DisplayName("Busca e valida CEP por ID selecionando Grande Usuário")
	public void mustSearchValidZipCodeSelectingBigUserOptionById() throws InterruptedException {


	}

	@Test
	@Severity(SeverityLevel.NORMAL)
	@Description("Validate BY ID" +
			"Enter a valid zip code; " +
			"Selects Operating Unit Option; " +
			"Click to seek zip code and valid non-existing zip code;")
	@DisplayName("Busca e valida CEP por ID selecionando Unidade Operacional")
	public void mustSearchValidZipCodeWithOperatingUnitOptionById() throws InterruptedException {


	}

	@Test
	@Severity(SeverityLevel.NORMAL)
	@Description("Validate BY ID" +
			"Enter a valid zip code; " +
			"Selects Community All Options; " +
			"Click to seek zip code and valid non-existing zip code;")
	@DisplayName("Busca e valida CEP por ID selecionando Todas as Opções ")
	public void mustSearchValidZipCodeWithAllOptionsById() throws InterruptedException {

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


	}

	@Test
	@Severity(SeverityLevel.BLOCKER)
	@Description("Validate CSS SELECTOR" +
			"Enter a valid zip code; " +
			"Selects Community Mailbox Option; " +
			"Click to seek zip code and valid non-existing zip code;")
	@DisplayName("Busca e valida CEP por CSS Selector selecionando Caixa Postal Comunitária")
	public void mustSearchValidZipCodeWithCommunityMailboxByCssSelector()throws InterruptedException {


	}

	@Test
	@Severity(SeverityLevel.BLOCKER)
	@Description("Validate CSS SELECTOR" +
			"Enter a valid zip code; " +
			"Selects BigUser Option Option; " +
			"Click to seek zip code and valid non-existing zip code;")
	@DisplayName("Busca e valida CEP por CSS Selector selecionando Grande Usuário")
	public void mustSearchValidZipCodeSelectingBigUserOptionByCssSelector() throws InterruptedException {




	}

	@Test
	@Severity(SeverityLevel.BLOCKER)
	@Description("Validate CSS SELECTOR" +
			"Enter a valid zip code; " +
			"Selects Operating Unit Option; " +
			"Click to seek zip code and valid non-existing zip code;")
	@DisplayName("Busca e valida CEP por Css Slector selecionando Unidade Operacional")
	public void mustSearchValidZipCodeWithOperatingUnitOptionByCssSelector() throws InterruptedException {
	}

	@Test
	@Severity(SeverityLevel.BLOCKER)
	@Description("Validate CSS SELECTOR" +
			"Enter a valid zip code; " +
			"Selects Community All Options; " +
			"Click to seek zip code and valid non-existing zip code;")
	@DisplayName("Busca e valida CEP por ID selecionando Todas as Opções")
	public void mustSearchValidZipCodeWithAllOptionsByCssSelector() throws InterruptedException {


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

	}

	@Test
	@Severity(SeverityLevel.MINOR)
	@Description("Validate BY XPATH" +
			"Enter a valid zip code; " +
			"Selects Community Mailbox Option; " +
			"Click to seek zip code and valid non-existing zip code;")
	@DisplayName("Busca e valida CEP por XPATH selecionando Caixa Postal Comunitária")
	public void mustSearchValidZipCodeWithCommunityMailboxByXpath()throws InterruptedException {


	}

	@Test
	@Severity(SeverityLevel.TRIVIAL)
	@Description("Validate BY XPATH" +
			"Enter a valid zip code; " +
			"Selects BigUser Option Option; " +
			"Click to seek zip code and valid non-existing zip code;")
	@DisplayName("Busca e valida CEP por XPATH selecionando Grande Usuário")
	public void mustSearchValidZipCodeSelectingBigUserOptionByXpath() throws InterruptedException {


	}

	@Test
	@Severity(SeverityLevel.BLOCKER)
	@Description("Validate BY XPATH" +
			"Enter a valid zip code; " +
			"Selects Operating Unit Option; " +
			"Click to seek zip code and valid non-existing zip code;")
	@DisplayName("Busca e valida CEP por XPATH selecionando Unidade Operacional")
	public void mustSearchValidZipCodeWithOperatingUnitOptionByXpath() throws InterruptedException {


	}

	@Test
	@Severity(SeverityLevel.MINOR)
	@Description("Validate BY XPATH" +
			"Enter a valid zip code; " +
			"Selects Community All Options; " +
			"Click to seek zip code and valid non-existing zip code;")
	@DisplayName("Busca e valida CEP por XPATH selecionando Todos")
	public void mustSearchValidZipCodeWithAllOptionsByXpath() throws InterruptedException {

	}


}


