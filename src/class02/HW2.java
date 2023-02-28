package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
navigate to fb.com
click on create new account
fill up all the text boxes
click on sign up button
close the pop-up
close the browser
TIP for HW2:
just fill in text boxes or button, no need to deal with other webElements
also u will need a Thread.sleep after clicking on create new account 🙂
we will discuss "WHY" in future
 */
public class HW2 {
    public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.facebook.com/");
            driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Lesli");
        driver.findElement(By.name("lastname")).sendKeys("Baker");
        driver.findElement(By.name("reg_email__")).sendKeys("leslisnchz@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("Password!");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("leslisnchz@gmail.com");
        driver.findElement(By.id("month")).sendKeys("Dec");
        driver.findElement(By.id("day")).sendKeys("25");
        driver.findElement(By.id("year")).sendKeys("1987");
        driver.findElement(By.name("sex")).click();
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(2000);
        driver.getWindowHandle();
        Thread.sleep(2000);
        driver.close();





    }
}
