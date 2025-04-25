package src;
public class DiskonMember implements InterfaceDiskon {

    @Override
    public double hitungDiskon(double totalHarga) {
        return totalHarga * 0.1;  // 10% diskon untuk member
    }
}
