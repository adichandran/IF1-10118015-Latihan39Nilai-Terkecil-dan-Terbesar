/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118015.latihan39nilaiterbesardanterkecil;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class nilaimhs {
        public int terbesar = 0;
        public int terkecil = 100;
        public int[] nilaimhs = new int[100];
        
    public void inputnilai(int jmlmhs){
        double nilai;
        
        Scanner scanner = new Scanner(System.in);
        
        
	for( int i = 0; i < jmlmhs; i++){
		System.out.print("Masukkan Nilai Mahasiswa Ke-" + (i+1) + " : " );
		nilaimhs[i] =  scanner.nextInt();
		if(nilaimhs[i] > terbesar)
			terbesar = nilaimhs[i];
		if(nilaimhs[i] < terkecil)
			terkecil = nilaimhs[i];
	}
    }
    
    public void tampilNilai(int jmlmhs) {
        int i;
        System.out.println("===Hasil Nilai Mahasiswa===");
        for (i = 1; i <= jmlmhs; i++) {
            System.out.println("Nilai Mahasiswa ke-" + i + " = " + nilaimhs[i]);
        }
    }
    
    public void tampilnilter(int jmlMhs) {
        int i;

        terbesar = nilaimhs[1];
        terkecil = nilaimhs[1];

        for (i = 1; i <= jmlMhs; i++) {
            if (nilaimhs[i] > terbesar) {
               terbesar = nilaimhs[i];
            } else if (nilaimhs[i] < terkecil) {
                terkecil = nilaimhs[i];
            }
        }
    }
}
