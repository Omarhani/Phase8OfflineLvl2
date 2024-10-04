package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class MethodHandles {

    protected WebDriver driver;

    WebDriverWait wait;

    Select select;

    Actions actions;

    static ExtentReports extent;

    static ExtentTest test;

    public MethodHandles(WebDriver driver) {
        this.driver = driver;
    }

    private WebElement webElement(By locator) {
        return driver.findElement(locator);
    }

    private void explicitWait(By locator, int time) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.and(
                ExpectedConditions.visibilityOf(webElement(locator)),
                ExpectedConditions.visibilityOfElementLocated(locator),
                ExpectedConditions.elementToBeClickable(locator),
                ExpectedConditions.presenceOfElementLocated(locator)
        ));
    }
    protected void invisibleOfElement(By locator, int time) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.and(
                ExpectedConditions.invisibilityOf(webElement(locator)),
                ExpectedConditions.invisibilityOfElementLocated(locator)
        ));
    }

    protected void click(By locator, int time) {
        for (int i = 0; i < 5; i++) {
            try {
                explicitWait(locator, time);
                webElement(locator).click();
                setSteps();
                addBorderToElement(driver, webElement(locator));
                break;
            } catch (StaleElementReferenceException e) {

            }
        }
    }

    protected void clear(By locator, int time) {
        for (int i = 0; i < 5; i++) {
            try {
                explicitWait(locator, time);
                webElement(locator).clear();
                setSteps();
                addBorderToElement(driver, webElement(locator));
                break;
            } catch (StaleElementReferenceException e) {

            }
        }

    }

    protected void submit(By locator, int time) {
        for (int i = 0; i < 5; i++) {
            try {
                explicitWait(locator, time);
                webElement(locator).submit();
                setSteps();
                addBorderToElement(driver, webElement(locator));
                break;
            } catch (StaleElementReferenceException e) {

            }
        }

    }

    protected String getText(By locator, int time) {
        String text = null;
        for (int i = 0; i < 5; i++) {
            try {
                explicitWait(locator, time);
                text = webElement(locator).getText();
                setSteps();
                addBorderToElement(driver, webElement(locator));
                break;
            } catch (StaleElementReferenceException e) {

            }
        }
        return text;
    }

    protected boolean isDisplayed(By locator, int time) {
        boolean flag = false;
        for (int i = 0; i < 5; i++) {
            try {
                explicitWait(locator, time);
                flag = webElement(locator).isDisplayed();
                setSteps();
                addBorderToElement(driver, webElement(locator));
                break;
            } catch (StaleElementReferenceException e) {

            }
        }
        return flag;
    }

    protected boolean isSelected(By locator, int time) {
        boolean flag = false;
        for (int i = 0; i < 5; i++) {
            try {
                explicitWait(locator, time);
                flag = webElement(locator).isSelected();
                setSteps();
                addBorderToElement(driver, webElement(locator));
                break;
            } catch (StaleElementReferenceException e) {

            }
        }
        return flag;
    }

    protected boolean isEnabled(By locator, int time) {
        boolean flag = false;
        for (int i = 0; i < 5; i++) {
            try {
                explicitWait(locator, time);
                flag = webElement(locator).isEnabled();
                setSteps();
                addBorderToElement(driver, webElement(locator));
                break;
            } catch (StaleElementReferenceException e) {

            }
        }
        return flag;
    }

    protected void selectByIndex(By locator, int time, int index) {
        for (int i = 0; i < 5; i++) {
            try {
                select = new Select(webElement(locator));
                explicitWait(locator, time);
                select.selectByIndex(index);
                setSteps();
                addBorderToElement(driver, webElement(locator));
                break;
            } catch (StaleElementReferenceException e) {

            }
        }
    }

    protected void selectByValue(By locator, int time, String value) {
        for (int i = 0; i < 5; i++) {
            try {
                select = new Select(webElement(locator));
                explicitWait(locator, time);
                select.selectByValue(value);
                setSteps();
                addBorderToElement(driver, webElement(locator));
                break;
            } catch (StaleElementReferenceException e) {

            }
        }
    }

    protected void selectByVisibleText(By locator, int time, String visibleText) {
        for (int i = 0; i < 5; i++) {
            try {
                select = new Select(webElement(locator));
                explicitWait(locator, time);
                select.selectByVisibleText(visibleText);
                setSteps();
                addBorderToElement(driver, webElement(locator));
                break;
            } catch (StaleElementReferenceException e) {

            }
        }
    }

    protected void acceptAlert() {
        driver.switchTo().alert().accept();
    }

    protected void dismissAlert() {
        driver.switchTo().alert().dismiss();
    }

    protected void sendKeysAlert(String text) {
        driver.switchTo().alert().sendKeys(text);
    }

    protected String getTextAlert() {
        return driver.switchTo().alert().getText();
    }


    protected void switchToFrame(String nameOrID) {
        driver.switchTo().frame(nameOrID);
    }

    protected void switchToFrame(WebElement element) {
        driver.switchTo().frame(element);
    }

    protected void switchToParent() {
        driver.switchTo().parentFrame();
    }

    protected void sendKeys(By locator, String text, int time) {
        for (int i = 0; i < 5; i++) {
            try {
                explicitWait(locator, time);
                webElement(locator).sendKeys(text);
                setSteps();
                addBorderToElement(driver, webElement(locator));
                break;
            } catch (StaleElementReferenceException e) {

            }
        }
    }

    protected void clickWithActions(By locator, int time) {
        actions = new Actions(driver);
        for (int i = 0; i < 5; i++) {
            try {
                explicitWait(locator, time);
                actions.click(webElement(locator)).build().perform();
                setSteps();
                addBorderToElement(driver, webElement(locator));
                break;
            } catch (StaleElementReferenceException e) {

            }
        }
    }
    protected void clickWithActions() {
        actions = new Actions(driver);
        actions.click().build().perform();
        setSteps();
    }

    protected void doubleClick(By locator, int time) {
        actions = new Actions(driver);
        for (int i = 0; i < 5; i++) {
            try {
                explicitWait(locator, time);
                actions.doubleClick(webElement(locator)).build().perform();
                setSteps();
                addBorderToElement(driver, webElement(locator));
                break;
            } catch (StaleElementReferenceException e) {

            }
        }
    }
    protected void doubleClick() {
        actions = new Actions(driver);
        actions.doubleClick().build().perform();
        setSteps();
    }

    protected void contextClick(By locator, int time) {
        actions = new Actions(driver);
        for (int i = 0; i < 5; i++) {
            try {
                explicitWait(locator, time);
                actions.contextClick(webElement(locator)).build().perform();
                setSteps();
                addBorderToElement(driver, webElement(locator));
                break;
            } catch (StaleElementReferenceException e) {

            }
        }
    }
    protected void contextClick() {
        actions = new Actions(driver);
        actions.contextClick().build().perform();
        setSteps();
    }

    protected void dragAndDrop(By src, By target, int time) {
        actions = new Actions(driver);
        for (int i = 0; i < 5; i++) {
            try {
                explicitWait(src, time);
                explicitWait(target, time);
                actions.dragAndDrop(webElement(src), webElement(target)).build().perform();
                setSteps();
                addBorderToElement(driver, webElement(src));
                addBorderToElement(driver, webElement(target));
                break;
            } catch (StaleElementReferenceException e) {

            }
        }
    }
    protected void moveToElement(By locator, int time) {
        actions = new Actions(driver);
        for (int i = 0; i < 5; i++) {
            try {
                explicitWait(locator, time);
                actions.moveToElement(webElement(locator)).build().perform();
                setSteps();
                addBorderToElement(driver, webElement(locator));
                break;
            } catch (StaleElementReferenceException e) {

            }
        }
    }
    protected void clickAndHold(By locator, int time) {
        actions = new Actions(driver);
        for (int i = 0; i < 5; i++) {
            try {
                explicitWait(locator, time);
                actions.clickAndHold(webElement(locator)).build().perform();
                setSteps();
                addBorderToElement(driver, webElement(locator));
                break;
            } catch (StaleElementReferenceException e) {

            }
        }
    }
    protected void clickAndHold() {
        actions = new Actions(driver);
        actions.contextClick().build().perform();
        setSteps();
    }
    protected void release(By locator, int time) {
        actions = new Actions(driver);
        for (int i = 0; i < 5; i++) {
            try {
                explicitWait(locator, time);
                actions.release(webElement(locator)).build().perform();
                setSteps();
                addBorderToElement(driver, webElement(locator));
                break;
            } catch (StaleElementReferenceException e) {

            }
        }
    }
    protected void release() {
        actions = new Actions(driver);
        actions.release().build().perform();
        setSteps();
    }

    protected String getCurrentUrl(){
        return driver.getCurrentUrl();
    }

    protected String getTitle(){
        return driver.getTitle();
    }

    private static String getMethodName() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        if (stackTraceElements.length >= 2) {
            if (stackTraceElements.length >= 4)
                return stackTraceElements[4].getMethodName();
            return stackTraceElements[2].getMethodName();
        } else {
            return "Unknown";
        }
    }

    private void setSteps() {
        test.info(getMethodName());
    }

    public static void myAssertEquals(Object actual, Object expected) {
        test.info(MarkupHelper.createLabel("------------------- Actual Result -------------------", ExtentColor.TEAL));
        test.info(actual.toString());

        test.info(MarkupHelper.createLabel("------------------- Expected Result -------------------", ExtentColor.TEAL));
        test.info(expected.toString());

        assertEquals(actual, expected);
    }

    private static void addBorderToElement(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.border = '5px solid red'", element);
    }
}
