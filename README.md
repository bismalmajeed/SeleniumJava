# SeleniumJava

A collection of standalone Selenium WebDriver scripts written in Java while practicing UI automation. Each file is a self-contained `main()` class rather than part of a single runnable test suite — there's no Maven or Gradle project set up here, just individual scripts grouped by package.

## What's in here

```
Daraz_mouse_hover.java              - package actionpkg
TestCase_Login_BYFile_Reading.java  - package ReadWrite_Files (class Login2)
TestLogin.properties                - config used by the file-reading login test
File read and write                 - leftover/placeholder file, empty
locators/
  All_Elements.java                 - package locators
  Button.java
  Checkbox.java
  Daraz_Locators.java
  Dropdown.java
  Links.java
  Radio.java
  TextBox.java
  package-info.java
```

### actionpkg — Daraz_mouse_hover.java
Automates mouse-hover navigation on daraz.pk: hovers over the "Groceries & Pets" menu, then "Cat", then "Food", clicks into the Pouches category, selects a product, and attempts a login and buy flow. Uses `ChromeDriver` with `WebDriverManager` (from `io.github.bonigarcia.wdm`) to handle the driver binary, and `Actions` for the hover/click chains.

### ReadWrite_Files — TestCase_Login_BYFile_Reading.java
Class is actually named `Login2`. Reads a URL, username, and password out of `TestLogin.properties` using `java.util.Properties` and `FileInputStream`, then logs into the OrangeHRM demo site (opensource-demo.orangehrmlive.com) with `FirefoxDriver`. The properties file path is currently hardcoded to a local machine path (`G:\Selenium tranings\...`), so it won't run as-is on another machine without updating that path.

### locators/
Small practice scripts, one per locator strategy or element type, mostly built against the OrangeHRM demo site, Gmail, the-internet.herokuapp.com, and sastaticket.pk:

- `All_Elements.java` — walks through link text, partial link text, tag name, absolute/relative XPath, and CSS selector locators on the OrangeHRM login form (most alternatives are commented out, only one is active at a time)
- `Button.java` — finds and clicks a button on Gmail's sign-in flow
- `Checkbox.java` — checkbox locator practice (currently broken: calls `driver1.findElement(...)` instead of `driver.findElement(...)`, so it won't compile)
- `Daraz_Locators.java` — incomplete script for a bus search flow on sastaticket.pk; left mid-edit with a trailing method call and a comment about an "element not interactable" issue caused by dependent fields
- `Dropdown.java` — uses the `Select` class against the-internet.herokuapp.com dropdown page, selecting by visible text and by index, then reading back the option count
- `Links.java` / `TextBox.java` — near-identical scripts that locate the Gmail email field, send keys, and check `getAttribute`, `isDisplayed`, `isEnabled`
- `Radio.java` — empty stub, no implementation yet
- `package-info.java` — just the package declaration

## Tech stack

- Java
- Selenium WebDriver (`org.openqa.selenium`)
- WebDriverManager (`io.github.bonigarcia.wdm`) for automatic ChromeDriver setup in `Daraz_mouse_hover.java`
- GeckoDriver, referenced via a hardcoded local path in most of the `locators/` scripts and in `Login2`

## Running these

There's no `pom.xml` or `build.gradle` in this repo, so these aren't set up to build from the command line. To run any of the scripts:

1. Import the folder into an IDE (Eclipse or IntelliJ) as a Java project.
2. Add the Selenium Java client jar (and WebDriverManager, for `Daraz_mouse_hover.java`) to the build path.
3. For scripts using `FirefoxDriver`, update the hardcoded `webdriver.gecko.driver` path to point at a local `geckodriver.exe`. For `Daraz_mouse_hover.java`, WebDriverManager handles the ChromeDriver binary automatically.
4. Run the individual class as a Java application — each one has its own `main()` method.

Some scripts (`Checkbox.java`, `Daraz_Locators.java`) have known bugs or are left unfinished, as noted above.
