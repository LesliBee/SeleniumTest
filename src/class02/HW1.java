package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
fill out the form
click on register
close the browser
 */
public class HW1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.id("customer.firstName")).sendKeys("Lesli");
        driver.findElement(By.id("customer.lastName")).sendKeys("Baker");
        driver.findElement(By.id("customer.address.street")).sendKeys("123 Main Street");
        driver.findElement(By.id("customer.address.city")).sendKeys("Virginia Beach");
        driver.findElement(By.id("customer.address.state")).sendKeys("Virginia");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("23451");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("7574500458");
        driver.findElement(By.id("customer.ssn")).sendKeys("229123456");
        driver.findElement(By.id("customer.username")).sendKeys("LesliBkr");
        driver.findElement(By.id("customer.password")).sendKeys("Password!");
        driver.findElement(By.id("repeatedPassword")).sendKeys("Password!");
        driver.findElement(By.className("button")).click();
        driver.close();










    }
}
