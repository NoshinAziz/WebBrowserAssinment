import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IzaanPage {


    public static void main(String[] args) throws InterruptedException{


        String chromeDriverPath = "/Users/noshinrahman/IdeaProjects/WebBrowserOperation/drivers/mac/chromedriver";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);

//        WebDriver chromeDriver= new ChromeDriver();
//        String url = "https://www.izaanschool.com/";
//        chromeDriver.get(url);
//         izaanSchoolApplyPage();
        izaanSchoolApplyPageDataInput();



    }

    public static void izaanSchoolApplyPage() throws InterruptedException{
        WebDriver chormeDrive= new ChromeDriver();
        chormeDrive.manage().window().maximize();
        String url= "https://www.izaanschool.com/apply";
        chormeDrive.get(url);
        chormeDrive.findElement(By.id("navbarLandings")).click();
        chormeDrive.navigate().back();
        chormeDrive.navigate().forward();
        chormeDrive.navigate().refresh();
        chormeDrive.close();


    }
    public static void izaanSchoolApplyPageDataInput() throws InterruptedException{
        WebDriver chromeDrive= new ChromeDriver();
        chromeDrive.manage().window().maximize();
        String url= "https://www.izaanschool.com/apply";
        chromeDrive.get(url);
        chromeDrive.findElement(By.id("firstname")).sendKeys("John");
        chromeDrive.findElement(By.id("name")).sendKeys("jack");
        chromeDrive.findElement(By.id("phone")).sendKeys("3470973219");
        chromeDrive.findElement(By.id("email")).sendKeys("mymail@gmail.com");
        WebElement countryDropdown = chromeDrive.findElement(By.xpath("/html/body/app-root/app-public-layout/app-application-form/div[3]/div/div/form/div/div[2]/div[2]/select"));
        Select dropdown= new Select(countryDropdown);
        dropdown.selectByIndex(2);
        chromeDrive.findElement(By.id("zipCode")).sendKeys("32456");
        chromeDrive.findElement(By.id("firstname")).clear();
        chromeDrive.close();



    }
    }

