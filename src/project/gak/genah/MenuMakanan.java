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
public class MenuMakanan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Array
        String[] Menu = {"Sate Ayam","Sate Kambing","Sate Bebek"};
        int[] Harga = {12000,17000,15000};
        
        System.out.println("Selamat datang");
        System.out.println("Menu Makanan");
        //Perulangan
        for (int i = 0; i < Menu.length; i++){
            System.out.println(1+". "+Menu[i]+" = "+ Harga[i]);
        }
        //Scanner
        System.out.println("Silahkan Pilih Menu Yang Ingin Anda Pesan:");
        Scanner io = new Scanner(System.in);
        int pilihan = io.nextInt();
        System.out.println("Menu pilihan : "+ Menu[pilihan]);
        
        //percabangan else if
        System.out.println("silahkan masukan uang anda");
        int uang = io.nextInt();
        if (uang > Harga[pilihan]){
            System.out.println("kembalian"+(uang - Harga[pilihan]));
        }else if (uang == Harga[pilihan]){
            System.out.println("terima Kasih Uang Anda Pas");
        }else{
            System.out.println("Uang Anda Kurang "+(Harga[pilihan]-uang));
        }
}}
