/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Controlador.Controlador;
import Jugar.Jugando;
import javax.swing.JOptionPane;

/**
 *
 * @author sebas
 */
public class main {
    static int Jugadores;
    public static void main(String[] args) {
        Jugadores=Integer.parseInt(JOptionPane.showInputDialog("Cuantos Jugadores van a jugar: "));
        Controlador c1=new Controlador(Jugadores);
        Jugando j1 = new Jugando(c1);
        j1.empezarJuego();
    }
}