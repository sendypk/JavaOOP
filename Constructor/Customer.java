
package Constructor;

public class Customer {

    String nama;
    int umur;
    
    Customer(){
       System.out.println("Ini adalah COnstructor ke 1");
    }

    Customer(String nama){
       System.out.println("Ini adalah COnstructor ke 2"); 
    }
    
    Customer(String nama,int umur){
        System.out.println("Ini adalah COnstructor ke 3");
    }
    
    void alamat(){
        
    }
}