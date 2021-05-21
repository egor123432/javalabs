import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: n = ");
        int n = scanner.nextInt();

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: m = ");
        int m = sc.nextInt();

        int [][] mas = new int[n][m];
        int arr[] = new int[m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mas[i][j] = ((int) (Math.random() * 101) - 50);
                System.out.print(mas[i][j] + " ");
            }System.out.println();
        }

        for (int i = 0; i < m; i++) {
            int k = Math.abs(mas[i][0]);
            for (int j = 1; j < n; j++) {
                k = Math.min(k, Math.abs(mas[i][j]));
            }
            arr[i] = k;
        }

        System.out.print("Массив ответов: ");
        for (int i = 0; i < m; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");

    }

}


