
public class MyProgram {
	
/**
 * Nadhif documentation
 *public = public is an access modifier, meaning that it 
 *is used to set the level of access. You can use access modifiers for classes, attributes, and methods.
 */

/*
For classes, the available modifiers are public or default (left blank), as described below:
1.public: The class is accessible by any other class.
2.default: The class is accessible only by classes in the same package.

The following choices are available for attributes and methods:
--default: A variable or method declared with no access control modifier is available to any other class in the same package.
--public: Accessible from any other class.
--protected: Provides the same access as the default access modifier, with the addition that subclasses can access protected methods and variables of the superclass (Subclasses and superclasses are covered in upcoming lessons).
--private: Accessible only within the declared class itself.

*/



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String a = "5";
		//int b = 3;
		//int c = Integer.parseInt(a);
		//Integer d = 9;
		//int m = 1;
		//String result = d.toString();
		Objects v1 = new Objects("merah");
		Objects v2 = new Objects();
		Objects v3 = new Objects();

		System.out.println("Warna object v1: " + v1.getColor());
		System.out.println("Warna object v2: " + v2.getColor());




		//Objects.setColor("Red");

		//v1.setColor("blue");
		//System.out.println(v1.getColor());
	}

}
