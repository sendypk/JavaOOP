package spk.master.statis.data;

public class User {

    static String nama ="Sendy";
    String nik;
    static int umur = 20;
   
    public static void tanyaNama(){
       System.out.println("Nama :"+nama);
     }
    
    public static int umur(){
        int hasilUmur = 20;
        return hasilUmur;
    }
}