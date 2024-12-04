package Pertemuan13;

public class PengunjungCafe23 {
    public static void daftarPengunjung(String... namaPengujung) {
        System.out.println("Daftar Nama Pengunjung:");
        for (int i = 0; i < namaPengujung.length; i++) {
            System.out.println("- " + namaPengujung[i]);
        }
    }

    public static void main(String[] args) {
        daftarPengunjung("Ali","Budi", "Citra");
    }
}
