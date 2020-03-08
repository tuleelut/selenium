package tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import org.hamcrest.Matchers.*;

import com.codeborne.selenide.testng.ScreenShooter;

import pages.LoginPage;
import pages.MainPage;

@Listeners({ ScreenShooter.class})
public class SearchTest {
		
	@Test
	void loginTest() {
		new LoginPage()
		.openPage()
		.enterUsername("vtmc.test1")
		.clickNext()
		.enterPassword("vtmc@vtmc.lt")
		.clickPasswordNext();		
	}
	
	@Test 
	void sendEmail() {
		new MainPage()
		.clickComposeEmail()
		.enterTo("test@test.lt")
		.enterBody("test")
		.clickSend();
	}
}
