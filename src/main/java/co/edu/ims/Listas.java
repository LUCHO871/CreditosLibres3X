/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ims;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author 1061693472
 */
public class Listas {
    
    public static void main(String[] args){
        List<String> lista = new ArrayList<>();
        String actor1 = "chespirito";
        String actor2 = "Audrey Tatoo";
        String actor3 = "Megan Fox";
        String actor4 = "Arnold Scharcenegger";
        
        lista.add(actor1);
        lista.add(actor2);
        lista.add(actor3);
        lista.add(actor4);
        lista.add(actor2);
        lista.add(actor3);
        
        
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("Tamaño "+ lista.size());
        
        
        
    }
    
}
