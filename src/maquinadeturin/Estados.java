/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinadeturin;

/**
 *
 * @author diego
 */
public class Estados {
    
    /**
     *Estado en el cual se encontraba antes
     */
     public Integer estado_Nuevo;

    /**
     *Simbolo que va a escribir
     */
    public String escritura;

    /**
     *Se movera a la derecha o izquierda
     */
     public String movimiento;

    /**
     *Constructor de la clase
     */
    public Estados() {
        this.estado_Nuevo = 0;
        this.escritura = "";
        this.movimiento = "";
    }

}
