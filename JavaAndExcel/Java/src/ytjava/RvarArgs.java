package ytjava;

class Calc {

	public int add(int i, int j) {
		return i + j;
	}

	//varargs - variable length arguments
	public int addMany(int... n) {
		int sum = 0;
		for (int i : n) {
			sum += i;
		}
		return sum;
	}
}

public class RvarArgs {

	public static void main(String[] args) {

		Calc obj = new Calc();
		int res = obj.addMany(10, 12, 1, 2, 1);
		
		System.out.println(res);
	}
}
