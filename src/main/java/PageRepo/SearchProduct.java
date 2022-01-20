package PageRepo;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Basa.BaseClass;
import Basa.BaseClass;

public class SearchProduct extends BaseClass {
	
	
	
	public SearchProduct(){
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement Searchbox;

	public WebElement getSearchbox() {
		return Searchbox;
	}

	public void setSearchbox(WebElement searchbox) {
		Searchbox = searchbox;
	}

	public WebElement getSearchbutton() {
		return Searchbutton;
	}

	public void setSearchbutton(WebElement searchbutton) {
		Searchbutton = searchbutton;
	}

	public WebElement getPagination_2() {
		return Pagination_2;
	}

	public void setPagination_2(WebElement pagination_2) {
		Pagination_2 = pagination_2;
	}

	public List<WebElement> getIteams() {
		return Iteams;
	}

	public void setIteams(List<WebElement> iteams) {
		Iteams = iteams;
	}

	public WebElement getAddCart() {
		return AddCart;
	}

	public void setAddCart(WebElement addCart) {
		AddCart = addCart;
	}

	public WebElement getAddCartMsg() {
		return AddCartMsg;
	}

	public void setAddCartMsg(WebElement addCartMsg) {
		AddCartMsg = addCartMsg;
	}

	@FindBy(id="nav-search-submit-button")
	private WebElement Searchbutton;
	
	@FindBy(xpath="(//a[@class='s-pagination-item s-pagination-button'])[1]")
	private WebElement Pagination_2;
	
	
	@FindBy(xpath="//span[@class='a-size-medium a-color-base a-text-normal']")
	private List<WebElement> Iteams;
	
	@FindBy(id="add-to-cart-button")
	private WebElement AddCart;
	
	@FindBy(xpath="//span[@class='a-size-medium-plus a-color-base sw-atc-text a-text-bold']")
	private WebElement AddCartMsg;
	
	
	

}
