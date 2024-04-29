package org.automation.element_repository;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CartPage {
	@FindBy(name = "removefromcart")
	private WebElement removeFromCart;
	
	@FindBy(name = "updatecart")
	private WebElement updateCart;
	
	@FindBy(name = "continueshopping")
	private WebElement continueShopping;
	
	public CartPage(WebElement driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getRemoveFromCart() {
		return removeFromCart;
	}

	public void setRemoveFromCart(WebElement removeFromCart) {
		this.removeFromCart = removeFromCart;
	}

	public WebElement getUpdateCart() {
		return updateCart;
	}

	public void setUpdateCart(WebElement updateCart) {
		this.updateCart = updateCart;
	}

	public WebElement getContinueShopping() {
		return continueShopping;
	}

	public void setContinueShopping(WebElement continueShopping) {
		this.continueShopping = continueShopping;
	}


}
