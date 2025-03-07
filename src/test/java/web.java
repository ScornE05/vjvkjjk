import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class web {
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver d = new ChromeDriver();
        d.navigate().to("");
    }
}
