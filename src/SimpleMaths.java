public class SimpleMaths {

    public static void main(String[] args) {

        int numberOne = 278;
        int numberTwo = 192;

        int sum = (numberOne + numberTwo);
        int difference = (numberOne - numberTwo);
        int product =  (numberOne * numberTwo);
        double qoutient = (double) numberOne / numberTwo;

        System.out.println(numberOne + " + " + numberTwo + " = " + sum);
        System.out.println(numberOne + " - " + numberTwo + " = " + difference);
        System.out.println(numberOne + " * " + numberTwo + " = " + product);
        System.out.format(numberOne + " / " + numberTwo + " = %.2f", qoutient);


    }

}
