package spkjavaoop;

public class Mobil {
    String merek = "Toyota";
    String warna = "Biru";
    int harga = 100000000;
    final int tahun = 2018;
 
    int jarak = 90;
    int kecepatan = 60;
    int waktu = 3600;
    
    void jalan(){
        
        System.out.println("Laju mobil dengan kecepatan 70km/jam");
        System.out.println("Warna mobil adalah"+warna);
        System.out.println("Harga Mobil :"+harga);
    }
    
    int JarakTempuh(){
        
        int hitungJarak = kecepatan * waktu; //hantya1command
        return hitungJarak;
    }

    int waktuTempuh(){
        
        int hitungWaktu = jarak / kecepatan;
        return hitungWaktu;
    }
            
}
