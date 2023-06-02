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
public class AIToolGeneratedTest {
	AndroidDriver<AndroidElement> driver;
	@Before
	public void setUp() throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		dc.setCapability("platformName", "Android");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "1A121FDF600D21");
		dc.setCapability("appPackage", "ai.bite.biteapp");
        dc.setCapability("appActivity", "ai.bite.biteapp.MainActivity");
		dc.setCapability("noReset", "true");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<AndroidElement>(url, dc);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]").click();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView").click();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]").click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
		
	@Test
	public void TestCase2() {
		driver.findElementByAccessibilityId("Photo taken on May 10, 2022 2:14:14 AM").click();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        String actualResult= driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView").getText();
        System.out.println(actualResult);
        assertEquals("Animal-based,Uncooked,Fresh,Unpacked,Single-item,Dark,Different,Top", "Chicken", actualResult);
        driver.closeApp();
	}
	@Test
	public void TestCase3() {
		driver.findElementByAccessibilityId("Photo taken on May 10, 2022 2:19:43 AM").click();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        String actualResult= driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView").getText();
        System.out.println(actualResult);
        assertEquals("Plant-Based,Cooked,Fresh,Unpacked,Single-item,Dark,Different,Top", "Chocolate Truffle", actualResult);
        driver.closeApp();
	}

	@Test
	public void TestCase6() {
		driver.findElementByAccessibilityId("Photo taken on May 10, 2022 2:30:15 AM").click();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        String actualResult= driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView").getText();
        System.out.println(actualResult);
        assertEquals("Plant-Based,Cooked,Fresh,Unpacked,Single-item,Bright,Same,Top", "Toast", actualResult);
        driver.closeApp();
	}
	
	@Test
	public void TestCase8() {
		driver.findElementByAccessibilityId("Photo taken on May 10, 2022 2:35:11 AM").click();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        String actualResult= driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView").getText();
        System.out.println(actualResult);
        assertEquals("Animal-Based,Cooked,Fresh,Packed,Multiple-item,Bright,Different,Side", "Milk", actualResult);
        driver.closeApp();
	}
	
	@Test
	public void TestCase9() {
		driver.findElementByAccessibilityId("Photo taken on May 10, 2022 2:37:46 AM").click();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        String actualResult= driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView").getText();
        System.out.println(actualResult);
        assertEquals("Plant-Based,Uncooked,Fresh,Unpacked,Single-item,Bright,Different,Bottom", "Plum", actualResult);
        driver.closeApp();
	}
	
	@Test
	public void TestCase12() {
		driver.findElementByAccessibilityId("Photo taken on May 10, 2022 1:11:21 AM").click();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        String actualResult= driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView").getText();
        System.out.println(actualResult);
        assertEquals("Plant-Based,UnCooked,Fresh,Packed,Multiple-item,Bright,Different,side", "Apple", actualResult);
        driver.closeApp();
	}
	
	@Test
	public void TestCase13() {
		driver.findElementByAccessibilityId("Photo taken on May 10, 2022 2:47:02 AM").click();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        String actualResult= driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView").getText();
        System.out.println(actualResult);
        assertEquals("Animal-Based,Cooked,Fresh,Packed,Multiple-item,Bright,Different,top", "Fried Chicken", actualResult);
        driver.closeApp();
	}
	
	@Test
	public void TestCase14() {
		driver.findElementByAccessibilityId("Photo taken on May 10, 2022 1:30:51 AM").click();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        String actualResult= driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView").getText();
        System.out.println(actualResult);
        assertEquals("Animal-Based,Cooked,Fresh,unpacked,Multiple-item,Bright,Different,top", "Curry", actualResult);
        driver.closeApp();
	}
	
	@Test
	public void TestCase15() {
		driver.findElementByAccessibilityId("Photo taken on May 10, 2022 1:35:46 AM").click();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        String actualResult= driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView").getText();
        System.out.println(actualResult);
        assertEquals("Animal-Based,UnCooked,Fresh,unpacked,Single-item,Bright,Different,top", "Egg", actualResult);
        driver.closeApp();
	}
	@Test
	public void TestCase29() {
		driver.findElementByAccessibilityId("Photo taken on May 10, 2022 1:30:51 AM").click();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        String actualResult= driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView").getText();
        System.out.println(actualResult);
        assertEquals("Animal-Based,Cooked,Fresh,unpacked,Single-item,Bright,Different,side", "Curry", actualResult);
        driver.closeApp();
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}

}
