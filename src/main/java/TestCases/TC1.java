package TestCases;

import PageRepo.SearchProduct;
import Utilites.SeleniumMethods;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Basa.BaseClass;

import java.util.concurrent.TimeUnit;

public class TC1 extends BaseClass {

		public String ProductIteam ="Alexa";
		public int thirdIteam =2;
		public String ActualMsg ="Added to Cart";
		public SeleniumMethods sm = new SeleniumMethods();
	
	@Test
	public void Tc1(){
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		SearchProduct sp = new SearchProduct();

		sm.SendData(sp.getSearchbox(),ProductIteam);

		sm.ClickButton(sp.getSearchbutton());

		sm.ScrollDown();

		sm.ClickButton(sp.getPagination_2());

		WebElement ProductItem = sp.getIteams().get(thirdIteam);

		sm.ClickButton(ProductItem);

		sm.SwtichNextWin(1);

		System.out.println(driver.getCurrentUrl());

		sm.ClickButton(sp.getAddCart());

		String ExpectedMsg = sm.GetElementText(sp.getAddCartMsg());

		Assert.assertEquals(ExpectedMsg,ActualMsg);

	}
    
}
