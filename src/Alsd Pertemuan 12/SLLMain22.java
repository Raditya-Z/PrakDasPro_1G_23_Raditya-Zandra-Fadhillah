import java.util.Scanner;
public class SLLMain22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SingleLinkedList22 sll = new SingleLinkedList22();

        System.out.println("Linked List Mahasiswa");
        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = input.nextInt();
        input.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nama mahasiswa: ");
            String nama = input.nextLine();
            System.out.print("Masukkan nim mahasiswa: ");
            String nim = input.nextLine();
            System.out.print("Masukkan kelas mahasiswa: ");
            String kelas = input.nextLine();
            System.out.print("Masukkan ipk mahasiswa: ");
            double ipk = input.nextDouble();
            System.out.println();

            Mahasiswa22 mhs = new Mahasiswa22(nama, nim, kelas, ipk);
            input.nextLine(); 
            sll.addLast(mhs);
        }
        sll.print();

        System.out.println("data index 1 : ");
        sll.getData(1);

        System.out.println("data mahasiswa an Bimon berada pada index : "+sll.indexOf("bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }
}