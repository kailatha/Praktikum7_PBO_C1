// Nama 	: Kaila Talitha Putri
// Nim 	: 24060123140179
// Lab 	: C1

public class Car extends Vehicle{
    void calRent(int jarak, float harga){
        float fare=jarak*harga;
        fare=fare-100.00f;
        System.out.println("harga sewa mobil = "+fare);
    }

    @Override
    void sewa() {
        System.out.println("Sewa mobil pribadi.");
    }
}
