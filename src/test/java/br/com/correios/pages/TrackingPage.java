package br.com.correios.pages;
import br.com.correios.core.BasePage;
import br.com.correios.core.Urls;
import static br.com.correios.pages.dataFieldsPage.DataTrackingElements.*;
import static br.com.correios.core.DriverFactory.getDriver;
import static br.com.correios.addressTest.dataTrackingPage.DataTrackingPage.TRACKING_MESSAGE_ERROR;
import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrackingPage extends BasePage {

	public static void accessScreenSearchTracking(){
		getDriver().get(Urls.MAIL_TRACKING);
	}

	/**
	 * Validações por ID
	 ** @throws InterruptedException
	 */
	public void informCodeById(String code){
		wiriteById(ID_FIELD_CODE,code);
	}

	public void validateInfomrmedCodeByID(String code){
		assertEquals(code, getValueFieldById(ID_FIELD_CODE));
	}

	public void clickSearchByID(){
		clickButtonoByID(ID_BTN_SEARCH);
	}

	public void validateMessageError() throws InterruptedException {
		assertEquals(TRACKING_MESSAGE_ERROR,validatesLabelByXpath(XPATH_MESSAGE_ERROR));
	}


	/**
	 *
	 * Validações por  Css Selector
	 ** @throws InterruptedException
	 */


	public void informCodeByCssSelector(String code){
		wiriteByCssSelector(CSS_FIELD_CODE,code);
	}

	public void validateInfomrmedCodeByCssSelector(String code){
		assertEquals(code, getValueFieldByCssSlector(CSS_FIELD_CODE));
	}

	public void clickSearchByCssSelector(){
		clickButtonByCssSelector(CSS_BTN_SEARCH);
	}

	public void validateMessageErrorByCssSelector() throws InterruptedException {
		assertEquals(TRACKING_MESSAGE_ERROR, validateLabelByCssSelector(CSS_MESSAGE_ERROR));
	}

	/**
	 * Validações por  XPATH
	 ** @throws InterruptedException
	 */

	public void informCodeByXpath(String code){
		wiriteByXpath(XPATH_FIELD_CODE,code);

	}

	public void clickSerachByXpath(){
		clickButtonByXpath(XPATH_BTN_SEARCH);
	}
	public void validateInfomrmedCodeByXpath(String code){
		assertEquals(code, getValueFieldByXpath(XPATH_FIELD_CODE));
	}

	public void validateMessageErrorByXpath() throws InterruptedException {
		assertEquals(TRACKING_MESSAGE_ERROR,validatesLabelByXpath(XPATH_MESSAGE_ERROR));
	}
}
