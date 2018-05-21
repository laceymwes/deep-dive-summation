package edu.cnm.deepdive;
/**
 * This is the class containing the main entry point for the (eventual) RPN calculator.
 * @author Michael Lacey
 * @version 0.1
 * 
 */
public class Summation {

	/**
	 * Command-line entry point for RPN interpreter
	 * 
	 * @param args  operands and operators.
	 */
	public static void main(String[] args) {
		int sum = 0;
		
		for (int i = 0; i < args.length; ++i) {
			int val = Integer.parseInt(args[i]);
			sum += val;
		}
		System.out.println(sum);
		
	}
}
