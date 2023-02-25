package Sandun.Jay.SimpleCalculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(24,35,'+');
        calculator.calculate(48,69,'/');
        calculator.toString();
    }
}
