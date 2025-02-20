public class DosenMain23 {
    public static void main(String[] args) {
        Dosen23 dosen1 = new Dosen23();
        dosen1.nama = "Candra Bella Vista, S.Kom., MT.";
        dosen1.idDosen = "VIS";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 1990;
        dosen1.bidangKeahlian = "Agama";

        dosen1.tampilInformasi();
        dosen1.setStatusAktif(false);
        dosen1.hitungMasaKerja(2025);
        dosen1.ubahKeahlian("Basis Data");
        dosen1.tampilInformasi();

        Dosen23 mk2 = new Dosen23("Sastrio Binusa S, SS, M.Pd", "SBS", false, 2005, "Aljabar Linear");
        mk2.tampilInformasi(); 
        dosen1.setStatusAktif(true);
        dosen1.hitungMasaKerja(2025);
        dosen1.ubahKeahlian("Bahasa Inggris");
        mk2.tampilInformasi();
    }


}
