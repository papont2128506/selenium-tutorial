package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");
        WebElement input = driver.findElement(By.xpath("//input[@aria-label=\"Найти\"]"));
//        WebElement input = driver.findElement(By.cssSelector());
//        WebElement input = driver.findElement(By.className()); //атрибут class
//        WebElement input = driver.findElement(By.id()); //атрибут id
//        WebElement input = driver.findElement(By.name()); //атрибут name
//        WebElement input = driver.findElement(By.linkText()); //Текст ссылки
//        WebElement input = driver.findElement(By.partialLinkText()); //часть текста ссылки
//        WebElement input = driver.findElement(By.tagName()); //атрибут tagname

        input.click();

        List<WebElement> elements = driver.findElements(By.xpath("//input[@aria-label=\"Найти\"]"));


    }
}