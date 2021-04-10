public class CalculatorMain {
    public static void main(String[] args) {
        Number number1 = new Number("4.8","int","first","member");
        Number number2 = new Number("4.8","int","/","member");
        Number result = new Number("", "int", "", "result");
        Calculator calculator = new Calculator();
        result = calculator.calculate(number1, number2);
        System.out.println(result);
    }
}
