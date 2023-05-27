package techproed.day02_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_ManageMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/main/resourcess/drivers/chromedriver.exe");

        WebDriver driver =new ChromeDriver();

        //Brawser'ın konumunu yazdıralaım
        System.out.println("Brawser'ın konumu = " + driver.manage().window().getPosition());
        //Brawser'ın boyutlarını yazdırın
        System.out.println("Brawser'ın boyutları = " + driver.manage().window().getSize());
        //Brawser'ın maximize yapalım
        driver.manage().window().maximize();
        /*
            Bir web sitesine gittiğimizde browser default olarak bir boyutta gelir. Ve açılan browser'daki
        webElementlere browser maximize olmadığı için ulaşamayabiliriz. Dolayısıyla browser'ı açtıktan sonra
        maximize yaparsak driver bütün webelementleri görür ve rahatlikla müdehale edebilir. Bu yüzden
        browser'ı açtıktan sonra ilk olarak driver.manage().window().maximize(); yapmamız bizim webelementlere
        ulaşmada işimizi kolaylaştırır. Böylelikle fail almamış oluruz
        */
        //Techproeducation sayfasına gidelim
        driver.get("https://techproeducation.com");
        //Brawser'ın konumunu yazdıralaım
        System.out.println("Brawser'ın konumu = " + driver.manage().window().getPosition());
        //Brawser'ın boyutlarını yazdırın
        System.out.println("Brawser'ın boyutları = " + driver.manage().window().getSize());
        Thread.sleep(3000);
        //Brawser'ın minimize yapalım
        driver.manage().window().minimize();
        Thread.sleep(3000);
        //Sayfayı fullscreen yapalım
        driver.manage().window().fullscreen();

        driver.manage().window().setPosition(new Point(50,50));
        driver.manage().window().setSize(new Dimension(600,600));

        //Sayfayı kapatın
        driver.close();


        //Sayfanin icinde gordugumuz tum kutucuklar tum kisimlar birer web elementidir.Bunlarin butunu web sayfasini olusturur.
    }
}
