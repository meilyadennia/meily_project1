/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsiUTS;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        
        System.out.println("Output Produk");
        Produk produk1 = new Elektronik("Laptop", 9000000, 2);
        produk1.tampilkanInfo();
        
        System.out.println("\nOutput Pegawai");
        Pegawai tetap = new PegawaiTetap("Meily", 5000000, 1000000);
        tetap.tampilkanInfo();
        
        System.out.println("\nOutput Polimorfisme");
        Produk produk2 = new Makanan("Ice Cream", 10000, "12-12-2024");
        produk2.tampilkanInfo();
        System.out.println(" ");
        Pegawai kontrak = new PegawaiKontrak("Karina", 3000000, 12);
        kontrak.tampilkanInfo();
    }
}
