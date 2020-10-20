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
public class Konversi_Suhu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //array
        String[] konversi = {"Fahrenheit","Kelvin","Reamur"};
       int pilihan;
    double angka, hasil;    
        //perulangan
    System.out.println("Konversi Suhu");
    System.out.println("pilih Nomor");
    for (int i = 0; i < konversi.length; i++){
        System.out.println(+i+"." + konversi[i]);
    }
    
    Scanner input = new Scanner (System.in);
    
    System.out.print("Masukkan Pilihan : ");
    pilihan = input.nextInt();
    //percabangan switch case
    switch (pilihan){
        case 0 :
            System.out.println("Fahrenheit");
            System.out.println("angka (celcius) : ");
            angka = input.nextDouble();
            hasil = (1.8 * angka) + 32;
            System.out.println("Hasil ="+ hasil+"°F");
            break;
        case 1 :
            System.out.println("Kelvin");
            System.out.println("angka (celcius) : ");
            angka = input.nextDouble();
            hasil = angka + 273.15;
            System.out.println("Hasil ="+ hasil+"K");
            break;
        case 2 :
            System.out.println("Reamur");
            System.out.println("angka (celcius) : ");
            angka = input.nextDouble();
            hasil = 0.8 * angka;
            System.out.println("Hasil="+ hasil+"°");
            break;
    }
    }
    
}
