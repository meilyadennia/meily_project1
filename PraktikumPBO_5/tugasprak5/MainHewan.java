/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasprak5;

/**
 *
 * @author ASUS
 */
public class MainHewan {
    public static void main(String[] args) {
        Kucing kiki = new Kucing();
        kiki.nama = "Kiki";
        kiki.jenis = "British Shorthair";
        kiki.suara = "Meow meow";
        kiki.usia = 5;
        System.out.println("Informasi Kucing");
        kiki.infohewan();
        kiki.suarahewan();
        
        Anjing layla = new Anjing();
        layla.nama = "Layla";
        layla.jenis = "Border Collie";
        layla.suara = "Woof woof";
        layla.usia = 12;
        System.out.println("\nInformasi Anjing");
        layla.infohewan();
        layla.suarahewan();
    }
}
