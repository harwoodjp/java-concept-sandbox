import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.junit.Before;
import org.junit.Test;

import com.harwoodjp.Classes.Application.Application;
import com.harwoodjp.Classes.Application.Database;

public class PropertiesTest {
	
	Properties properties;

	@Before
	public void setup() {
		Properties props = new Properties();
		InputStream input = null;

		try {
			input = new FileInputStream("/Users/justin.harwood/Projects/Misc/java-concept-sandbox/src/main/java/com/harwoodjp/Resources/foo.properties");
			//input = PropertiesTest.class.getClassLoader().getResourceAsStream("resources.foo.properties");
			props.load(input);
			properties = props;
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
	@Test
	public void propertiesNotNull() {
		assertNotNull(properties);
		assertNotNull(properties.getProperty("host"));
		assertNotNull(properties.getProperty("user"));
		assertNotNull(properties.getProperty("pass"));
	}

	@Test
	public void appHasProperties() {
		Database db = new Database(
				properties.getProperty("host"),
				properties.getProperty("user"),
				properties.getProperty("pass")
		);
		Application app = new Application(db);
		assertEquals(app.hasValidDatabase(), true);
	}
		
}

