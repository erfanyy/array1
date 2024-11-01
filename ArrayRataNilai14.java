import java.util.Scanner;
public class ArrayRataNilai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan Jumlah Mahasiswa: ");
        int jumlahMhs = sc.nextInt();

        int[] nilaiMhs= new int [jumlahMhs];
        double total = 0;
        int countLulus = 0;
        int countTidakLulus = 0;
        double totalLulus = 0;
        double totalTidakLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukan Nilai Mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
            if (nilaiMhs[i] > 70) {
                countLulus++;
                totalLulus += nilaiMhs[i];
            } else {
                countTidakLulus++;
                totalTidakLulus += nilaiMhs[i];
            }
        }
        double rata2 = total/nilaiMhs.length;
        double rata2Lulus = countLulus > 0 ? totalLulus / countLulus : 0;
        double rata2TidakLulus = countTidakLulus > 0 ? totalTidakLulus / countTidakLulus : 0;

        System.out.println("Rata-Rata Nilai Lulus = " +rata2Lulus);
        System.out.println("Rata-Rata Nilai Tidak Lulus = " +rata2TidakLulus);
    }
}
