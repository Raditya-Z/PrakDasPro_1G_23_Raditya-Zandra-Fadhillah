package Pertemuan9;
import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1,j;
        String namaAtlet;

        while (i<5) {
            if (i == 1) {
                System.out.println("Perwakilan Cabang Olahraga Badminton");
            } else if (i == 2) {
                System.out.println("Perwakilan Cabang Olahraga Tenis Meja");
            } else if (i == 3) {
                System.out.println("Perwakilan Cabang Olahraga Basket");
            } else if (i == 4) {
                System.out.println("Perwakilan Cabang Olahraga Bola Voly");
            }


             for (j = 1; j <= 5; j++) {
                System.out.print("Masukkan Nama Atlet ke-" + j + ": " );
                namaAtlet = sc.nextLine();
            }
            i++;
            System.out.println();
        }
    }
}
