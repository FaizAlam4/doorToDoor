package doorToDoor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class myFile {

  public static void main(String[] args) {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Faiz Alam\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	  
	    WebDriver driver = new ChromeDriver();

	    driver.get("https://www.trukky.com/door-to-door-goods-delivery");

	    try {
	      Thread.sleep(4000); 
	    } catch (InterruptedException e) {
	      e.printStackTrace();
	    }

	    driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/form/div/div[1]")).click();

	    WebElement fromInput = driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/form/div/div[1]/input"));
	    fromInput.sendKeys("Hyderabad");

	    driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/form/div/div[1]/div/ul/li[1]/div")).click();

	    driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/form/div/div[2]")).click();

	    WebElement toInput = driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/form/div/div[2]/input"));
	    toInput.sendKeys("New Delhi");

	    driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/form/div/div[2]/div/ul/li[1]/div")).click();

	    driver.findElement(By.xpath("/html/body/div[1]/div/main/div[1]/div/form/button")).click();

	    try {
	      Thread.sleep(5000);
	    } catch (InterruptedException e) {
	      e.printStackTrace();
	    }

	    driver.findElement(By.xpath("/html/body/div[1]/div/main/div/ul/li[2]/div/span[3]")).click();

	    try {
	      Thread.sleep(3000);
	    } catch (InterruptedException e) {
	      e.printStackTrace();
	    }

	    driver.findElement(By.xpath("/html/body/div[1]/div/main/div/ul/li[1]/div/span[3]")).click();

	    try {
	      Thread.sleep(2000);
	    } catch (InterruptedException e) {
	      e.printStackTrace(); 
	    }

	    driver.findElement(By.xpath("/html/body/div[1]/div/main/div[1]/div/div[1]")).click();

	    try {
	      Thread.sleep(3000);
	    } catch (InterruptedException e) {
	      e.printStackTrace();
	    }

	    driver.findElement(By.xpath("/html/body/div[1]/div/main/div[1]/div/div[2]/form/div[1]/div[2]/select")).click();

	    try {
	      Thread.sleep(5000);
	    } catch (InterruptedException e) {
	      e.printStackTrace();
	    }

	    driver.findElement(By.xpath("/html/body/div[1]/div/main/div[1]/div/div[2]/form/div[1]/div[2]/select/option[7]")).click();

	    try {
	      Thread.sleep(2000);
	    } catch (InterruptedException e) {
	      e.printStackTrace();
	    }

	    WebElement noOfItems = driver.findElement(By.xpath("/html/body/div[1]/div/main/div[1]/div/div[2]/form/div[2]/div/div[2]/input"));
	    noOfItems.sendKeys("2");

	    try {
	      Thread.sleep(3000);
	    } catch (InterruptedException e) {
	      e.printStackTrace();
	    }

	    driver.findElement(By.xpath("/html/body/div[1]/div/main/div[1]/div/div[2]/form/div[3]/button")).click();

	    try {
	      Thread.sleep(2000);
	    } catch (InterruptedException e) {
	      e.printStackTrace();
	    }

	    driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/button")).click();

	    try {
	      Thread.sleep(2000); 
	    } catch (InterruptedException e) {
	      e.printStackTrace();
	    }

	    for(int i=0; i<7; i++) {
	      driver.findElement(By.xpath("/html/body/div[1]/div/main/div[1]/div/div/div[1]/button[4]")).click();

	      try {
	        Thread.sleep(2000);
	      } catch (InterruptedException e) {
	        e.printStackTrace();
	      }
	    }

	    driver.findElement(By.xpath("/html/body/div[1]/div/main/div[1]/div/div/div[2]/div/div/div/div[2]/button[29]")).click();

	    try {
	      Thread.sleep(3000);
	    } catch (InterruptedException e) {
	      e.printStackTrace();
	    }

	    driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/button")).click();

	    try {
	      Thread.sleep(2000);
	    } catch (InterruptedException e) {
	      e.printStackTrace();
	    }

	    WebElement contact = driver.findElement(By.xpath("/html/body/div[1]/div/main/div[1]/form/div/input"));
	    contact.sendKeys("7987072308");

	    try {
	      Thread.sleep(2000);
	    } catch (InterruptedException e) {
	      e.printStackTrace();
	    }

	    driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/button")).click();


    }

}