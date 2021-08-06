package com.FlightBookingSystem.ObjectRepository;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlightBookingObject {

	final WebDriver driver;

	public FlightBookingObject(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//p[contains(text(),'Login/Signup for Best Prices')]")
	private WebElement loginPopUp;

	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]")
	private WebElement loginButton;

	@FindBy(xpath = "//input[@id='fromCity']")
	private WebElement fromCityButton;

	// @FindBy(how = How.XPATH, using =
	// "//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]")
	@FindBy(xpath = "//p[contains(text(),'Mumbai, India')]")
	private WebElement mubaiCityLabel;

	@FindBy(xpath = "//input[@id='toCity']")
	private WebElement toCity;

	@FindBy(xpath = "//p[contains(text(),'Delhi, India')]")
	private WebElement selectToCity;

	@FindBy(xpath = "//span[contains(text(),'DEPARTURE')]")
	private WebElement ClickOnDatePicker;

	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[2]/div[4]")
	private WebElement selectDepartureDate;

	// click on return
	@FindBy(xpath = "//span[contains(text(),'RETURN')]")
	private WebElement selectReturn;

	// click on return date
	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[3]/div[5]/div[1]")
	private WebElement selectReturnDate;

	// click on traveller class
	@FindBy(xpath = "//span[contains(text(),'Travellers & CLASS')]")
	private WebElement travellerClass;

	// click on adult
	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[5]/div[2]/div[1]/ul[1]/li[2]")
	private WebElement adult;

	// click on child
	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[5]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[2]")
	private WebElement child;

	// click on INFANTS
	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[5]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[2]")
	private WebElement infants;

	// Click on business type

	@FindBy(xpath = "//li[contains(text(),'Business')]")
	private WebElement businessType;

	// click on apply button

	@FindBy(xpath = "//button[contains(text(),'APPLY')]")
	private WebElement apply;

	// get traveller and class text

	@FindBy(xpath = "//span[@class='appendRight10']")
	private WebElement travellerCount;

	// Business class type

	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[5]/label[1]/p[2]")
	private WebElement getBusinessType;

//click on serach button

	@FindBy(xpath = "//a[contains(text(),'Search')]")
	private WebElement search;

	@FindBy(xpath = "//input[@id = 'fromCity']")
	private WebElement fromCityOnSearchPage;

	@FindBy(xpath = "//input[@id='toCity']")
	private WebElement toCityOnSearchPage;

	@FindBy(xpath = "//input[@id='departure']")
	private WebElement departDateonSearchPage;

	@FindBy(xpath = "//input[@id='return']")
	private WebElement returnDateonSearchPage;

	@FindBy(xpath = "//input[@id='travellerAndClass']")
	private WebElement TravellerandClassonSearchPage;

	@FindBys({ @FindBy(xpath = "//div[@class='makeFlex priceInfo ']/div/p") })
	private List<WebElement> flightPrices;

	@FindBys({ @FindBy(xpath = "//span[@class='flexOne makeFlex']/span[2]") })
	private List<WebElement> airlineList;

	@FindBy(xpath = "//div[@class='rc-slider-handle']")
	private WebElement priceSliderStr;

	public void selectFromCity() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(fromCityButton));
		fromCityButton.click();

		wait.until(ExpectedConditions.elementToBeClickable(mubaiCityLabel));
		mubaiCityLabel.click();
	}

	public void selectToCity() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(toCity));
		try {
			toCity.click();
		} catch (Exception e) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(selectToCity));
		selectToCity.click();
	}

	public void selectTravelDate() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(ClickOnDatePicker));
		ClickOnDatePicker.click();

		wait.until(ExpectedConditions.elementToBeClickable(selectDepartureDate));
		selectDepartureDate.click();

	}

	public void selectTravellersAndClass() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(travellerClass));
		travellerClass.click();

		wait.until(ExpectedConditions.elementToBeClickable(adult));
		adult.click();

		wait.until(ExpectedConditions.elementToBeClickable(child));
		child.click();

		wait.until(ExpectedConditions.elementToBeClickable(infants));
		infants.click();

		wait.until(ExpectedConditions.elementToBeClickable(businessType));
		businessType.click();

		wait.until(ExpectedConditions.elementToBeClickable(apply));
		apply.click();
	}

	public void clickOnSearch() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(search));
		search.click();
	}

	public String getFromCity() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(fromCityButton));
		return fromCityButton.getAttribute("value");
	}

	public String getToCity() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(toCity));
		return toCity.getAttribute("value");
	}

	public void removePopUp() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(loginPopUp));
			if (loginPopUp.isDisplayed()) {
				loginButton.click();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public String getPreviousDateStatus(int date) {

		WebElement element = driver.findElement(By.xpath("(//p[contains(text(),'" + date + "')]/../..)[1]"));

		return element.getAttribute("aria-disabled");

	}

	public String getPreviousDateStatusForEndDate(int date) {

		WebElement element = driver.findElement(By.xpath("(//p[contains(text(),'" + date + "')]/../..)[2]"));

		return element.getAttribute("aria-disabled");

	}

	public void selectDate(int date) {

		WebElement element = driver.findElement(By.xpath("(//p[contains(text(),'" + date + "')]/../..)[1]"));

		element.click();

	}

	public void selectReturn() {
		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.elementToBeClickable(selectReturn));
		selectReturn.click();
	}

	public String getTravellerCount() {
		String businesstype = null;
		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.visibilityOf(travellerCount));
		businesstype = travellerCount.getText();
		return businesstype;
	}

	public String getTravellClass() {

		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.visibilityOf(getBusinessType));

		return getBusinessType.getText();
	}

	public String getTripTypeFromSearch() {

		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.visibilityOf(getBusinessType));

		return getBusinessType.getText();
	}

	public String getFromCityNameonSerachPage() {

		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.visibilityOf(fromCityOnSearchPage));
		return fromCityOnSearchPage.getAttribute("value");

	}

	public String getToCityNameOnSerachPage() {

		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.visibilityOf(toCityOnSearchPage));
		return toCityOnSearchPage.getAttribute("value");

	}

	public String getDepartDateOnSerachPage() {

		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.visibilityOf(departDateonSearchPage));

		return departDateonSearchPage.getText();

	}

	public String getReturnDateOnSerachPage() {

		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.visibilityOf(returnDateonSearchPage));

		return returnDateonSearchPage.getText();

	}

	public String getPassangerAndClassOnSerachPage() {

		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.visibilityOf(TravellerandClassonSearchPage));

		return TravellerandClassonSearchPage.getText();

	}

	public List<String> getFlightPrice() {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(flightPrices.get(0)));

		List<String> flightPricesList = new ArrayList<String>();
		for (WebElement element : flightPrices) {

			flightPricesList.add(element.getText());

		}

		return flightPricesList;

	}

	public List<String> getAirlineList() {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(airlineList.get(0)));

		List<String> airlineListName = new ArrayList<String>();
		for (WebElement element : airlineList) {

			airlineListName.add(element.getText());

		}

		return airlineListName;
	}

	public void handleSlider() {

		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.visibilityOf(priceSliderStr));
		
		  new Actions(driver).dragAndDropBy(priceSliderStr, -72, 0).build().perform();


	}
}