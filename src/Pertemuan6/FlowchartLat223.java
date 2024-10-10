package Pertemuan6;
import java.util.Scanner;
public class FlowchartLat223 {
    public static void main(String[] args) {
        Scanner input23 = new Scanner(System.in);
        String jenisBuku;
        int jumlahBuku, diskon;

        System.out.print("Masukkan Jenis Buku: ");
        jenisBuku = input23.nextLine();
        System.out.print("Masukkan Jumlah Buku: ");
        jumlahBuku = input23.nextInt();

        if (jenisBuku.equalsIgnoreCase("kamus")) {
            if (jumlahBuku > 2) {
                System.out.println("diskon 12%");
            } else {
                System.out.println("diskon 10%");
                return;
            }
            
        }

        else if (jenisBuku.equalsIgnoreCase("novel")) {
            if (jumlahBuku > 3) {
                System.out.println("diskon 9%");
            } else {
                System.out.println("diskon 8%");
                return;
            }
            
        }
        
        else {
            if (jumlahBuku > 3) {
                System.out.println("diskon 5%");
            } else {
                System.out.println("diskon 0");
        }

        }    
        
    }
}
