package ytjava;

class Calc2 { // parent , base , super class

	public int add(int i, int j) {
		return i + j;
	}
}

class CalcAdv2 extends Calc2 { // sub class , child class

	public int sub(int a, int b) {
		return a - b;
	}
}

class CalcMoreAdv extends CalcAdv2 {
	public int multiply(int i, int j) {
		return i * j;
	}
}

public class TMultiLevelInheritance {
	public static void main(String[] args) {
		CalcMoreAdv obj = new CalcMoreAdv();
		obj.add(1, 2);
		obj.sub(2, 1);
		
		obj.multiply(2, 10);
	}
}

//java doesnot support multiple inheritance
//inheritance IS-A relationship
