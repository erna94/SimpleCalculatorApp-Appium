package com.example.app.base;

import com.example.app.drivers.AndroidDriverInit;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePageObject {

  public AndroidDriver<AndroidElement> getDriver(){
    return AndroidDriverInit.driver;
  }

  public AndroidElement find(By by){
    return getDriver().findElement(by);
  }

  public void type(By by, String text){
    AndroidElement element = find(by);
    element.clear();
    element.sendKeys(text);
  }

  public void click(By by){
    find(by).click();
  }

  public String getText(By by){
    return find(by).getText();
  }

  public boolean isDisplayed(By by){
    return find(by).isDisplayed();
  }
  //tambahan
  public void longPress(By by) {
    AndroidElement element = find(by);
    TouchAction action = new TouchAction(getDriver());
    action.longPress(PointOption.point(element.getCenter())).release().perform();
  }

  public void doubleTap(By by) {
    TouchAction action = new TouchAction(getDriver());
    action.tap(TapOptions.tapOptions().withTapsCount(2)
            .withElement(ElementOption.element(find(by)))
    ).perform();
  }

  public void toast(By by) {
    WebDriverWait wait = new WebDriverWait(getDriver(), 30, 1000);
    wait.until(ExpectedConditions.presenceOfElementLocated(by));
  }


}
