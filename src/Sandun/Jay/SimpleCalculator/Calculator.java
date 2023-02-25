package Sandun.Jay.SimpleCalculator;

import java.util.Arrays;

public class Calculator {
    private float num1;
    private float num2;
    private char operator;
    private float solution;

    public Calculator(float num1, float num2, char operator) {
        this.num1 = num1;
        this.num2 = num2;
        this.operator = operator;
    }

    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public float getSolution() {
        return solution;
    }

    public void setSolution(float solution) {
        this.solution = solution;
    }

    public float calculate(float num1, float num2, char operator){
            switch (operator) {
                case '+':
                    solution = num1 + num2;
                break;
                case '-':
                    solution = num1 - num2;
                    break;
                case '*':
                    solution = num1 * num2;
                    break;
                case '/':
                    solution = num1 / num2;
                    break;
            }
            return solution;
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                ", operator=" + operator +
                ", solution=" + solution +
                '}';
    }
}
