# SeleniumJava

A collection of standalone Selenium WebDriver scripts written in Java while practicing UI automation. Each file is a self-contained `main()` class rather than part of a single runnable test suite, but it's now a proper Maven project (`pom.xml`) so it compiles from the command line instead of needing a hand-built IDE classpath.

## What's in here

```
pom.xml
src/main/java/
  actionpkg/
    Daraz_mouse_hover.java             - package actionpkg
  ReadWrite_Files/
    Login2.java                        - package ReadWrite_Files
  locators/
    All_Elements.java
    Button.java
    Checkbox.java
    Daraz_Locators.java
    Dropdown.java
    Links.java
    Radio.java
    TextBox.java
    package-info.java
src/main/resources/
  TestLogin.properties                 - config used by Login2
```

### actionpkg — Daraz_mouse_hover.java
Automates mouse-hover navigation on daraz.pk: hovers over the "Groceries & Pets" menu, then "Cat", then "Food", clicks into the Pouches category, selects a product, and attempts a login and buy flow. Uses `ChromeDriver` with `WebDriverManager` (from `io.github.bonigarcia.wdm`) to handle the driver binary, and `Actions` for the hover/click chains.

### ReadWrite_Files — Login2.java
Reads a URL, username, and password out of `TestLogin.properties` (loaded from the classpath, via `src/main/resources`) using `java.util.Properties`, then logs into the OrangeHRM demo site (opensource-demo.orangehrmlive.com) with `FirefoxDriver`.

### locators/
Small practice scripts, one per locator strategy or element type, mostly built against the OrangeHRM demo site, Gmail, the-internet.herokuapp.com, and sastaticket.pk:

- `All_Elements.java` — walks through link text, partial link text, tag name, absolute/relative XPath, and CSS selector locators on the OrangeHRM login form (most alternatives are commented out, only one is active at a time)
- `Button.java` — finds and clicks a button on Gmail's sign-in flow
- `Checkbox.java` — finds a checkbox by label text and clicks it
- `Daraz_Locators.java` — bus search flow on sastaticket.pk; the destination field is located but clicking it is expected to still throw "element not interactable" since it depends on the origin field being filled first
- `Dropdown.java` — uses the `Select` class against the-internet.herokuapp.com dropdown page, selecting by visible text and by index, then reading back the option count
- `Links.java` / `TextBox.java` — near-identical scripts that locate the Gmail email field, send keys, and check `getAttribute`, `isDisplayed`, `isEnabled`
- `Radio.java` — empty stub, no implementation yet
- `package-info.java` — just the package declaration

## Tech stack

- Java 11, Maven
- Selenium WebDriver (`org.openqa.selenium`)
- WebDriverManager (`io.github.bonigarcia.wdm`) for automatic ChromeDriver setup in `Daraz_mouse_hover.java`
- GeckoDriver, referenced via a hardcoded local path in the `locators/` scripts and in `Login2` (see below)

## Running these

```
mvn compile
```

Each class still has its own `main()` method and needs to be run individually — this isn't a single test suite, just a shared build setup:

```
mvn exec:java -Dexec.mainClass="locators.Button"
```

Most of the `locators/` scripts and `Login2` still point `webdriver.gecko.driver` at a specific local path (`G:\Katalon_Studio_Windows_64-8.1.0\...\geckodriver.exe`) rather than using WebDriverManager — update that line to your own geckodriver path before running them, or swap it for `WebDriverManager.firefoxdriver().setup()` like `Daraz_mouse_hover.java` already does for Chrome.
.
