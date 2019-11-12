package com.spartaglobal.QAformTest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


import javax.sound.midi.Soundbank;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.List;

public class QaFromsPage {



    private WebDriver driver;
    private String homePageURL = "https://www.toolsqa.com/automation-practice-form/";
    private By cookieButton = By.id("cookie_action_close_header");
    private By partialLink = By.linkText("Partial Link Text");
    private By firstName = By.name("firstname");
    private By lastName = By.id("lastname");
    private By sexElements = By.name("sex");
    private By experienceElements = By.name("exp");
    private By proffesionElements = By.name("profession");
    private By continentsElements = By.id("continents");
    private By toolsElements = By.name("tool");
    private By multipleContinentsElements = By.id("continentsmultiple");
    private By date = By.id("datepicker");

    private By button = By.name("sumbit");

    public QaFromsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goBack(){
        driver.navigate().back();
    }

    public void goToHomePage()
    {
        driver.navigate().to(homePageURL);
    }

    public void clickCookieButton(){
        driver.findElement(cookieButton).click();
    }

    public void clickLinkText(){
        driver.findElement(partialLink).click();
    }

    public String getCurrentLink()
    {
        return driver.getCurrentUrl();
    }

    public void inputFirstName(String firstNameInput){
        driver.findElement(firstName).sendKeys(firstNameInput);
    }
    public void inputLastName(String firstLastInput){
        driver.findElement(lastName).sendKeys(firstLastInput);
    }
    public void inputDatee(String dateInput){
        driver.findElement(date).sendKeys(dateInput);
    }

    public String getFirstNameFieldText(){
        return driver.findElement(firstName).getAttribute("value");

    }
    public String getLastNameFieldText(){
        return driver.findElement(lastName).getAttribute("value");
    }
    public String getDateFieldText(){
        return driver.findElement(date).getAttribute("value");
    }

    public void clickButtonOne()
    {
        List<WebElement> buttons = driver.findElements(button);
        for(WebElement but: buttons){
            driver.findElement(By.id(but.getAttribute("id"))).click();
            System.out.println(driver.findElement(By.id(but.getAttribute("id"))).getAttribute("value"));
        }
    }

    public void getSexElements(){

        List<WebElement> sexItems = driver.findElements(sexElements);
        System.out.println(sexItems.size());
        for (WebElement  sexItem : sexItems) {
            driver.findElement(By.id(sexItem.getAttribute("id"))).click();
            driver.findElement(By.id(sexItem.getAttribute("id"))).isSelected();
            System.out.println(driver.findElement(By.id(sexItem.getAttribute("id"))).getAttribute("value"));

        }
    }

    public void getExperienceElements(){
        List<WebElement> expElements = driver.findElements(experienceElements);
        for(WebElement expElemetn: expElements){
            driver.findElement(By.id(expElemetn.getAttribute("id"))).click();
            driver.findElement(By.id(expElemetn.getAttribute("id"))).isSelected();
            System.out.println(driver.findElement(By.id(expElemetn.getAttribute("id"))).getAttribute("value"));
        }
    }

    public void getProfessionElements(){
        List<WebElement> professions = driver.findElements(proffesionElements);
        for(WebElement profession: professions){
            driver.findElement(By.id(profession.getAttribute("id"))).click();
            driver.findElement(By.id(profession.getAttribute("id"))).isSelected();
            System.out.println(driver.findElement(By.id(profession.getAttribute("id"))).getAttribute("value"));
        }
    }
    public void getToolElements(){
        List<WebElement> tools = driver.findElements(toolsElements);
        for(WebElement tool: tools){
            driver.findElement(By.id(tool.getAttribute("id"))).click();
            driver.findElement(By.id(tool.getAttribute("id"))).isSelected();
            System.out.println(driver.findElement(By.id(tool.getAttribute("id"))).getAttribute("value"));
        }
    }



    public void getContinentsElements() {
        WebElement continents = driver.findElement(continentsElements);

        Select select = new Select(continents);
        for (int i = 0; i < select.getOptions().size(); i++) {
            select.selectByIndex(i);
            System.out.println(select.getFirstSelectedOption().getText());
            System.out.println(continents.getAttribute("value"));
        }
    }
//        for(WebElement continent: continents){
//            System.out.println(driver.findElement(By.id(continent.getAttribute("value"))));
//            List<WebElement> elemennts = driver.findElements(By.id(continent.getAttribute("id")));
//            for (WebElement ele :elemennts) {
//                System.out.println(driver.findElement(By.id(ele.getAttribute("id"))).getAttribute("value"));
//            }

//            driver.findElement(By.id(continent.getAttribute("id"))).click();
//            driver.findElement(By.id(continent.getAttribute("id"))).isSelected();
//            System.out.println(driver.findElement(By.id(continent.getAttribute("id"))).getAttribute("value"));

    public void getMultipleContinentsElements() {
        WebElement multipleContinents = driver.findElement(multipleContinentsElements);

        Select select = new Select(multipleContinents);
        for (int i = 0; i < select.getOptions().size(); i++) {
            select.selectByIndex(i);
            System.out.println(multipleContinents.getAttribute("value"));
        }
    }
}












