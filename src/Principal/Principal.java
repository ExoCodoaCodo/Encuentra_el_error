package Principal;

import clases.Persona;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jose.zapatagom
 */
public class Principal {
    
    
    
    public static void main(String []args){
    
        System.out.println("hola Personas");
        
        Persona obj1 = new Persona();
        
        obj1.setNombre("Miguel Angel");
        obj1.setApellido("cortez");
        
        System.out.println(obj1.getNombre());
        System.out.println(obj1.getApellido());
        
    
    }
    
    
    
}
