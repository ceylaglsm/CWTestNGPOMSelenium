package clarusway.tests;

import clarusway.pages.SauceDemoLoginPage;
import clarusway.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day02_C04_PageClassFidAll {
    @Test
    public void test(){
        Driver.getDriver().get("https://www.saucedemo.com/");
        SauceDemoLoginPage demoLoginPage = new SauceDemoLoginPage();
        Assert.assertEquals(3,demoLoginPage.inputElements.size());

       demoLoginPage.inputElements.forEach(t-> System.out.println(t.getTagName()));
    }
}
