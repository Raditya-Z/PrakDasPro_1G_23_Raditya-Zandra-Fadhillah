import java.util.Scanner;

public class DosenDemo22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah dosen: ");
        int jumlah = input.nextInt();
        input.nextLine();
        DataDosen22 list = new DataDosen22(jumlah);

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan data dosen ke-" + (i + 1));
            System.out.print("Nama          : ");
            String nama = input.nextLine();
            System.out.print("Kode          : ");
            String kode = input.nextLine();
            System.out.print("Jenis Kelamin (Pria/Wanita): ");
            String inputKelamin = input.nextLine().toLowerCase();
            Boolean jenisKelamin = inputKelamin.equals("pria");

            System.out.print("Usia          : ");
            int usia = input.nextInt();
            input.nextLine();

            Dosen22 d = new Dosen22(kode, nama, jenisKelamin, usia);
            list.tambah(d);
        }

        list.tampil();

        System.out.println("-----------------------------");
        System.out.println("Menggunakan sequential search");
        System.out.println("-----------------------------");
        System.out.print("Masukkan nama dosen yang dicari: ");
        String cari = input.nextLine();
        list.PencarianDataSequential22(cari);

        System.out.println("-----------------------------");
        System.out.println("Menggunakan binary search");
        System.out.println("-----------------------------");
        System.out.print("Masukkan usia dosen yang dicari: ");
        int temu = input.nextInt();
        list.PencarianDataBinary22(temu);
    }
}
