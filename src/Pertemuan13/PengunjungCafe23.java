package Pertemuan13;

public class PengunjungCafe23 {
    public static void daftarPengunjung(String... namaPengujung) {
        System.out.println("Daftar Nama Pengunjung:");
        for (String daftarPengunjung : namaPengujung) {
            System.out.println("- " + daftarPengunjung);
        }
    }

    public static void main(String[] args) {
        daftarPengunjung("Ali","Budi", "Citra");
    }
}
