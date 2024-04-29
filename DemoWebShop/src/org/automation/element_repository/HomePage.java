package org.automation.element_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(className="ico-register")
	private WebElement registerLink;
	
	@FindBy(linkText="Log in")
	private WebElement loginLink;
	
	@FindBy(partialLinkText = "Log out")
	private WebElement logoutLink;
	
	@FindBy(xpath="//span[text()='Shopping cart']")
	private WebElement shoppingCartLink;
	
	@FindBy(xpath="//span[text()='Wishlist']")
	private WebElement wishListLink;
	
	@FindBy(partialLinkText = "Books")
	private WebElement booksLink;
	
	@FindBy(partialLinkText = "Digital downloads")
	private WebElement digitalDownloadLink;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getRegisterLink()
	{
		return registerLink;
	}
	
	public WebElement getLoginLink() {
		return loginLink;
	}

	public void setLoginLink(WebElement loginLink) {
		this.loginLink = loginLink;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}

	public void setLogoutLink(WebElement logoutLink) {
		this.logoutLink = logoutLink;
	}

	public WebElement getShoppingCartLink() {
		return shoppingCartLink;
	}

	public void setShoppingCartLink(WebElement shoppingCartLink) {
		this.shoppingCartLink = shoppingCartLink;
	}

	public WebElement getWishListLink() {
		return wishListLink;
	}

	public void setWishListLink(WebElement wishListLink) {
		this.wishListLink = wishListLink;
	}

	public WebElement getBooksLink() {
		return booksLink;
	}

	public void setBooksLink(WebElement booksLink) {
		this.booksLink = booksLink;
	}

	public WebElement getDigitalDownloadLink() {
		return digitalDownloadLink;
	}

	public void setDigitalDownloadLink(WebElement digitalDownloadLink) {
		this.digitalDownloadLink = digitalDownloadLink;
	}

	public void setRegisterLink(WebElement registerLink) {
		this.registerLink = registerLink;
	}}

