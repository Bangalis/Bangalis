import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Created by mdrahman on 10/19/21.
 * Spring 2018
 */


public class DriverWrapper {

    private static WebDriver driver = null;
    private static String website = null;


    /*public static void main(String[] args) {
//        Users/mdrahman/Downloads/Selenium/Chrome
//        /Users/mdrahman/Downloads/Selenium/Chrome/chromedriver
        System.setProperty("webdriver.chrome.driver", "/Users/mdrahman/Downloads/Selenium/Chrome/chromedriver");

        for (int i=1; i<=10; i =i+1) {
            driver = new ChromeDriver();
            website = "https://www.bangalis.com";
            driver.get(website);
            driver.navigate().to(website);

            driver.close();

            System.out.println(i);

        }

    }*/

    @Test
    public void chrome() {

        System.setProperty("webdriver.chrome.driver", "/Users/mdrahman/Downloads/Selenium/Chrome/chromedriver");

        for (int i = 1; i <= 30; i = i + 1) {
            driver = new ChromeDriver();
            website = "https://www.bangalis.com";
            driver.get(website);
            driver.navigate().to(website);

            driver.close();

            System.out.println(i);

        }

    }

    @Test
    public void chrome2() {
//        Users/mdrahman/Downloads/Selenium/Chrome
//        /Users/mdrahman/Downloads/Selenium/Chrome/chromedriver
        System.setProperty("webdriver.chrome.driver", "/Users/mdrahman/Downloads/Selenium/Chrome/chromedriver");

        for (int i = 1; i <= 30; i = i + 1) {
            driver = new ChromeDriver();
            website = "https://www.bangalis.com";
            driver.get(website);
            driver.navigate().to(website);

            driver.close();

            System.out.println(i);

        }

    }

}
