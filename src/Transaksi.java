package src;
import java.util.ArrayList;

public class Transaksi {
    private ArrayList<Produk> produkList = new ArrayList<>();
    private double totalHarga;

    public void tambahProduk(Produk produk) {
        produkList.add(produk);
    }

    public double hitungTotal() {
        totalHarga = 0;
        for (Produk produk : produkList) {
            totalHarga += produk.getHarga();
        }
        return totalHarga;
    }

    public void tampilkanTransaksi() {
        System.out.println("Daftar Produk yang Dibeli:");
        for (Produk produk : produkList) {
            System.out.println("- " + produk.getNama() + " | Harga: " + produk.getHarga());
        }
        System.out.println("Total Harga: " + hitungTotal());
    }
}
