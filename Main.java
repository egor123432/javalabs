import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        double x;
        double y;
        double a;
        double b;
        double s, sa;

        Scanner scanner = new Scanner(System.in);
        x = scanner.nextFloat();

        s = Math.cos(Math.pow(Math.abs(x), 0.5));
        sa = Math.pow(s, 2) + 5;
        a = Math.pow(Math.pow(Math.acos(s/sa), 6), 0.2);
        b = Math.log10(Math.pow(4, (1/Math.tan(4*x)))+ 5)/Math.log10(2);

        y =  a + b;

        System.out.println(y);

        boolean t = ((x >= -1.5) && (x <= 1.5)) && ((y >= -1.5) && (y <= 1.5));
            System.out.println(t);

    }


}
