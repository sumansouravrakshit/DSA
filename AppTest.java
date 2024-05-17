package projectWork.projectWork;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	/**
	 * Rigorous Test :-)
	 */
	@Test
	public void shouldAnswerWithTrue() {
		assertTrue(true);
		HashMap<String, String> hm = new HashMap<>();
		hm.put("1", "Suman");
		hm.put("2", "Sourav");
		for (Map.Entry<String, String> m : hm.entrySet()) {
			System.out.println(m.getKey() + "----" + m.getValue());
		}
	}
}
