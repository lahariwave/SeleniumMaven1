package org.automation.element_repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class DigitalDownloadsPage {
	@FindBy(xpath = "//input[@value='Add to cart']")
	private WebElement addToCart;
	
	public DigitalDownloadsPage(WebElement driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddToCart() {
		return addToCart;
	}

	public void setAddToCart(WebElement addToCart) {
		this.addToCart = addToCart;
	}


}
