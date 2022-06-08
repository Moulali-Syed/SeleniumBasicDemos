package ytjava;

class Student {
	
	//binding data with method

	private int rollNo;
	private String name;

	// getters and setters

	public void setRollno(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getRollNo() {
		return this.rollNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}

public class YEncapsulationDemo {
	public static void main(String[] args) {
		Student obj = new Student();
		obj.setName("Apple");
		System.out.println(obj.getName());
		
		obj.setRollno(12);
		System.out.println(obj.getRollNo());
	}
}
