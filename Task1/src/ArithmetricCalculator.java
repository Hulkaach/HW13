public class ArithmetricCalculator {
    double num1;
    double num2;

//    public ArithmetricCalculator(double num1, double num2) {
//        this.num1 = num1;
//        this.num2 = num2;
//    }

    public double calculate(double x, double y, Operation operation) {
        double value = 0;
        if (operation.getValue() == 1) {
            value = x + y;
        } else if (operation.getValue() == 2) {
            value = x - y;
        } else if (operation.getValue() == 3) {
            value = x * y;
        } else System.out.println("Неправильный ввод");
        return value;
    }


}
