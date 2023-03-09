package br.com.correios.address.tests;
import br.com.correios.core.BaseTestClass;
import br.com.correios.pages.TrackingPage;
import io.qameta.allure.*;
import org.junit.jupiter.api.*;
import static br.com.correios.address.dataTrackingPage.DataTracking.INVALID_TRACKING_CODE;
import static br.com.correios.dataTestes.epics.TrackingEpic.createTrakingPage;
import static br.com.correios.dataTestes.histories.TrackingHistories.validateTrackingScreen;
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
	@Epic(createTrakingPage)
	@Feature("Adding two values")
	@Story(validateTrackingScreen)
	@Owner("shantonu")
	@Issues({@Issue("WW-22"),@Issue("WW-21"),@Issue("WW-23")})
	@Links({ @Link(name = "RQ-1", url="https://www.programiz.com/c-programming/examples/add-numbers",type = "Trello"),
			@Link(name = "RQ-2", url="https://www.programiz.com/c-programming/examples/product-numbers",type = "Trello")})
	@TmsLinks({@TmsLink("tc-257"), @TmsLink("tc-258"), @TmsLink("tc-256")})
	@Test
	@Description("Validate BY ID"  +
			"Should access the mail tracking screen;" +
			"Search for an invalid code;" +
			"Confirm that the code is incorrect and close the browser;")
	@DisplayName("Busca e valida Cóigo de rastrio por ID")
	@Severity(SeverityLevel.CRITICAL)
	public void mustSearchValidZipCodeSelectingOptionLogradouroByID() throws InterruptedException{
		trackingPage.informCodeById("INVALID_TRACKING_CODE");
		trackingPage.validateInfomrmedCodeByID(INVALID_TRACKING_CODE);
		trackingPage.clickSearchByID();
		trackingPage.validateMessageError();
	}

	/**
	 * Execução de dos testes e validação por CSS SELECTOR
	 */

	@Epic(createTrakingPage)
	@Feature("Adding two values")
	@Story(validateTrackingScreen)
	@Owner("shantonu")
	@Issues({@Issue("WW-22"),@Issue("WW-21"),@Issue("WW-23")})
	@Links({ @Link(name = "RQ-1", url="https://www.programiz.com/c-programming/examples/add-numbers",type = "Trello"),
			@Link(name = "RQ-2", url="https://www.programiz.com/c-programming/examples/product-numbers",type = "Trello")})
	@TmsLinks({@TmsLink("tc-257"), @TmsLink("tc-258"), @TmsLink("tc-256")})
	@Test
	@Description("By CSS" +
			"Should access the mail tracking screen;" +
			"Search for an invalid code;" +
			"Confirm that the code is incorrect and close the browser;")
	@DisplayName("Busca e valida Cóigo de rastrio por CSS Selector")
	@Severity(SeverityLevel.MINOR)
	public void mustSearchValidZipCodeSelectingOptionLogradouroByCssSelector() throws InterruptedException {
		trackingPage.informCodeByCssSelector("INVALID_TRACKING_CODE");
		trackingPage.validateInfomrmedCodeByCssSelector(INVALID_TRACKING_CODE);
		trackingPage.clickSearchByCssSelector();
		trackingPage.validateMessageErrorByCssSelector();
	}

	/**
	 * Execução de dos testes e validação por XPATH
	 */

	@Epic(createTrakingPage)
	@Feature("Adding two values")
	@Story(validateTrackingScreen)
	@Owner("shantonu")
	@Issues({@Issue("WW-22"),@Issue("WW-21"),@Issue("WW-23")})
	@Links({ @Link(name = "RQ-1", url="https://www.programiz.com/c-programming/examples/add-numbers",type = "Trello"),
			@Link(name = "RQ-2", url="https://www.programiz.com/c-programming/examples/product-numbers",type = "Trello")})
	@TmsLinks({@TmsLink("tc-257"), @TmsLink("tc-258"), @TmsLink("tc-256")})
	@Test
	@Severity(SeverityLevel.MINOR)
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


