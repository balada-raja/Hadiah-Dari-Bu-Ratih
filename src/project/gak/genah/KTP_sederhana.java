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
public class KTP_sederhana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //deklarsi variabel dan tipe data
        String nama,lahir,kelamin,alamat,agama,pekerjaan,goldar,status;
        
        Scanner io = new Scanner(System.in);
        //input data
        System.out.println("Masukan data data berikut");
        System.out.print("Nama :");
        nama = io.nextLine();
        System.out.print("Tempat tanggal lahir :");
        lahir = io.nextLine();
        System.out.print("Jenis kelamin :");
        kelamin = io.nextLine();
        System.out.print("Alamat :");
        alamat = io.nextLine();
        System.out.print("Agama :");
        agama = io.nextLine();
        System.out.print("Status Perkawinan:");
        status = io.nextLine();
        System.out.print("Pekerjaan :");
        pekerjaan = io.nextLine();
        System.out.print("Golongan darah");
        goldar = io.nextLine();
        //output data
        System.out.println("***************************************************");
        System.out.println("PROVINSI JAWA TIMUR KABUPATEN MADIUN");
        System.out.println("Nama :"+ nama);
        System.out.println("Tempat Tgl Lahir :"+ lahir);
        System.out.println("Jenis Kelamin :"+ kelamin);
        System.out.println("Alamat :"+ alamat);
        System.out.println("Agama :"+ agama);
        System.out.println("Pekerjaan :"+ pekerjaan);
        System.out.println("Status Perkawinan :"+ status);
        System.out.println("Gol Darah :"+ goldar);
    }
}
