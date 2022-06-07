package ytjava;

public class JConstructor {

	
	//constructor is a member method , no return type , has same name as classname
	//we always have a default constructor though we dont create
	//use of constructor - to allocate memory to object
	int n;
	JConstructor(){
		//we can provide initial values of instance variables
		n=10;
	}
	
	//we can have constructor overloading - every constructor must have a different signature
	JConstructor(int i){
		this.n = i;
	}
	
	public static void main(String[] args) {
		JConstructor obj = new JConstructor() ;
							//allocates memory
		
		//constrctor is called automatically whenever object is created
		
		JConstructor obj1 = new JConstructor(10) ;
	}
}
