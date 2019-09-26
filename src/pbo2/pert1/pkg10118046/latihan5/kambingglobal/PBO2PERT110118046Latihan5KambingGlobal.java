/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pert1.pkg10118046.latihan5.kambingglobal;

/**
 *
 * @author
 *  Nama              : M. Hilmy Naufal
 *  Kelas             : IF2
 *  NIM               : 10118046
 *  Deskripsi Program : menampilkan jumlah kambing, menambah jumlah kambing lalu menampilkan lagi jumlah kambing yang sudah tertambah
 */
public class PBO2PERT110118046Latihan5KambingGlobal {

    /**
     * @param args the command line arguments
     */
    
    int jumlahKambing = 88;
    
    public void getJumlahKambing() {
        System.out.println("Jumlah Kambing: " + jumlahKambing);
    }
    
    public void tambahKambing() {
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambah: " + jumlahKambing);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        PBO2PERT110118046Latihan5KambingGlobal kambingSusu = new PBO2PERT110118046Latihan5KambingGlobal();
        kambingSusu.getJumlahKambing();
        kambingSusu.tambahKambing();
        kambingSusu.getJumlahKambing();
    }

}
