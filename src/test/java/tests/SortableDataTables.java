package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SortableDataTables {

    @Test
    public void checkLastName () {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/tables");
        String lastname1 =  driver.findElement(By.xpath("//table//tr[1]/td[1]")).getText();
        String lastname2 =  driver.findElement(By.xpath("//table//tr[2]/td[1]")).getText();
        String lastname3 =  driver.findElement(By.xpath("//table//tr[3]/td[1]")).getText();
        String lastname4 =  driver.findElement(By.xpath("//table//tr[4]/td[1]")).getText();

        Assert.assertEquals(lastname1, "Smith", "Фамимлия в 1 строке таблицы не соответствует ожидаемой");
        Assert.assertEquals(lastname2, "Bach", "Фамимлия во 2 строке таблицы не соответствует ожидаемой");
        Assert.assertEquals(lastname3, "Doe", "Фамимлия в 3 строке таблицы не соответствует ожидаемой");
        Assert.assertEquals(lastname4, "Conway", "Фамимлия в 4 строке таблицы не соответствует ожидаемой");

        driver.quit();
}

    @Test
    public void checkFirstName () {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/tables");
        String firstname1 =  driver.findElement(By.xpath("//table//tr[1]/td[2]")).getText();
        String firstname2 =  driver.findElement(By.xpath("//table//tr[2]/td[2]")).getText();
        String firstname3 =  driver.findElement(By.xpath("//table//tr[3]/td[2]")).getText();
        String firstname4 =  driver.findElement(By.xpath("//table//tr[4]/td[2]")).getText();

        Assert.assertEquals(firstname1, "John", "Имя в 1 строке таблицы не соответствует ожидаемому");
        Assert.assertEquals(firstname2, "Frank", "Имя во 2 строке таблицы не соответствует ожидаемому");
        Assert.assertEquals(firstname3, "Jason", "Имя в 3 строке таблицы не соответствует ожидаемому");
        Assert.assertEquals(firstname4, "Tim", "Имя в 4 строке таблицы не соответствует ожидаемому");

        driver.quit();
    }

    @Test
    public void checkEmail () {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/tables");
        String email1 =  driver.findElement(By.xpath("//table//tr[1]/td[3]")).getText();
        String email2 =  driver.findElement(By.xpath("//table//tr[2]/td[3]")).getText();
        String email3 =  driver.findElement(By.xpath("//table//tr[3]/td[3]")).getText();
        String email4 =  driver.findElement(By.xpath("//table//tr[4]/td[3]")).getText();

        Assert.assertEquals(email1, "jsmith@gmail.com", "Email в 1 строке таблицы не соответствует ожидаемому");
        Assert.assertEquals(email2, "fbach@yahoo.com", "Email во 2 строке таблицы не соответствует ожидаемому");
        Assert.assertEquals(email3, "jdoe@hotmail.com", "Email в 3 строке таблицы не соответствует ожидаемому");
        Assert.assertEquals(email4, "tconway@earthlink.net", "Email в 4 строке таблицы не соответствует ожидаемому");

        driver.quit();
    }

    @Test
    public void checkDue () {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/tables");
        String due1 =  driver.findElement(By.xpath("//table//tr[1]/td[4]")).getText();
        String due2 =  driver.findElement(By.xpath("//table//tr[2]/td[4]")).getText();
        String due3 =  driver.findElement(By.xpath("//table//tr[3]/td[4]")).getText();
        String due4 =  driver.findElement(By.xpath("//table//tr[4]/td[4]")).getText();

        Assert.assertEquals(due1, "$50.00", "Сумма в 1 строке таблицы не соответствует ожидаемой");
        Assert.assertEquals(due2, "$51.00", "Сумма во 2 строке таблицы не соответствует ожидаемой");
        Assert.assertEquals(due3, "$100.00", "Сумма в 3 строке таблицы не соответствует ожидаемой");
        Assert.assertEquals(due4, "$50.00", "Сумма в 4 строке таблицы не соответствует ожидаемой");

        driver.quit();
    }

    @Test
    public void checkWebSite() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/tables");
        String url1 =  driver.findElement(By.xpath("//table//tr[1]/td[5]")).getText();
        String url2 =  driver.findElement(By.xpath("//table//tr[2]/td[5]")).getText();
        String url3 =  driver.findElement(By.xpath("//table//tr[3]/td[5]")).getText();
        String url4 =  driver.findElement(By.xpath("//table//tr[4]/td[5]")).getText();

        Assert.assertEquals(url1, "http://www.jsmith.com", "URL в 1 строке таблицы не соответствует ожидаемому");
        Assert.assertEquals(url2, "http://www.frank.com", "URL во 2 строке таблицы не соответствует ожидаемому");
        Assert.assertEquals(url3, "http://www.jdoe.com", "URL в 3 строке таблицы не соответствует ожидаемому");
        Assert.assertEquals(url4, "http://www.timconway.com", "URL в 4 строке таблицы не соответствует ожидаемому");

        driver.quit();
    }
}
