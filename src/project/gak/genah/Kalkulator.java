/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.gak.genah;

import java.util.Scanner;

/**
 *
 * @author WIN 10
 */
public class Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Array
        String[] Aritmatika = {"penjumlahan","pengurangan","perkalian","pembagian","Sisa Bagi"};
    int angka1,angka2, hasil;    
        //perulangan
    System.out.println("Pilih Operator Aritmatika Sesuai Nomor");
    for (int i = 0; i < Aritmatika.length; i++){
        System.out.println(+i+"." + Aritmatika[i]);
    }
    
    Scanner input = new Scanner (System.in);
    
    System.out.print("Masukkan Nomor Pilihan : ");
    int pilihan = input.nextInt();
    //percabangan switch case
    switch (pilihan){
        case 0 :
            System.out.println("Penjumlahan");
            System.out.println("angka pertama : ");
            angka1 = input.nextInt();
            System.out.println("angka kedua : ");
            angka2 = input.nextInt();
            hasil = angka1 + angka2;
            System.out.println("Hasil ="+ hasil);
            break;
        case 1 :
            System.out.println("Pengurangan");
            System.out.println("angka pertama : ");
            angka1 = input.nextInt();
            System.out.println("angka kedua : ");
            angka2 = input.nextInt();
            hasil = angka1 - angka2;
            System.out.println("Hasil ="+ hasil);
            break;
        case 2 :
            System.out.println("Perkalian");
            System.out.println("angka pertama : ");
            angka1 = input.nextInt();
            System.out.println("angka kedua : ");
            angka2 = input.nextInt();
            hasil = angka1 * angka2;
            System.out.println("Hasil ="+ hasil);
            break;
        case 3 :
            System.out.println("pembagian");
            System.out.println("angka pertama : ");
            angka1 = input.nextInt();
            System.out.println("angka kedua : ");
            angka2 = input.nextInt();
            hasil = angka1 / angka2  ;
            System.out.println("Hasil ="+ hasil);
            break;
        case 4 :
            System.out.println("sisa bagi");
            System.out.println("angka pertama : ");
            angka1 = input.nextInt();
            System.out.println("angka kedua : ");
            angka2 = input.nextInt();
            hasil = angka1 % angka2  ;
            System.out.println("Hasil ="+ hasil);
            break;
        default:
            System.out.println("kode anda salah goblok");
    }
    }
}
