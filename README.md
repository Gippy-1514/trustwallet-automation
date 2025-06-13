# Trust Wallet Mobile Automation  

1. Overview:
   Mobile automation testing framework for Trust Wallet application to streamline and standardize mobile automation for Trust Wallet, enabling reliable, maintainable, and scalable test automation

2. Technology Stack:
   Java 17 - Modern programming language with enhanced features
   Maven -   Build automation and dependency management
   Appium - Mobile automation framework for native/hybrid apps
   TestNG - Testing framework with parallel execution and reporting
   Selenium WebDriver - Element interaction library

3. Framework Architecture:
   Design Patterns:
    - Page Object Model: Clean separation of test logic and page code
    - Base Page Pattern: Common functionality through BasePage inheritance
    - Base Test Pattern: Driver lifecycle management via BaseTest class

4. Framework Features:
    - Page Object Model design pattern
    - Maven for dependency management
    - TestNG for test execution
    - Appium for mobile automation
    - Explicit waits for reliable element handling

5. Project Structure:
      src/
      ├── main/java/
      │ ├── pages/
      │ │ ├── BasePage.java
      │ │ └── WelcomePage.java
      │ └── utils/
      │ └── DriverUtils.java
      └── test/java/
      └── tests/
      ├── BaseTest.java
      └── WelcomeTest.java

6. Setup Instructions:
    - Install Java 17+
    - Install Maven
    - Install Appium Server
    - Set up Android Studio and device/emulator
    - Set environment variables (ANDROID_HOME, JAVA_HOME)
    - Run: mvn clean test

7. Execution:
    - Run all tests: mvn clean test
    - Run specific test suite:Example: mvn test -Dsuite=smoke
    - Platform-specific profiles:Example: mvn test -Pandroid

8. Test Results and Reporting:
   - Reports Location: target/surefire-reports
