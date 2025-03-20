import java.util.Scanner;
public class MahasiswaDemo22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = input.nextInt();
        input.nextLine();
        MahasiswaBerprestasi22 list = new MahasiswaBerprestasi22(jumlah);

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("Nama  : ");
            String nama = input.nextLine();
            System.out.print("NIM   : ");
            String nim = input.nextLine();
            System.out.print("Kelas : ");
            String kelas = input.nextLine();
            System.out.print("IPK   : ");
            double ipk = input.nextDouble();
            input.nextLine(); 

            Mahasiswa22 m = new Mahasiswa22(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        System.out.println("Data mahasiswa sebelum sorting");
        list.tampil();
        System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC)");
        list.bubbleSort();
        list.tampil();
        System.out.println("Data yang sudah terurut menggunakan Selection Sort (ASC)");
        list.selectionSort();
        list.tampil();
        System.out.println("Data yang sudah terurut menggunakan Insertion Sort (DSC)");
        list.InsertionSort();
        list.tampil();
    }
}
