package spk.master.innerclass.aplikasi;

import spk.master.innerclass.info.Kampus;
import spk.master.innerclass.info.Kampus.Dosen;

public class Program {

    public static void main(String[] args) {
        
    Kampus objekUtama = new Kampus();
    Dosen objekInner = objekUtama.new Dosen();
    
    objekInner.setNama("Sendy");
    System.out.println(objekInner.getNama());
    }
    
}
