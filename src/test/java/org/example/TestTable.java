package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(ReportWatcher.class)
public class TestTable {

    WebDriver driver;
    TablePage tablePage;

    @BeforeEach
    void setUp (TestInfo testInfo) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        options.addArguments("--window-size=1920,1080");
        driver = new ChromeDriver(options);
        tablePage = new TablePage(driver);
        tablePage.goTo();
        ReportManager.createTest(testInfo.getDisplayName());
    }

    @AfterAll
    static void report () {
        ReportManager.getInstance().flush();
    }

    public WebDriver getDriver () {
        return driver;
    }

    @Test
    void filterLanguageJava () {
        tablePage.setLangJava();
        assertTrue(tablePage.isTableJava());
    }

    @Test
    void filterLanguagePython () {
        tablePage.setLangPython();
        assertTrue(tablePage.isTablePython());
    }

    @Test
    void filterLevelBeginner () {
        tablePage.setLevelBeginner();
        assertTrue(tablePage.isTableBeginner());
    }

    @Test
    void filterLevelIntermediate () {
        tablePage.setLevelIntermediate();
        assertTrue(tablePage.isTableIntermediate());
    }

    @Test
    void filterLevelAdvanced () {
        tablePage.setLevelAdvanced();
        assertTrue(tablePage.isTableAdvanced());
    }

    @Test
    void filterEnrollments5k () {
        tablePage.setMinEnrollments5k();
        assertTrue(tablePage.isTableEnrollments5k());
    }

    @Test
    void filterEnrollments10k () {
        tablePage.setMinEnrollments10k();
        assertTrue(tablePage.isTableEnrollments10k());
    }

    @Test
    void filterEnrollments50k () {
        tablePage.setMinEnrollments50k();
        assertTrue(tablePage.isTableEnrollments50k());
    }

    @Test
    void filterAnyBeginner5k () {
        tablePage.setLevelBeginner();
        tablePage.setMinEnrollments5k();
        assertTrue(tablePage.isTableBeginner() && tablePage.isTableEnrollments5k());
    }

    @Test
    void filterAnyBeginner10k () {
        tablePage.setLevelBeginner();
        tablePage.setMinEnrollments10k();
        assertTrue(tablePage.isTableBeginner() && tablePage.isTableEnrollments10k());
    }

    @Test
    void filterAnyBeginner50k () {
        tablePage.setLevelBeginner();
        tablePage.setMinEnrollments50k();
        assertTrue(tablePage.isTableBeginner() && tablePage.isTableEnrollments50k());
    }

    @Test
    void filterAnyIntermediate5k () {
        tablePage.setLevelIntermediate();
        tablePage.setMinEnrollments5k();
        assertTrue(tablePage.isTableIntermediate() && tablePage.isTableEnrollments5k());
    }

    @Test
    void filterAnyIntermediate10k () {
        tablePage.setLevelIntermediate();
        tablePage.setMinEnrollments10k();
        assertTrue(tablePage.isTableIntermediate() && tablePage.isTableEnrollments10k());
    }

    @Test
    void filterAnyIntermediate50k () {
        tablePage.setLevelIntermediate();
        tablePage.setMinEnrollments50k();
        assertTrue(tablePage.isTableIntermediate() && tablePage.isTableEnrollments50k());
    }

    @Test
    void filterAnyAdvanced5k () {
        tablePage.setLevelAdvanced();
        tablePage.setMinEnrollments5k();
        assertTrue(tablePage.isTableAdvanced() && tablePage.isTableEnrollments5k());
    }

    @Test
    void filterAnyAdvanced10k () {
        tablePage.setLevelAdvanced();
        tablePage.setMinEnrollments10k();
        assertTrue(tablePage.isTableAdvanced() && tablePage.isTableEnrollments10k());
    }

    @Test
    void filterAnyAdvanced50k () {
        tablePage.setLevelAdvanced();
        tablePage.setMinEnrollments50k();
        assertTrue(tablePage.isTableAdvanced() && tablePage.isTableEnrollments50k());
    }

    @Test
    void filterJavaBeginnerAny () {
        tablePage.setLangJava();
        tablePage.setLevelBeginner();
        assertTrue(tablePage.isTableJava() && tablePage.isTableBeginner());
    }

    @Test
    void filterJavaBeginner5k () {
        tablePage.setLangJava();
        tablePage.setLevelBeginner();
        tablePage.setMinEnrollments5k();
        assertTrue(tablePage.isTableJava() && tablePage.isTableBeginner() && tablePage.isTableEnrollments5k());
    }

    @Test
    void filterJavaBeginner10k () {
        tablePage.setLangJava();
        tablePage.setLevelBeginner();
        tablePage.setMinEnrollments10k();
        assertTrue(tablePage.isTableJava() && tablePage.isTableBeginner() && tablePage.isTableEnrollments10k());
    }

    @Test
    void filterJavaBeginner50k () {
        tablePage.setLangJava();
        tablePage.setLevelBeginner();
        tablePage.setMinEnrollments50k();
        assertTrue(tablePage.isTableJava() && tablePage.isTableBeginner() && tablePage.isTableEnrollments50k());
    }

    @Test
    void filterJavaIntermediateAny () {
        tablePage.setLangJava();
        tablePage.setLevelIntermediate();
        assertTrue(tablePage.isTableJava() && tablePage.isTableIntermediate());
    }

    @Test
    void filterJavaIntermediate5k () {
        tablePage.setLangJava();
        tablePage.setLevelIntermediate();
        tablePage.setMinEnrollments5k();
        assertTrue(tablePage.isTableJava() && tablePage.isTableIntermediate() && tablePage.isTableEnrollments5k());
    }

    @Test
    void filterJavaIntermediate10k () {
        tablePage.setLangJava();
        tablePage.setLevelIntermediate();
        tablePage.setMinEnrollments10k();
        assertTrue(tablePage.isTableJava() && tablePage.isTableIntermediate() && tablePage.isTableEnrollments10k());
    }

    @Test
    void filterJavaIntermediate50k () {
        tablePage.setLangJava();
        tablePage.setLevelIntermediate();
        tablePage.setMinEnrollments50k();
        assertTrue(tablePage.isTableJava() && tablePage.isTableIntermediate() && tablePage.isTableEnrollments50k());
    }

    @Test
    void filterJavaAdvancedAny () {
        tablePage.setLangJava();
        tablePage.setLevelAdvanced();
        assertTrue(tablePage.isTableJava() && tablePage.isTableAdvanced());
    }

    @Test
    void filterJavaAdvanced5k () {
        tablePage.setLangJava();
        tablePage.setLevelAdvanced();
        tablePage.setMinEnrollments5k();
        assertTrue(tablePage.isTableJava() && tablePage.isTableAdvanced() && tablePage.isTableEnrollments5k());
    }

    @Test
    void filterJavaAdvanced10k () {
        tablePage.setLangJava();
        tablePage.setLevelAdvanced();
        tablePage.setMinEnrollments10k();
        assertTrue(tablePage.isTableJava() && tablePage.isTableAdvanced() && tablePage.isTableEnrollments10k());
    }

    @Test
    void filterJavaAdvanced50k () {
        tablePage.setLangJava();
        tablePage.setLevelAdvanced();
        tablePage.setMinEnrollments50k();
        assertTrue(tablePage.isTableJava() && tablePage.isTableAdvanced() && tablePage.isTableEnrollments50k());
    }

    @Test
    void filterPythonBeginnerAny () {
        tablePage.setLangPython();
        tablePage.setLevelBeginner();
        assertTrue(tablePage.isTablePython() && tablePage.isTableBeginner());
    }

    @Test
    void filterPythonBeginner5k () {
        tablePage.setLangPython();
        tablePage.setLevelBeginner();
        tablePage.setMinEnrollments5k();
        assertTrue(tablePage.isTablePython() && tablePage.isTableBeginner() && tablePage.isTableEnrollments5k());
    }

    @Test
    void filterPythonBeginner10k () {
        tablePage.setLangPython();
        tablePage.setLevelBeginner();
        tablePage.setMinEnrollments10k();
        assertTrue(tablePage.isTablePython() && tablePage.isTableBeginner() && tablePage.isTableEnrollments10k());
    }

    @Test
    void filterPythonBeginner50k () {
        tablePage.setLangPython();
        tablePage.setLevelBeginner();
        tablePage.setMinEnrollments50k();
        assertTrue(tablePage.isTablePython() && tablePage.isTableBeginner() && tablePage.isTableEnrollments50k());
    }

    @Test
    void filterPythonIntermediateAny () {
        tablePage.setLangPython();
        tablePage.setLevelIntermediate();
        assertTrue(tablePage.isTablePython() && tablePage.isTableIntermediate());
    }

    @Test
    void filterPythonIntermediate5k () {
        tablePage.setLangPython();
        tablePage.setLevelIntermediate();
        tablePage.setMinEnrollments5k();
        assertTrue(tablePage.isTablePython() && tablePage.isTableIntermediate() && tablePage.isTableEnrollments5k());
    }

    @Test
    void filterPythonIntermediate10k () {
        tablePage.setLangPython();
        tablePage.setLevelIntermediate();
        tablePage.setMinEnrollments10k();
        assertTrue(tablePage.isTablePython() && tablePage.isTableIntermediate() && tablePage.isTableEnrollments10k());
    }

    @Test
    void filterPythonIntermediate50k () {
        tablePage.setLangPython();
        tablePage.setLevelIntermediate();
        tablePage.setMinEnrollments50k();
        assertTrue(tablePage.isTablePython() && tablePage.isTableIntermediate() && tablePage.isTableEnrollments50k());
    }

    @Test
    void filterPythonAdvancedAny () {
        tablePage.setLangPython();
        tablePage.setLevelAdvanced();
        assertTrue(tablePage.isTablePython() && tablePage.isTableAdvanced());
    }

    @Test
    void filterPythonAdvanced5k () {
        tablePage.setLangPython();
        tablePage.setLevelAdvanced();
        tablePage.setMinEnrollments5k();
        assertTrue(tablePage.isTablePython() && tablePage.isTableAdvanced() && tablePage.isTableEnrollments5k());
    }

    @Test
    void filterPythonAdvanced10k () {
        tablePage.setLangPython();
        tablePage.setLevelAdvanced();
        tablePage.setMinEnrollments10k();
        assertTrue(tablePage.isTablePython() && tablePage.isTableAdvanced() && tablePage.isTableEnrollments10k());
    }

    @Test
    void filterPythonAdvanced50k () {
        tablePage.setLangPython();
        tablePage.setLevelAdvanced();
        tablePage.setMinEnrollments50k();
        assertTrue(tablePage.isTablePython() && tablePage.isTableAdvanced() && tablePage.isTableEnrollments50k());
    }

    @Test
    void filterEmpty () {
        tablePage.setLangPython();
        tablePage.setLevelAdvanced();
        assertTrue(tablePage.isNoData());
    }

    @Test
    void resetFilters () {
        tablePage.setLangJava();
        tablePage.setLevelBeginner();
        tablePage.setMinEnrollments5k();
        tablePage.resetFilters();
        assertTrue(tablePage.isTableReset());
    }
}
