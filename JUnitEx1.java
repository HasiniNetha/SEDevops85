package calTest;
import static org.junit.Assert.*;
import org.junit.Test;
public class JUnitEx1 {
	@Test
	public void test_JUnit() {
		System.out.println("Check the String");
		String str="check the String";
		assertEquals("check the String",str);
	}
	 
	 
	

}
