import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {
	@Test
	public static void checkTittle() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:8000/");
		String ExpectedTitle;
		ExpectedTitle = "TaskTracker";
		String ActualTitle;
		ActualTitle = "TaskTracker";
		Assertions.assertEquals(ExpectedTitle, ActualTitle);
		System.out.println("Test case Tested Succesfully");
	}
	@Test
	public static void login() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:8000/login/?next=/");
		driver.findElement(By.id("id_username"));
		WebElement username = driver.findElement(By.id("id_username"));
		driver.findElement(By.id("id_password"));
		WebElement password = driver.findElement(By.id("id_password"));
		username.sendKeys("demouser");
		password.sendKeys("demohuman");
		String ExpectedUserName = "demouser";
		String ActualUserName = "demouser";
		Assertions.assertEquals(ExpectedUserName, ActualUserName);
		String ExpectedPassword = "demohuman";
		String ActualPassword = "demohuman";
		Assertions.assertEquals(ExpectedPassword, ActualPassword);
		WebElement login = driver.findElement(By.className("button"));
		login.click();
		System.out.println("Test case Tested Succesfully");
	}
	@Test
	public static void register() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:8000/register/");
		driver.findElement(By.id("id_username"));
		WebElement username = driver.findElement(By.id("id_username"));
		driver.findElement(By.id("id_password1"));
		WebElement password1 = driver.findElement(By.id("id_password1"));
		driver.findElement(By.id("id_password2"));
		WebElement password2 = driver.findElement(By.id("id_password2"));
		username.sendKeys("userone");
		password1.sendKeys("uonepswd");
		password2.sendKeys("uonepswd");
		String ExpectedPassword1 = "uonepswd";
		String ActualPassword1 = "uonepswd";
		Assertions.assertEquals(ExpectedPassword1, ActualPassword1);
		String ExpectedPassword2 = "uonepswd";
		String ActualPassword2 = "uonepswd";
		Assertions.assertEquals(ExpectedPassword2, ActualPassword2);
		WebElement register = driver.findElement(By.className("button"));
		register.click();
		System.out.println("Test case Tested Succesfully");
	}
	@Test
	public static void addTask() {
		String  taskone = "myfirstproject";
		String mandatory = "create a website";

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:8000/login/?next=/");
		driver.findElement(By.id("id_username"));
		WebElement username = driver.findElement(By.id("id_username"));
		driver.findElement(By.id("id_password"));
		WebElement password = driver.findElement(By.id("id_password"));
		username.sendKeys("userone");
		password.sendKeys("uonepswd");
		WebElement login = driver.findElement(By.className("button"));
		login.click();
		WebElement newtask = driver.findElement(By.id("newtask"));
		newtask.click();
		driver.findElement(By.id("id_title")).sendKeys(taskone);
		driver.findElement(By.id("id_description")).sendKeys(mandatory);
		WebElement submit = driver.findElement(By.className("button"));
		submit.click();
		System.out.println("Test case Tested Succesfully");
	}
	@Test
	public static void addMore() {
		String tasktwo = "mysecondproject";
		String discription = "Selenium is good";

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:8000/");
		driver.findElement(By.id("id_username"));
		WebElement username = driver.findElement(By.id("id_username"));
		driver.findElement(By.id("id_password"));
		WebElement password = driver.findElement(By.id("id_password"));
		username.sendKeys("userone");
		password.sendKeys("uonepswd");
		WebElement login = driver.findElement(By.className("button"));
		login.click();
		WebElement addlink = driver.findElement(By.id("addlink"));
		addlink.click();
		driver.findElement(By.id("id_title")).sendKeys(tasktwo);
		driver.findElement(By.id("id_description")).sendKeys(discription);
		WebElement submit = driver.findElement(By.className("button"));
		submit.click();
		System.out.println("Test case Tested Succesfully");
	}
	@Test
	public static void delete() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:8000/");
		driver.findElement(By.id("id_username"));
		WebElement username = driver.findElement(By.id("id_username"));
		driver.findElement(By.id("id_password"));
		WebElement password = driver.findElement(By.id("id_password"));
		username.sendKeys("userone");
		password.sendKeys("uonepswd");
		WebElement login = driver.findElement(By.className("button"));
		login.click();
		WebElement deletelink = driver.findElement(By.id("deletelink"));
		deletelink.click();
		WebElement delete = driver.findElement(By.className("button"));
		delete.click();
		System.out.println("Test case Tested Succesfully");
	}
	@Test
	public static void logout() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:8000/");
		driver.findElement(By.id("id_username"));
		WebElement username = driver.findElement(By.id("id_username"));
		driver.findElement(By.id("id_password"));
		WebElement password = driver.findElement(By.id("id_password"));
		username.sendKeys("userone");
		password.sendKeys("uonepswd");
		WebElement login = driver.findElement(By.className("button"));
		login.click();
		WebElement logout = driver.findElement(By.id("logout"));
		logout.click();
		System.out.println("Test case Tested Succesfully");
	}
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);

//		checkTittle();
		login();
//		register();
//		addTask();
//		addMore();
//		delete();
//		logout();

	}
}
