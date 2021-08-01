import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest {

    @Test
    public void someTest(){
        System.setProperty("webdriver.chrome.driver",
                "F:/ForJava/chromedriver.exe");

        // Селениум запускает хром
        WebDriver webDriver = new ChromeDriver();

        // Открываем нужный сайт
        webDriver.get("http://www.univ.kiev.ua/ru/");
        webDriver.quit();
    }
}
