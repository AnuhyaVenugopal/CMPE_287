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
public class AITestAutomation {
	AndroidDriver<AndroidElement> driver;
	@Before
	public void setUp() throws MalformedURLException {
		
		System.out.println("Running Automated Test cases on FOODZILLA AI Mobile Application");
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		dc.setCapability("platformName", "Android");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "1A121FDF600D21");
		dc.setCapability("appPackage", "io.foodzilla.app");
        dc.setCapability("appActivity", "io.foodzilla.app.MainActivity");
		dc.setCapability("noReset", "true");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<AndroidElement>(url, dc);
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView[2]").click();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]").click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	@Test
	public void TestCase1() {
		System.out.println("Running TestCase-1");
		driver.findElementByAccessibilityId("Photo taken on May 10, 2022 12:40:34 AM").click();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup").click();
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[1]").getText();        
        assertEquals("Plant-Based,Uncooked,Fresh,Unpacked,Multiple-item,Dark,Different,Top", "Vegetable", actualResult);
        driver.closeApp();
	}
	
	@Test
	public void TestCase2() {
		System.out.println("Running TestCase-2");
		driver.findElementByAccessibilityId("Photo taken on May 10, 2022 2:14:14 AM").click();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup").click();
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[1]").getText();        
        System.out.println(actualResult);
        assertEquals("Animal-based,Uncooked,Fresh,Unpacked,Single-item,Dark,Different,Top", "Chicken", actualResult);
        driver.closeApp();
	}
	@Test
	public void TestCase3() {
		System.out.println("Running TestCase-3");
		driver.findElementByAccessibilityId("Photo taken on May 10, 2022 2:19:43 AM").click();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup").click();
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[1]").getText();        
        System.out.println(actualResult);
        assertEquals("Plant-Based,Cooked,Fresh,Unpacked,Single-item,Dark,Different,Top", "Chocolate", actualResult);
        driver.closeApp();
	}
	
	@Test
	public void TestCase4() {
		System.out.println("Running TestCase-4");
		driver.findElementByAccessibilityId("Photo taken on May 10, 2022 2:22:01 AM").click();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup").click();
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[1]").getText();        
        System.out.println(actualResult);
        assertEquals("Plant-Based,Uncooked,Fresh,Unpacked,Multiple-item,Dark,Different,Side", "Strawberry", actualResult);
        driver.closeApp();
	}
	
	@Test
	public void TestCase5() {
		System.out.println("Running TestCase-5");
		driver.findElementByAccessibilityId("Photo taken on May 10, 2022 2:27:07 AM").click();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup").click();
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[1]").getText();        
        System.out.println(actualResult);
        assertEquals("Plant-Based,Uncooked,Fresh,Unpacked,Single-item,Bright,Same,Top", "Vegetable", actualResult);
        driver.closeApp();
	}
	
	@Test
	public void TestCase6() {
		System.out.println("Running TestCase-6");
		driver.findElementByAccessibilityId("Photo taken on May 10, 2022 2:30:15 AM").click();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup").click();
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[1]").getText();        
        System.out.println(actualResult);
        assertEquals("Plant-Based,Cooked,Fresh,Unpacked,Single-item,Bright,Same,Top", "Toast", actualResult);
        driver.closeApp();
	}
	
	@Test
	public void TestCase7() {
		System.out.println("Running TestCase-7");
		driver.findElementByAccessibilityId("Photo taken on May 10, 2022 2:32:23 AM").click();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup").click();
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[1]").getText();        
        System.out.println(actualResult);
        assertEquals("Plant-Based,Cooked,Fresh,Unpacked,Multiple-item,Bright,Same,Top", "Corn", actualResult);
        driver.closeApp();
	}
	
	@Test
	public void TestCase8() {
		System.out.println("Running TestCase-8");
		driver.findElementByAccessibilityId("Photo taken on May 10, 2022 2:35:11 AM").click();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup").click();
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[1]").getText();        
        System.out.println(actualResult);
        assertEquals("Animal-Based,Cooked,Fresh,Packed,Multiple-item,Bright,Different,Side", "Coffee", actualResult);
        driver.closeApp();
	}
	
	@Test
	public void TestCase9() {
		System.out.println("Running TestCase-9");
		driver.findElementByAccessibilityId("Photo taken on May 10, 2022 2:37:46 AM").click();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup").click();
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[1]").getText();        
        System.out.println(actualResult);
        assertEquals("Plant-Based,Uncooked,Fresh,Unpacked,Single-item,Bright,Different,Bottom", "Apple", actualResult);
        driver.closeApp();
	}
	
	@Test
	public void TestCase10() {
		System.out.println("Running TestCase-10");
		driver.findElementByAccessibilityId("Photo taken on May 10, 2022 2:40:24 AM").click();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup").click();
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[1]").getText();        
        System.out.println(actualResult);
        assertEquals("Plant-Based,Cooked,Fresh,Unpacked,Multiple-item,Bright,Different,top", "Rice", actualResult);
        driver.closeApp();
	}
	
	@Test
	public void TestCase11() {
		System.out.println("Running TestCase-11");
		driver.findElementByAccessibilityId("Photo taken on May 9, 2022 11:43:47 PM").click();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup").click();
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[1]").getText();        
        System.out.println(actualResult);
        assertEquals("Plant-Based,UnCooked,Fresh,Unpacked,single-item,Bright,Different,side", "Banana", actualResult);
        driver.closeApp();
	}
	
	@Test
	public void TestCase12() {
		System.out.println("Running TestCase-12");
		driver.findElementByAccessibilityId("Photo taken on May 10, 2022 1:11:21 AM").click();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup").click();
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[1]").getText();        
        System.out.println(actualResult);
        assertEquals("Plant-Based,UnCooked,Fresh,Packed,Multiple-item,Bright,Different,side", "Apple", actualResult);
        driver.closeApp();
	}
	
	@Test
	public void TestCase13() {
		System.out.println("Running TestCase-13");
		driver.findElementByAccessibilityId("Photo taken on May 10, 2022 2:47:02 AM").click();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup").click();
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[1]").getText();        
        System.out.println(actualResult);
        assertEquals("Animal-Based,Cooked,Fresh,Packed,Multiple-item,Bright,Different,top", "Fried Chicken", actualResult);
        driver.closeApp();
	}
	
	@Test
	public void TestCase14() {
		System.out.println("Running TestCase-14");
		driver.findElementByAccessibilityId("Photo taken on May 10, 2022 1:30:51 AM").click();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup").click();
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[1]").getText();        
        System.out.println(actualResult);
        assertEquals("Animal-Based,Cooked,Fresh,unpacked,Multiple-item,Bright,Different,top", "Curry", actualResult);
        driver.closeApp();
	}
	
	@Test
	public void TestCase15() {
		System.out.println("Running TestCase-15");
		driver.findElementByAccessibilityId("Photo taken on May 10, 2022 1:35:46 AM").click();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup").click();
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[1]").getText();        
        System.out.println(actualResult);
        assertEquals("Animal-Based,UnCooked,Fresh,unpacked,Single-item,Bright,Different,top", "Egg", actualResult);
        driver.closeApp();
	}
	
	@Test
	public void TestCase16() {
		System.out.println("Running TestCase-16");
		driver.findElementByAccessibilityId("Photo taken on May 10, 2022 2:27:07 AM").click();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup").click();
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[1]").getText();        
        System.out.println(actualResult);
        assertEquals("Plant-Based,UnCooked,Rotten,unpacked,Single-item,Bright,Different,top", "Vegetable", actualResult);
        driver.closeApp();
	}
	
	@Test
	public void TestCase17() {
		System.out.println("Running TestCase-17");
		driver.findElementByAccessibilityId("Photo taken on May 10, 2022 2:40:24 AM").click();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup").click();
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[1]").getText();        
        System.out.println(actualResult);
        assertEquals("Plant-Based,Cooked,Fresh,unpacked,Multiple-item,Bright,Different,side", "Rice", actualResult);
        driver.closeApp();
	}
	
	@Test
	public void TestCase18() {
		System.out.println("Running TestCase-18");
		driver.findElementByAccessibilityId("Photo taken on May 10, 2022 2:57:30 AM").click();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup").click();
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[1]").getText();        
        System.out.println(actualResult);
        assertEquals("Not Food", "Not Food", actualResult);
        driver.closeApp();
	}
	
	@Test
	public void TestCase19() {
		System.out.println("Running TestCase-19");
		driver.findElementByAccessibilityId("Photo taken on May 10, 2022 2:14:14 AM").click();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup").click();
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[1]").getText();        
        System.out.println(actualResult);
        assertEquals("Animal-Based,Cooked,Rotten,unpacked,Multiple-item,Bright,Different,side", "Chicken", actualResult);
        driver.closeApp();
	}
	
	@Test
	public void TestCase21() {
		System.out.println("Running TestCase-20");
		driver.findElementByAccessibilityId("Photo taken on May 10, 2022 1:22:54 AM").click();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup").click();
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[1]").getText();        
        System.out.println(actualResult);
        assertEquals("Plant-Based,UnCooked,Rotten,unpacked,Multiple-item,Bright,Different,side", "Strawberry", actualResult);
        driver.closeApp();
	}
	
	@Test
	public void TestCase22() {
		System.out.println("Running TestCase-21");
		driver.findElementByAccessibilityId("Photo taken on May 10, 2022 2:27:07 AM").click();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup").click();
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[1]").getText();        
        System.out.println(actualResult);
        assertEquals("Plant-Based,UnCooked,Rotten,unpacked,Single-item,Bright,Different,top", "Vegetable", actualResult);
        driver.closeApp();
	}
	
	@Test
	public void TestCase23() {
		System.out.println("Running TestCase-22");
		driver.findElementByAccessibilityId("Photo taken on May 10, 2022 1:30:51 AM").click();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup").click();
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[1]").getText();        
        System.out.println(actualResult);
        assertEquals("Animal-Based,Cooked,Fresh,unpacked,Single-item,Bright,Different,side", "Curry", actualResult);
        driver.closeApp();
	}
	@After
	public void tearDown() {
		driver.quit();
	}
	
	
}
