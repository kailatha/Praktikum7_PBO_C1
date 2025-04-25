// Nama 	: Kaila Talitha Putri
// Nim 	: 24060123140179
// Lab 	: C1

public class AMain {
    public static void main(String[] args) {
        Anabul[] anabulPeliharaan = {
            new Kucing("Momo"),
            new Anjing("Haru"),
            new Burung("Raven")
        };

        for(Anabul anabul : anabulPeliharaan){
            anabul.gerak();
            anabul.bersuara();
            System.out.println();
        }
    }
    
}
