package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest {


    @Test
    public void verifyThatSignInPageDisplay(){
        WebElement createAccountLink = driver.findElement(By.linkText("Create an Account"));
        createAccountLink.click();

        String expectedMessage = "Create an Account";
        String actualMessage = driver.findElement(By.xpath("//a[text() = 'Create an Account']")).getText();
        Assert.assertEquals(expectedMessage,actualMessage, "Create an Account");

        closeBrowser();
    }
    @Test
    public void userSholdRegisterAccountSuccessfully() {
        WebElement createAccountLink = driver.findElement(By.linkText("Create an Account"));
        createAccountLink.click();

        WebElement firstName = driver.findElement(By.id("firstname"));
        firstName.sendKeys("nnnn");

        WebElement lastName = driver.findElement(By.id("lastname"));
        lastName.sendKeys("dddd");

        WebElement emailField = driver.findElement(By.id("email_address"));
        emailField.sendKeys("nnhnnn27@gmail.com");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("19833@3r@#$n");

        WebElement confirmPasswordField = driver.findElement(By.id("password-confirmation"));
        confirmPasswordField.sendKeys("19833@3r@#$n");


        WebElement submitButton = driver.findElement(By.xpath("//button[span[text()='Create an Account']]"));
        submitButton.click();

        String expectTitle = "Thank you for registering with Main Website Store.";
        String actualTitle = driver.findElement(By.xpath("//div[text() = 'Thank you for registering with Main Website Store.']")).getText();
        Assert.assertEquals( expectTitle, actualTitle,"Thank you for registering with Main Website Store.");

        WebElement downAero = driver.findElement(By.xpath("//button[@class = 'action switch']"));
        downAero.click();

        WebElement signOut = driver.findElement(By.linkText("Sign Out"));
        signOut.click();

        String expectsignOut = "You are signed out";
        String actualsignOut = driver.findElement(By.xpath("//span[@class = 'base']")).getText();
        Assert.assertEquals(expectsignOut, actualsignOut,"You are signed out");

        closeBrowser();
    }

}
