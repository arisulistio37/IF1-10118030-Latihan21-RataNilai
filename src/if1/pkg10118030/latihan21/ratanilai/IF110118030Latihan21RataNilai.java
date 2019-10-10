/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118030.latihan21.ratanilai;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : Ari Sulistio
 * KELAS    : IF-1
 * NIM      : 10118030
 * Deskripsi Program    : Program ini berisi tentang Rata Rata nilai Mahasiswa
 */
public class IF110118030Latihan21RataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int array[], i, n;
    array = new int[100];
    float rata, total=0;
    Scanner scan = new Scanner(System.in);
    System.out.print("Masukkan Banyaknya Mahasiswa: ");
    n = scan.nextInt();
    for(i = 1; i <= n; i++){
      System.out.print("Nilai Mahasiswa ke-"+ i +" : ");
      array[i] = scan.nextInt();
      total = total + array[i];
    }
    rata = total/n;
    System.out.println("Maka, Rata-rata Nilainya adalah : " + rata);
        System.out.println("Developed by : Ari Sulistio");
    }
    
}
