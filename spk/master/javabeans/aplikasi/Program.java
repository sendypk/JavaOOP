
package spk.master.javabeans.aplikasi;
import spk.master.javabeans.info.Mahasiswa;
public class Program {

    public static void main(String[] args) {
        Mahasiswa objek = new Mahasiswa();
        objek.setNama("Sendy");
        objek.getNama();
        
        System.out.println(objek.getNama());
    }
    
}
