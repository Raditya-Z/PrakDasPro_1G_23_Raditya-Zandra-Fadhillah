package Pertemuan10;
import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String namaMakanan;
        int hasil = 0;
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};

        System.out.print("Masukkan Nama Makanan : ");
        namaMakanan = sc.nextLine();

        for (int i = 0; i < menu.length; i++) {
            if (namaMakanan.equalsIgnoreCase(menu[i])) {
                System.out.println("================");
                System.out.println("Makanan Tersedia");
                System.out.println("================");
                break;
            } else {
                hasil = -1;
            }
        }

        if (hasil == -1) {
            System.out.println();
            System.out.println("=============================");
            System.out.println("Makanan tidak ada dalam menu ");
            System.out.println("=============================");
        }

    }

}
