package edu.cnm.deepdive;

import java.util.Stack;

/**
 * Command-line entry point for RPN interpreter.
 *
 * @author Michael Lacey
 * @version 0.1
 */
public class Summation {

  /**
   * Command-line entry point for RPN interpreter
   *
   * @param args operands and operators.
   */
  public static void main(String[] args) {
    Stack<Double> stack = new Stack<>();
    for (int i = 0; i < args.length; i++) {
      args[i] = args[i].trim().toLowerCase();
      String arg = args[i];
      switch (arg) {
        case "add":
        case "+":
          add(stack);
          break;
        case "sub":
        case "-":
          subtract(stack);
          break;
        case "mul":
        case "*":
          multiply(stack);
          break;
        case "div":
        case "/":
          divide(stack);
          break;
        case "^":
        case "exp":
          power(stack);
          break;
        default:
          stack.push(Double.valueOf(arg));
          break;
      }
    }
    System.out.printf("Result = %,.2f", stack.pop());
  }

  /**
   * @param stack
   */
  private static void add(Stack<Double> stack) {
    double[] values = pop(stack, 2);
    stack.push(values[0] + values[1]);
  }

  private static void subtract(Stack<Double> stack) {
    double[] values = pop(stack, 2);
    stack.push(values[0] - values[1]);
  }

  private static void multiply(Stack<Double> stack) {
    double[] values = pop(stack, 2);
    stack.push(values[0] * values[1]);
  }

  private static void divide(Stack<Double> stack) {
    double[] values = pop(stack, 2);
    stack.push(values[0] / values[1]);
  }

  private static void power(Stack<Double> stack) {
    double[] values = pop(stack, 2);
    stack.push(Math.pow(values[0], values[1]));
  }

  private static double[] pop(Stack<Double> stack, int numItems) {
    double[] values = new double[numItems];
    for (int i = 0; i < numItems; i++) {
      values[i] = stack.pop();
    }
    return values;

  }
}
