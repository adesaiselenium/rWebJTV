package com.jtv.basics;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;


public class JTVbasics {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, IOException {
		
		//Adding Extension to Chrome Allow Control Allow Origin 

				/*ChromeOptions co = new ChromeOptions();
				co.addExtensions(new File ("/Users/AshwiniDesai/Desktop/Selenium/Allow-Control-Allow-Origin_-__v1.0.3.crx"));
				DesiredCapabilities dc = DesiredCapabilities.chrome();
				dc.setCapability(co.CAPABILITY,co);*/
		        System.setProperty ("webdriver.chrome.driver","/Users/AshwiniDesai/Desktop/Selenium/Drivers/chromedriver");
				
				ChromeOptions co = new ChromeOptions();
				co.addExtensions(new File("/Users/AshwiniDesai/Desktop/Selenium/Allow-Control-Allow-Origin_-__v1.0.3.crx"));
				DesiredCapabilities dc = new DesiredCapabilities();
				dc.setCapability(ChromeOptions.CAPABILITY, co);
				ChromeDriver d2 = new ChromeDriver(dc);
				
				
				d2.get("https://172.24.64.16:8443/gemvault-collection/api/articleTypes/activeArticleTypes");

				//Open new Tab

				/*Actions act = new Actions(d2);
				act.keyDown(Keys.COMMAND).sendKeys("t").keyUp(Keys.COMMAND).build().perform(); // Open new tab
	
		       	ArrayList<String> tabs = new ArrayList<String> (d2.getWindowHandles()); 
		     	d2.switchTo().window(tabs.get(1)); 
			
				String selectLinkOpeninNewTab = Keys.chord(Keys.COMMAND,Keys.RETURN); 
				d2.findElement(By.linkText("http://34.203.242.232/jtv4/#!/discover")).sendKeys(selectLinkOpeninNewTab);
				*/
		        
		        System.out.println("Testing");
		       
		        d2.get("http://34.203.242.232/jtv3/#!/discover");
		        d2.findElement(By.className("myCollMenuLabel")).click();
				d2.switchTo().activeElement();
			    Thread.sleep(9000);

				// To enter the username/password
				d2.findElement(By.xpath("//*[@id=\"loginPopup\"]/div/div/div[2]/div/div[2]/form/div[1]/input")).sendKeys("cust-7233353@jtv.com");
				d2.findElement(By.xpath("//*[@id=\"loginPopup\"]/div/div/div[2]/div/div[2]/form/div[2]/div/input")).sendKeys("P@ssw0rd");
				d2.findElement(By.xpath("//*[@id=\"loginPopup\"]/div/div/div[2]/div/div[2]/form/div[4]/button")).click();
				
			    Thread.sleep(9000);
		        Thread.sleep(9000);
		        
				
				//To click on coachmark
				d2.findElement(By.xpath("//*[@id=\"btnCoachMarkNext\"]")).click();		

				d2.findElement(By.xpath("//*[@id=\"btnCoachMarkOk\"]")).click();
		        Thread.sleep(9000);

				//To click on the create collection icon
				d2.findElement(By.xpath("//*[@id=\"collection-landing\"]/div[1]/div/span[1]/span")).click();
		        Thread.sleep(9000);

		       
		        d2.findElement(By.xpath("/html/body/div[1]/section/div[1]/div[1]/div[1]/div[1]/label")).click();
		        
		        //To add a image to collection
		        Thread.sleep(5000);
		        
				Runtime.getRuntime().exec("osascript " + "/Users/AshwiniDesai/Desktop/Attachment.scpt");
				Thread.sleep(9000);
				d2.findElement(By.xpath("/html/body/div[1]/section/div[1]/div[1]/div[2]/input")).sendKeys("collectionNew");
				Thread.sleep(9000);

				d2.findElement(By.id("createNewCollectionSave")).click();
				Thread.sleep(9000);
		
				//Click on the collection created and add a gemstone
				d2.findElement(By.xpath("//*[@id=\"customCollectionCont\"]/div[1]")).click();
				Thread.sleep(9000);

				d2.findElement(By.xpath("/html/body/div[1]/section/div[2]/div[2]/div/div[3]/button")).click();
				Thread.sleep(9000);
			
				d2.findElement(By.xpath("//*[@id=\"addItemsModal\"]/div/div/div[2]/div/div/div[5]/div[1]/div[2]/div[2]/div[2]/div")).click();
				Thread.sleep(9000);
				
				d2.findElement(By.xpath("//*[@id=\"addItemsBtn\"]/span")).click();
				Thread.sleep(9000);
			
				System.out.println("adding gems successful");
				
				//To remove the added gemstone for the same collection
				
				d2. findElement(By.xpath("//*[@id=\"collectionDetailRemove\"]")).click();
				Thread.sleep(9000);
				Thread.sleep(9000);

				d2.findElement(By.xpath("//*[@id=\"removeItemsModal\"]/div/div/div[2]/div/div/div/div/div[2]/div[2]/div")).click();
				Thread.sleep(9000);

				d2.findElement(By.xpath("//*[@id=\"removeItemsBtn\"]/span")).click();
				Thread.sleep(9000);

				System.out.println("removing gems successfully");
				d2.findElement(By.xpath("//*[@id=\"confirmRemoveGems\"]")).click();
				Thread.sleep(9000);

				
				//To delete the created collection.
				d2.findElement(By.xpath("//*[@id=\"collectionDetailEdit\"]")).click();
				Thread.sleep(9000);
				d2.findElement(By.xpath("//*[@id=\"editCollectionDeleteButton\"]")).click();
				Thread.sleep(3000);
				d2.findElement(By.xpath("//*[@id=\"confirmDelete\"]/div/div/div[2]/div/button[1]")).click();
				
				System.out.println("collection deleted successful");

		        
		        
	}
}
