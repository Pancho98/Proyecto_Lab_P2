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
public class Rey extends Pieza{

    public Rey() {
    }

    public Rey(Color color, boolean mover) {
        super(color, mover);
    }

    @Override
    public String toString() {
        return "♛";
    }

    @Override
    public Object[][] mover(Object[][] mat) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
