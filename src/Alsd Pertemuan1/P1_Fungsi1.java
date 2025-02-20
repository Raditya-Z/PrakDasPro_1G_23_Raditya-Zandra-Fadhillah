public class P1_Fungsi1 {
    public static void main(String[] args) {
        String [] namaCabang = {"royalGarden1", "royalGarden2", "royalGarden3", "royalGarden4"};
        int[][] stokBunga = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };
        int[] hargaBunga = {75000, 50000, 60000, 10000};
        String[] namaBunga = {"Agolnema", "Keladi", "Alocasia", "Mawar"};
        int[] bungaMati = {1, 2, 0, 5};

        pendapatan(namaCabang, stokBunga, hargaBunga);
        System.out.println();
        System.out.println("========================================");
        System.out.println("           STOK ROYALGARDEN4             ");
        System.out.println("========================================");
        stokRoyalGarden4(stokBunga, bungaMati, namaBunga);
    }

    static void pendapatan (String[] namaCabang, int [][] stokBunga, int[] hargaBunga) {
        System.out.println("========================================");
        System.out.println("        PENDAPATAN SETIAP CABANG        ");
        System.out.println("========================================");
        for (int i = 0; i < namaCabang.length; i++) {
            int hasilPendapatan = 0;
            for (int j = 0; j < stokBunga[i].length; j++) {
                hasilPendapatan += (stokBunga[i][j] * hargaBunga[j]);
            }
            System.out.println("Jumlah Pendapatan " + namaCabang[i] + ": " + hasilPendapatan);
        }   
        System.out.println("========================================");
    }

    static void stokRoyalGarden4 (int[][] stokBunga, int[] bungaMati, String[] namaBunga) {
        for (int i = 0; i < stokBunga[3].length; i++) {
            int stokKurang =  (stokBunga[3][i] - bungaMati[i]);
            System.out.println(namaBunga[i] + ": " + stokKurang);
        }
        System.out.println("========================================");
    }
}
