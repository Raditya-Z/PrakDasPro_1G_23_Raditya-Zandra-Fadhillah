package minggu5;
public class MainLatihan {
    public static void main(String[] args) {
        Latihan data = new Latihan();

        int utsTertinggi = data.cariUTSTertinggi(0, data.nilaiUTS.length - 1);
        int utsTerendah = data.cariUTSTerendah(0, data.nilaiUTS.length - 1);
        double rataRataUAS = data.hitungRataRataUAS();
    System.out.println("=================== NILAI UTS TERTINGGI ======================");
    System.out.println("--------------------------------------------------------------");
    System.out.println("Nama\t\tNIM\t\tTahun Masuk\tUTS Tertinggi");
    System.out.println("--------------------------------------------------------------");

    for (int i = 0; i < data.nilaiUTS.length; i++) {
        if (data.nilaiUTS[i] == utsTertinggi) {
            System.out.print(data.nama[i] + "\t\t");
            System.out.print(data.nim[i] + "\t");
            System.out.print(data.tahunMasuk[i] + "\t\t");
            System.out.println(data.nilaiUTS[i]);
        }
    }
    System.out.println("--------------------------------------------------------------\n");

    System.out.println("=================== NILAI UTS TERENDAH ======================");
    System.out.println("--------------------------------------------------------------");
    System.out.println("Nama\t\tNIM\t\tTahun Masuk\tUTS Tertinggi");
    System.out.println("--------------------------------------------------------------");

    for (int i = 0; i < data.nilaiUTS.length; i++) {
        if (data.nilaiUTS[i] == utsTerendah) {
            System.out.print(data.nama[i] + "\t\t");
            System.out.print(data.nim[i] + "\t");
            System.out.print(data.tahunMasuk[i] + "\t\t");
            System.out.println(data.nilaiUTS[i]);
        }
    }
    System.out.println("--------------------------------------------------------------\n");

    System.out.println("=================== NILAI RATA-RATA UAS ======================");
    System.out.println("--------------------------------------------------------------");
    System.out.println("Nama\t\tNIM\t\tTahun Masuk\tNilai UAS");
    System.out.println("--------------------------------------------------------------");

    for (int i = 0; i < data.nama.length; i++) {
            System.out.print(data.nama[i] + "\t\t");
            System.out.print(data.nim[i] + "\t");
            System.out.print(data.tahunMasuk[i] + "\t\t");
            System.out.println(data.nilaiUAS[i]);
    }
    System.out.println("--------------------------------------------------------------");
    System.out.println("\t\t RATA-RATA UAS\t\t\t" + rataRataUAS);
    System.out.println("--------------------------------------------------------------");

    }
}
