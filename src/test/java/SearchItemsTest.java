import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class SearchItemsTest {

    WebDriver driver;

    /*Multi-line comment
     * */
    //Single line comment
    @Before
    public void openBrowser() {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.next.co.uk/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();

    }

    @After
    public void closeBrowser() {
        driver.quit();
    }

    @Test
    public void searchItemUsingProductName() {

        driver.findElement(By.id("sli_search_1")).sendKeys("Jeans");
    }

    @Test
    public void searchItemUsingBrandName() {

    }
}
