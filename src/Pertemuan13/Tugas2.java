package Pertemuan13;
import java.util.Scanner;
public class Tugas2 {
    public static int[][] inputDataPenjualan(String[] menu, int hari) {
        Scanner sc = new Scanner(System.in);
        int[][] dataPenjualan = new int[menu.length][hari];

        System.out.println("\nMasukkan data penjualan per menu untuk setiap hari:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println("Menu: " + menu[i]);
            for (int j = 0; j < hari; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                dataPenjualan[i][j] = sc.nextInt();
            }
        }
        return dataPenjualan;
    }

    public static void tampilkanDataPenjualan(String[] menu, int[][] dataPenjualan) {
        System.out.println("\nRekap Penjualan (Tabel):");
        System.out.println("-----------------------------------------------------------------------");
        System.out.print("Menu\t\t");
        for (int i = 1; i <= 7; i++) {
            System.out.print("Hari " + i + "\t");
        }
        System.out.println();
        System.out.println("-----------------------------------------------------------------------");
        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i]);

            if (menu[i].length() < 8) {
                System.out.print("\t\t");
            } else {
                System.out.print("\t");
            }
            for (int j = 0; j < dataPenjualan[i].length; j++) {
                System.out.print(dataPenjualan[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------------------");
    }


    public static void menuPenjualanTertinggi(String[] menu, int[][] dataPenjualan) {
        int maxPenjualan = 0;
        String menuTerlaris = "";
        for (int i = 0; i < menu.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < dataPenjualan[i].length; j++) {
                totalPenjualan += dataPenjualan[i][j];
            }
            if (totalPenjualan > maxPenjualan) {
                maxPenjualan = totalPenjualan;
                menuTerlaris = menu[i];
            }
        }
        System.out.println("\nMenu dengan penjualan tertinggi: " + menuTerlaris + " dengan total " + maxPenjualan + " porsi.");
    }

    public static void rataRataPenjualan(String[] menu, int[][] dataPenjualan) {
        System.out.println("\nRata-rata penjualan per menu:");
        for (int i = 0; i < menu.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < dataPenjualan[i].length; j++) {
                totalPenjualan += dataPenjualan[i][j];
            }
            double rataRata = (double) totalPenjualan / dataPenjualan[i].length;
            System.out.println(menu[i] + ": " + String.format("%.2f", rataRata) + " porsi.");
        }
    }

    public static void main(String[] args) {
        String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};

        int hari = 7;

        int[][] dataPenjualan = inputDataPenjualan(menu, hari);

        tampilkanDataPenjualan(menu, dataPenjualan);

        menuPenjualanTertinggi(menu, dataPenjualan);

        rataRataPenjualan(menu, dataPenjualan);
    }
}
