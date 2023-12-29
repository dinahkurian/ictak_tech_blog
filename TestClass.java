package com.techblog.test;
import java.time.Duration;
import org.testng.annotations.Test;
import com.techblog.pages.HomePage;


public class TestClass extends TestBase {
	
	HomePage obj=null;
	
	@Test(priority=1)
	public void home()
	{
		obj=new HomePage(driver);
		obj.assertHome();
		System.out.println("Home page is present");
	}
	
	@Test(priority=2)
	public void cat() throws InterruptedException
	{		
		obj=new HomePage(driver);
		obj.category();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(priority=3)
	public void about() throws InterruptedException
	{
		obj=new HomePage(driver);
		obj.aboutUs();		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("ABOUT US is present");
	}
	
	@Test(priority=4)
	public void contact() throws InterruptedException
	{
		obj=new HomePage(driver);	
		obj.contactUs("Anu","anu@gmail.com","hello");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("CONTACT US is present");
	}
	
	@Test(priority=5)
	public void profile() throws InterruptedException
	{
		obj=new HomePage(driver);
		obj.profileOne();
		System.out.println("Login page is present");
		obj.profileTwo();
		System.out.println("Signup page is present");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//		String s= "Home";
//		Assert.assertEquals(s,driver.findElement(By.xpath("//body/app-root/app-home[@class='ng-star-inserted']/app-header/nav[@class='navbar navbar-expand-lg navbar-dark']/div[@class='container-fluid']/div[@id='navbarSupportedContent']/ul[@class='navbar-nav me-auto mb-2 mb-lg-0']/li[1]/a[1]")).getText());
//		obj.setUsername("standard_user");
//		obj.setPass("secret_sauce");
//		obj.clickLogin();
	}
	
//techblog


