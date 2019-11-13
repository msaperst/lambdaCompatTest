import com.coveros.selenified.Selenified;
import com.coveros.selenified.application.App;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestPageIT extends Selenified {

    @BeforeClass(alwaysRun = true)
    public void beforeClass(ITestContext test) {
        // set the base URL for the tests here
        setAppURL(this, test, "https://www.coveros.com/");
        // set the author of the tests here
        setAuthor(this, test, "Max Saperstone\n<br/>max.saperstone@coveros.com");
        // set the version of the tests or of the software, possibly with a dynamic check
        setVersion(this, test, "3.2.1");
    }

    @Test
    public void testSite() {
        // use this object to manipulate the app
        App app = this.apps.get();
        // verify the correct page title
        app.azzert().titleEquals("Coveros | Bringing together agile and security to deliver superior software");
        // verify no issues
        finish();
    }
}
