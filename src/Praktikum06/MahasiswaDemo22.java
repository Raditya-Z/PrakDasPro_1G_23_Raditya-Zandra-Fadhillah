import java.util.Scanner;
public class MahasiswaDemo22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MahasiswaBerprestasi22 list = new MahasiswaBerprestasi22();
        int jumMhs = 5;

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = input.nextLine();
            System.out.print("Nama  : ");
            String nama = input.nextLine();
            System.out.print("Kelas : ");
            String kelas = input.nextLine();
            System.out.print("IPK   : ");
            double ipk = input.nextDouble();
            input.nextLine(); 

            Mahasiswa22 m = new Mahasiswa22(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        list.tampil();
        //melakukan pencarian data sequential
        System.out.println("-----------------------------");
        System.out.println("Pencarian Data");
        System.out.println("-----------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = input.nextDouble();

        System.out.println("menggunakan sequential search");
        double posisi = list.sequentialSearching(cari);
        int pss = (int) posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);
    }
}
