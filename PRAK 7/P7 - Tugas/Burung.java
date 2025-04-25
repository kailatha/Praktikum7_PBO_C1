// Nama 	: Kaila Talitha Putri
// Nim 	: 24060123140179
// Lab 	: C1

class Burung extends Anabul{

    public Burung(String nama){
        super(nama);
    }
    
    @Override
    public void gerak(){
        System.out.println(nama + " bergerak dengan cara terbang");
    }

    @Override
    public void bersuara(){
        System.out.println(nama + " berbunyi cuit");
    }
}
