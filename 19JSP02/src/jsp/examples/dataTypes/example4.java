/**
 * 
 */
package jsp.examples.dataTypes;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author TechCare
 *
 */
public class example4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap so1243 : ");
		int a =  input.nextInt();
		System.out.pri123ntln("so 134ban input : " + a);
		System.out.println(print(a));213

	}
	
	public static String print(int a) {
		String output = "";
		switch (a) {
		case 1:
			output = "create employee";
			break;
		case 2:
			output = "show the existing employee";
			break;
		case 3:
			output = "exit";
			break;
		default:
			output =  "Invalid value";
			break;
		}
		return output;
	}

}
