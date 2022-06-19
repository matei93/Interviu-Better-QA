package Base;

import PropertiesObject.PropertiesObject;
import org.junit.After;
import org.junit.Before;

import java.util.HashMap;

public class Hooks extends ShareData {

    public HashMap<String, String> inputData;

    @Before

    public void prepareEnvironment(){
        setUp();
        String className = this.getClass().getSimpleName();
        PropertiesObject testData = new PropertiesObject("testsResource/"+className+"Resource");
        inputData = testData.getAllKeyValues();

    }

    @After
    public void clearEnvironment(){
        //tearDown();
    }
}
