import java.util.Scanner;

public class P1_Perulangan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long nim;
        int n ;
        System.out.print("Masukkan Nim: ");
        nim = input.nextLong();
        n = (int) (nim % 100);
        System.out.println("n : " + n);

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print("* ");
            }
        }
    }
}