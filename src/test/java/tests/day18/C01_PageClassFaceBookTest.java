package tests.day18;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FaceBookPage;
import utilities.Driver;

public class C01_PageClassFaceBookTest {
    @Test
    public void test01() {


        //https://www.facebook.com/ adresine gidin
        Driver.getDriver().get("https://www.facebook.com/");

        //POM’a uygun olarak email, sifre kutularini ve giris yap
        //butonunu locate edin
        FaceBookPage facebookPage = new FaceBookPage();
        Faker faker = new Faker();

        //Faker class’ini kullanarak email ve sifre degerlerini
        //yazdirip, giris butonuna basin
        facebookPage.email.sendKeys(faker.internet().emailAddress());
        facebookPage.sifre.sendKeys(faker.internet().password());
        facebookPage.login.click();

        //Basarili giris yapilamadigini test edin
        Assert.assertTrue(facebookPage.girisYapilmadi.isDisplayed());
    }
}