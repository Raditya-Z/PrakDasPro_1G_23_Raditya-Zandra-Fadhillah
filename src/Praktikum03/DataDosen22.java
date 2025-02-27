public class DataDosen22 {
    public static void dataSemuaDosen(Dosen22[] arrayOfDosen) {
        System.out.println("\nData Semua Dosen:");
        for (Dosen22 dosen : arrayOfDosen) {
            dosen.cetakInfo();
        }
    }

    public static void jumlahDosenPerJenisKelamin(Dosen22[] arrayOfDosen) {
        int jumlahPria = 0, jumlahWanita = 0;
        for (Dosen22 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                jumlahPria++;
            } else {
                jumlahWanita++;
            }
        }
        System.out.println("\nJumlah Dosen Pria: " + jumlahPria);
        System.out.println("Jumlah Dosen Wanita: " + jumlahWanita);
    }


    public static void rataUsiaDosenPerJenisKelamin(Dosen22[] arrayOfDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int countPria = 0, countWanita = 0;

        for (Dosen22 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                totalUsiaPria += dosen.usia;
                countPria++;
            } else {
                totalUsiaWanita += dosen.usia;
                countWanita++;
            }
        }

        double rataPria = (countPria == 0) ? 0 : (double) totalUsiaPria / countPria;
        double rataWanita = (countWanita == 0) ? 0 : (double) totalUsiaWanita / countWanita;

        System.out.println("\nRata-rata Usia Dosen Pria: " + rataPria);
        System.out.println("Rata-rata Usia Dosen Wanita: " + rataWanita);
    }

    public static void infoDosenPalingTua(Dosen22[] arrayOfDosen) {
        Dosen22 dosenTertua = arrayOfDosen[0];

        for (Dosen22 dosen : arrayOfDosen) {
            if (dosen.usia > dosenTertua.usia) {
                dosenTertua = dosen;
            }
        }

        System.out.println("\nDosen Paling Tua:");
        dosenTertua.cetakInfo();
    }

    public static void infoDosenPalingMuda(Dosen22[] arrayOfDosen) {
        Dosen22 dosenTermuda = arrayOfDosen[0];

        for (Dosen22 dosen : arrayOfDosen) {
            if (dosen.usia < dosenTermuda.usia) {
                dosenTermuda = dosen;
            }
        }

        System.out.println("\nDosen Paling Muda:");
        dosenTermuda.cetakInfo();
    }
}
