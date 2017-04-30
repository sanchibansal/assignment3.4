
public class Constructor_Chaining {

	public Constructor_Chaining(){		//inside default constructor
	System.out.println("inside default constructor");
	}
	public Constructor_Chaining(int num1,int num2){		//inside parameterized constructor with 2 arguments 
	this(2);											// -->to Constructor_Chaining(num1)
	System.out.println("product of two numbers= "+(num1*num2));
	}

	public Constructor_Chaining(int num1) {			//inside parameterized constructor with 1 arguments 
		this();										// -->to Constructor_Chaining()
		System.out.println("value of num 1 is=  "+num1);
	}
	public static void main(String args[]){
		Constructor_Chaining g= new Constructor_Chaining(2,4);	// -->to Constructor_Chaining(num1, num2) 
	}
}
