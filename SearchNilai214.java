import java.util.Scanner;
public class SearchNilai214 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyak nilai yang akan diinput: ");
        int jumlahElemen = sc.nextInt();
        int[] arrNilai = new int[jumlahElemen];

        for (int i = 0; i < jumlahElemen; i++) {
            System.out.print("Masukan nilai mahasiswa ke-" + (i + 1) + " : ");
            arrNilai[i] = sc.nextInt();
        }

        System.out.print("Masukan nilai yang dicari: ");
        int key = sc.nextInt();

        boolean found = false;
        System.out.print("Nilai " +key+ "Ketemu di Index ke- ");
        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                System.out.print(i + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Nilai yang dicari tidak ditemukan.");
        }else{
            System.out.println();
        }
        double total = 0;
        int max = arrNilai[0];
        int min = arrNilai[0];

        for (int i = 0; i < arrNilai.length; i++) {
            total += arrNilai[i];
            if (arrNilai[i] > max) {
                max = arrNilai[i];
            }
            if (arrNilai[i] < min) {
                min = arrNilai[i];
            }
        }
        double rata2 = total / arrNilai.length;
        System.out.println("Total nilai = " +total);
        System.out.println("Rata-rata tertinggi = " +rata2);
        System.out.println("Nilai tertinggi  = " +max);
        System.out.println("Nilai terendah = " +min);

        sc.close();
    }

}
