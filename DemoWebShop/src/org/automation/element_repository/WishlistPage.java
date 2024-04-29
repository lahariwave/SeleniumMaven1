package org.automation.element_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishlistPage {
		
		@FindBy(name = "removefromcart")
		private WebElement removeFromCart;
		
		@FindBy(name = "addtocart")
		private WebElement addToCart;
		
		@FindBy(name = "updatecart")
		private WebElement updateCart;
		
		@FindBy(name = "addtocartbutton")
		private WebElement addToCartButton;
		
		@FindBy(xpath = "//input[@value='Email a friend']")
		private WebElement emailFriend;
		
		public WishlistPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

		public WebElement getRemoveFromCart() {
			return removeFromCart;
		}

		public void setRemoveFromCart(WebElement removeFromCart) {
			this.removeFromCart = removeFromCart;
		}

		public WebElement getAddToCart() {
			return addToCart;
		}

		public void setAddToCart(WebElement addToCart) {
			this.addToCart = addToCart;
		}

		public WebElement getUpdateCart() {
			return updateCart;
		}

		public void setUpdateCart(WebElement updateCart) {
			this.updateCart = updateCart;
		}

		public WebElement getAddToCartButton() {
			return addToCartButton;
		}

		public void setAddToCartButton(WebElement addToCartButton) {
			this.addToCartButton = addToCartButton;
		}

		public WebElement getEmailFriend() {
			return emailFriend;
		}

		public void setEmailFriend(WebElement emailFriend) {
			this.emailFriend = emailFriend;
		}
	
}
