/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ganjilgenap;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Ganjilgenap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] bilangan = new int[2];
        int bil1,bil2;
        int i;
        
        //membuat perulangan dari inputan user, dimana perulangan 
        //akan menampilkan output untuk menginputkan angka sebanyak 2 kali
        for (i = 0; i<2; i++){
            String nilai = JOptionPane.showInputDialog("Masukkan Bilangan: ");
            bilangan[i] = Integer.parseInt(nilai);
            System.out.println("Input Bilangan: "+nilai);
        
    }
        //menentukan bilangan ganjil genap
        for (i=0; i<2; i++){
            if (bilangan[i] %2 == 1){
            System.out.println("Bilangan "+bilangan[i]+" GANJIL");
            }
            else
            System.out.println("Bilangan "+bilangan[i]+" GENAP");
        }
    }
    
}
