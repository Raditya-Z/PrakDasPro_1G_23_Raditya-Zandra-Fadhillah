import java.util.Scanner;
public class Flowchart23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String namaMakanan1, namaMakanan2, namaMakanan3;
        double totalAkhir;
        int hargaMakanan1, hargaMakanan2, hargaMakanan3, jumlahBeli1, jumlahBeli2, jumlahBeli3, totalBelanja;

        System.out.print("Masukkan nama makanan 1: ");
        namaMakanan1 = input.nextLine();
        System.out.print("Masukkan harga makanan 1: ");
        hargaMakanan1 = input.nextInt();
        System.out.print("Masukkan jumlah pembelian: ");
        jumlahBeli1 = input.nextInt();

        input.nextLine();

        System.out.print("Masukkan nama makanan 2: ");
        namaMakanan2 = input.nextLine();
        System.out.print("Masukkan harga makanan 2: ");
        hargaMakanan2 = input.nextInt();
        System.out.print("Masukkan jumlah pembelian: ");
        jumlahBeli2 = input.nextInt();

        input.nextLine();
        
        System.out.print("Masukkan nama makanan 3: ");
        namaMakanan3 = input.nextLine();
        System.out.print("Masukkan harga makanan 3: ");
        hargaMakanan3 = input.nextInt();
        System.out.print("Masukkan jumlah pembelian: ");
        jumlahBeli3 = input.nextInt();

        totalBelanja = (hargaMakanan1 * jumlahBeli1) + (hargaMakanan2 * jumlahBeli2) + (hargaMakanan3 * jumlahBeli3);

        System.out.println("total belanja: " + totalBelanja);

        if (totalBelanja > 100000 && totalBelanja < 200000) {
            totalAkhir = totalBelanja - (totalBelanja * 0.02);
        }else if (totalBelanja > 200000 && totalBelanja < 500000) {
            totalAkhir = totalBelanja - (totalBelanja * 0.05);
        }else if (totalBelanja > 500000) {
            totalAkhir = totalBelanja - (totalBelanja * 0.1); 
        }else {
            totalAkhir = totalBelanja;
        }

        System.out.println("total akhir: " + totalAkhir);

    }

}

        