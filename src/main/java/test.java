import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class test {

    public static void main(String[] args) throws InterruptedException{

        System.setProperty("webdriver.gecko.driver", "F:\\QALab1\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");






        WebElement input = driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']"));

        input.sendKeys("denys.dulepin.knm.2018@lpnu.ua", Keys.ENTER);

        WebElement input2 = driver.findElement(By.xpath("//input[@name='password']"));

        input2.sendKeys("20.05.2003", Keys.ENTER);





        Thread.sleep(3000);


        WebElement MoreButton = driver.findElement(By.xpath("//div[@class='n6']"));
        MoreButton.click();



        WebElement MitkaButton = driver.findElement(By.xpath("//div[@class='CL Wj']"));
        MitkaButton.click();



        WebElement MitkaName = driver.findElement(By.xpath("//input[@class='xx']"));


        MitkaName.sendKeys("aa", Keys.ENTER);

        Thread.sleep(3000);


        MoreButton.click();


        WebElement MitkaSetting = driver.findElement(By.xpath("//input[@class='CL Q7']"));
        MitkaSetting.click();

    }

}
