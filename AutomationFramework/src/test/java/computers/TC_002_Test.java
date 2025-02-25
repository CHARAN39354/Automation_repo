package computers;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.tricenties.genericUtility.BaseClass;
import com.tricenties.objectRepository.HomePage;

public class TC_002_Test extends BaseClass{
	@Test
	public void clickOnComputers() {
		ExtentTest test=extReport.createTest("clickOnComputers");
		hp=new HomePage(driver);
		hp.getComputerlink().click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Computers","Computers Page is not displayed");
		test.log(Status.PASS,"Computer page is displayed");
	}

}
