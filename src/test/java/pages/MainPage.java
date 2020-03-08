package pages;

import static com.codeborne.selenide.Selenide.$;

import org.openqa.selenium.By;

import com.codeborne.selenide.SelenideElement;

public class MainPage {
	SelenideElement
	buttonCompose=$("div[gh='cm"),
	inputTo=$("textarea[name='to']"),
	inputBody=$("div[aria-label='Message Body'"),
	buttonSend=$("div[aria-label*='(Ctrl-Enter)']");
	
	
	public MainPage clickComposeEmail() {
		buttonCompose.click();
		return this;
	}
	
	public MainPage enterTo(String to) {
		inputTo.sendKeys(to);
		return this;
	}
	
	public MainPage enterBody(String body) {
		inputBody.sendKeys(body);
		return this;
	}
	
	public MainPage clickSend() {
		buttonSend.click();
		return this;
	}
	
}
