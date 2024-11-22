package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    @Test
    public void userShouldLoginSuccessfullyWithValid(){

        WebElement signIn = driver.findElement(By.xpath("//a[contains(text(), 'Sign In')]"));
        signIn.click();

        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("nnhnnn27@gmail.com");

        WebElement passwordField = driver.findElement(By.id("pass"));
        passwordField.sendKeys("19833@3r@#$n");

        WebElement loginButton = driver.findElement(By.id("send2"));
        loginButton.click();

        String expectedMessage = "Welcome, nnnn dddd!";
        String actualMessage = driver.findElement(By.xpath("//span[contains(text(), 'Welcome, nnnn dddd!')]")).getText();
        Assert.assertEquals(expectedMessage,actualMessage, "Welcome, nnnn dddd!");
    }
    @Test
    public void verifyTheErrorMessageWithInvalidCredentials() {

        WebElement signIn = driver.findElement(By.xpath("//a[contains(text(), 'Sign In')]"));
        signIn.click();

        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("nnhnnn278@gmail.com");

        WebElement passwordField = driver.findElement(By.id("pass"));
        passwordField.sendKeys("1983553@3r@#$n");

        WebElement loginButton = driver.findElement(By.id("send2"));
        loginButton.click();

        String expectedErrorMessage = "The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.";
        String actulaErrorMessage = driver.findElement(By.xpath("//div[contains(text(), 'The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.')]")).getText();
        Assert.assertEquals(expectedErrorMessage,actulaErrorMessage,"The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.");
        closeBrowser();

    }
    @Test
    public void userShouldLogOutSuccessfully(){

        WebElement signIn = driver.findElement(By.xpath("//a[contains(text(), 'Sign In')]"));
        signIn.click();

        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("nnhnnn27@gmail.com");

        WebElement passwordField = driver.findElement(By.id("pass"));
        passwordField.sendKeys("19833@3r@#$n");

        WebElement logoutButton = driver.findElement(By.xpath("//a[contains(text() , ' Sign Out ')]"));
        logoutButton.click();








    }


}
