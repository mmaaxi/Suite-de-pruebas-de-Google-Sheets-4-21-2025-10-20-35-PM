package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.tc_1Page;

import static org.junit.Assert.assertTrue;

public class tc_1Steps {

    WebDriver driver;
    tc_1Page googleSheetsPage;

    @Given("^El usuario navega a la URL \"([^\"]*)\"$")
    public void el_usuario_navega_a_la_URL(String url) {
        driver = new ChromeDriver();
        driver.get(url);
        googleSheetsPage = new tc_1Page(driver);
    }

    @Then("^La hoja de cálculo se carga correctamente$")
    public void la_hoja_de_calculo_se_carga_correctamente() {
        assertTrue("La hoja de cálculo no se cargó correctamente", googleSheetsPage.isPageLoaded());
        driver.quit();
    }
}