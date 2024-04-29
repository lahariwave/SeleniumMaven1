package org.automation.element_repository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FictionFXPage {
	@FindBy(id = "add-to-wishlist-button-78")
	private WebElement addToWishlist;

	public FictionFXPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddToWishlist() {
		return addToWishlist;
	}

	public void setAddToWishlist(WebElement addToWishlist) {
		this.addToWishlist = addToWishlist;
	}

}
