import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double x, y;

        Scanner scanner = new Scanner(System.in);
        x = scanner.nextFloat();

        if (x <= 1) {
            y = Math.asin(x / (Math.pow(x, 2) + 1));
        } else if ((x > 1) && (x < 2)) {
            y = Math.log(Math.pow(x, 4) / (1 + Math.pow(x, 4)));
        } else {
            y = Math.log(Math.abs(Math.pow(2, -x) * Math.pow(x, 4 - x))) / Math.log(10);
        }

        System.out.println(y);
    }
}



