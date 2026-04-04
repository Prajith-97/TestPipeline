//package javaPrograms.scenarioBasedQuestions;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.StaleElementReferenceException;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.FluentWait;
//import org.openqa.selenium.support.ui.Wait;
//
//import java.time.Duration;
//import java.util.List;
//import java.util.NoSuchElementException;
//
//public class dynamicWaitUtility {
//    public static void main(String[] args) {
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.amazon.in/");
//
//        Wait<WebDriver> wait = new FluentWait<>(driver)
//                .withTimeout(Duration.ofSeconds(1000))
//                .pollingEvery(Duration.ofMillis(50))
//                .ignoring(NoSuchElementException.class)
//                .ignoring(StaleElementReferenceException.class);
//
//        List<WebElement> element = driver.findElements(By.xpath("//div[@id='nav-xshop-container']//a"));
//        wait.until(ExpectedConditions.visibilityOfAllElements(element));
//
//
//    }
//}
