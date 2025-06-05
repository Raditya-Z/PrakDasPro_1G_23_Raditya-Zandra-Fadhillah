public class BinaryTreeArray22 {
    Mahasiswa22[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray22() {
        this.dataMahasiswa = new Mahasiswa22[10];
    }

    void populateData (Mahasiswa22 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2*idxStart + 1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2*idxStart + 2);
            }
        }
    }

    public void add(Mahasiswa22 data) {
        if (dataMahasiswa[0] == null) {
            dataMahasiswa[0] = data;
            idxLast = 0;
            return;
        }

        int index = 0;
        while (index < dataMahasiswa.length) {
            if (data.ipk < dataMahasiswa[index].ipk) {
                index = 2 * index + 1;
            } else {
                index = 2 * index + 2;
            }

            if (index >= dataMahasiswa.length) {
                System.out.println("Array sudah penuh atau tidak cukup besar!");
                return;
            }

            if (dataMahasiswa[index] == null) {
                dataMahasiswa[index] = data;
                if (index > idxLast) {
                    idxLast = index;
                }
                return;
            }
        }
    }

    public void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast && dataMahasiswa[idxStart] != null) {
            dataMahasiswa[idxStart].tampilInformasi();
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }

}
