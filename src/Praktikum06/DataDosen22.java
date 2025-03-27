public class DataDosen22 {
    int idx = 0;
    Dosen22[] listDosen;

    DataDosen22(int jumlah) {
        listDosen = new Dosen22[jumlah];
    }

    void tambah(Dosen22 d) {
        if (idx < listDosen.length) {
            listDosen[idx] = d;
            idx++;
        } else {
            System.out.println("Data sudah penuh.");
        }
    }

    void tampil() {
        for (Dosen22 d : listDosen) {
            d.tampil();
            System.out.println("--------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listDosen.length - 1; i++) {
            for (int j = 1; j < listDosen.length - i; j++) {
                if (listDosen[j].usia < listDosen[j - 1].usia) {
                    Dosen22 tmp = listDosen[j];
                    listDosen[j] = listDosen[j - 1];
                    listDosen[j - 1] = tmp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < listDosen.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listDosen.length; j++) {
                if (listDosen[j].usia > listDosen[idxMin].usia) {
                    idxMin = j;
                }
            }
            Dosen22 tmp = listDosen[idxMin];
            listDosen[idxMin] = listDosen[i];
            listDosen[i] = tmp;
        }
    }

    void insertionSort() {
        for (int i = 1; i < listDosen.length; i++) {
            Dosen22 temp = listDosen[i];
            int j = i;
            while (j > 0 && listDosen[j - 1].usia < temp.usia) {
                listDosen[j] = listDosen[j - 1];
                j--;
            }
            listDosen[j] = temp;
        }
    }

    void PencarianDataSequential22(String cari) {
        int ketemu = 0;

        System.out.println("Hasil Pencarian:");
        for (int j = 0; j < listDosen.length; j++) {
            if (listDosen[j].nama.equalsIgnoreCase(cari)) {
                tampilDataSearchSequential(cari, j);
                ketemu++;
            }
        }

        if (ketemu == 0) {
            System.out.println("Data dosen dengan nama '" + cari + "' tidak ditemukan.");
        } else if (ketemu > 1) {
            System.out.println("Peringatan: Ditemukan lebih dari satu dosen dengan nama '" + cari + "'!");
        }
    }

    void tampilDataSearchSequential(String x, int pos) {
        System.out.println("Nama\t: " + listDosen[pos].nama);
        System.out.println("Kode\t: " + listDosen[pos].kode);
        System.out.println("Jenis Kelamin\t: " + (listDosen[pos].jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia\t: " + listDosen[pos].usia);
        System.out.println("--------------------");
    }

    void PencarianDataBinary22(int temu) {
        bubbleSort(); 
        int posisi = PencarianDataBinary22(temu, 0, listDosen.length - 1);

        if (posisi == -1) {
            System.out.println("Data dosen dengan usia " + temu + " tidak ditemukan.");
            return;
        }

        System.out.println("Hasil Pencarian:");
        int kiri = posisi - 1;
        int kanan = posisi + 1;
        int ketemu = 1;
        tampilDataSearchBinary(temu, posisi);

        while (kiri >= 0 && listDosen[kiri].usia == temu) {
            tampilDataSearchBinary(temu, kiri);
            ketemu++;
            kiri--;
        }

        while (kanan < listDosen.length && listDosen[kanan].usia == temu) {
            tampilDataSearchBinary(temu, kanan);
            ketemu++;
            kanan++;
        }

        if (ketemu > 1) {
            System.out.println("Peringatan: Ditemukan lebih dari satu dosen dengan usia '" + temu + "'!");
        }
    }

    int PencarianDataBinary22(int temu, int left, int right) {
        if (right >= left) {
            int mid = (left + right) / 2;
            if (listDosen[mid].usia == temu) {
                return mid;
            } else if (listDosen[mid].usia < temu) {
                return PencarianDataBinary22(temu, left, mid - 1);
            } else {
                return PencarianDataBinary22(temu, mid + 1, right);
            }
        }
        return -1;
    }

    void tampilDataSearchBinary(int x, int pos) {
        System.out.println("Nama\t: " + listDosen[pos].nama);
        System.out.println("Kode\t: " + listDosen[pos].kode);
        System.out.println("Jenis Kelamin\t: " + (listDosen[pos].jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia\t: " + listDosen[pos].usia);
        System.out.println("--------------------");
    }
}
