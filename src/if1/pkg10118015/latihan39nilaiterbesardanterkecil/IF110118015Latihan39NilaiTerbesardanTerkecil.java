/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118015.latihan39nilaiterbesardanterkecil;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA                 : Adi Chandra Nugraha
 * KELAS                : IF-1
 * NIM                  : 10118015
 * Deskripsi Program    : Program ini berisi program mencari nilai terbesar dan terkecil
 */
public class IF110118015Latihan39NilaiTerbesardanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        nilaimhs mhs = new nilaimhs();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama Petugas : ");
	String petugas = input.next();
	System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
	int jumlahmhs = input.nextInt();
        
        mhs.inputnilai(jumlahmhs);
        mhs.tampilNilai(jumlahmhs);
        mhs.tampilnilter(jumlahmhs);
        System.out.println();
	System.out.println("Nilai Terbesar adalah " + mhs.terbesar);
	System.out.println("Nilai Terkecil adalah " + mhs.terkecil);
        System.out.println();
        System.out.println("Petugas : "+ petugas);
        System.out.println("(Developed by : Adi Chandra Nugraha)");
    }
    
}
