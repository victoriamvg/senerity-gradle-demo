package selenium.serenity.pages;

import net.serenitybdd.core.pages.PageObject;


public class googleHomePage extends PageObject {

    // Método para buscar un término en Google
    public void buscar(String término) {
        $(By.name("q")).typeAndEnter(término);
    }
}
