# Selenium

[![CI](https://github.com/SeleniumHQ/selenium/actions/workflows/ci.yml/badge.svg?branch=trunk&event=schedule)](https://github.com/SeleniumHQ/selenium/actions/workflows/ci.yml)

<a href="https://selenium.dev"><img src="https://selenium.dev/images/selenium_logo_square_green.png" width="180" alt="Selenium"/></a>

Selenium is an umbrella project encapsulating a variety of tools and
libraries enabling web browser automation. Selenium specifically
provides an infrastructure for the [W3C WebDriver specification](https://w3c.github.io/webdriver/)
— a platform and language-neutral coding interface compatible with all
major web browsers.

Selenium's source code is made available under the [Apache 2.0 license](https://github.com/SeleniumHQ/selenium/blob/trunk/LICENSE).

## Documentation

Narrative documentation:

•⁠  ⁠[User Manual](https://selenium.dev/documentation/)

API documentation:

•⁠  ⁠[C#](https://seleniumhq.github.io/selenium/docs/api/dotnet/)

•⁠  ⁠[JavaScript](https://seleniumhq.github.io/selenium/docs/api/javascript/)

•⁠  ⁠[Java](https://seleniumhq.github.io/selenium/docs/api/java/index.html)

•⁠  ⁠[Python](https://seleniumhq.github.io/selenium/docs/api/py/)

•⁠  ⁠[Ruby](https://seleniumhq.github.io/selenium/docs/api/rb/)


## Automation Web
Java + Selenium + Cucumber + Junit

## Documentation of other frameworks used in the project

https://cucumber.io/docs/cucumber/

https://junit.org/junit4/

https://docs.oracle.com/en/java/

## Observation
 - Make sure you have Java 11 or higher installed on your machine
 - Install cucumber plugin in your IDE Ex: VS Code or IntelliJ

## Feature Purchase on the Saucedemo website

- To clone the application, follow the steps:

1 - git clone https://github.com/Pedro02650/Automation_SouceDemo.git

## How to run the project

Run Local:
mvn test -Dtest=TestRunner -Dplatform=local

Run in the pipeline: 
mvn test -Dtest=TestRunner -Dplatform=ci

Tests go to folder:
target/report-cucumber

