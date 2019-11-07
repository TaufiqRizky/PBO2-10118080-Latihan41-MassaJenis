/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118080.latihan41.massajenis;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class PBO210118080Latihan41MassaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("=======Massa Jenis Kubus=======");
        System.out.print("Sisi\t: ");
        Scanner a = new Scanner(System.in);
        int s = a.nextInt();
        System.out.print("Massa\t: ");
        Scanner b = new Scanner(System.in);
        int m = b.nextInt();
        System.out.println("");
        
        Kubus cube= new Kubus();
        cube.setMassa(m);
        cube.setSisi(s);
        
        //output
        System.out.println("=======Hasil Perhitungan=======");
        System.out.println("Volume\t: "+cube.hitungVolume(cube.getSisi()));
        System.out.println("Massa Jenis\t: "+cube.hitungMassaJenis(cube.getMassa(), cube.getSisi()));
        
    }
    
}
