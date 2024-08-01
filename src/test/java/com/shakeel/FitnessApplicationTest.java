package com.shakeel;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class FitnessApplicationTest {

	WebDriver driver = new ChromeDriver();

	@Test
	public void addProd() throws InterruptedException {
		driver.get("http://localhost:3000");
		driver.findElement(By.id("add-trn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("add")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("name")).sendKeys("Shakeel");
		Thread.sleep(2000);
		driver.findElement(By.name("age")).sendKeys("22");
		Thread.sleep(2000);
		driver.findElement(By.name("city")).sendKeys("Madurai");
		Thread.sleep(2000);
		driver.findElement(By.id("sub-btn")).submit();

	}

}
