# Day 3: Selenium WebDriver Setup & First Automation Program

Welcome to Day 3 of my Software Testing & Automation training! This document covers Selenium WebDriver, its role in browser automation, WebDriver interfaces, browser drivers, and executing the first Selenium automation program using Java and Maven.

---

## 🌐 Introduction to Selenium WebDriver

### 1. What is Selenium WebDriver?

**Selenium WebDriver** is an interface provided by Selenium that allows automation scripts to control and interact with web browsers.

It is used to automate browser activities such as:
- Opening a website.
- Navigating between web pages.
- Interacting with web elements.
- Entering data into input fields.
- Clicking buttons and links.
- Performing browser-based testing.

### 2. What is WebDriver?

**WebDriver** is an interface in Selenium that provides methods to control and automate web browsers.

It acts as a common interface for different browser drivers such as ChromeDriver, EdgeDriver, and FirefoxDriver.

**Example:**

```java
WebDriver driver = new ChromeDriver();
```

Here:
- `WebDriver` is the interface.
- `driver` is the reference variable.
- `new ChromeDriver()` creates an object of the ChromeDriver class.

---

## 🔧 Browser Drivers

Browser drivers act as intermediaries between Selenium WebDriver and the respective browsers.

Each browser has its corresponding driver:

| Browser | Browser Driver |
|---|---|
| Google Chrome | ChromeDriver |
| Microsoft Edge | EdgeDriver |
| Mozilla Firefox | FirefoxDriver |
| Safari | SafariDriver |

### How Selenium WebDriver Works

1. The tester writes automation scripts using Java and Selenium.
2. Selenium communicates with the corresponding browser driver.
3. The browser driver communicates with the browser.
4. The browser performs the requested actions.
5. The results are returned through WebDriver.

**Execution Flow:**

```text
Java Automation Script
          |
          v
   Selenium WebDriver
          |
          v
     Browser Driver
          |
          v
       Browser
```

---

## 📦 Selenium WebDriver Dependency in Maven

To use Selenium WebDriver in a Java Maven project, we need to add the Selenium Java dependency inside the `pom.xml` file.

### Selenium Java Dependency

```xml
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.27.0</version>
</dependency>
```

### Steps to Add the Dependency

1. Open the Maven project in IntelliJ IDEA.
2. Open the `pom.xml` file.
3. Search for Selenium Java in the Maven Repository.
4. Copy the dependency XML.
5. Paste it inside the `<dependencies>` section.
6. Reload the Maven project.
7. Wait until all required libraries are downloaded.

**Note:** If Selenium classes such as `WebDriver` or `ChromeDriver` cannot be resolved, verify that the Selenium dependency is correctly added and Maven has successfully downloaded the libraries.

---

## ☕ Creating the First Selenium Automation Program

After adding the Selenium dependency, we can write our first browser automation program.

### Step 1: Create a Java Class

1. Open the Maven project in IntelliJ IDEA.
2. Navigate to `src → main → java`.
3. Right-click on the Java folder.
4. Select `New → Java Class`.
5. Create a class named `FirstTest`.

### Step 2: Import Required Packages

```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
```

### Step 3: Write the Automation Code

```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

    }
}
```

### Step 4: Execute the Program

1. Right-click inside the Java class.
2. Select `Run 'FirstTest.main()'`.
3. Chrome browser launches.
4. Google website opens automatically.

---

## 🔍 Understanding the Selenium Code

### 1. WebDriver driver = new ChromeDriver();

```java
WebDriver driver = new ChromeDriver();
```

- `WebDriver` is the Selenium interface.
- `driver` is the reference variable.
- `ChromeDriver()` creates an instance of the ChromeDriver class.
- This object is used to control the Chrome browser.

### 2. driver.get()

```java
driver.get("https://www.google.com");
```

The `get()` method is used to open a specified URL in the browser.

**Syntax:**

```java
driver.get("URL");
```

**Example:**

```java
driver.get("https://www.google.com");
driver.get("https://www.amazon.in");
driver.get("https://aec.edu.in/");
```

Each call navigates the browser to the specified URL.

---

## 🧪 Understanding Web Elements and Locators

### What is a Web Element?

A **Web Element** is an individual component present on a webpage.

Examples:
- Text boxes
- Buttons
- Links
- Checkboxes
- Radio buttons
- Dropdown menus

### What are Locators?

Locators are used to identify and locate specific web elements on a webpage.

To inspect an element:

1. Open a website.
2. Right-click on the required element.
3. Select `Inspect`.
4. Examine its HTML attributes.

Selenium provides locator strategies to identify elements, which will be covered in detail in upcoming sessions.

---

## 📌 Important Points

- Selenium WebDriver is used for browser automation.
- WebDriver is an interface in Selenium.
- ChromeDriver, EdgeDriver and FirefoxDriver are browser-specific driver classes.
- Browser drivers enable communication between Selenium and browsers.
- Selenium dependencies must be added to the Maven `pom.xml` file.
- The `get()` method is used to navigate to a specified URL.
- A WebDriver reference can be used to work with different browser driver implementations.

---

## 📝 Day 3 Summary

In this session, I learned:

- Introduction to Selenium WebDriver.
- Understanding the WebDriver interface.
- Different browser drivers.
- How Selenium communicates with browsers.
- Adding Selenium dependencies using Maven.
- Creating a WebDriver object.
- Writing and executing the first Selenium automation program.
- Opening websites using the `get()` method.
- Introduction to Web Elements and Locators.

---

**Learning Outcome:** Successfully understood the basic working of Selenium WebDriver and executed the first Java-based browser automation program using ChromeDriver.
