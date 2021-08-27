package WebDriver_Arch;

public class AppTestSwitchCase {

	public static void main(String[] args) {
		WebDriver driver = null;
		
		String browser = "chrome";
		switch (browser) {
		case "chrome":
			driver = new ChromeDriver();
			System.out.println(browser+" is launched - 200OK");
		case "firefox":
			driver = new FirefoxDriver();
			System.out.println(browser+" is launched");
		case "safari":
			driver = new SafariDriver();
			System.out.println(browser+" is launched");
		default:
			System.out.println(browser+" Not Found");
		}
		driver.get("http://www.gmail.com");
	
		String title = driver.getTitle();
		System.out.println(title);
		
		System.out.println(driver.getUrl());
		driver.click();
		driver.sendKeys("testa@gmail.com");
		driver.quit();
	}

}
