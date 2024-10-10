package Pertemuan6;
import java.util.Scanner;
public class Pemilihan2Percobaan223 {
    public static void main(String[] args) {
        Scanner input23 = new Scanner(System.in);
        int pilihan_menu;
        String member, jenisPembayaran;
        double harga = 0, diskon, total_bayar = 0;

        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("-------------------------------------");
        System.out.print("masukkan angka dari menu yang dipilih = ");
        pilihan_menu = input23.nextInt();
        input23.nextLine();
        System.out.print("Apakah punya member (y/n) ? = ");
        member = input23.nextLine();
        System.out.print("Jenis pembayaran = ");
        jenisPembayaran = input23.nextLine();
        System.out.println("-------------------------------------");

        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);

            }else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);
            }else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }
            
            total_bayar = harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon = " + total_bayar);
        
        }
        
        else if (member.equalsIgnoreCase("n")) {
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);

            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);

            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
                
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }

            System.out.println("Total bayar = " + harga);

        } else {
            System.out.println("Member tidak valid");
        }

        if (jenisPembayaran.equalsIgnoreCase("QRIS")) {
            if (member.equalsIgnoreCase("y")) {
                total_bayar -= 1000;
                System.out.println("Potongan Rp. 1000 karena pembayaran menggunakan QRIS");
                System.out.println("Total bayar setelah potongan pembayaran QRIS (jika ada) = " + total_bayar);
            } else {
                harga -= 1000;
                System.out.println("Potongan Rp. 1000 karena pembayaran menggunakan QRIS");
                System.out.println("Total bayar setelah potongan pembayaran QRIS (jika ada) = " + harga);
            }

        }
        
        System.out.println("-------------------------------------");

    }
}
