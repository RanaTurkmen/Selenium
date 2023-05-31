package techproed.day04_Locators_Xpath_Css;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class C02_WebElementLocator {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resourcess/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        // https://www.amazon.com sayfasına gidiniz
        driver.get("https://www.amazon.com");
        // arama kutusuna "city bike" yazıp aratın
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike", Keys.ENTER);


        // sonuc yazısını yazdırın
        List<WebElement> sonucYazısı = driver.findElements(By.className("sg-col-inner"));

        System.out.println(sonucYazısı.get(0).getText());

        // sonuc sayısını yazdırın
        String[] sonucSayisi = sonucYazısı.get(0).getText().split(" ");
        System.out.println(sonucSayisi[2]);

        // ilk ürünün locatini alın
        List<WebElement> urunList = driver.findElements(By.className("s-image"));
        WebElement ilkUrun = urunList.get(0);
        //Xpath ile list kullanmadan locate aldık
        List<WebElement> urunList1 = driver.findElements(By.xpath("(//div[@class='sg-col-inner'])[1]"));
        //Sayfadaki 12. elementi list kullanmadan xpath'in index özelliğini kullanarak locate aldık
         List<WebElement> urunList2 = driver.findElements(By.xpath("(//*[@class='a-price-whole'])[1]"));

        // ilk ürünün, görünür olup olmadıgını true, false seklinde yazdırın
        System.out.println(ilkUrun.isDisplayed());
        // ilk ürünün, erisilebilir olup olmadıgını true, false seklinde yazdırın
        System.out.println(ilkUrun.isEnabled());
        // ilk ürünün, secilebilir olup olmadıgını true, false seklinde yazdırın
        System.out.println(ilkUrun.isSelected());
        // ilk urune tıklayın
        ilkUrun.click();
        // sayfayı kapatın
        driver.close();
        //Relative Xpath syntex --> //tagName[attributeName='atributeValue']
                                    //input[input@type='text']
                                    //(input[input@type='text'])[1]

        /*
        Aldigimiz xpath unique olmadigi zaman xpath' imizi parantez icine alarak index belirtebiliriz.
        Boylelikle webelementi List' e atip istedigimiz elementi almakla ugrasmayiz
        Xpathi ın degısık kullanma yolları vardır
         */
    }
}
