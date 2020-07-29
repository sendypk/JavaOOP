package Parameter;

public class Aplikasi {
    
    public static void main(String[] args) {
        
        User objek = new User();
        int beratNormal = objek.normalBerat(170, 75);  
        System.out.println("Berat Normalnya adalah :"+beratNormal);
                 objek.nama ("Sendy");
  
    }
}
