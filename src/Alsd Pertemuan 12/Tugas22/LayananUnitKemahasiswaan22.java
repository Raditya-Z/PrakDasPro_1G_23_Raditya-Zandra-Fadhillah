package Tugas22;
import java.util.Scanner;
public class LayananUnitKemahasiswaan22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ProgamAntrian22 antrian = new ProgamAntrian22(5);
        int pilihan;
        do {
            System.out.println("\n=== Menu Antrian Layanan Unit Kemahasiswaan ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Memanggil Antrian");
            System.out.println("3. Lihat Mahasiswa Terdepan");
            System.out.println("4. Lihat Mahasiswa Terakhir");
            System.out.println("5. Cek Antrian Kosong");
            System.out.println("6. Cek Antrian Penuh");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("8. Menampilkan jumlah mahasiswa yng ada di antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt(); input.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan nim mahasiswa: ");
                    String nim = input.nextLine();
                    System.out.print("Masukkan prodi mahasiswa: ");
                    String prodi = input.nextLine();
                    System.out.println();
                    Mahasiswa22 mhs = new Mahasiswa22(nama, nim, prodi);
                    antrian.addLast(mhs);
                    break;
                case 2:
                    if (!antrian.isEmpty()) { 
                        System.out.println("Memanggil mahasiswa:");
                        antrian.head.data.tampilInformasi();
                        antrian.removeFirst();
                    }
                    break;
                case 3:
                    if (antrian != null) {
                        System.out.println("Mahasiswa terdepan di antrian:");
                        antrian.head.data.tampilInformasi();
                    }
                    break;
                case 4:
                    if (antrian != null) {
                        System.out.println("Mahasiswa terakhir di antrian:");
                        antrian.tail.data.tampilInformasi();
                    }
                    break;
                case 5:
                    if (antrian.isEmpty()) {
                        System.out.println("Antrian kosong.");
                    } else {
                        System.out.println("Antrian tidak kosong.");
                    }
                    break;
                case 6:
                    if (antrian.jumlahAntrian == antrian.size) {
                        System.out.println("Antrian penuh.");
                    } else {
                        System.out.println("Antrian tidak penuh.");
                    }
                    break;
                case 7:
                    antrian.KosongkanAntrian();
                    break;
                case 8:
                    System.out.println("Jumlah mahasiswa di antrian: " + antrian.jumlahAntrian);
                    break;
                case 0:
                    System.out.println("Terima Kasih");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while(pilihan != 0);
    }
}
