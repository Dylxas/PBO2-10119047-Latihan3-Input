/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119047.latihan3.input;
import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Aldy Putra Hanggara
 * KELAS    : PBO2
 * NIM      : 10119047
 * DESKRIPSI PROGRAM : PROGRAM INI BERISI PROGRAM INPUT DENGAN KEYBOARD
 */

public class PBOIF210119047Latihan3Input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                
        System.out.print("Masukkan nama anda: ");
        Scanner scanner = new Scanner(System.in);
        
        String nama= scanner.nextLine();
        System.out.println("Nama anda adalah "+nama);
    }
    
}
