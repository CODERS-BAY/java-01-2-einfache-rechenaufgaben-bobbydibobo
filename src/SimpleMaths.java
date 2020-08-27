public class SimpleMaths {

    public static void main(String[] args) {

        double numberOne = 278;
        double numberTwo = 192;

        int sum = (int) (numberOne + numberTwo);
        int difference = (int) (numberOne - numberTwo);
        int product = (int) (numberOne * numberTwo);
        double qoutient = numberOne / numberTwo;

        System.out.println(numberOne + " + " + numberTwo + " = " + sum);
        System.out.println(numberOne + " - " + numberTwo + " = " + difference);
        System.out.println(numberOne + " * " + numberTwo + " = " + product);
        System.out.format(numberOne + " / " + numberTwo + " = %.2f", qoutient);


    }

}
