package techproed.day01_ilkTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/main/resourcess/drivers/chromedriver.exe");

        WebDriver driver =new ChromeDriver();
        driver.get("https://amazon.com");
        System.out.println("Amazon Actual Title :"+ driver.getTitle());
        System.out.println("Amazon Actual Url :"+ driver.getCurrentUrl() );


        //getTitle() methodu Sayfa başlığını verir
        System.out.println("Techproeducation sayfa baslıgi :" +driver.getTitle());
        driver.get("https://techproeducation.com");

        //getCurrentUrl() gidilen sayfanın urlsini verir.
        System.out.println("Techproed Actual Url :" +driver.getCurrentUrl());

        //getPageSource() methodu Acilan sayfanın kaynak kodlarını verir.
        //System.out.println(""+ driver.getPageSource()); her çalıştırdığımızda kaynak kodları verir

        //getWindowHandle() gidilen sayfanın handle değerini(hashcode) verir.
        //bu handle değerini sayfalar arası geçiş için kullanırız.
        System.out.println("Techproed Window Handel Degeri :"+ driver.getWindowHandle());






    }
}
