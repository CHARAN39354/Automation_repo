package books;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.tricenties.genericUtility.BaseClass;
import com.tricenties.objectRepository.HomePage;

public class TC_001_Test extends BaseClass{
	@Test
	public void clickOnBooks() {
		ExtentTest test=extReport.createTest("clickOnBooks");
		hp=new HomePage(driver);
		hp.getBookslink().click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Books","Books Page is not displayed");
		test.log(Status.PASS,"Books page is displayed");
	}

}
