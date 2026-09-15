package org.example;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TablePage {

    private WebDriver driver;
    private WebDriverWait wait;
    private By langAny = By.cssSelector("input[name='lang'][value='Any']");
    private By langJava = By.cssSelector("input[name='lang'][value='Java']");
    private By langPython = By.cssSelector("input[name='lang'][value='Python']");
    private By levelBeginner = By.cssSelector("input[type='checkbox'][value='Beginner']");
    private By levelIntermediate = By.cssSelector("input[type='checkbox'][value='Intermediate']");
    private By levelAdvanced = By.cssSelector("input[type='checkbox'][value='Advanced']");
    private By enrollDropdown = By.id("enrollDropdown");
    private By enroll5k = By.cssSelector("li[data-value='5000']");
    private By enroll10k = By.cssSelector("li[data-value='10000']");
    private By enroll50k = By.cssSelector("li[data-value='50000']");
    private By id = By.cssSelector("td[data-col='id']");
    private By course = By.cssSelector("td[data-col='course']");
    private By language = By.cssSelector("td[data-col='language']");
    private By level = By.cssSelector("td[data-col='level']");
    private By enrollments = By.cssSelector("td[data-col='enrollments']");
    private By noData = By.id("noData");
    private By resetButton = By.id("resetFilters");
    private By dropdownAny = By.className("dropdown-label");

    public TablePage (WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void goTo () {
        driver.get("https://practicetestautomation.com/practice-test-table/");
    }

    public void setLangJava () {
        driver.findElement(langJava).click();
    }

    public void setLangPython () {
        driver.findElement(langPython).click();
    }

    private void selectCheckbox (WebElement checkbox) {
        if (!checkbox.isSelected()) {
            checkbox.click();
        }
    }

    private void deselectCheckbox (WebElement checkbox) {
        if (checkbox.isSelected()) {
            checkbox.click();
        }
    }

    public void setLevelBeginner () {
        selectCheckbox(driver.findElement(levelBeginner));
        deselectCheckbox(driver.findElement(levelIntermediate));
        deselectCheckbox(driver.findElement(levelAdvanced));
    }

    public void setLevelIntermediate () {
        deselectCheckbox(driver.findElement(levelBeginner));
        selectCheckbox(driver.findElement(levelIntermediate));
        deselectCheckbox(driver.findElement(levelAdvanced));
    }

    public void setLevelAdvanced () {
        deselectCheckbox(driver.findElement(levelBeginner));
        deselectCheckbox(driver.findElement(levelIntermediate));
        selectCheckbox(driver.findElement(levelAdvanced));
    }

    public void setMinEnrollments5k () {
        driver.findElement(enrollDropdown).click();
        driver.findElement(enroll5k).click();
    }

    public void setMinEnrollments10k () {
        driver.findElement(enrollDropdown).click();
        driver.findElement(enroll10k).click();
    }

    public void setMinEnrollments50k () {
        driver.findElement(enrollDropdown).click();
        driver.findElement(enroll50k).click();
    }

    public void resetFilters () {
        WebElement button = driver.findElement(resetButton);
        if (button.isDisplayed()) {
            button.click();
        }
    }

    public boolean isTableJava () {
        List<WebElement> langs = driver.findElements(language);
        for (WebElement lang : langs) {
            if (!lang.getText().equals("Java") && lang.isDisplayed()) {
                return false;
            }
        }
        return true;
    }

    public boolean isTablePython () {
        List<WebElement> langs = driver.findElements(language);
        for (WebElement lang : langs) {
            if (!lang.getText().equals("Python") && lang.isDisplayed()) {
                return false;
            }
        }
        return true;
    }

    public boolean isTableBeginner () {
        List<WebElement> levels = driver.findElements(level);
        for (WebElement lev : levels) {
            if (!lev.getText().equals("Beginner") && lev.isDisplayed()) {
                return false;
            }
        }
        return true;
    }

    public boolean isTableIntermediate () {
        List<WebElement> levels = driver.findElements(level);
        for (WebElement lev : levels) {
            if (!lev.getText().equals("Intermediate") && lev.isDisplayed()) {
                return false;
            }
        }
        return true;
    }

    public boolean isTableAdvanced () {
        List<WebElement> levels = driver.findElements(level);
        for (WebElement lev : levels) {
            if (!lev.getText().equals("Advanced") && lev.isDisplayed()) {
                return false;
            }
        }
        return true;
    }

    public boolean isTableEnrollments5k () {
        List<WebElement> enrolls = driver.findElements(enrollments);
        for (WebElement enroll : enrolls) {
            if (enroll.isDisplayed()) {
                if (Integer.parseInt(enroll.getText().replace(",", "")) < 5000) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isTableEnrollments10k () {
        List<WebElement> enrolls = driver.findElements(enrollments);
        for (WebElement enroll : enrolls) {
            if (enroll.isDisplayed()) {
                if (Integer.parseInt(enroll.getText().replace(",", "")) < 10000) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isTableEnrollments50k () {
        List<WebElement> enrolls = driver.findElements(enrollments);
        for (WebElement enroll : enrolls) {
            if (enroll.isDisplayed()) {
                if (Integer.parseInt(enroll.getText().replace(",", "")) < 50000) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isNoData () {
        return driver.findElement(noData).isDisplayed();
    }

    public boolean isTableReset () {
        if (!driver.findElement(langAny).isSelected()) {
            return false;
        }
        if (!driver.findElement(levelBeginner).isSelected()) {
            return false;
        }
        if (!driver.findElement(levelIntermediate).isSelected()) {
            return false;
        }
        if (!driver.findElement(levelAdvanced).isSelected()) {
            return false;
        }
        if (!driver.findElement(dropdownAny).getText().equals("Any")) {
            return false;
        }
        return true;
    }
}
