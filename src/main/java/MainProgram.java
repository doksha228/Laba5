import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class MainProgram {
    public static void main(String[] args) {
        testNGGoogleChrome();
        testNGEdge();
        vikipediaGoogle();
        vikipediaEdge();
        vkusnoITochkaGoogle();
        vkusnoITochkaEdge();
    }

    public static void testNGGoogleChrome(){
        WebDriver driver = new ChromeDriver(); // Запуск браузера

        driver.get("https://testng.org/"); // Переходим на веб-страницу
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2)); // Неявное ожидание

        // Явное ожидание заголовка страницы
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(d -> d.getTitle().startsWith("TestNG"));

        System.out.println("Заголовок: " + driver.getTitle());

        // Явное ожидание видимости элемента содержания
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("toc")));

        // Поиск и вывод списка ссылок содержания (Table of Contents)
        List<WebElement> tocLinks = driver.findElements(By.cssSelector("#toc ul li a"));
        System.out.println("Список названий ссылок содержания (Table of Contents):");
        for (WebElement tocLink : tocLinks) {
            System.out.println(tocLink.getAttribute("textContent"));
        }
        //через css селекторы
        WebElement firstClick = driver.findElement(By.cssSelector("#tocbot > ul > li:nth-child(3) > a")); // кликает на TestNG Documentation
        firstClick.click();

        // через xpath
        WebElement secondClick = driver.findElement(By.xpath("//*[@id=\"tocbot\"]/ul/li[11]/a")); // кликает на Running TestNG
        secondClick.click();

        driver.quit(); // Закрываем браузер
    }

    public static void testNGEdge(){
        WebDriver driver = new EdgeDriver(); // Запуск браузера

        driver.get("https://testng.org/"); // Переходим на веб-страницу
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2)); // Неявное ожидание

        // Явное ожидание заголовка страницы
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(d -> d.getTitle().startsWith("TestNG"));

        System.out.println("Заголовок: " + driver.getTitle());

        // Явное ожидание видимости элемента содержания
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("toc")));

        // Поиск и вывод списка ссылок содержания (Table of Contents)
        List<WebElement> tocLinks = driver.findElements(By.cssSelector("#toc ul li a"));
        System.out.println("Список названий ссылок содержания (Table of Contents):");
        for (WebElement tocLink : tocLinks) {
            System.out.println(tocLink.getAttribute("textContent"));
        }
        //через css селекторы
        WebElement firstClick = driver.findElement(By.cssSelector("#tocbot > ul > li:nth-child(3) > a")); // кликает на TestNG Documentation
        firstClick.click();

        // через xpath
        WebElement secondClick = driver.findElement(By.xpath("//*[@id=\"tocbot\"]/ul/li[11]/a")); // кликает на Running TestNG
        secondClick.click();

        driver.quit(); // Закрываем браузер
    }

    public static void vikipediaGoogle(){
        WebDriver driver = new ChromeDriver(); // Запуск браузера

        // Переходим на веб-страницу
        driver.get("https://ru.wikipedia.org/wiki/%D0%97%D0%B0%D0%B3%D0%BB%D0%B0%D0%B2%D0%BD%D0%B0%D1%8F_%D1%81%D1%82%D1%80%D0%B0%D0%BD%D0%B8%D1%86%D0%B0");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2)); // Неявное ожидание

        // Явное ожидание заголовка страницы
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(d -> d.getTitle().startsWith("Википедия"));

        System.out.println("Заголовок: " + driver.getTitle());

        // Явное ожидание видимости элемента содержания
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#p-navigation > div")));

        // Поиск и вывод списка ссылок содержания
        List<WebElement> elements = driver.findElements(By.cssSelector("#p-navigation > div > ul > li"));
        System.out.println("Список меню:");
        for (WebElement element : elements) {
            System.out.println(element.getAttribute("textContent"));
        }

        // через css селекторы
        WebElement firstClick = driver.findElement(By.cssSelector("#n-currentevents")); // кликает на текущие события
        firstClick.click();

        System.out.println("Заголовок после первого клика: " + driver.getTitle());

        // через xpath
        WebElement secondClick = driver.findElement(By.xpath("//*[@id=\"n-content\"]")); // кликает на содержание
        secondClick.click();

        System.out.println("Заголовок после второго клика: " + driver.getTitle());

        driver.quit(); // Закрываем браузер
    }

    public static void vikipediaEdge(){
        WebDriver driver = new EdgeDriver(); // Запуск браузера

        // Переходим на веб-страницу
        driver.get("https://ru.wikipedia.org/wiki/%D0%97%D0%B0%D0%B3%D0%BB%D0%B0%D0%B2%D0%BD%D0%B0%D1%8F_%D1%81%D1%82%D1%80%D0%B0%D0%BD%D0%B8%D1%86%D0%B0");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2)); // Неявное ожидание

        // Явное ожидание заголовка страницы
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(d -> d.getTitle().startsWith("Википедия"));

        System.out.println("Заголовок: " + driver.getTitle());

        // Явное ожидание видимости элемента содержания
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#p-navigation > div")));

        // Поиск и вывод списка ссылок содержания
        List<WebElement> elements = driver.findElements(By.cssSelector("#p-navigation > div > ul > li"));
        System.out.println("Список меню:");
        for (WebElement element : elements) {
            System.out.println(element.getAttribute("textContent"));
        }

        // через css селекторы
        WebElement firstClick = driver.findElement(By.cssSelector("#n-currentevents")); // кликает на текущие события
        firstClick.click();

        System.out.println("Заголовок после первого клика: " + driver.getTitle());

        // через xpath
        WebElement secondClick = driver.findElement(By.xpath("//*[@id=\"n-content\"]")); // кликает на содержание
        secondClick.click();

        System.out.println("Заголовок после второго клика: " + driver.getTitle());

        driver.quit(); // Закрываем браузер
    }
    public static void vkusnoITochkaGoogle(){
        WebDriver driver = new ChromeDriver(); // Запуск браузера

        driver.get("https://vkusnoitochka.ru/"); // Переходим на веб-страницу
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2)); // Неявное ожидание

        // Явное ожидание заголовка страницы
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(d -> d.getTitle().startsWith("Вкусно"));

        System.out.println("Заголовок: " + driver.getTitle());

        // Явное ожидание видимости элемента содержания
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#__layout > div > header > div > div.page-header__desktop-wrap > div > div > nav")));

        // Поиск и вывод списка ссылок содержания
        List<WebElement> elements = driver.findElements(By.cssSelector("#__layout > div > header > div > div.page-header__desktop-wrap > div > div > nav"));
        System.out.println("Список меню:");
        for (WebElement element : elements) {
            System.out.println(element.getText());
        }

        // через css селекторы
        // кликает на Супер Бокс
        WebElement firstClick = driver.findElement(By.cssSelector("#__layout > div > header > div > div.page-header__desktop-wrap > div > div > nav > a:nth-child(3)"));
        firstClick.click();

        // через xpath
        // кликает на Меню
        WebElement secondClick = driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/header/div/div[1]/div/div/nav/a[1]"));
        secondClick.click();

        driver.quit(); // Закрываем браузер
    }
    public static void vkusnoITochkaEdge(){
        WebDriver driver = new EdgeDriver(); // Запуск браузера

        driver.get("https://vkusnoitochka.ru/"); // Переходим на веб-страницу
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2)); // Неявное ожидание

        // Явное ожидание заголовка страницы
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(d -> d.getTitle().startsWith("Вкусно"));

        System.out.println("Заголовок: " + driver.getTitle());

        // Явное ожидание видимости элемента содержания
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#__layout > div > header > div > div.page-header__desktop-wrap > div > div > nav")));

        // Поиск и вывод списка ссылок содержания
        List<WebElement> elements = driver.findElements(By.cssSelector("#__layout > div > header > div > div.page-header__desktop-wrap > div > div > nav"));
        System.out.println("Список меню:");
        for (WebElement element : elements) {
            System.out.println(element.getText());
        }

        // через css селекторы
        // кликает на Супер Бокс
        WebElement firstClick = driver.findElement(By.cssSelector("#__layout > div > header > div > div.page-header__desktop-wrap > div > div > nav > a:nth-child(3)"));
        firstClick.click();

        // через xpath
        // кликает на Меню
        WebElement secondClick = driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/header/div/div[1]/div/div/nav/a[1]"));
        secondClick.click();

        driver.quit(); // Закрываем браузер
    }
}
