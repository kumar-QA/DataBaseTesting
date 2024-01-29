import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleCookies {

	public static void main(String[] args) {
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://github.com/");
		int count=driver.manage().getCookies().size();
		System.out.println(driver.manage().getCookieNamed("git"));
			System.out.println(count);
//			driver.manage().deleteAllCookies();
//			int count1=driver.manage().getCookies().size();
//			System.out.println(count1);
//			
	}

}
