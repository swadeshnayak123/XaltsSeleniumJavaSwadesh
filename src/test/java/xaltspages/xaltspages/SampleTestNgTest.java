package xaltspages.xaltspages;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import xaltspages.TestNgTestBase;
import xaltspages.xaltspages.pages.HomePage;

public class SampleTestNgTest extends TestNgTestBase {

  private HomePage homepage;

  @BeforeClass
  public void testInit() {
    driver.get(baseUrl);
    homepage = PageFactory.initElements(driver, HomePage.class);
  }

  @Test
  public void testHomePageHasAHeader() {
    Assert.assertFalse("".equals(homepage.header.getText()));
  }
}
