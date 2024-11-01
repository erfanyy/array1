import java.util.Scanner;

public class SearchNilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyak nilai yang akan diinput: ");
        int jumlahElemen = sc.nextInt();
        int[] arrNilai = new int[jumlahElemen];

        // Input nilai ke dalam array
        for (int i = 0; i < jumlahElemen; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arrNilai[i] = sc.nextInt();
        }

        // Input nilai yang ingin dicari
        System.out.print("Masukkan nilai yang akan dicari: ");
        int key = sc.nextInt();

        // Mencari nilai dalam array
        boolean found = false;
        System.out.print("Nilai " + key + " ketemu di index ke- ");
        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                System.out.print(i + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.println("\nNilai yang dicari tidak ditemukan.");
        } else {
            System.out.println();
        }

        sc.close();
    }
}
