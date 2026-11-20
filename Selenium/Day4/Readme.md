# Day 4: Selenium Locators, Scrolling & Browser Actions

Welcome to Day 4 of my Software Testing & Automation training! This document covers Selenium locators, identifying web elements, browser navigation, interacting with webpage components, scrolling using JavaScript, and performing browser actions using Selenium WebDriver and Java.

---

## 🛠️ Core Concepts

### 1. WebDriver

**WebDriver** is an interface in Selenium that provides methods to control and automate web browsers.

It allows automation scripts to perform browser operations such as opening websites, clicking buttons, entering text, and navigating between pages.

**Example:**

```java
WebDriver driver = new EdgeDriver();
```

### 2. WebDriverManager

**WebDriverManager** is a Java library that automatically downloads and configures browser driver executables.

It eliminates the need to manually download browser drivers and configure their executable paths.

**Example:**

```java
WebDriverManager.edgedriver().setup();
```

### 3. By Class

The `By` class in Selenium provides different locator strategies to identify web elements on a webpage.

It is used along with the `findElement()` method to locate elements.

### 4. XPath

**XPath (XML Path Language)** is a query language used to navigate through HTML and XML documents to identify specific elements.

It is useful when elements do not have simple or unique attributes such as ID or Name.

**Example:**

```java
By.xpath("//input[@name='password']")
```

### 5. JavascriptExecutor

**JavascriptExecutor** is an interface in Selenium that allows Java automation scripts to execute JavaScript code directly inside the browser.

It can be used for operations such as scrolling webpages and interacting with certain browser elements through JavaScript.

### 6. Thread.sleep()

`Thread.sleep()` is a Java method used to pause program execution for a specified duration.

- 1000 milliseconds = 1 second
- 3000 milliseconds = 3 seconds
- 5000 milliseconds = 5 seconds

**Example:**

```java
Thread.sleep(3000);
```

It throws `InterruptedException`, which must be handled or declared.

---

## 🌐 1. Browser Setup & Navigation

Before performing automation, we need to initialize the browser and navigate to the required website.

| Code | Description |
|---|---|
| `WebDriver driver = new EdgeDriver();` | Creates a new Edge browser session. |
| `driver.get("URL");` | Opens the specified website. |
| `driver.manage().window().maximize();` | Maximizes the browser window. |
| `driver.close();` | Closes the current browser window. |
| `driver.quit();` | Closes all browser windows and ends the WebDriver session. |

**Example:**

```java
driver.get("https://demoqa.com/elements");

driver.manage().window().maximize();
```

---

## 🔍 2. Selenium Locators

Locators are used to identify web elements such as text boxes, buttons, links, checkboxes, and dropdowns.

Selenium provides different locator strategies through the `By` class.

### Types of Locators

| Locator | Description | Example |
|---|---|---|
| ID | Identifies an element using its ID attribute. | `By.id("userName")` |
| Name | Identifies an element using its Name attribute. | `By.name("roll_no")` |
| ClassName | Identifies an element using its class attribute. | `By.className("text")` |
| TagName | Identifies elements using HTML tag names. | `By.tagName("input")` |
| LinkText | Identifies a link using its complete visible text. | `By.linkText("Login")` |
| PartialLinkText | Identifies a link using part of its visible text. | `By.partialLinkText("Log")` |
| XPath | Identifies elements using XPath expressions. | `By.xpath("//input[@id='userName']")` |
| CSS Selector | Identifies elements using CSS selectors. | `By.cssSelector("#userName")` |

### 2.1 ID Locator

Used to locate an element using its ID attribute.

```java
driver.findElement(By.id("userName"));
```

### 2.2 Name Locator

Used to locate an element using its Name attribute.

```java
driver.findElement(By.name("roll_no"));
```

### 2.3 ClassName Locator

Used to locate an element using its class attribute.

```java
driver.findElement(By.className("text"));
```

### 2.4 LinkText Locator

Used to locate a hyperlink using its complete visible text.

```java
driver.findElement(By.linkText("Login")).click();
```

### 2.5 XPath Locator

XPath is useful when an element needs to be located using its HTML tag, attributes, or visible text.

**Example 1: Using the name attribute**

```java
driver.findElement(By.xpath("//input[@name='password']"));
```

**Example 2: Using exact visible text**

```java
driver.findElement(By.xpath("//a[.='Login']")).click();
```

**Understanding the XPath expression:**

- `//` – Selects matching elements anywhere in the document.
- `a` – Identifies an anchor (link) element.
- `[]` – Specifies a condition.
- `.` – Refers to the current element.
- `='Login'` – Matches the exact text.

---

## 🖱️ 3. Web Element Interaction Methods

Selenium provides methods to interact with webpage elements.

### 3.1 findElement()

The `findElement()` method locates the first matching web element on the webpage.

**Syntax:**

```java
driver.findElement(By.id("elementId"));
```

### 3.2 sendKeys()

The `sendKeys()` method is used to enter text into input fields.

**Example:**

```java
driver.findElement(By.id("userName")).sendKeys("Lalitha");
```

### 3.3 click()

The `click()` method is used to click buttons, links, and other clickable elements.

**Example:**

```java
driver.findElement(By.id("submit")).click();
```

---

## 📜 4. Scrolling Using JavascriptExecutor

Scrolling is required when webpage elements are outside the currently visible browser area.

Selenium provides the `JavascriptExecutor` interface to execute JavaScript commands in the browser.

### Step 1: Import JavascriptExecutor

```java
import org.openqa.selenium.JavascriptExecutor;
```

### Step 2: Create JavascriptExecutor Object

```java
JavascriptExecutor js = (JavascriptExecutor) driver;
```

Here, the WebDriver object is typecast into the `JavascriptExecutor` interface.

### Step 3: Execute JavaScript Scroll Command

```java
js.executeScript("window.scrollBy(0,200)");
```

**Understanding the command:**

| Parameter | Meaning |
|---|---|
| `window` | Represents the browser window. |
| `scrollBy()` | Scrolls the page by the specified amount. |
| `0` | Horizontal scrolling distance. |
| `200` | Vertical scrolling distance in pixels. |

**Scroll Down:**

```java
js.executeScript("window.scrollBy(0,200)");
```

**Scroll Up:**

```java
js.executeScript("window.scrollBy(0,-200)");
```

---

## ⏳ 5. Waits Using Thread.sleep()

Sometimes, we need to pause execution before performing the next operation.

Java provides the `Thread.sleep()` method for this purpose.

**Example:**

```java
Thread.sleep(5000);
```

This pauses execution for five seconds.

**Important Points:**

- The time is specified in milliseconds.
- It throws `InterruptedException`.
- It is a fixed wait.
- Explicit waits are generally preferred in Selenium automation because they wait for specific conditions.

---

## 💻 6. Practical Implementation 1: DemoQA Text Box Automation

**Objective:** Automate the Text Box form on the DemoQA website by entering user details and submitting the form.

**Website:** https://demoqa.com/elements

### Locating and Interacting with Elements

**1. Open the website**

```java
driver.get("https://demoqa.com/elements");
```

**2. Scroll the webpage**

```java
js.executeScript("window.scrollBy(0,200)");
```

**3. Click the Text Box section**

```java
driver.findElement(By.className("text")).click();
```

**4. Enter username**

```java
driver.findElement(By.id("userName")).sendKeys("Lalitha");
```

**5. Enter email**

```java
driver.findElement(By.id("userEmail"))
      .sendKeys("Lalitha123@gmail.com");
```

**6. Enter current and permanent addresses**

```java
driver.findElement(By.id("currentAddress"))
      .sendKeys("Bhupalapatnam");

driver.findElement(By.id("permanentAddress"))
      .sendKeys("Hyderabad");
```

**7. Submit the form**

```java
driver.findElement(By.id("submit")).click();
```

**Expected Result:** The Text Box form is filled with the provided details and submitted successfully.

---

## 💻 7. Practical Implementation 2: Maya Portal Login Automation

**Objective:** Automate the login process of the Maya student portal using Selenium WebDriver and Java.

**Website:** https://maya.adityauniversity.in/

### Locating and Interacting with Elements

**1. Open the Maya portal**

```java
driver.get("https://maya.adityauniversity.in/");
```

**2. Click the Login link**

```java
driver.findElement(By.linkText("Login")).click();
```

**3. Scroll the webpage**

```java
js.executeScript("window.scrollBy(0,200)");
```

**4. Enter roll number**

```java
driver.findElement(By.name("roll_no"))
      .sendKeys("YOUR_ROLL_NUMBER");
```

**5. Enter password**

```java
driver.findElement(By.name("password"))
      .sendKeys("YOUR_PASSWORD");
```

**6. Locate and click the Login button using XPath**

```java
driver.findElement(
    By.xpath("//button[@class='edu-btn btn-medium']")
).click();
```

**7. Wait for five seconds**

```java
Thread.sleep(5000);
```

**8. Close the browser**

```java
driver.quit();
```

**Expected Result:** The automation script enters the supplied credentials and attempts to log in to the Maya portal.

**Note:** Successful login depends on valid credentials and portal availability. Never commit actual passwords or private credentials to GitHub.

---

## 📌 8. Important Points to Remember

- WebDriver is the main interface used to control browsers.
- WebDriverManager helps configure browser drivers automatically.
- The `By` class provides different locator strategies.
- XPath is useful for identifying elements using HTML attributes and text.
- `findElement()` locates the first matching element.
- `sendKeys()` enters text into input fields.
- `click()` performs click actions on elements.
- JavascriptExecutor executes JavaScript inside the browser.
- `window.scrollBy()` scrolls the webpage horizontally and vertically.
- `Thread.sleep()` pauses Java program execution for a fixed duration.
- `driver.quit()` closes all browser windows and ends the WebDriver session.

---

## 📝 Day 4 Summary

In this session, I learned:

- Understanding WebDriver and WebDriverManager.
- Introduction to the Selenium `By` class.
- Different Selenium locator strategies.
- Working with XPath expressions.
- Identifying webpage elements using HTML attributes.
- Interacting with web elements using `findElement()`, `sendKeys()`, and `click()`.
- Scrolling webpages using JavascriptExecutor.
- Using `Thread.sleep()` to pause program execution.
- Automating a Text Box form on DemoQA.
- Automating the login process of the Maya student portal.
- Closing browser sessions using `driver.quit()`.

---

**Learning Outcome:** Successfully practiced different Selenium locator strategies, browser navigation, web element interactions, JavaScript-based scrolling, and form automation using Java and Selenium WebDriver.
