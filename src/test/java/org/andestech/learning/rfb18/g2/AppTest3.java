package org.andestech.learning.rfb18.g2;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static junit.framework.TestCase.assertTrue;


public class AppTest3
{
    private WebDriver wd = null;
    private InternetExplorerOptions options = null;

    @BeforeClass
    public void initData(){

    System.setProperty("webdriver.ie.driver",
            "E:\\drivers\\selenium\\IEDriverServer.exe");
        System.out.println("+++ Class: " + this);

     options = new InternetExplorerOptions();
     options.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
     options.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING,true);

    }

    @Test
    public void testCaseIE01()
    {

        wd = new InternetExplorerDriver(options);
        wd.get("http://lenta.ru");
        assertTrue( true );
    }


    @AfterClass
    public void tearDown()
    {
        if(wd != null) wd.quit();
        System.out.println("--- Class: " + this);
    }

}
