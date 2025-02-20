public class MataKuliahMain23 {
    public static void main(String[] args) {
        MataKuliah23 mk1 = new MataKuliah23();
        mk1.nama = "Agama";
        mk1.kodeMK = "RTI242001";
        mk1.sks = 1;
        mk1.jumlahJam = 2;

        mk1.tampilInformasi();
        mk1.ubahSKS(2);
        mk1.tambahJam(2);
        mk1.tampilInformasi();
        
        MataKuliah23 mk2 = new MataKuliah23("Algoritma dan Struktur Data", "RTI242008", 2,5);
        mk2.tampilInformasi(); 
        mk2.kurangiJam(6);
        mk2.tampilInformasi();
        mk2.kurangiJam(1);
        mk2.tampilInformasi();
    }
}
