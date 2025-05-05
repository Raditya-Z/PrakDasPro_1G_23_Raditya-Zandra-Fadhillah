import java.util.Scanner;

public class SuratDemo22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pilih;
        StackSurat22 stack = new StackSurat22(5);
        do {
            System.out.println("\nMenu");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine(); 
            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String idSurat = scan.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = scan.nextLine();
                    System.out.print("Kelas: ");
                    String NIM = scan.nextLine();
                    System.out.print("Jenis Izin: ");
                    char kelas = scan.next().charAt(0);
                    System.out.print("Durasi: ");
                    int durasi = scan.nextInt();
                    Surat22 srt = new Surat22(idSurat, nama, NIM, kelas, durasi);
                    stack.push(srt);
                    System.out.printf("Surat %s berhasil dimasukkan\n", srt.namaMahasiswa);
                    break;
                case 2:
                    Surat22 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.printf("Surat oleh %s telah diproses dengan alasan %s selama %d jam mata kuliah\n", diproses.namaMahasiswa, diproses.jenisIzin, diproses.durasi);
                    } 
                    break;
                case 3:
                    Surat22 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Surat terakhir dimasukkan oleh " + lihat.namaMahasiswa);
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String namaMahasiswa = scan.nextLine();
                    stack.cariSurat(namaMahasiswa);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih >= 1 && pilih <= 4);
    }
}
