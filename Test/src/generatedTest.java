import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class generatedTest {
	AndroidDriver<AndroidElement> driver;
	@Before
	public void setUp() throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		dc.setCapability("platformName", "Android");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "1A121FDF600D21");
		dc.setCapability("appPackage", "com.azumio.android.caloriesbuddy");

		dc.setCapability("appActivity", "com.azumio.android.argus.main_menu.launch.LaunchActivity");

		dc.setCapability("noReset", "true");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");

		driver = new AndroidDriver<AndroidElement>(url, dc);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		MobileElement el2 = (MobileElement) driver.findElementById("com.azumio.android.caloriesbuddy:id/photoGalleryIcon");
        el2.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView[1]\r\n"
        		+ "").click();
	}
	
	@Test
	public void TestCase1() {
        driver.findElementByAccessibilityId("Photo taken on May 10, 2022 2:14:14 AM").click();
        String actualResult=driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ViewSwitcher/android.widget.ScrollView/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.TextView\r\n"
        		+ "").getText();
        System.out.println(actualResult);
        assertEquals("Animal-based,Uncooked,Fresh,Unpacked,Single-item,Dark,Different,Top", "Chicken", actualResult);
        driver.closeApp();
	}
	
	@Test
	public void TestCase2() {
        driver.findElementByAccessibilityId("Photo taken on May 10, 2022 12:40:34 AM").click();
        String actualResult=driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ViewSwitcher/android.widget.ScrollView/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.TextView\r\n"
        		+ "").getText();
        System.out.println(actualResult);
        assertEquals("Plant-Based,Uncooked,Fresh,Unpacked,Multiple-item,Dark,Different,Top", "Tomato", actualResult);
        driver.closeApp();
	}
	
	@Test
	public void TestCase3() {
        driver.findElementByAccessibilityId("Photo taken on May 10, 2022 2:19:43 AM").click();
        String actualResult=driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ViewSwitcher/android.widget.ScrollView/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.TextView\r\n"
        		+ "").getText();
        System.out.println(actualResult);
        assertEquals("Plant-Based,Cooked,Fresh,Unpacked,Single-item,Dark,Different,Top", "Ice Cream", actualResult);
        driver.closeApp();
	}
	
	@Test
	public void TestCase4() {
        driver.findElementByAccessibilityId("Photo taken on May 10, 2022 2:22:01 AM").click();
        String actualResult=driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ViewSwitcher/android.widget.ScrollView/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.TextView\r\n"
        		+ "").getText();
        System.out.println(actualResult);
        assertEquals("Plant-Based,Uncooked,Fresh,Unpacked,Multiple-item,Dark,Different,Side", "Berry", actualResult);
        driver.closeApp();
	}
	
	@Test
	public void TestCase5() {
        driver.findElementByAccessibilityId("Photo taken on May 10, 2022 2:27:07 AM").click();
        String actualResult=driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ViewSwitcher/android.widget.ScrollView/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.TextView\r\n"
        		+ "").getText();
        System.out.println(actualResult);
        assertEquals("Plant-Based,Uncooked,Fresh,Unpacked,Single-item,Bright,Same,Top", "Broccoli", actualResult);
        driver.closeApp();
	}
	
	@Test
	public void TestCase6() {
        driver.findElementByAccessibilityId("Photo taken on May 10, 2022 2:30:15 AM").click();
        String actualResult=driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ViewSwitcher/android.widget.ScrollView/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.TextView\r\n"
        		+ "").getText();
        System.out.println(actualResult);
        assertEquals("Plant-Based,Cooked,Fresh,Unpacked,Single-item,Bright,Same,Top", "Bread", actualResult);
        driver.closeApp();
	}
	
	@Test
	public void TestCase7() {
        driver.findElementByAccessibilityId("Photo taken on May 10, 2022 2:32:23 AM").click();
        String actualResult=driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ViewSwitcher/android.widget.ScrollView/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.TextView\r\n"
        		+ "").getText();
        System.out.println(actualResult);
        assertEquals("Plant-Based,Cooked,Fresh,Unpacked,Multiple-item,Bright,Same,Top", "Corn", actualResult);
        driver.closeApp();
	}
	
	@Test
	public void TestCase8() {
        driver.findElementByAccessibilityId("Photo taken on May 10, 2022 2:35:11 AM").click();
        String actualResult=driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ViewSwitcher/android.widget.ScrollView/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.TextView\r\n"
        		+ "").getText();
        System.out.println(actualResult);
        assertEquals("Animal-Based,Cooked,Fresh,Packed,Multiple-item,Bright,Different,Side", "Milk", actualResult);
        driver.closeApp();
	}
	
	@Test
	public void TestCase9() {
        driver.findElementByAccessibilityId("Photo taken on May 10, 2022 2:37:46 AM").click();
        String actualResult=driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ViewSwitcher/android.widget.ScrollView/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.TextView\r\n"
        		+ "").getText();
        System.out.println(actualResult);
        assertEquals("Plant-Based,Uncooked,Fresh,Unpacked,Single-item,Bright,Different,Bottom", "Apple", actualResult);
        driver.closeApp();
	}
	
	@Test
	public void TestCase10() {
        driver.findElementByAccessibilityId("Photo taken on May 10, 2022 2:40:24 AM").click();
        String actualResult=driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ViewSwitcher/android.widget.ScrollView/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.TextView\r\n"
        		+ "").getText();
        System.out.println(actualResult);
        assertEquals("Plant-Based,Cooked,Fresh,Unpacked,Multiple-item,Bright,Different,top", "Rice", actualResult);
        driver.closeApp();
	}
	
	@Test
	public void TestCase11() {
        driver.findElementByAccessibilityId("Photo taken on May 9, 2022 11:43:47 PM").click();
        String actualResult=driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ViewSwitcher/android.widget.ScrollView/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.TextView\r\n"
        		+ "").getText();
        System.out.println(actualResult);
        assertEquals("Plant-Based,UnCooked,Fresh,Unpacked,single-item,Bright,Different,side", "Banana", actualResult);
        driver.closeApp();
	}
	
	@Test
	public void TestCase12() {
        driver.findElementByAccessibilityId("Photo taken on May 10, 2022 1:11:21 AM").click();
        String actualResult=driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ViewSwitcher/android.widget.ScrollView/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.TextView\r\n"
        		+ "").getText();
        System.out.println(actualResult);
        assertEquals("Plant-Based,UnCooked,Fresh,Packed,Multiple-item,Bright,Different,side", "Plum", actualResult);
        driver.closeApp();
	}
	
	@Test
	public void TestCase13() {
        driver.findElementByAccessibilityId("Photo taken on May 10, 2022 2:47:02 AM").click();
        String actualResult=driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ViewSwitcher/android.widget.ScrollView/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.TextView\r\n"
        		+ "").getText();
        System.out.println(actualResult);
        assertEquals("Animal-Based,Cooked,Fresh,Packed,Multiple-item,Bright,Different,top", "Fried Chicken", actualResult);
        driver.closeApp();
	}
	
	@Test
	public void TestCase14() {
        driver.findElementByAccessibilityId("Photo taken on May 10, 2022 1:30:51 AM").click();
        String actualResult=driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ViewSwitcher/android.widget.ScrollView/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.TextView\r\n"
        		+ "").getText();
        System.out.println(actualResult);
        assertEquals("Animal-Based,Cooked,Fresh,unpacked,Multiple-item,Bright,Different,top", "Curry", actualResult);
        driver.closeApp();
	}
	
	@Test
	public void TestCase15() {
        driver.findElementByAccessibilityId("Photo taken on May 10, 2022 1:35:46 AM").click();
        String actualResult=driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ViewSwitcher/android.widget.ScrollView/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.TextView\r\n"
        		+ "").getText();
        System.out.println(actualResult);
        assertEquals("Animal-Based,UnCooked,Fresh,unpacked,Single-item,Bright,Different,top", "Egg", actualResult);
        driver.closeApp();
	}
	
	@Test
	public void TestCase16() {
        driver.findElementByAccessibilityId("Photo taken on May 10, 2022 2:27:07 AM").click();
        String actualResult=driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ViewSwitcher/android.widget.ScrollView/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.TextView\r\n"
        		+ "").getText();
        System.out.println(actualResult);
        assertEquals("Plant-Based,UnCooked,Rotten,unpacked,Single-item,Bright,Different,top", "Broccoli", actualResult);
        driver.closeApp();
	}
	
	@Test
	public void TestCase17() {
        driver.findElementByAccessibilityId("Photo taken on May 10, 2022 2:40:24 AM").click();
        String actualResult=driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ViewSwitcher/android.widget.ScrollView/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.TextView\r\n"
        		+ "").getText();
        System.out.println(actualResult);
        assertEquals("Plant-Based,Cooked,Fresh,unpacked,Multiple-item,Bright,Different,side", "Rice", actualResult);
        driver.closeApp();
	}
	
	@Test
	public void TestCase18() {
        driver.findElementByAccessibilityId("Photo taken on May 10, 2022 2:57:30 AM").click();
        String actualResult=driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ViewSwitcher/android.widget.ScrollView/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.TextView\r\n"
        		+ "").getText();
        System.out.println(actualResult);
        assertEquals("Not Food", "Not Food", actualResult);
        driver.closeApp();
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
}
