/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfisnmo;

/**
 *
 * @author Suporte
 */
public class Polimorfisnmo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    Gato gato = new Gato();
    Cachorro cachorro = new Cachorro();
    Pato pato = new Pato(); 
    
   gato.comunicar();
   cachorro.comunicar();
   pato.comunicar();
    }
    
}
