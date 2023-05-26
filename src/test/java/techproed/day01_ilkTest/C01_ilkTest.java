package techproed.day01_ilkTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_ilkTest {
    public static void main(String[] args) {
        System.setProperty("chromeDriver","src/main/resourcess/drivers/chromedriver.exe");
        //Java uygulamalarında sistem özelliklerini ayarlamak için setProperty methodu ile kullanırız.
        //setPreperty methodu ile class'ımıza driver'ın fiziki yolunu belirtiriz
        System.out.println(System.getProperty("chromeDriver"));
        //getProperty ile "key" değerini girerek "value" ya ulaşabilirim

        WebDriver driver = new ChromeDriver();
        //ChromeDriver() türünde yeni bir obje oluşturuk.

        driver.get("https:/techproeducation.com");//get methodu ile string olarak yazılan urle gideriz





    }
}
