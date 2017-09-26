package IT7320.Assignment3;

public class CalcImplementation {
	
	CalcInterface intObj;
	
	public int addTwoNums(int a, int b) {
		return intObj.add(a,b);
	}
	
	public int subtractTwoNums(int a, int b) {
		return intObj.subtract(a,b);
	}
	
	public int multiplyTwoNums(int a, int b) {
		return intObj.multiply(a,b);
	}
	
	public double divideTwoNums(int a, int b) {
		return intObj.divide(a,b);
	}

	public void setIntObj(CalcInterface intObj) {
		this.intObj = intObj;
	}
	
	

}
