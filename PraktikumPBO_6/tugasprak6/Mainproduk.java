/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasprak6;

/**
 *
 * @author ASUS
 */
public class Mainproduk {
    public static void main(String[] args) {
        Produk produk1 = new Buku("Laut Bercerita", 100000, 20);
        Produk produk2 = new Elektronik("Air Diffuser", 250000, 15);
        Produk produk3 = new Pakaian("Sweater", 320000, 35);
        
        System.out.println("KERANJANG BELANJA");
        KeranjangBelanja keranjang = new KeranjangBelanja();
        keranjang.tambahproduk(produk1);
        keranjang.tambahproduk(produk2);
        keranjang.tambahproduk(produk3);
        
        keranjang.informasiproduk();
        
        double totalharga = keranjang.totalharga();
        System.out.println("\nTotal Harga Setelah Diskon : Rp " + totalharga);   
    }
}
