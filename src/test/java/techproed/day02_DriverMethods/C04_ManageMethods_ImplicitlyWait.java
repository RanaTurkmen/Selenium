package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_ManageMethods_ImplicitlyWait {
    public static void main(String[] args) {
        //bir sayfadaki tum web elementleri bizim vereceğimiz max sure kadar bekler.Olusmazsa bekler alt satıra gecmez.
        System.setProperty("webdriver.chrome.driver","src/main/resourcess/drivers/chromedriver.exe");

        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        /*
        implicitlyWait(Duration.ofSeconds(20)) Sayfadaki webElementleri gorunur olana kadar(sayfada olusana kadar)
    maximum 20 saniye bekler. Eger 2 saniyede olusursa 2 saniye bekler ve alt satira gecer . Fakat belirttigimiz
    sure boyunca internetten ya da sayfadan kaynakli webElementler olusmazsa testimiz "FAIL" verir
        Thread.sleep() java kodlarini bizim belirttigimiz sure kadar bekler. 30 saniye beklemesini belirtirsem
    30 saniye bekler ve alt satira gecer .

        */

        //techproed sayfasına gidelim
        String amazonUrl = "https://amazon.com";
        String techproUrl = "https://techproeducation.com";
        driver.get(techproUrl);

        //amazona gidelim
        driver.get(amazonUrl);

        //techpro sayfasına geri dönelim
        driver.navigate().back();

        //sayfa başlığının techpro içerdiğini test edelim
        String actualTitle = driver.getTitle();
        String arananKelime = "techpro";
        if (actualTitle.contains(arananKelime)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");

        //tekrar amazon sayfasına gidelim
        driver.navigate().forward();

        //sayfa başlığının Amazon içerdiğini test edelim
        if (driver.getTitle().contains("Amazon")) {
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");

        //sayfayı kapatın
        driver.close();

    }
}
