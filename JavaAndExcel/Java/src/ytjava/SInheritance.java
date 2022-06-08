package ytjava;

class Calc1 {  //parent , base , super class

	public int add(int i, int j) {
		return i + j;
	}
}


class CalcAdv extends Calc1{ //sub class , child class
	
	public int sub(int a,int b) {
		return a-b;
	}
}
public class SInheritance {
	public static void main(String[] args) {
		CalcAdv obj = new CalcAdv();
		obj.add(1, 2);
		obj.sub(2, 1);
	}
}
