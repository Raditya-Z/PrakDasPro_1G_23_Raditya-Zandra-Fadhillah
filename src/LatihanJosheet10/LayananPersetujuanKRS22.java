import java.util.Scanner;
public class LayananPersetujuanKRS22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianLayanan22 antrian = new AntrianLayanan22(10);
        int pilihan;

        do {
            System.out.println("\n=== Menu Antrian Layanan Akademik ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Lihat Mahasiswa Terdepan");
            System.out.println("4. Lihat Semua Antrian");
            System.out.println("5. Jumlah Mahasiswa dalam Antrian");
            System.out.println("6. Cek Antrian paling belakang");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("8. Cetak jumlah yang sudah melakukan KRS");
            System.out.println("9. Cetak jumlah yang belum melakukan KRS");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt(); sc.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    Mahasiswa22 mhs = new Mahasiswa22(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    Mahasiswa22[] dilayani = antrian.layaniMahasiswa();
                    if (dilayani != null) {
                        System.out.println("Melayani mahasiswa: ");
                        dilayani[0].tampilkanData();
                        dilayani[1].tampilkanData();
                    }
                    break;
                case 3:
                    antrian.lihatTerdepan();
                    break;
                case 4:
                    antrian.tampilkanSemua();
                    break;
                case 5:
                    System.out.println("Jumlah dalam antrian: " + antrian.getJumlahAntrian());
                    break;
                case 6:
                    antrian.LihatAkhir();
                    break;
                case 7:
                    antrian.clear();
                    break;
                case 8:
                    System.out.println("Jumlah yang sudah melakukan KRS: " + antrian.SudahKrs());
                    break;
                case 9:
                    System.out.println("Jumlah yang belum melakukan KRS: " + antrian.BelumKrs());
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");;
            }
        } while (pilihan != 0);
        sc.close();
    }
}

