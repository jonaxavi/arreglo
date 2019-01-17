/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.controlador;

import static com.sun.javafx.tk.Toolkit.getToolkit;
import ec.edu.ister.modelo.coordenadas;
import javax.swing.JOptionPane;

/**
 *
 * @author LAB2-PC
 */
public class Controlador {
    private coordenadas arreglo[];
    private Object btnIngresar;
    private Object txtY;
    private Object txtX;

    /*public void dimensionar() {
        int dim=Integer.parseInt(JOptionPane.showInputDialog("Ingrese dimension"));
        arreglo=new coordenadas[dim];
    }*/
    
     public void dimensionar(int dim) {
        //Integer.parseInt(JOptionPane.showInputDialog("Ingrese dimension"));
        arreglo=new coordenadas[dim];
    }
     
    public int getDimension(){
        return arreglo.length;
    }
    
    public void validar(java.awt.event.KeyEvent evt){
        char car=evt.getKeyChar();
        if(Character.isLetter(car)){
            //getToolkit().beep();
            evt.consume();
        }
    }
}
