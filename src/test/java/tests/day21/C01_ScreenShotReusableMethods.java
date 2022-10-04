package tests.day21;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class C01_ScreenShotReusableMethods {
    @Test
    public void test01() throws IOException {
        // hepsiburada sayfasına gidiniz ve
        Driver.getDriver().get("https://hepsiburada.com");
        //sayfanın resmini alınız
        ReusableMethods.getScreenshot("hepsiburada");
        // sayfayı kapatınız
        Driver.closeDriver();
    }

    @Test
    public void test02() throws IOException {
        //Amazon sayfasına gidiniz
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        AmazonPage amazonPage = new AmazonPage();
        //Nutella aratınız
        amazonPage.aramaKutusu.sendKeys("Nutella", Keys.ENTER);
        //Arama sonuc yazısı WebElementinin resmini alınız
        ReusableMethods.getScreenshotWebElement("AramaSonucWE",amazonPage.aramaSonucWE);

    }
}
