package Utilites;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Basa.BaseClass;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SeleniumMethods extends BaseClass {

    public static void  SendData(WebElement web, String Data){
        web.sendKeys(Data);
    }

    public  static void ClickButton(WebElement Web1){

        Web1.click();

    }

    public static void ScrollDown(){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
    }

    public static void SwtichNextWin(int i){

       Set<String> currentWin =  driver.getWindowHandles();
        List<String> win = new LinkedList<String>();
        win.addAll(currentWin);
        driver.switchTo().window(win.get(i));
    }

    public static String GetElementText(WebElement e){

      String Text =  e.getText();

        return Text ;
    }


}
