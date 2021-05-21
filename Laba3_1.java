import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int x = scanner.nextInt();

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int y = sc.nextInt();

        int k = 0;
        double [][] mas = new double[x][x];
        Random r = new Random();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                mas[i][j] = -50 + 100*r.nextDouble();
                System.out.print(mas[i][j] + " ");
            }System.out.println("");
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (mas[i][j] < 0) {
                    if (Math.abs(i - j) < y) {
                        k++;
                        System.out.print("Положение числа: ");
                        System.out.println(i + " " + j);
                    }
                }
            }
        }
        System.out.print("Количество: ");
        System.out.println(k);

        }




    }

