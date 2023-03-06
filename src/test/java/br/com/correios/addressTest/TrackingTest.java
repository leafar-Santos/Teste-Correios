package br.com.correios.addressTest;
import br.com.correios.core.BaseTestClass;
import br.com.correios.pages.TrackingPage;
import io.qameta.allure.Description;
import org.junit.jupiter.api.*;
import java.io.IOException;
import static br.com.correios.addressTest.dataTrackingPage.DataTracking.INVALID_TRACKING_CODE;
import static br.com.correios.pages.TrackingPage.accessScreenSearchTracking;


@DisplayName("Performs validations search screen for Tracking code")
public class TrackingTest extends BaseTestClass {

	private static TrackingPage trackingPage;
	@BeforeEach
	@DisplayName("Primeiro Teste")
	public void starTest(){
		trackingPage = new TrackingPage();
		accessScreenSearchTracking();
	}

	/**
     * Execução de dos testes e validação por ID
	 */

	@Test
	@Description("Validate BY ID"  +
			"Should access the mail tracking screen;" +
			"Search for an invalid code;" +
			"Confirm that the code is incorrect and close the browser;")
	@DisplayName("Busca e valida Cóigo de rastrio por ID")
	public void mustSearchValidZipCodeSelectingOptionLogradouroByID() throws InterruptedException, IOException {
		trackingPage.informCodeById(INVALID_TRACKING_CODE);
		trackingPage.validateInfomrmedCodeByID(INVALID_TRACKING_CODE);
		trackingPage.clickSearchByID();
		trackingPage.validateMessageError();
	}

	/**
	 * Execução de dos testes e validação por CSS SELECTOR
	 */

	@Test
	@Description("By CSS" +
			"Should access the mail tracking screen;" +
			"Search for an invalid code;" +
			"Confirm that the code is incorrect and close the browser;")
	@DisplayName("Busca e valida Cóigo de rastrio por CSS Selector")
	public void mustSearchValidZipCodeSelectingOptionLogradouroByCssSelector() throws InterruptedException {
		trackingPage.informCodeByCssSelector(INVALID_TRACKING_CODE);
		trackingPage.validateInfomrmedCodeByCssSelector(INVALID_TRACKING_CODE);
		trackingPage.clickSearchByCssSelector();
		trackingPage.validateMessageErrorByCssSelector();
	}

	/**
	 * Execução de dos testes e validação por XPATH
	 * @throws InterruptedException
	 */

	@Test
	@Description("Validate BY XPATH" +
			"Should access the mail tracking screen;" +
			"Search for an invalid code;" +
			"Confirm that the code is incorrect and close the browser;")
	@DisplayName("Busca e valida Cóigo de rastrio por XPATH")
	public void mustSearchValidZipCodeSelectingOptionLogradouroByXpath() throws InterruptedException {
		trackingPage.informCodeByXpath(INVALID_TRACKING_CODE );
		trackingPage.validateInfomrmedCodeByXpath(INVALID_TRACKING_CODE);
		trackingPage.clickSerachByXpath();
		trackingPage.validateMessageErrorByXpath();
	}

}


