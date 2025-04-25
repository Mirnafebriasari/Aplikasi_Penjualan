package src;
import java.util.Scanner;

public class PenjualanApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Transaksi transaksi = new Transaksi();

        // Input produk
        System.out.print("Masukkan jumlah produk: ");
        int jumlahProduk = scanner.nextInt();
        scanner.nextLine();  // consume newline

        for (int i = 0; i < jumlahProduk; i++) {
            System.out.print("Masukkan nama produk: ");
            String namaProduk = scanner.nextLine();
            System.out.print("Masukkan harga produk: ");
            double hargaProduk = scanner.nextDouble();
            scanner.nextLine();  // consume newline
            Produk produk = new Produk(namaProduk, hargaProduk);
            transaksi.tambahProduk(produk);
        }

        // Tampilkan produk dan total harga
        transaksi.tampilkanTransaksi();

        // Pilih jenis diskon
        System.out.println("Pilih jenis diskon:");
        System.out.println("1. Member");
        System.out.println("2. Umum");
        System.out.print("Pilih (1/2): ");
        int pilihanDiskon = scanner.nextInt();
        InterfaceDiskon diskon = null;
        
        if (pilihanDiskon == 1) {
            diskon = new DiskonMember();
        } else if (pilihanDiskon == 2) {
            diskon = new DiskonUmum();
        }

        // Hitung diskon dan total harga akhir
        double diskonHarga = diskon.hitungDiskon(transaksi.hitungTotal());
        double totalHargaAkhir = transaksi.hitungTotal() - diskonHarga;

        System.out.println("Diskon yang didapat: " + diskonHarga);
        System.out.println("Total Harga Setelah Diskon: " + totalHargaAkhir);
        scanner.close();
    }
}
