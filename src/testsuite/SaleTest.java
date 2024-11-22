package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Collections;
import java.util.List;

public class SaleTest extends BaseTest {
    @Test
    public void verifyTheTotalItemsDisplayedOnTheWomens(){

       WebElement salesItem =  driver.findElement(By.id("ui-id-8"));
       salesItem.click();

       WebElement jacketsLink = driver.findElement(By.xpath("//a[contains(text(), 'Jackets')]"));
       jacketsLink.click();

       String expectedName = "Jackets";
       String actualName = driver.findElement(By.xpath("//span[@class= 'base']")).getText();
       Assert.assertEquals(expectedName,actualName,"Jackets");

        List<WebElement> jacketItem = Collections.singletonList(driver.findElement(By.xpath("//li[contains(@class,'product-item')]")));
        int totalItemsDisplayed = jacketItem.size();

        System.out.println("Total Item Display : " +totalItemsDisplayed);
        for(WebElement item :jacketItem){
            WebElement itemName = item.findElement(By.xpath("//a[contains(@class,'product-item-link')]"));
            System.out.println(" - " + item.getText());

        }

        if (totalItemsDisplayed == 12) {
            System.out.println("Verified: 12 items are displayed on the Women's Jackets page.");
        } else {
            System.out.println("Verification failed: Expected 12 items, but found " + totalItemsDisplayed);
        }
        closeBrowser();





    }
}
