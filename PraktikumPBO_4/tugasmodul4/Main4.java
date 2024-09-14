/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasmodul4;

/**
 *
 * @author user
 */
public class Main4 {
    public static void main(String[] args) {
        Pekerja pekerja1 = new Pekerja("Giselle Aeri", 25, "Penyanyi", 10000000);
        
        //Menampilkan data pekerja dengan toString()
        System.out.println(pekerja1.toString());
        
        //Mengubah nama pekerja
        pekerja1.setNama("Aeri Uchinaga");
        
        //Menampilkan informasi baru
        System.out.println("\nInformasi Pekerja Setelah Diubah");
        System.out.println(pekerja1.toString());
    }
}
