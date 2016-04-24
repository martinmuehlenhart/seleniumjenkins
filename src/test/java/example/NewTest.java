package example;        
 
import org.openqa.selenium.By;      
import org.openqa.selenium.WebDriver;       
import org.openqa.selenium.firefox.FirefoxDriver;       
import org.testng.Assert;       
import org.testng.annotations.Test; 
import org.testng.annotations.BeforeTest;   
import org.testng.annotations.AfterTest;        
public class NewTest { 
	
        private WebDriver driver;       
        @Test              
        public void testEasy() {   
        	
            driver.get("http://www.guru99.com/selenium-tutorial.html");  
           
            String title = driver.getTitle();                
            Assert.assertTrue(title.contains("Free Selenium Tutorials"));       
        }   
        @Test              
        public void testEasy1() {    
            driver.get("http://www.google.de");             
            String title = driver.getTitle();                
            Assert.assertTrue(title.contains("Google"));       
        } 
        @Test              
        public void testEasy2() {    
            driver.get("http://www.n-tv.de");  
            
            String title = driver.getTitle();                
            Assert.assertTrue(title.contains("Nachrichten, aktuelle Schlagzeilen und Videos - n-tv.de"));       
        } 
        @BeforeTest
        public void beforeTest() {  
            driver = new FirefoxDriver();  
        }       
        @AfterTest
        public void afterTest() {
            driver.quit();          
        }       
}   
