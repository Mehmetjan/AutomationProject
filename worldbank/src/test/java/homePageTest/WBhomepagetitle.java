package homePageTest;

import base.CommonAPI;
import org.junit.Assert;
import org.testng.annotations.Test;

/**
 * Created by mehmet on 5/23/2017.
 */
public class WBhomepagetitle extends CommonAPI {
     @Test
    public void worldbanktitle() {
        String titleActual = "World Bank Group";
        Assert.assertEquals(titleActual, driver.getTitle());
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
    }
}