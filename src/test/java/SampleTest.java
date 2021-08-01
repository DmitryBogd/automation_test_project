import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class SampleTest {

    private WebDriver webDriver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver",
                "F:/ForJava/chromedriver.exe");

        // Селениум запускает хром
        webDriver = new ChromeDriver();
        // Открываем нужный сайт
        webDriver.get("http://www.univ.kiev.ua/ru/");
    }

    @After
    public void cleanUp(){
        //закрываем браузер
        webDriver.quit();
    }

    @Test
    public void urlAndTitleTest(){
        assertEquals("http://www.univ.kiev.ua/ru/", webDriver.getCurrentUrl());
        assertEquals("КНУ имени Тараса Шевченко", webDriver.getTitle());
    }

    @Test
    public void registerToCourse(){



    }
}
