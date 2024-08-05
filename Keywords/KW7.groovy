
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.annotation.Keyword
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory

class KW7 {
    @Keyword
    def clickElementByText(String tagName, String text) {
        WebDriver driver = DriverFactory.getWebDriver()
        driver.findElement(By.xpath("//${tagName}[text()='${text}']")).click()
    }
}