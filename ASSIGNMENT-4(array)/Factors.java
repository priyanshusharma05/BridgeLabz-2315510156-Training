import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int n = 5;
        int[] arr = new int[n];
        int ind = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                if (ind == arr.length) {
                    
                    int[] newArr = new int[arr.length * 2];
                    System.arraycopy(arr, 0, newArr, 0, arr.length);
                    arr = newArr;
                }
                arr[ind] = i;
                ind++;
            }
        }

        for (int i = 0; i < ind; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
