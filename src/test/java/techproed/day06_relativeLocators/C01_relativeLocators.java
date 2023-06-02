package techproed.day06_relativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class C01_relativeLocators {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resourcess/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // https://www.amazon.com sayfasına gidiniz
        driver.get("https://www.amazon.com");
        // arama kutusuna "city bike" yazıp aratın
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike", Keys.ENTER);
        //relative locator kullanarak hybrid bikes altındaki elemente tıklayalım
        //Webelementlerin yazısını konsola yazdıralım
        WebElement hybridBike = driver.findElement(By.xpath("//*[text()='Hybrid Bikes']"));
        System.out.println(hybridBike.getText());
        WebElement electricBike = driver.findElement(with(By.tagName("a")).below(hybridBike));
        System.out.println(electricBike.getText());
        WebElement completeBike = driver.findElement(with(By.tagName("a")).below(electricBike));
        System.out.println(completeBike.getText());
        completeBike.click();
        System.out.println("*******************************************************************");

        //Bikes altındaki tüm linkleri(webelement) konsola yazdıralım
        List<WebElement> linlkerListesi = driver.findElements(By.xpath("(//*[@class='a-list-item'])[position()>=10 and position()<=16]"));
        linlkerListesi.forEach(t-> System.out.println(t.getText()));

        for (WebElement w:linlkerListesi) {
            System.out.println(w.getText());
        }

        for (int i = 0; i <linlkerListesi.size() ; i++) {

            linlkerListesi = driver.findElements(By.xpath("(//*[@class='a-list-item'])[position()>=10 and position()<=16]"));
            System.out.println(linlkerListesi.get(i).getText());
            linlkerListesi.get(i).click();
            Thread.sleep(3000);
            driver.navigate().back();
            Thread.sleep(3000);


        }






    }
}
