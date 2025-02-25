package electronics;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.tricenties.genericUtility.BaseClass;
import com.tricenties.objectRepository.HomePage;

public class TC_003_Test extends BaseClass {
	@Test
	public void clickOnElectronics() {
		ExtentTest test=extReport.createTest("clickOnElectronics");
		hp=new HomePage(driver);
		hp.getElectronicslink().click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Electronics","Electronics Page is not displayed");
		test.log(Status.PASS,"Electronics page is displayed");
		test.log(Status.PASS,"Electronics page is displayed");
	}

}
