/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_labp2;

import java.awt.Color;

/**
 *
 * @author Francisco Santos
 */
public abstract class Pieza {
    private Color color;
    private boolean mover;

    public Pieza() {
    }

    public Pieza(Color color, boolean mover) {
        this.color = color;
        this.mover = mover;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isMover() {
        return mover;
    }

    public void setMover(boolean mover) {
        this.mover = mover;
    }

    @Override
    public String toString() {
        return "Pieza";
    }
    
    public abstract int [][] mover(int [][] mat);
    
}
