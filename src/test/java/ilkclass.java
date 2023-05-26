import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ilkclass {
    public static void main(String[] args) {

    System.setProperty("webdriver.chrome.driver","src/main/resourcess/drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://techproeducation.com");

    }
}
