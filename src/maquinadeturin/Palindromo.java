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
class Palindromo {
    private Maquina palindromo = new Maquina(8,4);
    
    public Palindromo(){
        construir();
    }
    
    void construir(){
        //Fila 1
        palindromo.tabla.get(0).get(0).estado_Nuevo = 1;
        palindromo.tabla.get(0).get(0).escritura = "B";
        palindromo.tabla.get(0).get(0).movimiento = "R";

        palindromo.tabla.get(0).get(1).estado_Nuevo = 2;
        palindromo.tabla.get(0).get(1).escritura = "B";
        palindromo.tabla.get(0).get(1).movimiento = "R";
        
        palindromo.tabla.get(0).get(2).estado_Nuevo = 3;
        palindromo.tabla.get(0).get(2).escritura = "B";
        palindromo.tabla.get(0).get(2).movimiento = "R";
        
        palindromo.tabla.get(0).get(3).estado_Nuevo = 9;
        palindromo.tabla.get(0).get(3).escritura = "B";
        palindromo.tabla.get(0).get(3).movimiento = "S";
        //Fila 2
        palindromo.tabla.get(1).get(0).estado_Nuevo = 1;
        palindromo.tabla.get(1).get(0).escritura = "a";
        palindromo.tabla.get(1).get(0).movimiento = "R";

        palindromo.tabla.get(1).get(1).estado_Nuevo = 1;
        palindromo.tabla.get(1).get(1).escritura = "b";
        palindromo.tabla.get(1).get(1).movimiento = "R";
        
        palindromo.tabla.get(1).get(2).estado_Nuevo = 1;
        palindromo.tabla.get(1).get(2).escritura = "c";
        palindromo.tabla.get(1).get(2).movimiento = "R";
        
        palindromo.tabla.get(1).get(3).estado_Nuevo = 4;
        palindromo.tabla.get(1).get(3).escritura = "B";
        palindromo.tabla.get(1).get(3).movimiento = "L";
        //Fila 3
        palindromo.tabla.get(2).get(0).estado_Nuevo = 2;
        palindromo.tabla.get(2).get(0).escritura = "a";
        palindromo.tabla.get(2).get(0).movimiento = "R";

        palindromo.tabla.get(2).get(1).estado_Nuevo = 2;
        palindromo.tabla.get(2).get(1).escritura = "b";
        palindromo.tabla.get(2).get(1).movimiento = "R";
        
        palindromo.tabla.get(2).get(2).estado_Nuevo = 2;
        palindromo.tabla.get(2).get(2).escritura = "c";
        palindromo.tabla.get(2).get(2).movimiento = "R";
        
        palindromo.tabla.get(2).get(3).estado_Nuevo = 5;
        palindromo.tabla.get(2).get(3).escritura = "B";
        palindromo.tabla.get(2).get(3).movimiento = "L";
        //Fila 4
        palindromo.tabla.get(3).get(0).estado_Nuevo = 3;
        palindromo.tabla.get(3).get(0).escritura = "a";
        palindromo.tabla.get(3).get(0).movimiento = "R";

        palindromo.tabla.get(3).get(1).estado_Nuevo = 3;
        palindromo.tabla.get(3).get(1).escritura = "b";
        palindromo.tabla.get(3).get(1).movimiento = "R";
        
        palindromo.tabla.get(3).get(2).estado_Nuevo = 3;
        palindromo.tabla.get(3).get(2).escritura = "c";
        palindromo.tabla.get(3).get(2).movimiento = "R";
        
        palindromo.tabla.get(3).get(3).estado_Nuevo = 7;
        palindromo.tabla.get(3).get(3).escritura = "B";
        palindromo.tabla.get(3).get(3).movimiento = "L";
        //Fila 5
        palindromo.tabla.get(4).get(0).estado_Nuevo = 8;
        palindromo.tabla.get(4).get(0).escritura = "B";
        palindromo.tabla.get(4).get(0).movimiento = "L";

        palindromo.tabla.get(4).get(1).estado_Nuevo = null;
        palindromo.tabla.get(4).get(1).escritura = "";
        palindromo.tabla.get(4).get(1).movimiento = "";
        
        palindromo.tabla.get(4).get(2).estado_Nuevo = null;
        palindromo.tabla.get(4).get(2).escritura = "";
        palindromo.tabla.get(4).get(2).movimiento = "";
        
        palindromo.tabla.get(4).get(3).estado_Nuevo = 9;
        palindromo.tabla.get(4).get(3).escritura = "B";
        palindromo.tabla.get(4).get(3).movimiento = "S";
         //Fila 6
        palindromo.tabla.get(5).get(0).estado_Nuevo = null;
        palindromo.tabla.get(5).get(0).escritura = "";
        palindromo.tabla.get(5).get(0).movimiento = "";

        palindromo.tabla.get(5).get(1).estado_Nuevo = 8;
        palindromo.tabla.get(5).get(1).escritura = "B";
        palindromo.tabla.get(5).get(1).movimiento = "L";
        
        palindromo.tabla.get(5).get(2).estado_Nuevo = null;
        palindromo.tabla.get(5).get(2).escritura = "";
        palindromo.tabla.get(5).get(2).movimiento = "";
        
        palindromo.tabla.get(5).get(3).estado_Nuevo = 9;
        palindromo.tabla.get(5).get(3).escritura = "B";
        palindromo.tabla.get(5).get(3).movimiento = "S";
         //Fila 7
        palindromo.tabla.get(6).get(0).estado_Nuevo = null;
        palindromo.tabla.get(6).get(0).escritura = "";
        palindromo.tabla.get(6).get(0).movimiento = "";

        palindromo.tabla.get(6).get(1).estado_Nuevo = null;
        palindromo.tabla.get(6).get(1).escritura = "";
        palindromo.tabla.get(6).get(1).movimiento = "";
        
        palindromo.tabla.get(6).get(2).estado_Nuevo = 8;
        palindromo.tabla.get(6).get(2).escritura = "B";
        palindromo.tabla.get(6).get(2).movimiento = "L";
        
        palindromo.tabla.get(6).get(3).estado_Nuevo = 9;
        palindromo.tabla.get(6).get(3).escritura = "B";
        palindromo.tabla.get(6).get(3).movimiento = "S";
         //Fila 8
        palindromo.tabla.get(7).get(0).estado_Nuevo = 8;
        palindromo.tabla.get(7).get(0).escritura = "a";
        palindromo.tabla.get(7).get(0).movimiento = "L";

        palindromo.tabla.get(7).get(1).estado_Nuevo = 8;
        palindromo.tabla.get(7).get(1).escritura = "b";
        palindromo.tabla.get(7).get(1).movimiento = "L";
        
        palindromo.tabla.get(7).get(2).estado_Nuevo = 8;
        palindromo.tabla.get(7).get(2).escritura = "c";
        palindromo.tabla.get(7).get(2).movimiento = "L";
        
        palindromo.tabla.get(7).get(3).estado_Nuevo = 0;
        palindromo.tabla.get(7).get(3).escritura = "B";
        palindromo.tabla.get(7).get(3).movimiento = "L";
    }
}
