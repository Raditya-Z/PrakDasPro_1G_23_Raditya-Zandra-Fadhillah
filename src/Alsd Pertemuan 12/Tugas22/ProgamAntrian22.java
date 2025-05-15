package Tugas22;

public class ProgamAntrian22 {
    Node22 head;
    Node22 tail;
    int size;
    int jumlahAntrian;

    public ProgamAntrian22(int size) {
        this.size = size;
        head = null;
        tail = null;
        jumlahAntrian = 0;
    }

    boolean isEmpty() {
        return (head == null);
    }

    public void print() {
        if (!isEmpty()) {
            Node22 tmp = head;
            System.out.println("Isi linked list:");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void addLast(Mahasiswa22 input) {
        Node22 ndInput = new Node22(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
        jumlahAntrian++;
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada mahasiswa yang dipanggil.");
        } else if (head == tail) {
            head = tail = null;
            jumlahAntrian--;
        } else {
            head = head.next;
            jumlahAntrian--;
        }
    }

    public void KosongkanAntrian() {
        head = tail = null;
        jumlahAntrian = 0;
        System.out.println("Antrian telah dikosongkan.");
    }
    
}
