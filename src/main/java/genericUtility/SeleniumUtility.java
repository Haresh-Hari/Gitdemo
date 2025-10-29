package genericUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class SeleniumUtility {
	public void accessToApplication(WebDriver driver,String URl) {
		driver.get(URl);
	}
public void implicitWait(WebDriver driver,int time) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
}
public void maximize(WebDriver driver) {
	driver.manage().window().maximize();
}
//DropDown
public void selectdropDownByIndex( WebElement dropDown,int index ) {
	Select sl= new Select(dropDown);
	sl.selectByIndex(index);
}
public void selectdropDownByValue(WebElement dropDown,String value ) {
	Select sl= new Select(dropDown);
	sl.selectByValue(value);
}
public void selectdropDownByVisibleText(WebElement dropDown, String text) {
	Select sl= new Select(dropDown);
	sl.deselectByVisibleText(text);	
}
public void deSelectdropDownByVisibleText(WebElement dropDown, String text) {
	Select sl= new Select(dropDown);
	sl.deselectByVisibleText(text);	
	
	}
//Handling Alert
public void acceptAlert(WebDriver driver){
	driver.switchTo().alert().accept();	}
public void dismissAlert(WebDriver driver){
	driver.switchTo().alert().dismiss();	}
public  String getAlertMessage(WebDriver driver){
	return driver.switchTo().alert().getText();	}
public void sendMessage(WebDriver driver,String data){
	driver.switchTo().alert().sendKeys(data);;	}

//Mouse Actions
public void mouseHoveringAction(WebDriver driver,WebElement targetEle) {
	Actions act = new Actions(driver);
	act.moveToElement(targetEle).perform();
}
public void doubleClickAction(WebDriver driver,WebElement targetele) {
	Actions act = new Actions(driver);
	act.doubleClick(targetele).perform();
}
//Taking ScreenShot
public String captureWebpageScreenshot(WebDriver driver,String ScreenshotName ) throws IOException {
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File dest= new File(".//ScreenShot"+ScreenshotName+".png");
	Files.copy(src, dest);
	return dest.getAbsolutePath();///used for listeners
	
	
}

}
