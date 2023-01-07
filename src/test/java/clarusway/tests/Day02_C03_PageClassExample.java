package clarusway.tests;

import clarusway.pages.HtmlGoodiesHomePage;
import clarusway.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Day02_C03_PageClassExample {
    @Test
    public void test() {
        Driver.getDriver().get(" http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        HtmlGoodiesHomePage homePage = new HtmlGoodiesHomePage();
        Actions actions=new Actions(Driver.getDriver());
        actions.dragAndDrop(homePage.copenhag,homePage.denmark)
                .dragAndDrop(homePage.seoul,homePage.sKorea)
                .dragAndDrop(homePage.washington,homePage.us)
                .dragAndDrop(homePage.rome,homePage.italy)
                .dragAndDrop(homePage.madrid,homePage.spain)
                .dragAndDrop(homePage.oslo,homePage.norway)

                .dragAndDrop(homePage.stockholm,homePage.sweden)
                .perform();
    }
}
