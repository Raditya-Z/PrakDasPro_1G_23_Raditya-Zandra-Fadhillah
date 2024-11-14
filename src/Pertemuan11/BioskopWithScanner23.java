package Pertemuan11;
import java.util.Scanner;
public class BioskopWithScanner23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom, opsi;
        String nama, next;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("----------------------------");
            System.out.println("======== OPSI MENU =========");
            System.out.println("----------------------------");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.println("----------------------------");
            System.out.print("Pilih opsi (1-3) : ");
            opsi = sc.nextInt();
            sc.nextLine();

            if (opsi == 1) {
                while (true) {
                System.out.print("Masukkan nama: ");
                nama = sc.nextLine();
                System.out.print("Masukkan baris: ");
                baris = sc.nextInt();
                System.out.print("Masukkan kolom: ");
                kolom = sc.nextInt();
                sc.nextLine();
                if (baris < 1 || baris > 4) {
                    System.out.println("Baris atau kolom tidak valid! Silahkan masukkan ulang. ");
                    continue;
                } else if (kolom < 1 || kolom > 2) {
                    System.out.println("Baris atau kolom tidak valid! Silahkan masukkan ulang.");
                    continue;
                } else if (penonton[baris-1][kolom-1] != null) {
                    System.out.println("Kursi yang dipilih sudah terisi. Silahkan masukkan baris dan kolom kembali.");
                    continue;
                }
                penonton[baris-1][kolom-1] = nama;
                System.out.print("Input penonton lainnya? (y/n): ");
                next = sc.nextLine();
    
                if (next.equalsIgnoreCase("n")) {
                break; 
                }
                }
                    
            } else if (opsi == 2) {
                System.out.println("======= DAFTAR PENONTON =======");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        System.out.println("Penonton baris" + i + ", " + "kolom" + j + " = " + penonton[i][j]);
                    }
                }
            } else if (opsi == 3) {
                break;
            }

        }
    }
}
