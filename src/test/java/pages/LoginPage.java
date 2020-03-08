package pages;

import static com.codeborne.selenide.Selenide.*;

import org.openqa.selenium.By;

import com.codeborne.selenide.SelenideElement;

public class LoginPage {
	
	SelenideElement
		inputUsername=$(By.id("identifierId")),
		buttonNext=$(By.id("identifierNext")),
		inputPassword=$(By.name("password")),
	    buttonPasswordNext=$(By.id("passwordNext"));

	
	
	
	public LoginPage openPage() {
		return open("http://gmail.com/", LoginPage.class);
	}
	
	public LoginPage enterUsername(String query) {
		inputUsername.sendKeys(query);
		return this;
	}
	
	public LoginPage clickNext() {
		buttonNext.click();
		return this;
	}
	
	public LoginPage enterPassword(String query) {
		inputPassword.sendKeys(query);
		return this;
	}
	
	public LoginPage clickPasswordNext() {
		buttonPasswordNext.click();
		return this;
	}
}
