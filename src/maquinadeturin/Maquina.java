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
}
