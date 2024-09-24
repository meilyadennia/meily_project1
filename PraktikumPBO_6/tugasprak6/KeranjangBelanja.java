/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasprak6;

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;
import java.util.List;

public class KeranjangBelanja {
    List<Produk> produklist;
    
    //Constructor Keranjang Belanja untuk membuat list
    public KeranjangBelanja() {
        produklist = new ArrayList<>();
    }
    public void tambahproduk(Produk produk) {
        produklist.add(produk);
    }
    //Menghitung total harga
    public double totalharga() {
        double total = 0;
        for (Produk produk : produklist) {
            total += produk.HargaSetelahDiskon();
        }
        return total;
    }
    //Menampilkan informasi produk
    public void informasiproduk() {
        for (Produk produk : produklist) {
            System.out.println("\nInformasi Produk ");
            System.out.println("Nama Produk : " + produk.getNama());
            System.out.println("Harga Asli : Rp " + produk.getHarga());
            System.out.println("Besar Diskon : " + produk.getPersenDiskon() + "%");
            System.out.println("Harga Akhir : Rp " + produk.HargaSetelahDiskon());
        }
    }
}
