package pages.objects;

import pages.base.BasePage;

public class HomePage extends BasePage{
	
	public void mouseOverNewCars() {
		
		mouseOver("NewCarsMenu_XPATH");
		
	}
	
	public void clickFindNewcars() {
		click("FindNewCars_XPATH");
	}
	
	public void searchCars() {
		
	}
	


}
