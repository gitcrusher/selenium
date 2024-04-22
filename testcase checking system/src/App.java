
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "E:\\testing by JAVA\\testcase checking system\\src\\Drivers\\chromedriver.exe");
        WebDriver d = new ChromeDriver();
        d.get("https://www.linkedin.com/home");
        d.findElement(By.id("username")).sendKeys("aayushguptasoni@gmail.com");
        d.findElement(By.id("password")).sendKeys("Aayush@05");
        d.findElement(By.xpath("//*[@id=\"main-content\"]/section[1]/div/div/form/div[2]/button"));
        String url = d.getCurrentUrl();
        if (url.equals("https://www.linkedin.com/feed/")) {
            System.out.println("Test case passed");
        } else {
            System.out.println("Test case failed");
        }
        d.close();

    }
}
