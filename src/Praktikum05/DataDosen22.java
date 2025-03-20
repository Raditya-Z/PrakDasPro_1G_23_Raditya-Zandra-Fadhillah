public class DataDosen22 {
    int idx;
    Dosen22 [] listDosen;

    DataDosen22 (int jumlah) {
        listDosen= new Dosen22[jumlah];
    }

    void tambah(Dosen22 d){
        if (idx < listDosen.length) {
            listDosen[idx] = d;
            idx++;
        } else {
            System.out.println("data sudah penuh");
        }
    }

    void tampil(){
        for (Dosen22 d : listDosen) {
            d.tampil();
            System.out.println("--------------------");
        }
    }

    void bubbleSort(){
        for (int i = 0; i < listDosen.length-1; i++) {
            for (int j = 1; j < listDosen.length-i; j++) {
                if (listDosen[j].usia < listDosen[j-1].usia) {
                    Dosen22 tmp = listDosen[j];
                    listDosen[j] = listDosen[j-1];
                    listDosen[j-1] = tmp;
                }
            }
        }
    }

    void selectionSort(){
        for (int i = 0; i < listDosen.length-1; i++) {
            int idxMin = i;
            for (int j = i+1; j < listDosen.length; j++) {
                if (listDosen[j].usia > listDosen[idxMin].usia) {
                    idxMin = j;
                }
            }
            Dosen22 tmp = listDosen[idxMin];
            listDosen[idxMin] = listDosen[i];
            listDosen[i] = tmp;
        }
    }
    
    void InsertionSort(){
        for (int i = 1; i < listDosen.length; i++) {
            Dosen22 temp = listDosen[i];
            int j = i;
            while (j>0 && listDosen[j-1].usia < temp.usia) {
                listDosen[j] = listDosen[j-1];
                j--;
            }
            listDosen[j] = temp; 
        }
    }
}
