public class StackSurat22 {
    Surat22[] stack;
    int top;
    int size;

    public StackSurat22(int size) {
        this.size = size;
        stack = new Surat22[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Surat22 srt) {
        if (!isFull()) {
            top++;
            stack[top] = srt;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    public Surat22 pop() {
        if (!isEmpty()) {
            Surat22 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada surat untuk diproses.");
            return null;
        }
    }

    public Surat22 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada surat yang dikumpulkan.");
            return null;
        }
    }

    public void cariSurat(String namaMahasiswa) {
        boolean found = false;
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(namaMahasiswa)) {
                System.out.println("Surat atas nama " + stack[i].namaMahasiswa + " ditemukan dengan id surat: " + stack[i].idSurat);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Surat tidak ditemukan.");
        }
    } 
}
