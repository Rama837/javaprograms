package rupeek.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SpiceJetTest {
//public static void main(String[] args) {
	@Test
	public void spiceJet() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://beta.spicejet.com/");
}
}
