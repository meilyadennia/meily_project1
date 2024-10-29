/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasmodul10;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        //Menghitung pajak Elektronik
        Pembayaran pajakElektronik = new Elektronik();
        System.out.println("Harga asli barang elektronik: " + pajakElektronik.hargaAsli(200000));
        System.out.println("Harga barang elektronik setelah pajak: " + pajakElektronik.hitungPajak(200000));
        
        //Menghitung pajak Makanan
        Pembayaran pajakMakanan = new Makanan();
        System.out.println("\nHarga asli makanan: " + pajakMakanan.hargaAsli(50000));
        System.out.println("Harga makanan setelah pajak: " + pajakMakanan.hitungPajak(50000));
    }
}
