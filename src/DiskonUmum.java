package src;
public class DiskonUmum implements InterfaceDiskon {

    @Override
    public double hitungDiskon(double totalHarga) {
        return totalHarga * 0.05;  // 5% diskon untuk umum
    }
}
