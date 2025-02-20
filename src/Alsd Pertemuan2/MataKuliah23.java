public class MataKuliah23 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    void tampilInformasi () {
        System.out.println("==================================");
        System.out.println("Nama: " + nama);
        System.out.println("Kode MK: " + kodeMK);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
        System.out.println("==================================");
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS telah diperbarui");
    }

    void tambahJam(int jam) {
        jumlahJam += jam;
        System.out.println("Jumlah jam ditambahi: "  + jam);
    }

    void kurangiJam(int jam) {
        if (jumlahJam > jam) {
            jumlahJam -= jam;
            System.out.println("Jumlah jam dikurangi: "  + jam);
        } else {
            System.out.println("Pengurangan tidak dapat dilakukan"); 
        }
    }

    public MataKuliah23() {  
    }

    public MataKuliah23(String nm, String kodeMK, int sks, int jumlahJam) {
        nama = nm;
        this.kodeMK = kodeMK;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
}
