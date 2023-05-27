package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_NavigateMethod {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/main/resourcess/drivers/chromedriver.exe");

        WebDriver driver =new ChromeDriver();

        //Techproeducation sayfasina gidelim
        driver.navigate().to("https://techproeducation.com");//get() methodu ile aynı mantıkla calısır.
        Thread.sleep(3000);//Java kodlarini bekletmek icin Thread.sleep kullanabiliriz
        //Sonra amazon sayfasina gidelim
        driver.navigate().to("https://amazon.com");
        Thread.sleep(3000);//Java kodlarini bekletmek icin Thread.sleep kullanabiliriz
        //Amazon sayfasinin basligini yazdiralim
        System.out.println("Amazon sayfa başlığı :"+ driver.getTitle());
        Thread.sleep(3000);//Java kodlarini bekletmek icin Thread.sleep kullanabiliriz
        //Techproeducation sayfasina geri donelim
        driver.navigate().back();
        Thread.sleep(3000);//Java kodlarini bekletmek icin Thread.sleep kullanabiliriz
        //Sayfa basligini yazdiralim
        System.out.println("Techproeducation sayfa başlığı :" +driver.getTitle());
        Thread.sleep(3000);//Java kodlarini bekletmek icin Thread.sleep kullanabiliriz
        //Amazon sayfasina tekrar gidip url'i yazdiralim
        driver.navigate().forward();
        System.out.println("Amazon Sayfa Başlığı :" +driver.getTitle());
        Thread.sleep(3000);//Java kodlarini bekletmek icin Thread.sleep kullanabiliriz
        //Amazon sayfasindayken sayfayi yenileyelim
        driver.navigate().refresh();
        Thread.sleep(3000);//Java kodlarini bekletmek icin Thread.sleep kullanabiliriz
        //Sayfayı kapatalım
        driver.close();

        /*
        Yeni bir Class olusturalim.C05_NavigationMethods
        Youtube ana sayfasina gidelim . https://www.youtube.com/
        Amazon soyfasina gidelim. https://www.amazon.com/
        Tekrar YouTube’sayfasina donelim
        Yeniden Amazon sayfasina gidelim
        Sayfayi Refresh(yenile) yapalim
        Sayfayi kapatalim / Tum sayfalari kapatalim
         */
    }
}
