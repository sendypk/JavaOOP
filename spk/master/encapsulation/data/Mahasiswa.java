
package spk.master.encapsulation.data;

public class Mahasiswa {
 
    private String nama;
    private int umur;
    //atribut nama
    public String getNama(){
        if(this.nama == null){
            System.out.println("Nama Kosong, belum diisi");
        }
        return this.nama;
    }
    public void modifikasiNama(String nama){
        this.nama = nama;
        if(nama.isEmpty()){
            System.out.println("Nama belum ditentukan");
        }
    }
    //atribut umur
    public int getUmur(){
        return this.umur;
    }
    public void modifikasiUmur(int umur){
        this.umur = umur;
    }
}