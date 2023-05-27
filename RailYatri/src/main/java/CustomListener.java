import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener extends Screenshoot implements ITestListener {
	public void onTestFailure(ITestResult result) {
		System.out.print(true);
		failScreenshoot(result.getMethod().getMethodName());
	}
}
