package spk.master.interfaces;
public class Batman implements Movie, Pemain{
    @Override
    public void namaMovie() {
     System.out.println("Batman");
    }   
    @Override
    public int tahunPembuatan() {
    return 2016; //method function 
    }
    @Override
    public void namaPemain() {
     System.out.println("Waluyo");
    }
}