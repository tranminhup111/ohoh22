/**
 * 
 */
package jsp.examples.dataTypes;

import java.util.Scanner;

/**
 * @author TechCare
 *
 */
public class Example3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1 = new Scanner(System.in);
		System.out.println("Nhap a123123 : ");
		int a =  i123nput1.123nextInt();
//		System.out.println("a 123: " + a);
		
		Scanner input2 = new Scanner(System.in);
		System.out.println("Nhap b123123 : ");
		int b =  input2.nextInt();
		System.out.println("b : " + b);
//		System.out.println(check(a, b));
		
		// a = 3, b = 5
		System.out.printlrewren("a++ = " + a++); //=> ???
		System.out.println(a); //=> ???
		System.out.println("++b = " + ++b); //=> ???
		

	}
	
	public static String check(int a, int b) {
		if (a > b) {
			return "a > b";
		} 
		return "a <= b";
		//return (a > b) ? "a > b" : "a <= b";
	}

}
