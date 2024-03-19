# SeleniumTask
This project contains automated tests for the registration flow of Almatar.com using Selenium WebDriver.
## Table of Contents
- [Introduction](#introduction)
- [Language](#language)
- [Tools and Libraries](#tools-and-libraries)
- [Testing Approach](#testing-approach)
- [Dependencies](#Dependencies)
  
## Introduction

This Selenium project aims to automate the happy scenario of registration process on Almatar.com to ensure a smooth user experience and catch any potential bugs or issues.

## Language

The project is developed using Java.

## Tools and Libraries

- [Selenium WebDriver](https://www.selenium.dev/documentation/en/webdriver/)
- [TestNG](https://testng.org/doc/)
- [Maven](https://maven.apache.org/)
- [ChromeDriver](https://chromedriver.chromium.org/)

## Testing Approach
This project follows the Page Object Model (POM) approach for organizing and maintaining Selenium tests. POM promotes code reusability, readability, and maintainability by separating web page functionality into separate classes.

## Dependencies

    <dependencies>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.13.2</version>
        </dependency>
        <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>4.3.0</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/org.eclipse.jetty/jetty-server -->
        <dependency>
            <groupId>org.eclipse.jetty</groupId>
            <artifactId>jetty-server</artifactId>
            <version>11.0.7</version>
        </dependency>
