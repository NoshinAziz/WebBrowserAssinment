import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

    public static void main(String[] args) {

        String directoryPath= System.getProperty("user.dir"); // /Users/noshinrahman/IdeaProjects/WebBrowserOperation

        String chromeDriverPath= directoryPath + "/drivers/mac/chromedriver";
        System.out.println(chromeDriverPath);



       System.setProperty("webdriver.chrome.driver",chromeDriverPath);


       WebDriver chromeDriver= new ChromeDriver();
       String url = "https://www.izaanschool.com/";
       chromeDriver.get(url);
       chromeDriver.close();


    }
}
