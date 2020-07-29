
package Constructor;

public class Aplikasi {

    public static void main(String[] args) {

        Customer objek = new Customer();
        Customer objek2 = new Customer("Sendy");
        Customer objek3 = new Customer("Sendy", 48);
        objek.alamat();
    }
    
}
