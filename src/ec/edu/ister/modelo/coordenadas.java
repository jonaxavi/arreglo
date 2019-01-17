/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

/**
 *
 * @author LAB2-PC
 */
public class coordenadas {
    private int puntoX;
    private int puntoY;

    public coordenadas() {
    }

    public coordenadas(int puntoX, int puntoY) {
        this.puntoX = puntoX;
        this.puntoY = puntoY;
    }

    /**
     * @return the puntoX
     */
    public int getPuntoX() {
        return puntoX;
    }

    /**
     * @param puntoX the puntoX to set
     */
    public void setPuntoX(int puntoX) {
        this.puntoX = puntoX;
    }

    /**
     * @return the puntoY
     */
    public int getPuntoY() {
        return puntoY;
    }

    /**
     * @param puntoY the puntoY to set
     */
    public void setPuntoY(int puntoY) {
        this.puntoY = puntoY;
    }

    @Override
    public String toString() {
        return "P("+getPuntoX()+";"+getPuntoY(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
