package javalangfeatures;


class MyList<T>{
	private T[] elementsList;
	
	public T[] getElementsList() {
		return elementsList;
	}
	
	public void setElementsList(T[] eleList) {
		this.elementsList = eleList;
	}
}
public class GenericsWithClasses {

	public static void main(String[] args) {
		MyList<Integer> obj = new MyList<Integer>();
		Integer[] nums = {1,2,3};
		obj.setElementsList(nums);
		System.out.println(obj.getElementsList());

	}

}


