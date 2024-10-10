package Pertemuan6;
import java.util.Scanner;
public class FlowchartLat323 {
    public static void main(String[] args) {
        Scanner input23 = new Scanner(System.in);

        String merek, kategori, ukuran;
        int harga1_1, harga1_2, harga2_1, harga2_2, harga3_1, harga3_2;

        System.out.print("Masukkan merk: ");
        merek = input23.nextLine();
        System.out.print("Masukkan kategori: ");
        kategori = input23.nextLine();
        System.out.print("Masukkan ukuran: ");
        ukuran = input23.nextLine();

        if (merek.equalsIgnoreCase("converse")) {
            if (kategori.equalsIgnoreCase("slip on")) {
                if (ukuran.equalsIgnoreCase("36-40"))
                System.out.println("harga sepatu: Rp800.000");
            } else {
                System.out.println("harga sepatu: Rp1.200.000");
                return;
            }
        }

        else if (merek.equalsIgnoreCase("Sketcher")) {
            if (kategori.equalsIgnoreCase("Woman")) {
                if (ukuran.equalsIgnoreCase("36-41"))
                System.out.println("harga sepatu: Rp1.000.000");
            } else {
                System.out.println("harga sepatu: Rp1.800.000");
                return;
            }
        }

        else if (merek.equalsIgnoreCase("Nike")) {
            if (kategori.equalsIgnoreCase("Kids")) {
                if (ukuran.equalsIgnoreCase("36-40"))
                System.out.println("harga sepatu: Rp750.000");
            } else {
                System.out.println("harga sepatu: Rp1.500.000");
                return;
            }
        }

    }
}
