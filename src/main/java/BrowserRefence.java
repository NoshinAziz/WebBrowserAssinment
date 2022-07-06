import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BrowserRefence {

    public static void main(String[] args) {

        String os = "mac";
        WebDriver chromeDriver=null;



        String directPath = System.getProperty("user.dir"); ///Users/noshinrahman/IdeaProjects/WebBrowserOperation

        String chromeDriverPath;
       // System.out.println(chromeDriverPath);
        getChromeDriver(os, chromeDriver);


           // WebDriver chromeDriver = new ChromeDriver();
            String url = "https://www.izaanschool.com/";
            chromeDriver.get(url);
            chromeDriver.close();
            selectDropdownOptionByvalue(chromeDriver, "2");



    }

    public static void getChromeDriver(String os, WebDriver chromedriver){
        String chromeDriverPath;
        if (os.equalsIgnoreCase("mac")) {
            chromeDriverPath =  System.getProperty("user.dir")+ "/drivers/mac/chromedriver";
            System.setProperty("webdriver.chrome.driver", chromeDriverPath);

           WebDriver chromeDriver = new ChromeDriver();

        }

        else if (os.equalsIgnoreCase("windows")){
            chromeDriverPath = System.getProperty("user.dir") + "/drivers/window/chromedriver.exe";
            System.setProperty("webdriver.chrome.driver", chromeDriverPath);

            WebDriver chromeDriver = new ChromeDriver();

        }


    }

public static void uploadFile(WebDriver webDriver){

    /** Go to the upload page
     * 1. choose file
     * 2.Click upload
     * 3.verify upload succssed
     */
    //go the upload page
 webDriver.findElement(By.linkText("File Upload")).click();
    System.out.println("You are in Upload page ");
    //choose file
    webDriver.findElement(By.id("file-upload")).sendKeys();
    //click upload
    webDriver.findElement(By.id("file-submit")).click();
    // go to the tag named h3 and get the tag value. After upload tag value shall be "file uploaded"
   String actualMessage=  webDriver.findElement(By.tagName("h3")).getText(); //gettext methods can provided tag value of the elements
    System.out.println(actualMessage);











}

  public static void selectDropdownOptionByvalue(WebDriver webDriver, String value){
        webDriver.findElement(By.linkText("Dropdown")).click();
      System.out.println("dropdown page");
       WebElement element =  webDriver.findElement(By.id("dropdown"));
       Select select=new Select(element);
       select.selectByValue(value);


  }









}
