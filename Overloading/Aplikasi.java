
package Overloading;

public class Aplikasi {

    public static void main(String[] args) {
        Menghitung objek = new Menghitung();
        int penjumlahan1 = objek.penjumlahan(20, 10);
        int penjumlahan2 = objek.penjumlahan(100, 100, 100);
        double penjumlahan3 = objek.penjumlahan(20.9, 10.23);
        
        System.out.println("Penjumlahan dengan 2 parameter" + penjumlahan1);
        System.out.println("Penjumlahan dengan 3 parameter" + penjumlahan2);
        System.out.println("Penjumlahan dengan 2 parameter beda tipe data" + penjumlahan3);
    }
    
}
