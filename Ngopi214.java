import java.util.Scanner;
public class Ngopi214 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] menu = {
            "Nasi Goreng", "Mie Goreng", "Roti Goreng", "Kentang Goreng", "Teh tarik", "Cappucino", "Chocolatte Ice"
        };

        System.out.print("Masukkan Jumlah Pesanan: ");
        int jumlahPesanan = sc.nextInt();
        sc.nextLine();

        String[] namaPesanan = new String[jumlahPesanan];
        double[] hargaPesanan = new double[jumlahPesanan];
        double totalHarga = 0;

        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.print("Masukkan nama pesanan ke-" + (i+1) + ": ");
            namaPesanan[i] = sc.nextLine();
            System.out.print("Masukkan harga pesanan ke-" + (i+1) + ": ");
            hargaPesanan[i] = sc.nextDouble();
            sc.nextLine();
            totalHarga += hargaPesanan[i];
        }

        System.out.println("Daftar Pesanan: ");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println((i+1)+ ". " + namaPesanan[i] + " - Rp" + hargaPesanan[i]);
        }
        System.out.println("Total Harga: Rp " + totalHarga);

        System.out.print("Masukkan nama makanan yang ingin dicari: ");
        String key = sc.nextLine();
        boolean found = false;

        for (int i = 0; i < menu.length; i++) {
            if (key.equalsIgnoreCase(menu[i])) {
                System.out.println("Makanan " + key + " tersedia di menu.");
                found = true;
                break;
            }
        }
        if(!found) {
            System.out.println("Makanan " + key + " tidak ditemukan dimenu.");
        }
    }
}
