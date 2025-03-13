package minggu5;
public class Latihan {
    String[] nama = {"Ahmad", "Budi", "Cindy", "Dian", "Eko", "Fajar", "Gina", "Hadi"};
    int[] nim = {220101001, 220101002, 220101003, 220101004, 220101005, 220101006, 220101007, 220101008};
    int[] tahunMasuk = {2022, 2022, 2021, 2021, 2023, 2020, 2023, 2020};
    int[] nilaiUTS = {78, 85, 90, 76, 92, 88, 80, 82};
    int[] nilaiUAS = {82, 88, 87, 79, 95, 85, 83, 84};

    int cariUTSTertinggi(int l, int r) {
        if (l == r) {
            return nilaiUTS[l];
        }
        int mid = (l + r) / 2;
        int leftMax = cariUTSTertinggi(l, mid);
        int rightMax = cariUTSTertinggi(mid + 1, r);
        return Math.max(leftMax, rightMax);
    }

    int cariUTSTerendah(int l, int r) {
        if (l == r) {
            return nilaiUTS[l];
        }
        int mid = (l + r) / 2;
        int leftMin = cariUTSTerendah(l, mid);
        int rightMin = cariUTSTerendah(mid + 1, r);
        return Math.min(leftMin, rightMin);
    }

    double hitungRataRataUAS() {
        double total = 0;
        for (int nilai : nilaiUAS) {
            total += nilai;
        }
        return total / nilaiUAS.length;
    }
}
