package edu.cnm.deepdive;

import java.util.Stack;


/**
 * Command-line entry point for RPN interpreter. 
 * 
 * @author Michael Lacey
 * @version 0.1
 * 
 */
public class Summation {

	/**
	 * Command-line entry point for RPN interpreter
	 * 
	 * @param args
	 *            operands and operators.
	 */
	public static void main(String[] args) {
		Stack<Double> stack = new Stack<>();
		for (int i = 0; i < args.length; i++) {
			args[i] = args[i].trim();
			if(args[i].equals("+")){
				double val1 = stack.pop();
				double val2 = stack.pop();
				stack.push(val1 + val2);
			}
			else if(args[i].equals("-")) {
				double val1 = stack.pop();
				double val2 = stack.pop();
				stack.push(val1 - val2);
			}
			else {
				double val = Double.parseDouble(args[i]);
				stack.push(val); 
			}
			
			
		}
		System.out.printf("Result = %,.2f", stack.pop()); 

	}
}
