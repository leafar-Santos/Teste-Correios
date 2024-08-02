package br.com.correios.pages.dataFieldsPage;

public class DataAddressElements {
    public static String ID_TYPE_ZIP_CODE = "tipoCEP";
    public static String ID_ADRESS_FIELD = "endereco";
    public static String ID_BTN_NEW_SEARCH = "btn_nbusca";


    public static String ID_BTN_SEARCH = "btn_pesquisar";
    public static String ID_FIRST_MESSAGE_RESULT = "mensagem-resultado";
    public static String ID_SECOND_MESSAGE_RESULT = "mensagem-resultado-alerta";
    public static String CSS_SELECTOR_ADRESS_FIELD = "#endereco";
    public static String CSS_SELECTOR_STREET = "#resultado-DNEC > tbody > tr > td:nth-child(1)";
    public static String CSS_SELECTOR_NEIGHBORHOOD ="#resultado-DNEC > tbody > tr > td:nth-child(2)";
    public static String CSS_SELECTOR_STATE_COUNTRY ="#resultado-DNEC > tbody > tr > td:nth-child(3)";

    public static String CLASS_TOAST_ALERT = "msg";
    public static String CLASS_HINT_ALERT = "mensagem";

    public static String CSS_BTN_SEARCH = "#btn_pesquisar";
    public static String CSS_TYPE_ZIP_CODE = "#tipoCEP";
    public static String CSS_BTN_NEW_SEARCH = "#btn_nbusca";

    public static String CSS_SELECTOR_FIRST_MESSAGE_ERROR_RESULT = "#mensagem-resultado";
    public static String CSS_SELECTOR_SECOND_MESSAGE_ERROR_RESULT = "#mensagem-resultado-alerta > h6";



    public static String XPATH_BTN_SEARCH = "//*[@id=\"btn_pesquisar\"]";
    public static String XPATH_BTN_NEW_SEARCH = "//*[@id=\"btn_nbusca\"]";
    public static String XPATH_TYPE_ZIP_CODE = "//*[@id=\"tipoCEP\"]";
    public static String XPATH_FILED_ZIP_CODE = "//*[@id=\"endereco\"]";
    public static String XPATH_SELECTOR_ADRESS_FIELD = "//*[@id=\"endereco\"]";
    public static String XPATH_FIRST_MESSAGE_ERROR_RESULT = "//div[@id='resultado']/div[2]";
    public static String XPATH_SECOND_MESSAGE_ERROR_RESULT = "//*[@id=\"mensagem-resultado-alerta\"]";
    public static String XPATH_STREET = "//*[@id=\"resultado-DNEC\"]/tbody/tr/td[1]";

    public static String XPATH_NEIGHBORHOOD = "//*[@id=\"resultado-DNEC\"]/tbody/tr/td[2]";

    public static String XPATH_STATE_COUNTRY = "//*[@id=\"resultado-DNEC\"]/tbody/tr/td[3]";


}
