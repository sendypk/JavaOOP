package spk.master.encapsulation.aplikasi;
import spk.master.encapsulation.data.Mahasiswa;
public class Program {

    public static void main(String[] args) {
    Mahasiswa objek = new Mahasiswa();
    
    objek.getNama();
    objek.modifikasiNama("");
    System.out.println(objek.getNama());
    }
    
}
