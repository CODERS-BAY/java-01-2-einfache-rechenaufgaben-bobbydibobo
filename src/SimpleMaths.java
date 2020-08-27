public class SimpleMaths {

    public static void main(String[] args) {

        int numberOne = 278;
        int numberTwo = 192;

        int sum = numberOne + numberTwo;
        int difference = numberOne - numberTwo;
        int product =  numberOne * numberTwo;
        double qoutient = numberOne / numberTwo;

        System.out.printf("%d + %d = %d %n",numberOne,numberTwo,sum);
        System.out.printf("%d - %d = %d %n",numberOne,numberTwo,difference);
        System.out.printf("%d * %d = %d %n",numberOne,numberTwo,product);
        System.out.printf("%d / %d = %.2f %n",numberOne,numberTwo,qoutient);


        System.out.println("\n");


        double numberOneD = 278;
        double numberTwoD = 192;

        double sumD = numberOneD + numberTwoD;
        double differenceD = numberOneD - numberTwoD;
        double productD =  numberOneD * numberTwoD;
        double qoutientD = numberOneD / numberTwoD;


        System.out.printf("%.0f + %.0f = %.0f %n",numberOneD,numberTwoD,sumD);
        System.out.printf("%.0f - %.0f = %.0f %n",numberOneD,numberTwoD,differenceD);
        System.out.printf("%.0f * %.0f = %.0f %n",numberOneD,numberTwoD,productD);
        System.out.printf("%.0f / %.0f = %.2f %n",numberOneD,numberTwoD,qoutientD);



    }

}
