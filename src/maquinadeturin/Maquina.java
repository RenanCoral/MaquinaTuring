/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinadeturin;

import java.awt.List;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
 public class Maquina extends Estados{  
     
    /**
     *Constructor de la clase
     */
    public Maquina(){
        
       
    } 
    
   public String[] palindromo (String estado, String simbolo){
       String casilla[] = new String[3];
        switch(estado){
            case "0":
                switch(simbolo){
                    case "a":
                        casilla[0] = "1";
                        casilla[1] = " ";
                        casilla[2] = "R";
                        break;
                    case "b":
                        casilla[0] = "2";
                        casilla[1] = " ";
                        casilla[2] = "R";
                        break;
                    case "c":
                        casilla[0] = "3";
                        casilla[1] = " ";
                        casilla[2] = "R";
                        break;
                    case " ":
                        casilla[0] = "F";
                        casilla[1] = " ";
                        casilla[2] = "L";
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "infoMessage", 
                                "InfoBox: " + "titleBar", JOptionPane.INFORMATION_MESSAGE);
                        break;
                   
                }
                break;
            case "1":
                switch(simbolo){
                    case "a":
                        casilla[0] = "1";
                        casilla[1] = "a";
                        casilla[2] = "R";
                        break;
                    case "b":
                        casilla[0] = "1";
                        casilla[1] = "b";
                        casilla[2] = "R";
                        break;
                    case "c":
                        casilla[0] = "1";
                        casilla[1] = "c";
                        casilla[2] = "R";
                        break;
                    case " ":
                        casilla[0] = "4";
                        casilla[1] = " ";
                        casilla[2] = "L";
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "infoMessage", 
                                "InfoBox: ERROR", JOptionPane.INFORMATION_MESSAGE);
                        break;
                }
                break;
            case "2":
                switch(simbolo){
                    case "a":
                        casilla[0] = "2";
                        casilla[1] = "a";
                        casilla[2] = "R";
                        break;
                    case "b":
                        casilla[0] = "2";
                        casilla[1] = "b";
                        casilla[2] = "R";
                        break;
                    case "c":
                        casilla[0] = "2";
                        casilla[1] = "c";
                        casilla[2] = "R";
                        break;
                    case " ":
                        casilla[0] = "5";
                        casilla[1] = " ";
                        casilla[2] = "L";
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "infoMessage", 
                                "InfoBox: ERROR", JOptionPane.INFORMATION_MESSAGE);
                        break;
                }
                break;
            case "3":
                switch(simbolo){
                    case "a":
                        casilla[0] = "3";
                        casilla[1] = "a";
                        casilla[2] = "R";
                        break;
                    case "b":
                        casilla[0] = "3";
                        casilla[1] = "b";
                        casilla[2] = "R";
                        break;
                    case "c":
                        casilla[0] = "3";
                        casilla[1] = "c";
                        casilla[2] = "R";
                        break;
                    case " ":
                        casilla[0] = "6";
                        casilla[1] = " ";
                        casilla[2] = "L";
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "infoMessage", 
                                "InfoBox: ERROR", JOptionPane.INFORMATION_MESSAGE);
                        break;
                }
                break;
            case "4":
                switch(simbolo){
                    case "a":
                        casilla[0] = "7";
                        casilla[1] = " ";
                        casilla[2] = "L";
                        break;
                    case "b":
                        JOptionPane.showMessageDialog(null, "infoMessage", 
                                "InfoBox: ERROR", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case "c":
                        JOptionPane.showMessageDialog(null, "infoMessage", 
                                "InfoBox: ERROR", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case " ":
                        casilla[0] = "F";
                        casilla[1] = " ";
                        casilla[2] = "L";
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "infoMessage", 
                                "InfoBox: ERROR", JOptionPane.INFORMATION_MESSAGE);
                        break;
                }
                break;
            case "5":
                switch(simbolo){
                    case "a":
                        JOptionPane.showMessageDialog(null, "infoMessage", 
                                "InfoBox: ERROR", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case "b":
                        casilla[0] = "7";
                        casilla[1] = " ";
                        casilla[2] = "L";
                        break;
                    case "c":
                         JOptionPane.showMessageDialog(null, "infoMessage", 
                                "InfoBox: ERROR", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case " ":
                        casilla[0] = "F";
                        casilla[1] = " ";
                        casilla[2] = "L";
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "infoMessage", 
                                "InfoBox: ERROR", JOptionPane.INFORMATION_MESSAGE);
                        break;
                }
                break;
            case "6":
                switch(simbolo){
                    case "a":
                        JOptionPane.showMessageDialog(null, "infoMessage", 
                                "InfoBox: ERROR", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case "b":
                        JOptionPane.showMessageDialog(null, "infoMessage", 
                                "InfoBox: ERROR", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case "c":
                        casilla[0] = "7";
                        casilla[1] = " ";
                        casilla[2] = "L";
                        break;
                    case " ":
                        casilla[0] = "F";
                        casilla[1] = " ";
                        casilla[2] = "L";
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "infoMessage", 
                                "InfoBox: ERROR", JOptionPane.INFORMATION_MESSAGE);
                        break;
                }
                break;
            case "7":
                switch(simbolo){
                    case "a":
                        casilla[0] = "7";
                        casilla[1] = "a";
                        casilla[2] = "L";
                        break;
                    case "b":
                        casilla[0] = "7";
                        casilla[1] = "b";
                        casilla[2] = "L";
                        break;
                    case "c":
                        casilla[0] = "7";
                        casilla[1] = "c";
                        casilla[2] = "L";
                        break;
                    case " ":
                        casilla[0] = "0";
                        casilla[1] = " ";
                        casilla[2] = "R";
                        break;
                     default:
                        JOptionPane.showMessageDialog(null, "infoMessage", 
                                "InfoBox: ERROR", JOptionPane.INFORMATION_MESSAGE);
                        break;
                }
                break;
            case "F":
                JOptionPane.showMessageDialog(null, "infoMessage", 
                                "La cadena es un palindromo",
                                JOptionPane.INFORMATION_MESSAGE);
                break;
            default:
                        JOptionPane.showMessageDialog(null, "infoMessage", 
                                "InfoBox: ERROR", JOptionPane.INFORMATION_MESSAGE);
                        break;
        }
        return casilla;
    }
   
   public String[] copiar (String estado, String simbolo){
       String casilla[] = new String[3];
        switch (estado){
            case "0":
                 switch(simbolo){
                    case "a":
                        casilla[0] = "1";
                        casilla[1] = "x";
                        casilla[2] = "R";
                        break;
                    case "b":
                        casilla[0] = "2";
                        casilla[1] = "y";
                        casilla[2] = "R";
                        break;
                    case "c":
                        casilla[0] = "3";
                        casilla[1] = "z";
                        casilla[2] = "R";
                        break;
                    case " ":
                        casilla[0] = "8";
                        casilla[1] = " ";
                        casilla[2] = "L";
                        break;
                    case "x":
                    case "y":
                    case "z":
                    default:
                        JOptionPane.showMessageDialog(null, "infoMessage", 
                                "InfoBox: ERROR CADENA DE ENTRADA", JOptionPane.INFORMATION_MESSAGE);
                        break;
                 }
                break;
            case "1":
               switch(simbolo){
                    case "a":
                        casilla[0] = "1";
                        casilla[1] = "a";
                        casilla[2] = "R";
                        break;
                    case "b":
                        casilla[0] = "1";
                        casilla[1] = "b";
                        casilla[2] = "R";
                        break;
                    case "c":
                        casilla[0] = "1";
                        casilla[1] = "c";
                        casilla[2] = "R";
                        break;
                    case " ":
                        casilla[0] = "4";
                        casilla[1] = " ";
                        casilla[2] = "R";
                        break;
                    case "x":
                    case "y":
                    case "z":
                    default:
                        JOptionPane.showMessageDialog(null, "infoMessage", 
                                "InfoBox: ERROR CADENA DE ENTRADA", JOptionPane.INFORMATION_MESSAGE);
                        break;
                 }
               break;
            case "2":
                switch(simbolo){
                    case "a":
                        casilla[0] = "2";
                        casilla[1] = "a";
                        casilla[2] = "R";
                        break;
                    case "b":
                        casilla[0] = "2";
                        casilla[1] = "b";
                        casilla[2] = "R";
                        break;
                    case "c":
                        casilla[0] = "2";
                        casilla[1] = "c";
                        casilla[2] = "R";
                        break;
                    case " ":
                        casilla[0] = "5";
                        casilla[1] = " ";
                        casilla[2] = "R";
                        break;
                    case "x":
                    case "y":
                    case "z":
                    default:
                        JOptionPane.showMessageDialog(null, "infoMessage", 
                                "InfoBox: ERROR CADENA DE ENTRADA", JOptionPane.INFORMATION_MESSAGE);
                        break;
                 }
                break;
            case "3":
                switch(simbolo){
                    case "a":
                        casilla[0] = "3";
                        casilla[1] = "a";
                        casilla[2] = "R";
                        break;
                    case "b":
                        casilla[0] = "3";
                        casilla[1] = "b";
                        casilla[2] = "R";
                        break;
                    case "c":
                        casilla[0] = "3";
                        casilla[1] = "c";
                        casilla[2] = "R";
                        break;
                    case " ":
                        casilla[0] = "6";
                        casilla[1] = " ";
                        casilla[2] = "R";
                        break;
                    case "x":
                    case "y":
                    case "z":
                    default:
                        JOptionPane.showMessageDialog(null, "infoMessage", 
                                "InfoBox: ERROR CADENA DE ENTRADA", JOptionPane.INFORMATION_MESSAGE);
                        break;
                 }
                break;
            case "4":
                switch(simbolo){
                    case "a":
                        casilla[0] = "4";
                        casilla[1] = "a";
                        casilla[2] = "R";
                        break;
                    case "b":
                        casilla[0] = "4";
                        casilla[1] = "b";
                        casilla[2] = "R";
                        break;
                    case "c":
                        casilla[0] = "4";
                        casilla[1] = "c";
                        casilla[2] = "R";
                        break;
                    case " ":
                        casilla[0] = "7";
                        casilla[1] = "a";
                        casilla[2] = "L";
                        break;
                    case "x":
                    case "y":
                    case "z":
                    default:
                        JOptionPane.showMessageDialog(null, "infoMessage", 
                                "InfoBox: ERROR CADENA DE ENTRADA", JOptionPane.INFORMATION_MESSAGE);
                        break;
                 }
                break;
            case "5":
                switch(simbolo){
                    case "a":
                        casilla[0] = "5";
                        casilla[1] = "a";
                        casilla[2] = "R";
                        break;
                    case "b":
                        casilla[0] = "5";
                        casilla[1] = "b";
                        casilla[2] = "R";
                        break;
                    case "c":
                        casilla[0] = "5";
                        casilla[1] = "c";
                        casilla[2] = "R";
                        break;
                    case " ":
                        casilla[0] = "7";
                        casilla[1] = "b";
                        casilla[2] = "L";
                        break;
                    case "x":
                    case "y":
                    case "z":
                    default:
                        JOptionPane.showMessageDialog(null, "infoMessage", 
                                "InfoBox: ERROR CADENA DE ENTRADA", JOptionPane.INFORMATION_MESSAGE);
                        break;
                 }
                break;
            case "6":
                switch(simbolo){
                    case "a":
                        casilla[0] = "6";
                        casilla[1] = "a";
                        casilla[2] = "R";
                        break;
                    case "b":
                        casilla[0] = "6";
                        casilla[1] = "b";
                        casilla[2] = "R";
                        break;
                    case "c":
                        casilla[0] = "6";
                        casilla[1] = "b";
                        casilla[2] = "R";
                        break;
                    case " ":
                        casilla[0] = "7";
                        casilla[1] = "c";
                        casilla[2] = "L";
                        break;
                    case "x":
                    case "y":
                    case "z":
                    default:
                        JOptionPane.showMessageDialog(null, "infoMessage", 
                                "InfoBox: ERROR CADENA DE ENTRADA", JOptionPane.INFORMATION_MESSAGE);
                        break;
                 }
                break;
            case "7":
                switch(simbolo){
                    case "a":
                        casilla[0] = "7";
                        casilla[1] = "a";
                        casilla[2] = "L";
                        break;
                    case "b":
                        casilla[0] = "7";
                        casilla[1] = "b";
                        casilla[2] = "L";
                        break;
                    case "c":
                        casilla[0] = "7";
                        casilla[1] = "c";
                        casilla[2] = "L";
                        break;
                    case " ":
                        casilla[0] = "7";
                        casilla[1] = " ";
                        casilla[2] = "L";
                        break;
                    case "x":
                         casilla[0] = "0";
                        casilla[1] = "x";
                        casilla[2] = "R";
                        break;
                    case "y":
                         casilla[0] = "0";
                        casilla[1] = "y";
                        casilla[2] = "R";
                        break;
                    case "z":
                        casilla[0] = "0";
                        casilla[1] = "z";
                        casilla[2] = "R";
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "infoMessage", 
                                "InfoBox: ERROR CADENA DE ENTRADA", JOptionPane.INFORMATION_MESSAGE);
                        break;
                 }
                break;
            case "8":
                switch(simbolo){
                    case "a":
                    case "b":
                    case "c":
                    case " ":
                        casilla[0] = "T";
                        casilla[1] = " ";
                        casilla[2] = "L";
                        break;
                    case "x":
                         casilla[0] = "8";
                        casilla[1] = "a";
                        casilla[2] = "L";
                        break;
                    case "y":
                         casilla[0] = "8";
                        casilla[1] = "b";
                        casilla[2] = "L";
                        break;
                    case "z":
                        casilla[0] = "8";
                        casilla[1] = "c";
                        casilla[2] = "L";
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "infoMessage", 
                                "InfoBox: ERROR CADENA DE ENTRADA", JOptionPane.INFORMATION_MESSAGE);
                        break;
                 }
                break;
            case "T":
                JOptionPane.showMessageDialog(null, "infoMessage", 
                                "InfoBox: CADENA COPIADA CON EXITO", JOptionPane.INFORMATION_MESSAGE);
                break;
        }
        return casilla;
    }
   
   public String[] multiplicar (String estado, String simbolo){
        String casilla[] = new String[3];
       switch(estado){
           case "0":
               switch(simbolo){
                   case "1":
                        casilla[0] = "1";
                        casilla[1] = " ";
                        casilla[2] = "R";
                        break;
                   case "x":
                        casilla[0] = "7";
                        casilla[1] = " ";
                        casilla[2] = "R";
                        break;
               }
               break;
           case "1":
                  switch(simbolo){
                   case "1":
                        casilla[0] = "1";
                        casilla[1] = "1";
                        casilla[2] = "R";
                        break;
                   case "x":
                        casilla[0] = "4";
                        casilla[1] = "x";
                        casilla[2] = "R";
                        break;
                   case "=":
                        casilla[0] = "2";
                        casilla[1] = "=";
                        casilla[2] = "R";
                        break;
               }
               break;
           case "2":
                switch(simbolo){
                   case "1":
                        casilla[0] = "2";
                        casilla[1] = "1";
                        casilla[2] = "R";
                        break;
                   case " ":
                        casilla[0] = "3";
                        casilla[1] = "1";
                        casilla[2] = "L";
                        break;
               }
               break;
           case "3":
                switch(simbolo){
                   case "1":
                        casilla[0] = "3";
                        casilla[1] = "1";
                        casilla[2] = "L";
                        break;
                   case "x":
                        casilla[0] = "3";
                        casilla[1] = "x";
                        casilla[2] = "L";
                        break;
                   case "=":
                        casilla[0] = "5";
                        casilla[1] = "=";
                        casilla[2] = "L";
                        break;
                   case " ":
                        casilla[0] = "0";
                        casilla[1] = " ";
                        casilla[2] = "R";
                        break;
                   case "0":
                        casilla[0] = "3";
                        casilla[1] = "1";
                        casilla[2] = "L";
                        break;
               }
               break;
           case "4":
               switch(simbolo){
                   case "1":
                        casilla[0] = "1";
                        casilla[1] = "0";
                        casilla[2] = "R";
                        break;
               }
               break;
           case "5":
               switch(simbolo){
                   case "1":
                        casilla[0] = "6";
                        casilla[1] = "1";
                        casilla[2] = "L";
                        break;
                   case "0":
                        casilla[0] = "3";
                        casilla[1] = "1";
                        casilla[2] = "L";
                        break;
               }
               break;
           case "6":
               switch(simbolo){
                   case "1":
                        casilla[0] = "6";
                        casilla[1] = "1";
                        casilla[2] = "L";
                        break;
                   case "0":
                        casilla[0] = "4";
                        casilla[1] = "0";
                        casilla[2] = "R";
                        break;
               }
               break;
           case "7":
               switch(simbolo){
                   case "1":
                        casilla[0] = "7";
                        casilla[1] = " ";
                        casilla[2] = "R";
                        break;
                   case "=":
                        casilla[0] = "F";
                        casilla[1] = " ";
                        casilla[2] = "R";
                        break;
                   case " ":
                        casilla[0] = "7";
                        casilla[1] = " ";
                        casilla[2] = "R";
                        break;
                   case "0":
                        casilla[0] = "7";
                        casilla[1] = " ";
                        casilla[2] = "R";
                        break;
               }
               break;
           case "F":
               break;
       }
       return casilla; 
   }
   
   public String[] suma (String estado, String simbolo){
        String casilla[] = new String[3];
        switch(estado){
            case "0":
                switch(simbolo){
                    case "1":
                        casilla[0] = "1";
                        casilla[1] = " ";
                        casilla[2] = "R";
                        break;
                    case "+":
                        casilla[0] = "0";
                        casilla[1] = " ";
                        casilla[2] = "R";
                        break;
                    case "=":
                        casilla[0] = "F";
                        casilla[1] = " ";
                        casilla[2] = "R";
                        break;
                    case " ":
                        break;
                }
                break;
            case "1":
                switch(simbolo){
                    case "1":
                        casilla[0] = "1";
                        casilla[1] = "1";
                        casilla[2] = "R";
                        break;
                    case "+":
                        casilla[0] = "1";
                        casilla[1] = "+";
                        casilla[2] = "R";
                        break;
                    case "=":
                        casilla[0] = "1";
                        casilla[1] = "=";
                        casilla[2] = "R";
                        break;
                    case " ":
                        casilla[0] = "2";
                        casilla[1] = "1";
                        casilla[2] = "L";
                        break;
                }
                break;
            case "2":
                switch(simbolo){
                    case "1":
                        casilla[0] = "2";
                        casilla[1] = "1";
                        casilla[2] = "L";
                        break;
                    case "+":
                        casilla[0] = "2";
                        casilla[1] = "+";
                        casilla[2] = "L";
                        break;
                    case "=":
                        casilla[0] = "2";
                        casilla[1] = "=";
                        casilla[2] = "L";
                        break;
                    case " ":
                        casilla[0] = "0";
                        casilla[1] = " ";
                        casilla[2] = "R";
                        break;
                }
                break;
            case "F":
                break;
        }
        return casilla;
   }
   
   public String[] resta (String estado, String simbolo){
        String casilla[] = new String[3];
        
        switch(estado){
            case "0":
                switch(simbolo){
                    case "1":
                        casilla[0] = "1";
                        casilla[1] = " ";
                        casilla[2] = "R";
                        break;
                    case "-":
                        casilla[0] = "6";
                        casilla[1] = " ";
                        casilla[2] = "R";
                        break;
                    case "=":
                        break;
                    case " ":
                        break;
                }
                break;
            case "1":
                 switch(simbolo){
                    case "1":
                        casilla[0] = "1";
                        casilla[1] = "1";
                        casilla[2] = "R";
                        break;
                    case "-":
                        casilla[0] = "1";
                        casilla[1] = "-";
                        casilla[2] = "R";
                        break;
                    case "=":
                        casilla[0] = "1";
                        casilla[1] = "=";
                        casilla[2] = "R";
                        break;
                    case " ":
                        casilla[0] = "2";
                        casilla[1] = "1";
                        casilla[2] = "L";
                        break;
                }
                break;
            case "2":
                switch(simbolo){
                    case "1":
                        casilla[0] = "2";
                        casilla[1] = "1";
                        casilla[2] = "L";
                        break;
                    case "-":
                        casilla[0] = "2";
                        casilla[1] = "-";
                        casilla[2] = "L";
                        break;
                    case "=":
                        casilla[0] = "2";
                        casilla[1] = "=";
                        casilla[2] = "L";
                        break;
                    case " ":
                        casilla[0] = "0";
                        casilla[1] = " ";
                        casilla[2] = "R";
                        break;
                }
                break;
            case "3":
                switch(simbolo){
                    case "1":
                        casilla[0] = "3";
                        casilla[1] = "1";
                        casilla[2] = "R";
                        break;
                    case "-":
                        break;
                    case "=":
                        casilla[0] = "3";
                        casilla[1] = "=";
                        casilla[2] = "R";
                        break;
                    case " ":
                        casilla[0] = "4";
                        casilla[1] = " ";
                        casilla[2] = "L";
                        break;
                }
                break;
            case "4":
                switch(simbolo){
                    case "1":
                        casilla[0] = "5";
                        casilla[1] = " ";
                        casilla[2] = "L";
                        break;
                    case "-":
                        break;
                    case "=":
                        casilla[0] = "7";
                        casilla[1] = "1";
                        casilla[2] = "L";
                        break;
                    case " ":
                        break;
                }
                break;
            case "5":
                switch(simbolo){
                    case "1":
                        casilla[0] = "5";
                        casilla[1] = "1";
                        casilla[2] = "L";
                        break;
                    case "-":
                        break;
                    case "=":
                        casilla[0] = "5";
                        casilla[1] = "=";
                        casilla[2] = "L";
                        break;
                    case " ":
                        casilla[0] = "6";
                        casilla[1] = " ";
                        casilla[2] = "R";
                        break;
                }
                break;
            case "6":
                switch(simbolo){
                    case "1":
                        casilla[0] = "3";
                        casilla[1] = " ";
                        casilla[2] = "R";
                        break;
                    case "-":
                        break;
                    case "=":
                        casilla[0] = "F";
                        casilla[1] = " ";
                        casilla[2] = "R";
                        break;
                    case " ":
                        break;
                }
                break;
            case "7":
                switch(simbolo){
                    case "1":
                        casilla[0] = "7";
                        casilla[1] = "1";
                        casilla[2] = "L";
                        break;
                    case "-":
                        break;
                    case "=":
                        break;
                    case " ":
                        casilla[0] = "F";
                        casilla[1] = "-";
                        casilla[2] = "L";
                        break;
                }
                break;
            case "F":
                break;
        }
        return casilla;
       
   }
}
