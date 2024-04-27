package br.com.correios.pages;
import br.com.correios.core.BasePage;
import br.com.correios.core.DriverFactory;
import br.com.correios.core.Urls;

import static br.com.correios.pages.dataFieldsPage.DataAddressElements.*;
import static br.com.correios.core.DriverFactory.getDriver;
import static br.com.correios.address.dataAddressPage.DataAddressPage.*;
import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddressPage extends BasePage {

	public static void accessScreenSearchZipCode(){
		getDriver().get(Urls.MAIL_ZIP_CODE);
	}


	/**
	 * Validações por ID

	 */

	public void informZipCodeById(String ZipCode){
		wiriteById(ID_ADRESS_FIELD,ZipCode);
	}

	public void validateZipCodeInformedById(String cep){
		assertEquals(cep, getValueFieldById(ID_ADRESS_FIELD));
	}
	public void clickSearchById() {
		clickButtonoByID(ID_BTN_SEARCH);
	}
	public void selectOptionLocationAddressbyId(){
		selectOptionComboById(ID_TYPE_ZIP_CODE,COMBO_STREET_OPTION);
	}
	public void selectPromotionalZipCodeOptionById(){
		selectOptionComboById(ID_TYPE_ZIP_CODE,COMBO_ZIPCODE_OPTION);
	}
	public void selectCommunityMailboxOption(){
		selectOptionComboById(ID_TYPE_ZIP_CODE,COMBO_COMMUNITY_MAIL_BOX_OPTION);
	}
	public void selectBigUserOption(){

		selectOptionComboById(ID_TYPE_ZIP_CODE,COMBO_BIG_USER_OPTION);
	}
	public void selectOperatingUnitOption(){

		selectOptionComboById(ID_TYPE_ZIP_CODE,COMBO_OPERATING_UNIT_OPTION);
	}
	public void selectAllOptions(){

		selectOptionComboById(ID_TYPE_ZIP_CODE,COMBO_ALL_OPTIONS );
	}
	public void validateFirstMessageErrorById() throws InterruptedException {
		DriverFactory.wait_element();
		assertEquals(FIRST_MESSAGE_ERROR,validatesLabelById(ID_FIRST_MESSAGE_RESULT));
	}

	public void validateSecondMessageErrorById() throws InterruptedException {
		DriverFactory.wait_element();
		assertEquals(SECOND_MESSAGE_ERROR,validatesLabelById(ID_SECOND_MESSAGE_RESULT));
	}

	public void newSearchById() {
		clickButtonoByID(ID_BTN_NEW_SEARCH);
	}


	/**
	 *
	 * Validações por  Css Selector

	 */


	public void informZipCodeByCssSelector(String ZipCode){
		wiriteByCssSelector(CSS_SELECTOR_ADRESS_FIELD,ZipCode);
	}

	public void selectOptionLocationAddressByCssSelector(){
		selectOptionComboByCssSelector(CSS_TYPE_ZIP_CODE,COMBO_STREET_OPTION);
	}

	public void clickSearchByCsselector() {
		clickButtonByCssSelector(CSS_BTN_SEARCH);
	}

	public void clickNewSearchByCsselector() {

		clickButtonByCssSelector(CSS_BTN_NEW_SEARCH);
	}

	public void selectPromotionalZipCodeOptionByCssSelector(){
		selectOptionComboByCssSelector(CSS_TYPE_ZIP_CODE,COMBO_ZIPCODE_OPTION);
	}
	public void selectCommunityMailboxOptionByCssSelector(){
		selectOptionComboByCssSelector(CSS_TYPE_ZIP_CODE,COMBO_COMMUNITY_MAIL_BOX_OPTION);
	}
	public void selectBigUserOptionByCssSelector(){
		selectOptionComboById(ID_TYPE_ZIP_CODE,COMBO_BIG_USER_OPTION);
	}
	public void selectOperatingUnitOptionByCssSelector(){
		selectOptionComboByCssSelector(CSS_TYPE_ZIP_CODE,COMBO_OPERATING_UNIT_OPTION);
	}
	public void selectAllOptionsByCssSelector(){
		selectOptionComboByCssSelector(CSS_TYPE_ZIP_CODE,COMBO_ALL_OPTIONS );
	}

	public void validateZipCodeInformedByCssSelector(String cep){
		assertEquals(cep, getValueFieldByCssSlector(CSS_SELECTOR_ADRESS_FIELD));
	}
	public void validateFirstMessageErrorByCssSelector() throws InterruptedException {
		assertEquals(FIRST_MESSAGE_ERROR, validateLabelByCssSelector(CSS_SELECTOR_FIRST_MESSAGE_ERROR_RESULT));
	}

	public void validateSecondMessageErrorByCssSelector() throws InterruptedException {
		assertEquals(SECOND_MESSAGE_ERROR, validateLabelByCssSelector(CSS_SELECTOR_SECOND_MESSAGE_ERROR_RESULT));
	}

	public void validateStreetByCssSelector() throws InterruptedException {
		assertEquals(STREERT ,validateLabelByCssSelector(CSS_SELECTOR_STREET));
	}

	public void validateNeighborhoodCssSelector() throws InterruptedException {
		assertEquals(NEIGHBORHOOD,validateLabelByCssSelector(CSS_SELECTOR_NEIGHBORHOOD));
	}
	public void validateStateCityCssSelector() throws InterruptedException {
		assertEquals(CITY_STATE,validateLabelByCssSelector(CSS_SELECTOR_STATE_COUNTRY));
	}

	/**
	 * Validações por  XPATH
	 */

	public void newSearchByXPath() {
		clickButtonByXpath(XPATH_BTN_NEW_SEARCH);
	}

	public void informZipCodeByXpath(String ZipCode){
		wiriteByXpath(XPATH_FILED_ZIP_CODE,ZipCode);
	}

	public void validateZipCodeInformedByXpath(String cep){
		assertEquals(cep, getValueFieldByXpath(XPATH_SELECTOR_ADRESS_FIELD));
	}

	public void selectOptionLocationAddressbyXpath(){
		selectOptionComboByXpath(XPATH_TYPE_ZIP_CODE,COMBO_STREET_OPTION);
	}
	public void selectPromotionalZipCodeOptionByXPath(){
		selectOptionComboByXpath(XPATH_TYPE_ZIP_CODE,COMBO_ZIPCODE_OPTION);
	}

	public void selectCommunityMailboxOptionByXPath(){
		selectOptionComboByXpath(XPATH_TYPE_ZIP_CODE ,COMBO_COMMUNITY_MAIL_BOX_OPTION);
	}
	public void selectBigUserOptionByXPath(){
		selectOptionComboByXpath(XPATH_TYPE_ZIP_CODE ,COMBO_BIG_USER_OPTION);
	}
	public void selectOperatingUnitOptionByXPath(){
		selectOptionComboByXpath(XPATH_TYPE_ZIP_CODE ,COMBO_OPERATING_UNIT_OPTION);
	}
	public void selectAllOptionsByXPath(){
		selectOptionComboByXpath(XPATH_TYPE_ZIP_CODE ,COMBO_ALL_OPTIONS );
	}


	public void validateStreetByXpath() throws InterruptedException {
		assertEquals(STREERT ,validatesLabelByXpath(XPATH_STREET));
	}
	public void validateFirstMessageErroByXpath() throws InterruptedException {
		DriverFactory.wait_element();
		assertEquals(FIRST_MESSAGE_ERROR,validatesLabelByXpath(XPATH_FIRST_MESSAGE_ERROR_RESULT));
	}
	public void validateSecondMessageErroByXpath() throws InterruptedException {
		assertEquals(SECOND_MESSAGE_ERROR,validatesLabelByXpath(XPATH_SECOND_MESSAGE_ERROR_RESULT));
	}
	public void validateNeighborhoodByXpath() throws InterruptedException {
		assertEquals(NEIGHBORHOOD,validatesLabelByXpath(XPATH_NEIGHBORHOOD));

	}
	public void validateStateCityByXpath() throws InterruptedException {
		assertEquals(CITY_STATE,validatesLabelByXpath(XPATH_STATE_COUNTRY));
	}

	public void clickSearchByXpath() {
		clickButtonByXpath(XPATH_BTN_SEARCH);
	}



}
