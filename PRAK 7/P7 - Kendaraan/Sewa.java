// Nama 	: Kaila Talitha Putri
// Nim 	: 24060123140179
// Lab 	: C1

public class Sewa {
    public static void main(String[] args) {
        Vehicle kendaraan = new Vehicle();
        Vehicle mobil = new Car();
        Vehicle bis = new Bus();

        kendaraan.calRent(50, 1000);
        mobil.calRent(50,1000);
        bis.calRent(50, 1000);

        hitungSewa(kendaraan);
        hitungSewa(mobil);
        hitungSewa(bis);
    }

    static void hitungSewa(Vehicle v){
        v.sewa();
    }
}
