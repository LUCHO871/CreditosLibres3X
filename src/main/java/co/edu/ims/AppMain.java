/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ims;

import co.edu.ims.modelo.Genero;
import co.edu.ims.modelo.Pelicula;
import com.google.gson.Gson;

/**
 *
 * @author 1061693472
 */
public class AppMain {
    
    public static void main(String[] args){
        Pelicula Terminator = new Pelicula("Terminator", 1985);
        Pelicula InsideOut = new Pelicula("Insade out", 2015);
        
        Pelicula Titanic = new Pelicula();
        Titanic.setTitulo("Titanic");
        Titanic.setAnio(1996);
        
        Genero Accion = new Genero ("accion");
        Genero Comedia = new Genero ("Comedia");
        Genero Animada = new Genero ("Animada");
        Genero Ficcion = new Genero ("Ficcion ");
        
        
        Terminator.getGeneros().add(Ficcion);
        Terminator.getGeneros().add(Accion);
        
        InsideOut.getGeneros().add(Animada);
        Titanic.getGeneros().add(Comedia);
        
        Gson gson = new Gson();
        String json = gson.toJson(Terminator);
        
        System.out.println(json);
        
        
        
        
        
        
    
    
    
}
    
}
