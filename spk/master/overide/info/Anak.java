package spk.master.overide.info;

public class Anak extends Keluarga{

    public void alamat(){
   System.out.println("Anak Alamat : Jakarta");
    }
    public void alamatOrangTua(){
        super.alamat();
    }
}
