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
public class Penilangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //array
        String[] Tilangan = {"masker","SIM"};
        int pilihan, pilih; 
        //perulangan
     System.out.println("Pilih Operator Tipe Tilangan Sesuai Nomor");
    for (int i = 0; i < Tilangan.length; i++){
        System.out.println(+i+"." + Tilangan[i]);
    }
     Scanner input = new Scanner (System.in);
     System.out.print("Masukkan Pilihan : ");
     pilihan = input.nextInt();
     //percabangan switch case
    switch (pilihan){
        case 0 :
            System.out.println("Membawa Masker Atau Tidak");
            System.out.println("Membawa(1)");
            System.out.println("Tidak bawa(2)");
            pilih = input.nextInt();
            if (pilih == 1){
                System.out.print("Silahkan Jalan");
            }else{
                System.out.print("Silahkan sapu jalan atau denda 50.000");
            }
            break;
        case 1 :
            System.out.println("Membawa Sim Atau Tidak");
            System.out.println("Membawa(1)");
            System.out.println("Tidak bawa(2)");
            pilih = input.nextInt();
            if (pilih == 1){
                System.out.println("sim anda kami tahan");
            }else{
                System.out.println("Apa anda membawa STNK");
                int STNK;
                System.out.println("Membawa(1)");
                System.out.println("Tidak bawa(2)");
                STNK = input.nextInt();
                if (STNK == 1){
                    System.out.println("STNK anda kami tahan");
                }else{
                    System.out.println("Kendaraan anda kami tahan");
                }
            }
            break;


}  } }  