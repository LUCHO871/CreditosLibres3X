/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ims;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author 1061693472
 */
public class Conjuntos {
    
    public static void main(String[] args){
        
        Set<String> conjunto = new HashSet<>();
        String actor1 = "chespirito";
        String actor2 = "Audrey Tatoo";
        String actor3 = "Megan Fox";
        String actor4 = "Arnold Scharcenegger";
        
        conjunto.add(actor1);
        conjunto.add(actor2);
        conjunto.add(actor3);
        conjunto.add(actor4);
        conjunto.add(actor2);
        conjunto.add(actor3);
        
        System.out.println(conjunto);
        System.out.println("Tamaño "+ conjunto.size());
                
    }
    
}
