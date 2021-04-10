import java.util.List;

public class Calculator {
    private Number result = new Number();
    private Number firstNumber = new Number();
    private Number secondNumber = new Number();
    private void input(String expression) {
        // TODO : створити масив чисел, додати результуючу логіку
    }


    public Number calculate(Number firstMember, Number secondMember) {
       result.setValue(firstMember.evaluate(firstMember, secondMember));
       return result;
    }
}
