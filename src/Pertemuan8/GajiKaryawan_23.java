package Pertemuan8;
import java.util.Scanner;
public class GajiKaryawan_23 {
    public static void main(String[] args) {
        Scanner Raditya = new Scanner(System.in);
        int menu23, golongan23 = 0, jumlahKehadiran23 = 0, gajiPokok23 = 0; 
        double masaKerja23 = 0, Tunjangan23, uangMakan23, totalGaji23;
        String pilihan23, cetak23, kembaliKeMenu23;

        System.out.println("=== UTS PRAKTIKUM DASAR PEMOGRAMAN TI - 1G ===");
        System.out.println("dibuat oleh : Raditya Zandra Fadhillah");
        System.out.println("NIM : 244107020144");
        System.out.println("=================================");
        System.out.println(" ");

        do {
            System.out.println("===============================");
            System.out.println("Pilih Menu :");
            System.out.println("1. Data Karyawan");
            System.out.println("2. Gaji Karyawan");
            System.out.println("===============================");
            System.out.print("menu: ");
            menu23 = Raditya.nextInt();
            Raditya.nextLine();
            if(menu23 == 2) {
                System.out.println("Masukkan data karyawan terlebih dahulu kembali ke menu? : {y/t}");
                pilihan23 = Raditya.nextLine();

                if (pilihan23.equalsIgnoreCase("y")) {
                    System.out.println("===============================");
                    System.out.println("Pilih Menu :");
                    System.out.println("1. Data Karyawan");
                    System.out.println("2. Gaji Karyawan");
                    System.out.print("menu: ");
                    menu23 = Raditya.nextInt();
                } 
            }
            
            if (menu23 == 1) {
                System.out.println("Masukkan data karyawan");
                System.out.println(" ");
                System.out.println("Nama : Mamluatul");
                System.out.println("Alamat: Malang");
                System.out.println("NoHp : 0876535789");
                System.out.print("Golongan (1/2/3) : ");
                golongan23 = Raditya.nextInt();
                System.out.print("Masa Kerja :");
                masaKerja23 = Raditya.nextDouble();
                System.out.print("Jumlah Kehadiran :");
                jumlahKehadiran23 = Raditya.nextInt();
                Raditya.nextLine();
                System.out.println("Apakah anda ingin mencetak data karyawan? (y/t)");
                cetak23 = Raditya.nextLine();
                if (cetak23.equalsIgnoreCase("y")) {
                    System.out.println("===============================");
                    System.out.println("Data Karyawan");
                    System.out.println("===============================");
                    System.out.println("Nama : Mamluatul");
                    System.out.println("Alamat: Malang");
                    System.out.println("NoHp : 0876535789");
                    System.out.println("Golongan : " + golongan23);
                    System.out.println("Masa Kerja : " + masaKerja23);
                    System.out.println("Jumlah Kehadiran : " + jumlahKehadiran23);
                    System.out.println("kembali ke menu? {y/t}");
                    kembaliKeMenu23 = Raditya.nextLine();
                    if (kembaliKeMenu23.equalsIgnoreCase("t")) {
                        break;
                    }
                }

            } else if (menu23 == 2) {
                System.out.println("===============================");
                System.out.println("Data Gaji Karyawan");
                System.out.println("===============================");
                System.out.println("Nama : Mamluatul");
                if (golongan23 == 1) {
                    gajiPokok23 = 2000000;
                } else if (golongan23 == 2) {
                    gajiPokok23 = 2500000;
                } else if (golongan23 == 3) {
                    gajiPokok23 = 3000000; 
                }
                System.out.println("Gaji Pokok : " + gajiPokok23);

                if (masaKerja23 < 1) {
                    Tunjangan23 = 0;
                    
                } else if (masaKerja23 >= 1 && masaKerja23 <= 5) {
                    Tunjangan23 = gajiPokok23 * 0.1;
                } else if (masaKerja23 >= 6 && masaKerja23 <= 8) {
                    Tunjangan23 = gajiPokok23 * 0.2;
                } else {
                    Tunjangan23 = gajiPokok23 * 0.25;
                }
                System.out.println("Tunjangan : " + Tunjangan23);

                uangMakan23 = jumlahKehadiran23 * 35000;
                System.out.println("Uang makan : " + uangMakan23);

                totalGaji23 = gajiPokok23 + Tunjangan23 + uangMakan23;
                System.out.println("Gaji yang diterima : " + totalGaji23);
                System.out.println("kembali ke menu? {y/t}");
                kembaliKeMenu23 = Raditya.nextLine();
                
                if (kembaliKeMenu23.equalsIgnoreCase("t")) {
                    break;
                } 
            }

        } while (true);
    }
}
