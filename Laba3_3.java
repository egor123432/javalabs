import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int n = sc.nextInt();
        int[] mas = new int[n];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            mas[i] = r.nextInt(3) - 1;
            System.out.print(mas[i]+" ");
        }
        System.out.println(); //мод пузырек
        for (int i = 0; i < n; i++){
            int temp = mas[i];
            int k = i;
            for (int j = i + 1; j<n; j++){
                if (mas[j] > temp){
                    temp = mas[j];
                    k = j;
                }
            }
            mas[k] = mas[i];
            mas[i] = temp;
        }

        System.out.println("Отсортированный массив: ");
        for (int i = 0; i < n; i++) {
            System.out.print(mas[i]+" ");
        }
    }
}
