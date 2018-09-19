/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author REL-KA
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int umur =32;
        String paras="cantik";
        String Iq="pintar";
        
        if(umur >=20 && umur <=23 && paras == "cantik" && Iq == "pintar"){
            System.out.println("Pasti Mau");
        }
        else if(umur >=20 && umur <= 23 && paras == "cantik" && Iq == "gak pintar gapapa"){
            System.out.println("Oke lah");
        }
        else if(umur >23 && paras == "cantik" && Iq == "gak pintar gapapa"){
            System.out.println("Saya pikir dulu");
        }
        else{
            System.out.println("Enggak mau");
        }
        
    }
    
    
    
}
