public class Number {
    private String value;
    private String typeOfNumber;
    private String action;
    private String own;

    public String getOwn() {
        return own;
    }

    public void setOwn(String own) {
        this.own = own;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getTypeOfNumber() {
        return typeOfNumber;
    }

    public void setTypeOfNumber(String typeOfNumber) {
        this.typeOfNumber = typeOfNumber;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Number(String value, String typeOfNumber, String action, String own) {
        this.value = value;
        this.typeOfNumber = typeOfNumber;
        this.action = action;
        this.own = own;
    }

    public Number() {}

    public String evaluate(Number firstNumber, Number secondNumber) {
        double firstNum = Double.parseDouble(firstNumber.getValue());
        double secondNum = Double.parseDouble(secondNumber.getValue());
        return switch (firstNumber.getAction()) {
            case "+" -> String.valueOf(firstNum + secondNum);
            case "-" -> String.valueOf(firstNum - secondNum);
            case "/" -> String.valueOf(firstNum / secondNum);
            case "*" -> String.valueOf(firstNum * secondNum);
            default -> null;
        };
    }

    @Override
    public String toString() {
        return value;
    }
}
