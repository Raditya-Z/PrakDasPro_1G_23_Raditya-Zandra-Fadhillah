package Pertemuan13;
import java.util.Scanner;
public class Kafe23 {
    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {  
        System.out.println("Selamat datang, " + namaPelanggan + "!");  
        
        if (isMember) {  
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");  
        }  
        
        System.out.println("===== MENU RESTO KAFE =====");  
        System.out.println("1. Kopi Hitam - Rp 15.000");  
        System.out.println("2. Cappuccino - Rp 20.000");  
        System.out.println("3. Latte - Rp 22.000");  
        System.out.println("4. Teh Tarik - Rp 12.000");  
        System.out.println("5. Roti Bakar - Rp 10.000");  
        System.out.println("6. Mie Goreng - Rp 18.000");  
        System.out.println("===========================");  
        System.out.println("Silakan pilih menu yang Anda inginkan.");

        if (kodePromo == "DISKON50") {
            System.out.println("diskon 50%");
        } else if (kodePromo == "DISKON30") {
            System.out.println("diskon 30%");
        } else {
            System.out.println("Kode Invalid");
        }

    }

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String diskon) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

        if (diskon.equals("DISKON50")) {
            hargaTotal = (int) (hargaTotal *0.5);
        } else if (diskon.equals("DISKON30")) {
            hargaTotal = (int) (hargaTotal - (hargaTotal * 0.3));
        } else {
            System.out.println("Kode Invalid");
        }

        return hargaTotal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
        int pilihanMenu = sc.nextInt();
        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();
        sc.nextLine();
        System.out.print("Masukkan diskon: ");
        String diskon = sc.nextLine();

        int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, diskon);


        System.out.println("Total harga untuk pesanan Anda: Rp" + totalHarga);
    }

}
