package selenium.serenity.steps;

import selenium.serenity.pages.GoogleHomePage;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class GoogleSearchTest {

    @Managed
    WebDriver driver; // Administrado por Serenity

    @Steps
    GoogleHomePage googleHomePage; // Paso que utilizamos en la prueba

    @Test
    public void elUsuarioPuedeBuscarEnGoogle() {
        googleHomePage.open(); // Abre la página de inicio de Google
        googleHomePage.buscar("Serenity BDD"); // Busca "Serenity BDD"
    }
}
