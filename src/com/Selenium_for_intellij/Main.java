package com.Selenium_for_intellij;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello");
        WebDriver obj = new ChromeDriver();
        obj.get("https://www.amazon.com");
        obj.manage().window().maximize();
    }
}
