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
			args[i] = args[i].trim().toLowerCase();
			String arg = args[i];
			/*
			 * if(arg.equals("+")){ double val1 = stack.pop(); double val2 = stack.pop();
			 * stack.push(val1 + val2); } else if(arg.equals("-")) { double val1 =
			 * stack.pop(); double val2 = stack.pop(); stack.push(val1 - val2); } else
			 * if(arg.equals("*")) { double val1 = stack.pop(); double val2 = stack.pop();
			 * stack.push(val1 * val2); } else { double val = Double.parseDouble(arg);
			 * stack.push(val); }
			 */
			double val1;
			double val2;
			switch (arg) {
			// FIXME: Replace repeated val1 and val2 assignment statements with method call.
			case "add":
			case "+":
				val1 = stack.pop();
				val2 = stack.pop();
				stack.push(val1 + val2);
				break;
			case "sub":
			case "-":
				val1 = stack.pop();
				val2 = stack.pop();
				stack.push(val1 - val2);
				break;
			case "mul":
			case "*":
				val1 = stack.pop();
				val2 = stack.pop();
				stack.push(val1 * val2);
				break;
			case "div":
			case "/":
				val1 = stack.pop();
				val2 = stack.pop();
				stack.push(val1 / val2);
				break;
			case "^":
			case "exp":
				val1 = stack.pop();
				val2 = stack.pop();
				stack.push(Math.pow(val1, val2));
				break;
			default:
				val1 = Double.parseDouble(arg);
				stack.push(val1);
				break;
			}
		}
		System.out.printf("Result = %,.2f", stack.pop());
	}
}
