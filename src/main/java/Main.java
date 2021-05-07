import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class Main {
    public static void main(String[] args)  {

        System.setProperty("webdriver.gecko.driver", "F:\\QALab1\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");


        try {
            WebElement input = driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']"));

            input.sendKeys("denys.dulepin.knm.2018@lpnu.ua", Keys.ENTER);

            WebElement input2 = driver.findElement(By.xpath("//input[@name='password']"));

            input2.sendKeys("20.05.2003", Keys.ENTER);
        } catch (Exception e) {
            e.printStackTrace();
        }


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        WebElement MoreButton = driver.findElement(By.xpath("//div[@class='n6']"));
        MoreButton.click();



        WebElement MitkaButton = driver.findElement(By.xpath("//div[@class='CL Wj']"));
        MitkaButton.click();



        WebElement MitkaName = driver.findElement(By.xpath("//input[@class='xx']"));
        MitkaName.sendKeys("aa", Keys.ENTER);



















        try {
            WebElement EmailOpenClick = driver.findElement(By.xpath("//div[@class='xT']"));
            EmailOpenClick.click();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.get("https://mail.google.com/mail/u/0/#inbox/QgrcJHrttkJTWjknckkZlzzrSlghcFZTcfG" );
        }


        try {
            WebElement EmailAddMitkaClick = driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-Js-Gs mA mw T-I-ax7 L3']"));
            EmailAddMitkaClick.click();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            driver.get("https://mail.google.com/mail/u/2/#settings/labels");
        }










        try {
            WebElement MitkaSettingDeleteButton = driver.findElement(By.xpath("//span[@act='lpe']"));
            MitkaSettingDeleteButton.click();


        } catch (Exception e) {

            e.printStackTrace();
        }




        try {

            WebElement MitkaSettingDeleteYesButton = driver.findElement(By.xpath("//button[@class='J-at1-atl']"));

            MitkaSettingDeleteYesButton.click();
        } catch (Exception e) {

            e.printStackTrace();
        }



    }
}
