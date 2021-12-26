package com.stepdefinitiom;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.common.Base;
import com.pageobjectmodel.SearchPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps extends Base {
	
	SearchPage sp;

@Given("user on amazon home page")
public void user_on_amazon_home_page() {
	getDriver();
   sp=PageFactory.initElements(driver, SearchPage.class);  
}

@When("user enter the item on search field {string}")
public void user_enter_the_item_on_search_field(String string) {
	sp.getSearchField(string);
   }

@When("user click on search button")
public void user_click_on_search_button() {
    sp.getSearchIcon();
}

@Then("user on search page")
public void user_on_search_page() {
	
	sp.getSearchitempage();
	
    Assert.assertEquals(sp.Searchitempage.getText(),"\"Qa testing\"");
}

}
