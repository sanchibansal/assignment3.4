import java.util.*;
public class Static_ {
	static String college= "XYZ";		//static variable
	static void change(){			//static method
		college= "PQR";
	}
	
	public static void main(String args[]){
		Scanner g= new Scanner(System.in);
		System.out.println("enter roll number= ");
		int h=g.nextInt();
		System.out.println("enter name ");
		String name = g.next(); 
		System.out.println("name= "+name+"\nroll number= "+h+"\ncollege= "+college); //prints the static value of college
		Static_.change();							//invoking of static methods do not require the use of an object
		System.out.println("-----------------------------------");

		System.out.println("name= "+name+"\nroll number= "+h+"\ncollege= "+college);	//changes the value of college and then prints it

	}
	
}
