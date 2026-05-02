package Q1;

public class Question1 {

    public static void main(String[] args) {

        double A = 2;
        double B = 3;
        double C = 4;
        double X = 5;
        double Y = 6;
         double r = 7;

        double a = Math.sqrt(Math.pow(B,2) + 4*A*C);
        double b = Math.sqrt(X + 4*Math.pow(Y,3));
         double c = Math.cbrt(X * Y);
        double d = Math.PI * Math.pow(r,2);

         System.out.println("a = " + a);
         System.out.println("b = " + b);
         System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}