import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "F:\\QALab1\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

        //driver.get("https://www.udemy.com/");
        //WebElement input = driver.findElement(By.xpath("//input[@name='q']"));
        // denys.dulepin.knm.2018@lpnu.ua


        WebElement input = driver.findElement(By.xpath("//input[@name='identifier']"));
        input.click();
        input.sendKeys("denys.dulepin.knm.2018@lpnu.ua", Keys.ENTER);

        WebElement input2 = driver.findElement(By.xpath("//input[@name='password']"));
        input2.click();
        input2.sendKeys("20.05.2003", Keys.ENTER);

        //class='T-I T-I-KE L3'



//        WebElement input3 = driver.findElement(By.xpath("//div[@class='T-I T-I-KE L3']"));
//        input3.click();
//
//
//        WebElement who = driver.findElement(By.xpath("//textarea[@name='to']"));
//        who.click();
//        who.sendKeys("denys.dulepin.knm.2018@lpnu.ua");
//
//        WebElement text = driver.findElement(By.xpath("//div[@aria-label='\"'Текст повідомлення']"));
//        text.click();
//        text.sendKeys("555555");
//
//        //data-tooltip="Надіслати ?(Ctrl –Enter)?"
//
//        WebElement send = driver.findElement(By.xpath("//*[@id=':110']/text()"));
//        send.click();

        Thread.sleep(3000);
        WebElement button= driver.findElement(By.xpath("//div[@class='T-I T-I-KE L3']"));
        button.click();


//         WebElement to = driver.findElement(By.xpath("//*[@id=':pp']"));

        WebElement to = driver.findElement(By.xpath("//textarea[@name='to']"));
to.click();
        to.sendKeys("denys.dulepin.knm.2018@lpnu.ua");



//        WebElement sub = driver.findElement(By.xpath("//input[@id=':p6']"));
//
//        sub.click();
//        sub.sendKeys("Hello");


        WebElement txt = driver.findElement(By.xpath("//div[@class='Am Al editable LW-avf tS-tW']"));
        txt.click();
        txt.sendKeys("Hello world");



        WebElement button2 =  driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji aoO v7 T-I-atl L3']"));
//        WebElement button2 =  driver.findElement(By.xpath("//button[@id=':ow']"));
        button2.click();







    }
}
