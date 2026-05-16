package com.example.spring_boot_practice.DSAPrcatice;
import java.util.Stack;

public class BODMASCalculator {

    // Function to return precedence of operators
    public static int precedence(char op) {
        switch (op) {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
            case '%':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }

    // Function to perform operation
    public static double applyOperation(double a, double b, char op) {
        switch (op) {
            case '+':
                return a + b;

            case '-':
                return a - b;

            case '*':
                return a * b;

            case '/':
                if (b == 0)
                    throw new ArithmeticException("Cannot divide by zero");
                return a / b;

            case '%':
                return a % b;

            case '^':
                return Math.pow(a, b);
        }
        return 0;
    }

    // Main evaluation function
    public static double evaluate(String expression) {

        Stack<Double> values = new Stack<>();
        Stack<Character> operators = new Stack<>();

        int i = 0;

        while (i < expression.length()) {

            char ch = expression.charAt(i);

            // Ignore spaces
            if (ch == ' ') {
                i++;
                continue;
            }

            // If number
            if (Character.isDigit(ch) || ch == '.') {

                StringBuilder sb = new StringBuilder();

                while (i < expression.length() &&
                        (Character.isDigit(expression.charAt(i))
                                || expression.charAt(i) == '.')) {

                    sb.append(expression.charAt(i));
                    i++;
                }

                values.push(Double.parseDouble(sb.toString()));
                continue;
            }

            // Opening bracket
            if (ch == '(') {
                operators.push(ch);
            }

            // Closing bracket
            else if (ch == ')') {

                while (!operators.isEmpty() && operators.peek() != '(') {

                    double b = values.pop();
                    double a = values.pop();
                    char op = operators.pop();

                    values.push(applyOperation(a, b, op));
                }

                operators.pop(); // remove '('
            }

            // Operator
            else {

                while (!operators.isEmpty()
                        && precedence(operators.peek()) >= precedence(ch)) {

                    double b = values.pop();
                    double a = values.pop();
                    char op = operators.pop();

                    values.push(applyOperation(a, b, op));
                }

                operators.push(ch);
            }

            i++;
        }

        // Remaining operations
        while (!operators.isEmpty()) {

            double b = values.pop();
            double a = values.pop();
            char op = operators.pop();

            values.push(applyOperation(a, b, op));
        }

        return values.pop();
    }

    public static void main(String[] args) {

        String expression = "10 + 2 * 6";
        System.out.println(expression + " = " + evaluate(expression));

        expression = "100 * ( 2 + 12 ) / 14";
        System.out.println(expression + " = " + evaluate(expression));

        expression = "5 + 3 * (2 ^ 3) - 4";
        System.out.println(expression + " = " + evaluate(expression));
    }
}