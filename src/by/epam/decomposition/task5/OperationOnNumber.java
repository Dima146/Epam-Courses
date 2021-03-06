package by.epam.decomposition.task5;

public final class OperationOnNumber {

    private OperationOnNumber() {
    }

    public  static double operateOnNumbers(double number) {
        if (number >= 0) {
            number = Math.pow(number, 2);
        } else {
            number = Math.pow(number, 4);
        }
        return number;
    }
}
