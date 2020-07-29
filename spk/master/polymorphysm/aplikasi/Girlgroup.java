
package spk.master.polymorphysm.aplikasi;
import spk.master.polymorphysm.data.Informasi;
import spk.master.polymorphysm.data.Movie;
import spk.master.polymorphysm.data.StarShip;

public class Girlgroup {

    public static void main(String[] args) {
    
        Movie m = new Movie();
        m.setJudul("As your Wish");
        m.setNegara("Amerika");
        m.setTahun(2017);
        
        Informasi i = new Informasi();
        i.info(m);
    }
    
}
