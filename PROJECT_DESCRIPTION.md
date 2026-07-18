# Project Description

**SeleniumJava — Java Selenium WebDriver practice scripts**

I put this repo together while learning Selenium WebDriver with Java, working through locator strategies, mouse actions, dropdowns, and reading test data from a properties file instead of hardcoding it.

## Problem

I needed a place to practice the fundamentals of Selenium in Java one concept at a time — different ways to locate elements, handling hover menus and dropdowns, and pulling login credentials from an external file instead of typing them into the script.

## Approach

Each script is a standalone class with its own `main()` method targeting a real site: the OrangeHRM demo app for locator and login practice, daraz.pk for mouse-hover navigation through nested menus, the-internet.herokuapp.com for dropdown handling, and Gmail for basic textbox and attribute checks. The `ReadWrite_Files` package reads login details out of a `.properties` file with `java.util.Properties` instead of hardcoding them. Not every script is a finished demo — `Radio.java` is still an empty stub, and `Daraz_Locators.java` intentionally documents a real "element not interactable" issue rather than hiding it, which reflects the practice-as-I-go nature of this repo. It's now set up as a proper Maven project (`pom.xml`, standard `src/main/java` layout) instead of loose files needing manual IDE classpath setup.

## Tech Stack

- Java 11, Maven
- Selenium WebDriver
- WebDriverManager (for automatic ChromeDriver setup)
- Java Properties API for config/file-based test data

## Status

Practice repo, not actively maintained as a formal project. Scripts are added as I work through new Selenium concepts.
