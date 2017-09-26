package IT7320.Assignment3;

import junit.framework.TestCase;
import static org.mockito.Mockito.*;

public class TestCalcImplementation extends TestCase {

	CalcImplementation obj;
	int x, y;
	//1st commit
	protected void setUp() throws Exception {
		
		obj = new CalcImplementation();
		x = 12;
		y = 4;

		CalcInterface mockObj = mock(CalcInterface.class);
		when(mockObj.add(x, y)).thenReturn(x + y);
		when(mockObj.subtract(x, y)).thenReturn(x - y);
		when(mockObj.multiply(x, y)).thenReturn(x * y);
		when(mockObj.divide(x, y)).thenReturn((double) (x / y));
		obj.setIntObj(mockObj);
		
		
	}

	protected void tearDown() throws Exception {
		
		obj = null;
		x = 0;
		y = 0;
	}

	public void testAddTwoNums() {
	
		assertEquals(16, obj.addTwoNums(x, y));
	}

	public void testSubtractTwoNums() {
		
		assertEquals(8, obj.subtractTwoNums(x, y));
	}

	public void testMultiplyTwoNums() {
		
		assertEquals(48, obj.multiplyTwoNums(x, y));
	}

	public void testDivideTwoNums() {
		
		assertEquals(3.0, obj.divideTwoNums(x, y));
	}

}
