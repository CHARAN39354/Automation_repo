package giftCards;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.tricenties.genericUtility.BaseClass;
import com.tricenties.objectRepository.HomePage;

public class TC_004_Test extends BaseClass {
	@Test
	public void clickOnGiftCards() {
		ExtentTest test=extReport.createTest("clickOnGiftCards");
		hp=new HomePage(driver);
		hp.getGiftcardslink().click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Gift Cards","Gift cards Page is not displayed");
		test.log(Status.PASS,"Gift cards page is displayed");
	}

}
