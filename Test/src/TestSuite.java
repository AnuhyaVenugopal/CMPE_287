import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	
	
	//Input Based Test Automation
	OccurancesTest.class,
	PackageTest.class,
	QualityTest.class,
	StateTest.class,
	TypeTest.class,
	
	//Context Based Test Automation
	ContextBasedTest.class,
	
	//Test Automation - Foodzilla Mobile Application 22
	AITestAutomation.class,  
			
	//Test Automation - Bitesnap Mobile Application 8-9
	AIToolGeneratedTest.class
		
	
})

public class TestSuite {
	
}
