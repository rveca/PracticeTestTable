[![Selenium Tests](https://github.com/rveca/PracticeTestTable/actions/workflows/selenium-tests.yml/badge.svg)](https://github.com/rveca/PracticeTestTable/actions/workflows/selenium-tests.yml)
# Selenium Test Automation Framework

A Java-based UI test automation framework built to practice real-world Selenium patterns: Page Object Model, custom HTML reporting with failure screenshots, and CI/CD integration via GitHub Actions.

**Target site:** [Practice Test Table](https://practicetestautomation.com/practice-test-table/)

## Tech Stack
- Java 21
- Selenium WebDriver
- JUnit 5
- Maven
- Extent Reports (HTML reporting with screenshot-on-failure)
- GitHub Actions (CI/CD, headless execution)

## What's Covered
- 43 test cases across language/level/enrollment filtering, combined filters, empty-result states, and reset behavior
- Page Object Model separating locators/actions from test logic
- Automatic HTML report generation with screenshots attached on test failure
- Headless Chrome execution with CI

## Running Locally
```bash
git clone https://github.com/rveca/PracticeTestTable.git
cd PracticeTestTable
mvn test
```
Reports generate at `test-output/report.html` after a run.

## CI/CD
Tests run automatically on every push and pull request via GitHub Actions, executing headlessly on a clean Ubuntu runner. See the `.github/workflows/` directory for the pipeline configuration.