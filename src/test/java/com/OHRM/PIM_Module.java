package com.OHRM;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class PIM_Module {
WebDriver driver;
	
	@BeforeTest
	public void initialize() throws IOException {
		Properties prop = new Properties();
		   FileInputStream fis = null;
		   fis = new FileInputStream(PIM_Module.class.getProtectionDomain().getCodeSource().getLocation().getPath()+"locators.properties");
		   prop.load(fis);
		   prop.setProperty("browser", "chrome");
		   FileOutputStream fos = null;
		   fos = new FileOutputStream("C:\\Users\\ADMIN\\eclipse-workspace\\com.OHRM\\src\\test\\resources\\locators.properties");
		   prop.store(fos, null);
		   driver = WebDriverManager.chromedriver().create(); 
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		
	}
	
	@Test
	public void login() throws IOException {
		Properties prop = new Properties();
		   FileInputStream fis = null;
		   fis = new FileInputStream(PIM_Module.class.getProtectionDomain().getCodeSource().getLocation().getPath()+"locators.properties");
		   prop.load(fis);
		   prop.setProperty("browser", "chrome");
		   FileOutputStream fos = null;
		   fos = new FileOutputStream("C:\\Users\\ADMIN\\eclipse-workspace\\com.OHRM\\src\\test\\resources\\locators.properties");
		   prop.store(fos, null);
		   driver.get(prop.getProperty("url"));
		   try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath(prop.getProperty("username"))).sendKeys(prop.getProperty("Username_Value"));
		
		driver.findElement(By.xpath(prop.getProperty("password"))).sendKeys(prop.getProperty("Password_Value"));
		
		driver.findElement(By.xpath(prop.getProperty("login_click"))).click();
		
	}
	
	@Test
	public void TS_Two() throws IOException {
		   Properties prop = new Properties();
		   FileInputStream fis = null;
		   fis = new FileInputStream(PIM_Module.class.getProtectionDomain().getCodeSource().getLocation().getPath()+"locators.properties");
		   prop.load(fis);
		   prop.setProperty("browser", "chrome");
		   FileOutputStream fos = null;
		   fos = new FileOutputStream("C:\\Users\\ADMIN\\eclipse-workspace\\com.OHRM\\src\\test\\resources\\locators.properties");
		   prop.store(fos, null);
		   driver.get(prop.getProperty("url"));
		   
		   driver.findElement(By.xpath(prop.getProperty("username"))).sendKeys(prop.getProperty("Username_Value"));
			
			driver.findElement(By.xpath(prop.getProperty("password"))).sendKeys(prop.getProperty("Password_Value"));
			
			driver.findElement(By.xpath(prop.getProperty("login_click"))).click();
		
			driver.findElement(By.xpath(prop.getProperty("PIM_Menu"))).click();
		
	}
	
	@Test
	public void TS_Three() throws IOException {
		Properties prop = new Properties();
		   FileInputStream fis = null;
		   fis = new FileInputStream(PIM_Module.class.getProtectionDomain().getCodeSource().getLocation().getPath()+"locators.properties");
		   prop.load(fis);
		   prop.setProperty("browser", "chrome");
		   FileOutputStream fos = null;
		   fos = new FileOutputStream("C:\\Users\\ADMIN\\eclipse-workspace\\com.OHRM\\src\\test\\resources\\locators.properties");
		   prop.store(fos, null);
		   driver.get(prop.getProperty("url"));
		   
		   driver.findElement(By.xpath(prop.getProperty("username"))).sendKeys(prop.getProperty("Username_Value"));
			
			driver.findElement(By.xpath(prop.getProperty("password"))).sendKeys(prop.getProperty("Password_Value"));
		  
			driver.findElement(By.xpath(prop.getProperty("login_click"))).click();
			
		   driver.get(prop.getProperty("Emp_li_url"));
		
		driver.findElement(By.xpath(prop.getProperty("Emp_ID_Search"))).sendKeys(prop.getProperty("Emp_ID_Search_Value"));
		
		driver.findElement(By.cssSelector(prop.getProperty("Emp_ID_Search_Button"))).click();
	}
	
	@Test
	
	public void TS_Four() throws IOException {
		Properties prop = new Properties();
		   FileInputStream fis = null;
		   fis = new FileInputStream(PIM_Module.class.getProtectionDomain().getCodeSource().getLocation().getPath()+"locators.properties");
		   prop.load(fis);
		   prop.setProperty("browser", "chrome");
		   FileOutputStream fos = null;
		   fos = new FileOutputStream("C:\\Users\\ADMIN\\eclipse-workspace\\com.OHRM\\src\\test\\resources\\locators.properties");
		   prop.store(fos, null);
		   driver.get(prop.getProperty("url"));
		   
		   driver.findElement(By.xpath(prop.getProperty("username"))).sendKeys(prop.getProperty("Username_Value"));
			
			driver.findElement(By.xpath(prop.getProperty("password"))).sendKeys(prop.getProperty("Password_Value"));
		   
			driver.findElement(By.xpath(prop.getProperty("login_click"))).click();
			
		driver.get(prop.getProperty("Emp_Add_Url"));
		
		driver.findElement(By.xpath(prop.getProperty("Emp_Add_Fname"))).sendKeys(prop.getProperty("Emp_Add_Fname_Value"));
		
		driver.findElement(By.xpath(prop.getProperty("Emp_Add_Lname"))).sendKeys(prop.getProperty("Emp_Add_Lname_Value"));
		
		driver.findElement(By.xpath(prop.getProperty("Emp_Add_Id"))).sendKeys(prop.getProperty("Emp_Add_ID_Value"));
		
		driver.findElement(By.xpath(prop.getProperty("Emp_Add_Button"))).click();
		
		}
	
	@Test
	public void TS_Five() throws IOException {
		Properties prop = new Properties();
		   FileInputStream fis = null;
		   fis = new FileInputStream(PIM_Module.class.getProtectionDomain().getCodeSource().getLocation().getPath()+"locators.properties");
		   prop.load(fis);
		   prop.setProperty("browser", "chrome");
		   FileOutputStream fos = null;
		   fos = new FileOutputStream("C:\\Users\\ADMIN\\eclipse-workspace\\com.OHRM\\src\\test\\resources\\locators.properties");
		   prop.store(fos, null);
		   driver.get(prop.getProperty("url"));
		   
		   driver.findElement(By.xpath(prop.getProperty("username"))).sendKeys(prop.getProperty("Username_Value"));
			
			driver.findElement(By.xpath(prop.getProperty("password"))).sendKeys(prop.getProperty("Password_Value"));
		  
			driver.findElement(By.xpath(prop.getProperty("login_click"))).click();
		
		driver.get(prop.getProperty("Emp_Add_Url"));
		
		driver.findElement(By.xpath(prop.getProperty("Emp_Add_Id"))).sendKeys(prop.getProperty("Emp_Add_ID_Value_L"));
		
	}
	
	@Test
	public void TS_Six() throws InterruptedException, IOException {
		Properties prop = new Properties();
		   FileInputStream fis = null;
		   fis = new FileInputStream(PIM_Module.class.getProtectionDomain().getCodeSource().getLocation().getPath()+"locators.properties");
		   prop.load(fis);
		   prop.setProperty("browser", "chrome");
		   FileOutputStream fos = null;
		   fos = new FileOutputStream("C:\\Users\\ADMIN\\eclipse-workspace\\com.OHRM\\src\\test\\resources\\locators.properties");
		   prop.store(fos, null);
		   driver.get(prop.getProperty("url"));
		   
		   driver.findElement(By.xpath(prop.getProperty("username"))).sendKeys(prop.getProperty("Username_Value"));
			
			driver.findElement(By.xpath(prop.getProperty("password"))).sendKeys(prop.getProperty("Password_Value"));
		  
			driver.findElement(By.xpath(prop.getProperty("login_click"))).click();
		
		driver.get(prop.getProperty("View_Emp_Url"));
		
		
		driver.findElement(By.xpath(prop.getProperty("Emp_Delete_Checkbox"))).click();
		driver.findElement(By.xpath(prop.getProperty("Emp_Del_Icon"))).click();
		
		driver.findElement(By.xpath(prop.getProperty("Emp_Del_Btn"))).click();
		
		driver.findElement(By.xpath(prop.getProperty("Emp_Del_Final_Btn"))).click();
	    
	}
	
	
	@Test
	public void TS_Seven() throws IOException {
		Properties prop = new Properties();
		   FileInputStream fis = null;
		   fis = new FileInputStream(PIM_Module.class.getProtectionDomain().getCodeSource().getLocation().getPath()+"locators.properties");
		   prop.load(fis);
		   prop.setProperty("browser", "chrome");
		   FileOutputStream fos = null;
		   fos = new FileOutputStream("C:\\Users\\ADMIN\\eclipse-workspace\\com.OHRM\\src\\test\\resources\\locators.properties");
		   prop.store(fos, null);
		   driver.get(prop.getProperty("url"));
		 
		   driver.findElement(By.xpath(prop.getProperty("username"))).sendKeys(prop.getProperty("Username_Value"));
			
			driver.findElement(By.xpath(prop.getProperty("password"))).sendKeys(prop.getProperty("Password_Value"));
		   
			driver.findElement(By.xpath(prop.getProperty("login_click"))).click();
		
		driver.findElement(By.xpath(prop.getProperty("PIM_Menu"))).click();
		
		driver.findElement(By.xpath(prop.getProperty("Edit_Record_Checkbox"))).click();
		
		driver.findElement(By.xpath(prop.getProperty("Delete_Record_Icon"))).click();
	
		driver.findElement(By.xpath(prop.getProperty("Emp_Fname_Edit"))).sendKeys("Adi");
		
		driver.findElement(By.xpath(prop.getProperty("Emp_Edit_Save_Btn"))).click();
		
	}
	
	@Test
	
	public void TS_Eight() throws InterruptedException, AWTException, IOException{
		Properties prop = new Properties();
		   FileInputStream fis = null;
		   fis = new FileInputStream(PIM_Module.class.getProtectionDomain().getCodeSource().getLocation().getPath()+"locators.properties");
		   prop.load(fis);
		   prop.setProperty("browser", "chrome");
		   FileOutputStream fos = null;
		   fos = new FileOutputStream("C:\\Users\\ADMIN\\eclipse-workspace\\com.OHRM\\src\\test\\resources\\locators.properties");
		   prop.store(fos, null);
		   driver.get(prop.getProperty("url"));
		  
		   driver.findElement(By.xpath(prop.getProperty("username"))).sendKeys(prop.getProperty("Username_Value"));
			
			driver.findElement(By.xpath(prop.getProperty("password"))).sendKeys(prop.getProperty("Password_Value"));
		   
			driver.findElement(By.xpath(prop.getProperty("login_click"))).click();
		
		driver.findElement(By.xpath(prop.getProperty("PIM_Menu"))).click();
		
		driver.findElement(By.xpath(prop.getProperty("Config_Menu"))).click();  
		
		driver.findElement(By.linkText(prop.getProperty("Data_Impo_Opt"))).click();
		
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div/div[1]")).click();
		
		//File upload
		Robot robot = new Robot();
		robot.delay(2000);
		StringSelection  stringSelection = new StringSelection("C:\\Users\\ADMIN\\Desktop\\Automation Project\\Project 2\\importData.csv");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, stringSelection);
	     robot.setAutoDelay(2000);
	     robot.keyPress(KeyEvent.VK_CONTROL);
	     robot.keyPress(KeyEvent.VK_V);
	     
	     robot.keyRelease(KeyEvent.VK_CONTROL);
	     robot.keyRelease(KeyEvent.VK_V);
	     
	     robot.keyPress(KeyEvent.VK_ENTER);
	     robot.keyRelease(KeyEvent.VK_ENTER);
	     
	     driver.findElement(By.xpath(prop.getProperty("File_Upload_Save_Btn"))).click();
	     
	     
	}
	
	@Test
	
	public void TS_Nine() throws  IOException {
		Properties prop = new Properties();
		   FileInputStream fis = null;
		   fis = new FileInputStream(PIM_Module.class.getProtectionDomain().getCodeSource().getLocation().getPath()+"locators.properties");
		   prop.load(fis);
		   prop.setProperty("browser", "chrome");
		   FileOutputStream fos = null;
		   fos = new FileOutputStream("C:\\Users\\ADMIN\\eclipse-workspace\\com.OHRM\\src\\test\\resources\\locators.properties");
		   prop.store(fos, null);
		   driver.get(prop.getProperty("url"));
		  
		   driver.findElement(By.xpath(prop.getProperty("username"))).sendKeys(prop.getProperty("Username_Value"));
			
			driver.findElement(By.xpath(prop.getProperty("password"))).sendKeys(prop.getProperty("Password_Value"));
		   
			driver.findElement(By.xpath(prop.getProperty("login_click"))).click();
		
		driver.findElement(By.xpath(prop.getProperty("PIM_Menu"))).click();
		
		driver.findElement(By.xpath(prop.getProperty("Config_Menu"))).click();  
		
		driver.findElement(By.linkText(prop.getProperty("Reporting_Method_Menu"))).click();
		
		driver.findElement(By.xpath(prop.getProperty("Report_Add_Btn"))).click();
		
		driver.findElement(By.xpath(prop.getProperty("Report_Add_Input"))).sendKeys(prop.getProperty("Report_Add_Value"));
		
		driver.findElement(By.xpath(prop.getProperty("Report_Save_Btn"))).click();
		
		
	}
	
	@Test
	
	public void TS_Ten() throws InterruptedException, IOException {
		Properties prop = new Properties();
		   FileInputStream fis = null;
		   fis = new FileInputStream(PIM_Module.class.getProtectionDomain().getCodeSource().getLocation().getPath()+"locators.properties");
		   prop.load(fis);
		   prop.setProperty("browser", "chrome");
		   FileOutputStream fos = null;
		   fos = new FileOutputStream("C:\\Users\\ADMIN\\eclipse-workspace\\com.OHRM\\src\\test\\resources\\locators.properties");
		   prop.store(fos, null);
		   driver.get(prop.getProperty("url"));
		  
		   driver.findElement(By.xpath(prop.getProperty("username"))).sendKeys(prop.getProperty("Username_Value"));
			
			driver.findElement(By.xpath(prop.getProperty("password"))).sendKeys(prop.getProperty("Password_Value"));
		  
			driver.findElement(By.xpath(prop.getProperty("login_click"))).click();
		
		driver.findElement(By.xpath(prop.getProperty("PIM_Menu"))).click();
		
		driver.findElement(By.xpath(prop.getProperty("Config_Menu"))).click();  
		
		driver.findElement(By.linkText(prop.getProperty("Reporting_Method_Menu"))).click();
		
		driver.findElement(By.xpath(prop.getProperty("Reporting_Method_Checkbox"))).click();
		
		driver.findElement(By.xpath(prop.getProperty("Reporting_Method_Btn"))).click();
		
		driver.findElement(By.xpath(prop.getProperty("Reporting_Method_Del_Icon"))).click();
		
		driver.findElement(By.xpath(prop.getProperty("Reporting_Method_Del_Btn"))).click();
		
		
		
	}
	
	@Test
	public void TS_Eleven() throws InterruptedException, IOException {
		Properties prop = new Properties();
		   FileInputStream fis = null;
		   fis = new FileInputStream(PIM_Module.class.getProtectionDomain().getCodeSource().getLocation().getPath()+"locators.properties");
		   prop.load(fis);
		   prop.setProperty("browser", "chrome");
		   FileOutputStream fos = null;
		   fos = new FileOutputStream("C:\\Users\\ADMIN\\eclipse-workspace\\com.OHRM\\src\\test\\resources\\locators.properties");
		   prop.store(fos, null);
		   driver.get(prop.getProperty("url"));
		   
		   driver.findElement(By.xpath(prop.getProperty("username"))).sendKeys(prop.getProperty("Username_Value"));
			
			driver.findElement(By.xpath(prop.getProperty("password"))).sendKeys(prop.getProperty("Password_Value"));
		   
			driver.findElement(By.xpath(prop.getProperty("login_click"))).click();
		
		driver.findElement(By.xpath(prop.getProperty("PIM_Menu"))).click();
		
		driver.findElement(By.xpath(prop.getProperty("Config_Menu"))).click();  
		
		driver.findElement(By.linkText(prop.getProperty("Reporting_Method_Menu"))).click();
		
		driver.findElement(By.xpath(prop.getProperty("Reporting_Method_Checkbox"))).click();
		
		driver.findElement(By.xpath(prop.getProperty("Reporting_Method_Edit_Icon"))).click();
		
		driver.findElement(By.xpath(prop.getProperty("Reporting_Method_Edit"))).sendKeys("New");
		
		driver.findElement(By.xpath(prop.getProperty("Reporting_Method_Save_Btn"))).click();
		
		
		
	}
	
	@Test
	public void TS_Twelve() throws InterruptedException, IOException {
		Properties prop = new Properties();
		   FileInputStream fis = null;
		   fis = new FileInputStream(PIM_Module.class.getProtectionDomain().getCodeSource().getLocation().getPath()+"locators.properties");
		   prop.load(fis);
		   prop.setProperty("browser", "chrome");
		   FileOutputStream fos = null;
		   fos = new FileOutputStream("C:\\Users\\ADMIN\\eclipse-workspace\\com.OHRM\\src\\test\\resources\\locators.properties");
		   prop.store(fos, null);
		   driver.get(prop.getProperty("url"));
		   
		   driver.findElement(By.xpath(prop.getProperty("username"))).sendKeys(prop.getProperty("Username_Value"));
			
			driver.findElement(By.xpath(prop.getProperty("password"))).sendKeys(prop.getProperty("Password_Value"));
		   
			driver.findElement(By.xpath(prop.getProperty("login_click"))).click();
		
		driver.findElement(By.xpath(prop.getProperty("PIM_Menu"))).click();
		
		driver.findElement(By.xpath(prop.getProperty("Config_Menu"))).click();  
		
		driver.findElement(By.linkText(prop.getProperty("Termination_Menu"))).click();
		
		driver.findElement(By.xpath(prop.getProperty("Termi_Add_Button"))).click();
		
		driver.findElement(By.xpath(prop.getProperty("Termi_Input_Value"))).sendKeys("Self Resigned");
		
		driver.findElement(By.xpath(prop.getProperty("Termi_Add_Save_Btn"))).click();
		
		
		
	}
	
	@Test
	
	public void TS_Thirteen() throws InterruptedException, IOException {
		Properties prop = new Properties();
		   FileInputStream fis = null;
		   fis = new FileInputStream(PIM_Module.class.getProtectionDomain().getCodeSource().getLocation().getPath()+"locators.properties");
		   prop.load(fis);
		   prop.setProperty("browser", "chrome");
		   FileOutputStream fos = null;
		   fos = new FileOutputStream("C:\\Users\\ADMIN\\eclipse-workspace\\com.OHRM\\src\\test\\resources\\locators.properties");
		   prop.store(fos, null);
		   driver.get(prop.getProperty("url"));
		   
		   driver.findElement(By.xpath(prop.getProperty("username"))).sendKeys(prop.getProperty("Username_Value"));
			
			driver.findElement(By.xpath(prop.getProperty("password"))).sendKeys(prop.getProperty("Password_Value"));
		   
			driver.findElement(By.xpath(prop.getProperty("login_click"))).click();
		
		driver.findElement(By.xpath(prop.getProperty("PIM_Menu"))).click();
		
		driver.findElement(By.xpath(prop.getProperty("Config_Menu"))).click();  
		
		driver.findElement(By.linkText(prop.getProperty("Termination_Menu"))).click();
		
		
		driver.findElement(By.xpath(prop.getProperty("Termi_Checkbox"))).click();
	
		driver.findElement(By.xpath(prop.getProperty("Termi_Del_Btn"))).click();
		
		
	}
	
	@Test
	public void TS_Fourteen() throws InterruptedException, IOException {
		Properties prop = new Properties();
		   FileInputStream fis = null;
		   fis = new FileInputStream(PIM_Module.class.getProtectionDomain().getCodeSource().getLocation().getPath()+"locators.properties");
		   prop.load(fis);
		   prop.setProperty("browser", "chrome");
		   FileOutputStream fos = null;
		   fos = new FileOutputStream("C:\\Users\\ADMIN\\eclipse-workspace\\com.OHRM\\src\\test\\resources\\locators.properties");
		   prop.store(fos, null);
		   driver.get(prop.getProperty("url"));
		   
		   driver.findElement(By.xpath(prop.getProperty("username"))).sendKeys(prop.getProperty("Username_Value"));
			
			driver.findElement(By.xpath(prop.getProperty("password"))).sendKeys(prop.getProperty("Password_Value"));
		  
			driver.findElement(By.xpath(prop.getProperty("login_click"))).click();
		
		driver.findElement(By.xpath(prop.getProperty("PIM_Menu"))).click();
		
		driver.findElement(By.xpath(prop.getProperty("Config_Menu"))).click();  
		
		driver.findElement(By.linkText(prop.getProperty("Termination_Menu"))).click();
		
		driver.findElement(By.xpath(prop.getProperty("Termi_Edit_checkbox"))).click();
		
		driver.findElement(By.xpath(prop.getProperty("Termi_Edit_Btn"))).click();
		
		driver.findElement(By.xpath(prop.getProperty("Termi_Input_Value"))).sendKeys("Resign");
		
		driver.findElement(By.xpath(prop.getProperty("Termi_Edit_Save_Btn"))).click();
		
	}
	
	@Test
	public void TS_Fifteen() throws IOException {
		try {
			Properties prop = new Properties();
			   FileInputStream fis = null;
			   fis = new FileInputStream(PIM_Module.class.getProtectionDomain().getCodeSource().getLocation().getPath()+"locators.properties");
			   prop.load(fis);
			   prop.setProperty("browser", "chrome");
			   FileOutputStream fos = null;
			   fos = new FileOutputStream("C:\\Users\\ADMIN\\eclipse-workspace\\com.OHRM\\src\\test\\resources\\locators.properties");
			   prop.store(fos, null);
			   driver.get(prop.getProperty("url"));
			   
			   driver.findElement(By.xpath(prop.getProperty("username"))).sendKeys(prop.getProperty("Username_Value"));
				
				driver.findElement(By.xpath(prop.getProperty("password"))).sendKeys(prop.getProperty("Password_Value"));
			   
				driver.findElement(By.xpath(prop.getProperty("login_click"))).click();
			
			driver.findElement(By.xpath(prop.getProperty("PIM_Menu"))).click();
			
		driver.findElement(By.linkText(prop.getProperty("Reports_Menu"))).click();
		
		driver.findElement(By.xpath(prop.getProperty("Report_Add_Btn"))).click();
		
		driver.findElement(By.xpath(prop.getProperty("Report_Add_Value"))).sendKeys("Annual");
		
		driver.findElement(By.xpath(prop.getProperty("Report_Save_Btn"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div[1]/div[2]/div/div/div[2]")).click();
		Thread.sleep(3000);
		List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div[1]/div[2]/div"));
		 Iterator<WebElement> iterator = list.iterator();
		 while (iterator.hasNext()) {
			WebElement webElement = (WebElement) iterator.next();
			System.out.println(webElement.getText());
			if(webElement.getText().equals("Employee Name")) {
				webElement.click();
			}
		}
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
		driver.findElement(By.xpath("(//button[normalize-space()='Save'])[1]")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	@Test
	public void TS_Sixteen() throws IOException {
		Properties prop = new Properties();
		   FileInputStream fis = null;
		   fis = new FileInputStream(PIM_Module.class.getProtectionDomain().getCodeSource().getLocation().getPath()+"locators.properties");
		   prop.load(fis);
		   prop.setProperty("browser", "chrome");
		   FileOutputStream fos = null;
		   fos = new FileOutputStream("C:\\Users\\ADMIN\\eclipse-workspace\\com.OHRM\\src\\test\\resources\\locators.properties");
		   prop.store(fos, null);
		   driver.get(prop.getProperty("url"));
		  
		   driver.findElement(By.xpath(prop.getProperty("username"))).sendKeys(prop.getProperty("Username_Value"));
			
			driver.findElement(By.xpath(prop.getProperty("password"))).sendKeys(prop.getProperty("Password_Value"));
		   
			driver.findElement(By.xpath(prop.getProperty("login_click"))).click();
	
		driver.findElement(By.xpath(prop.getProperty("PIM_Menu"))).click();
		
	driver.findElement(By.linkText(prop.getProperty("Reports_Menu"))).click();
	
		driver.findElement(By.xpath(prop.getProperty("Report_Checkbox"))).click();
		
		driver.findElement(By.xpath(prop.getProperty("Report_Delete_Icon"))).click();
		
		driver.findElement(By.xpath(prop.getProperty("Report_Del_Btn"))).click();
		
	}
	
	@Test
	public void TS_Seventeen() throws IOException {
		Properties prop = new Properties();
		   FileInputStream fis = null;
		   fis = new FileInputStream(PIM_Module.class.getProtectionDomain().getCodeSource().getLocation().getPath()+"locators.properties");
		   prop.load(fis);
		   prop.setProperty("browser", "chrome");
		   FileOutputStream fos = null;
		   fos = new FileOutputStream("C:\\Users\\ADMIN\\eclipse-workspace\\com.OHRM\\src\\test\\resources\\locators.properties");
		   prop.store(fos, null);
		   driver.get(prop.getProperty("url"));
		 
		   driver.findElement(By.xpath(prop.getProperty("username"))).sendKeys(prop.getProperty("Username_Value"));
			
			driver.findElement(By.xpath(prop.getProperty("password"))).sendKeys(prop.getProperty("Password_Value"));
		   
			driver.findElement(By.xpath(prop.getProperty("login_click"))).click();
		
		driver.findElement(By.xpath(prop.getProperty("PIM_Menu"))).click();
	
	driver.findElement(By.linkText(prop.getProperty("Reports_Menu"))).click();
	
		driver.findElement(By.xpath(prop.getProperty("Report_Checkbox"))).click();
		
		driver.findElement(By.xpath(prop.getProperty("Report_Edit_Btn"))).click();
		
		driver.findElement(By.xpath(prop.getProperty("Report_Input_Value"))).sendKeys("HR Report");
		
		driver.findElement(By.xpath(prop.getProperty("Report_Save_Btn"))).click();
		
		
	}

}
