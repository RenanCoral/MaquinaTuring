/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinadeturin;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author diego
 */
 class Maquina extends Estados {
    private final Estados estado = new Estados();
    ArrayList<ArrayList<Estados>> tabla; 
     
    /**
     *Constructor de la clase
     * @param cantidadEstados
     * @param cantidadSimbolos
     */
    public Maquina(int cantidadEstados, int cantidadSimbolos){
        
       for(int i =0; i<= cantidadEstados; i++){
           
           for (int j = 0; j < cantidadEstados; j++) {
               tabla.get(cantidadEstados).add(estado);
           }
            
        }

    }
   



    
}
