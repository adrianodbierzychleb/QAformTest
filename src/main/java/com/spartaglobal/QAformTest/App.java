package com.spartaglobal.QAformTest;

import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adrian Odbierzychleb\\Downloads\\chromedriver.exe");
        ChromeDriver chromeDriver = new ChromeDriver();
        QaFromsPage qaFromsPage = new QaFromsPage(chromeDriver);
        qaFromsPage.goToHomePage();
        qaFromsPage.clickCookieButton();

        qaFromsPage.inputDatee("12/11/2019");
        System.out.println(qaFromsPage.getDateFieldText());
        qaFromsPage.clickButtonOne();
    }
}
