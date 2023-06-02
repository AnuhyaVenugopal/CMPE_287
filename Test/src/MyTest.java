import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class MyTest {
	public static void main(String args[]) throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        dc.setCapability("platformName", "Android");
        dc.setCapability(MobileCapabilityType.DEVICE_NAME,"1A121FDF600D21");
        
        //CalorieMama
        //dc.setCapability("appPackage", "com.azumio.android.caloriesbuddy");
        //dc.setCapability("appActivity", "com.azumio.android.argus.main_menu.launch.LaunchActivity");
        
        //BiteSnap
        dc.setCapability("appPackage", "ai.bite.biteapp");
        dc.setCapability("appActivity", "ai.bite.biteapp.MainActivity");
        
        //FoodZilla
//         dc.setCapability("appPackage", "io.foodzilla.app");
//         dc.setCapability("appActivity", "io.foodzilla.app.MainActivity");
        
        dc.setCapability("noReset", "true");
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(url, dc);
        System.out.println(driver.currentActivity());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        //Cal mama
//      MobileElement el2 = (MobileElement) driver.findElementById("com.azumio.android.caloriesbuddy:id/photoGalleryIcon");
//      el2.click();
//      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//      driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView[1]").click();
//      driver.findElementByAccessibilityId("Photo taken on May 9, 2022 11:45:18 PM").click();
//      String actualResult=driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ViewSwitcher/android.widget.ScrollView/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.TextView").getText();

        
        //Bitesnap
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]").click();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView").click();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]").click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElementByAccessibilityId("Photo taken on May 10, 2022 2:22:01 AM").click();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        String actualResult= driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView").getText();
        
        //FoodZilla
//        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView[2]").click();
//        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
//        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]").click();
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        driver.findElementByAccessibilityId("Photo taken on May 9, 2022 11:45:18 PM").click();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup").click();
//        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[1]").getText();
//         System.out.println(actualResult);
//        

	}
}
