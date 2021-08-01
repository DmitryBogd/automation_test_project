import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
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
        System.out.println("Start Browser");
        webDriver = new ChromeDriver();
        // Открываем нужный сайт
        System.out.println("Open website");
        webDriver.get("http://www.univ.kiev.ua/ru/");
    }

    @After
    public void cleanUp(){
        //закрываем браузер
        System.out.println("Close browser");
        webDriver.quit();
    }

    @Test
    public void urlAndTitleTest(){
        System.out.println("Check url");
        assertEquals("http://www.univ.kiev.ua/ru/", webDriver.getCurrentUrl());
        System.out.println("Check title");
        assertEquals("КНУ имени Тараса Шевченко", webDriver.getTitle());
    }

    @Test
    public void virtualTour(){
        System.out.println("Click on button");
        webDriver.findElement(By.linkText("Виртуальный тур")).click();

    }

    @Test
    public void registration() throws InterruptedException {
        System.out.println("Open website");
        webDriver.get("https://vstup.knu.ua/");

        System.out.println("Click on button");
        webDriver.findElement(By.linkText("Реєстрація")).click();

        System.out.println("Enter login");
        webDriver.findElement(By.id("jform_username")).sendKeys("SSSS");

        System.out.println("Enter password");
        webDriver.findElement(By.id("jform_password1")).sendKeys("QWERTY");
        webDriver.findElement(By.id("jform_password2")).sendKeys("QWERTY");

        System.out.println("Enter email");
        webDriver.findElement(By.id("jform_email1")).sendKeys("r.o.b.o.t@ukr.net");
        webDriver.findElement(By.id("jform_email2")).sendKeys("r.o.b.o.t@ukr.net");

        System.out.println("Enter name");
        webDriver.findElement(By.id("jform_name")).sendKeys("SSSS");

        System.out.println("I am agree");
        webDriver.findElement(By.id("terms_terms0")).click();

        System.out.println("Click button");
        webDriver.findElement(By.xpath("//button[contains(@class, 'validate btn')]")).click();

        System.out.println("Check url");
        //Thread.sleep(2000);
        assertEquals("https://vstup.knu.ua/register", webDriver.getCurrentUrl());
    }
}
