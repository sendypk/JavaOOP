
package spk.master.konversipoly;

public class Aplikasi { 

    public static void main(String[] args) {
    
        Kampus k = new Mahasiswa();
        Mahasiswa m = (Mahasiswa)k;
        
        m. getNamaKampus();
        
        m.setNIM("4869 ");
        System.out.println("NIM: "+m.getNIM());
    }
    
}
