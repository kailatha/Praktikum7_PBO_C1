// Nama 	: Kaila Talitha Putri
// Nim 	: 24060123140179
// Lab 	: C1

public class Programmer extends Pegawai {
    private int bonus = 450000;

    public Programmer(String nama) {
        this.nama = nama;
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus : " + bonus);
    }
}
