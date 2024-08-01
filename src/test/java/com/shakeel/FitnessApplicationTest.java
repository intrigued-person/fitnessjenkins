package com.shakeel;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class FitnessApplicationTest {

	WebDriver driver = new ChromeDriver();

	@Test
	void addProd() throws InterruptedException {
		driver.get("http://localhost:3000");
		driver.findElement(By.id("add-trn")).click();
		driver.findElement(By.id("add")).click();
		driver.findElement(By.name("name")).sendKeys("Shakeel");
		driver.findElement(By.name("age")).sendKeys("22");
		driver.findElement(By.name("city")).sendKeys("Madurai");
		driver.findElement(By.id("sub-btn")).submit();

	}

}
