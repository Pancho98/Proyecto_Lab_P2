/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_labp2;

import java.awt.Color;
import java.util.*;

public class Proyecto_LabP2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String gana = " ";
        int x, x1;
        int y, y1;
        String resp = "s";
        while ("s".equals(resp) || "S".equals(resp)) {
            System.out.print("Ingrese el nombre de jugador 1:\n ");
            String j1 = sc.next();
            System.out.print("Ingrese el nombre de jugador 2:\n ");
            String j2 = sc.next();
            Object[][] mat = llenar();
            int cont = 0;
            while (" ".equals(gana)) {
                if (cont == 0) {
                    System.out.print("Turno de: " + j1);
                    System.out.println();
                    Imprimir(mat, 0, 0);
                    System.out.println();
                    System.out.println("Ingrese Valor de X:\n ");
                    x = sc.nextInt();
                    System.out.println("Ingrese Valor de Y:\n ");
                    y = sc.nextInt();
                    cont = 1;
                    while (mat[x][y] instanceof Pieza || !((Pieza) mat[x][y]).getColor().equals(Color.white)) {
                        System.out.println("/////La pieza que selecciono no es suya://///");
                        System.out.print("Ingrese Valor de X:\n ");
                        x = sc.nextInt();
                        System.out.print("Ingrese Valor de Y:\n ");
                        y = sc.nextInt();
                    }
                    if (mat[x][y] instanceof Pieza && ((Pieza) mat[x][y]).getColor().equals(Color.white)) {
                        System.out.println("A que posicion desea mover la pieza: ");

                    }

                } else if (cont == 1) {
                    System.out.print("Turno de: " + j2);
                    System.out.println();
                    Imprimir(mat, 0, 0);

                    System.out.println();
                    System.out.print("Ingrese Valor de X:\n ");
                    x = sc.nextInt();
                    System.out.print("Ingrese Valor de Y:\n ");
                    y = sc.nextInt();
                    cont = 0;
                    while (mat[x][y] instanceof Pieza || !((Pieza) mat[x][y]).getColor().equals(Color.black)) {
                        System.out.println("/////La pieza que selecciono no es suya://///");
                        System.out.println("Ingrese Valor de X:\n ");
                        x = sc.nextInt();
                        System.out.println("Ingrese Valor de Y:\n ");
                        y = sc.nextInt();
                    }
                    if (mat[x][y] instanceof Pieza && ((Pieza) mat[x][y]).getColor().equals(Color.black)) {

                    }
                }
            }
        }
    }

    public static void Imprimir(Object matriz[][], int filas, int cols) {
        if (filas == matriz.length - 1 && cols == matriz[0].length - 1) {
            System.out.print("[" + matriz[filas][cols] + "]\t   ");
        } else if (cols == matriz[0].length - 1) {
            System.out.println("[" + matriz[filas][cols] + "]");
            Imprimir(matriz, filas + 1, 0);
        } else {
            System.out.print("[" + matriz[filas][cols] + "] \t   ");
            Imprimir(matriz, filas, cols + 1);
        }
    }

    public static Object[][] llenar() {
        Object x[][] = new Object[8][8];
        //torres
        x[0][0] = new Torre(Color.black, false);
        x[0][7] = new Torre(Color.black, false);
        x[7][0] = new Torre(Color.white, false);
        x[7][7] = new Torre(Color.white, false);
        //caballos
        x[0][1] = new Caballo(Color.black, false);
        x[0][6] = new Caballo(Color.black, false);
        x[7][1] = new Caballo(Color.white, false);
        x[7][6] = new Caballo(Color.white, false);
        //alfils
        x[0][2] = new Alfil(Color.black, false);
        x[0][5] = new Alfil(Color.black, false);
        x[7][2] = new Alfil(Color.white, false);
        x[7][5] = new Alfil(Color.white, false);
        //reinas
        x[0][3] = new Reina(Color.black, false);
        x[7][3] = new Reina(Color.white, false);
        //rey
        x[0][4] = new Rey(Color.black, false);
        x[7][4] = new Rey(Color.white, false);
        //peones
        x[1][0] = new Peon(Color.black, false);
        x[1][1] = new Peon(Color.black, false);
        x[1][2] = new Peon(Color.black, false);
        x[1][3] = new Peon(Color.black, false);
        x[1][4] = new Peon(Color.black, false);
        x[1][5] = new Peon(Color.black, false);
        x[1][6] = new Peon(Color.black, false);
        x[1][7] = new Peon(Color.black, false);
        //
        x[6][0] = new Peon(Color.white, false);
        x[6][1] = new Peon(Color.white, false);
        x[6][2] = new Peon(Color.white, false);
        x[6][3] = new Peon(Color.white, false);
        x[6][4] = new Peon(Color.white, false);
        x[6][5] = new Peon(Color.white, false);
        x[6][6] = new Peon(Color.white, false);
        x[6][7] = new Peon(Color.white, false);

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                if (x[i][j] instanceof Pieza) {

                } else {
                    x[i][j] = " ";
                }
            }
        }
        return x;
    }

    public static void cambio(Object[][] x, int cont) {
        if (cont == 0) {
            x[6][0] = new Peon(Color.white, false);
            x[6][1] = new Peon(Color.white, false);
            x[6][2] = new Peon(Color.white, false);
            x[6][3] = new Peon(Color.white, false);
            x[6][4] = new Peon(Color.white, false);
            x[6][5] = new Peon(Color.white, false);
            x[6][6] = new Peon(Color.white, false);
            x[6][7] = new Peon(Color.white, false);

            x[7][4] = new Rey(Color.white, false);
            x[7][3] = new Reina(Color.white, false);
            x[7][2] = new Alfil(Color.white, false);
            x[7][5] = new Alfil(Color.white, false);
            x[7][1] = new Caballo(Color.white, false);
            x[7][6] = new Caballo(Color.white, false);
            x[7][0] = new Torre(Color.white, false);
            x[7][7] = new Torre(Color.white, false);
        } else if (cont == 1) {
            x[1][0] = new Peon(Color.black, false);
            x[1][1] = new Peon(Color.black, false);
            x[1][2] = new Peon(Color.black, false);
            x[1][3] = new Peon(Color.black, false);
            x[1][4] = new Peon(Color.black, false);
            x[1][5] = new Peon(Color.black, false);
            x[1][6] = new Peon(Color.black, false);
            x[1][7] = new Peon(Color.black, false);

            x[0][4] = new Rey(Color.black, false);
            x[0][3] = new Reina(Color.black, false);
            x[0][2] = new Alfil(Color.black, false);
            x[0][5] = new Alfil(Color.black, false);
            x[0][1] = new Caballo(Color.black, false);
            x[0][6] = new Caballo(Color.black, false);
            x[0][0] = new Torre(Color.black, false);
            x[0][7] = new Torre(Color.black, false);
        }
    }
}
