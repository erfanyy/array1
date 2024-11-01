import java.util.Scanner;
public class Ngopi14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan Jumlah Pesanan: ");
        int jumlahPesanan = sc.nextInt();
        sc.nextLine();

        String[] namaPesanan = new String[jumlahPesanan];
        double[] hargaPesanan = new double[jumlahPesanan];
        double totalHarga = 0;

        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.print("Masukkan nama pesanan ke-" + (i + 1) + ": ");
            namaPesanan[i] = sc.nextLine();
            System.out.print("Masukkan harga pesanan ke-" + (i + 1) + ": ");
            hargaPesanan[i] = sc.nextDouble();
            sc.nextLine();
            totalHarga += hargaPesanan[i];
        }

        System.out.println("Daftar Pesanan");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println((i + 1) + ". " + namaPesanan[i] + " -Rp" +hargaPesanan[i]);
        }
        System.out.println("Total Harga: Rp " +totalHarga);

    }
}
