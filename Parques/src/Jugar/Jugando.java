/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jugar;

import Controlador.Controlador;
import FabricaDado.Dado;
import FabricaFichas.FichaAmarilla;
import FabricaFichas.FichaAzul;
import FabricaFichas.FichaRoja;
import FabricaFichas.FichaVerde;
import javax.swing.JOptionPane;

/**
 *
 * @author sebas
 */
public class Jugando {

    private final Dado dado1;
    private final Dado dado2;
    private int co1;
    private int co2;
    private int co3;
    private int co4;
    private final Controlador c1;
    private final boolean win = false;
    public int contSali = 0;

    public Jugando(Controlador c1) {
        this.dado1 = new Dado();
        this.dado2 = new Dado();
        this.c1 = c1;

    }

    public void empezarJuego() {
        int jugadores = c1.getnJugadores();
        if (jugadores == 3) {
            while (win == false) {
                turnoj1();
                turnoj2();
                turnoj3();
            }
        } else {
            while (win == false) {
                turnoj1();
                turnoj2();
                turnoj3();
                turnoj4();
            }
        }
    }

    public void turnoj1() {
        JOptionPane.showMessageDialog(null, "Turno1");
        String color = "Amarillo";
        co1=0;
        if (c1.a1.isEstado() == true) {
            co1++;
        }
        if (c1.a2.isEstado() == true) {
            co1++;
        }
        if (c1.a3.isEstado() == true) {
            co1++;
        }
        if (c1.a4.isEstado() == true) {
            co1++;
        }
        if (co1 == 0) {
            contSali=0;
            salirCarcel(color);
        }else if(comprobarT(color)){
            mover(color);
            
        }else{
            JOptionPane.showMessageDialog(null, "algo pasa");
        }
        JOptionPane.showMessageDialog(null, "Siguiente turno");
    }

    public void turnoj2() {
        JOptionPane.showMessageDialog(null, "Turno2");
        String color = "Azul";
        co2=0;
        if (c1.b1.isEstado() == true) {
            co2++;
        }

        if (c1.b2.isEstado() == true) {
            co2++;
        }
        if (c1.b3.isEstado() == true) {
            co2++;
        }
        if (c1.b4.isEstado() == true) {
            co2++;
        }
        if (co2 == 0) {
            contSali=0;
            salirCarcel(color);
        }else if(comprobarT(color)){
            mover(color);
            
        }else{
            JOptionPane.showMessageDialog(null, "algo pasa");
        }
        JOptionPane.showMessageDialog(null, "Siguiente turno");
    }

    public void turnoj3() {
        JOptionPane.showMessageDialog(null, "Turno3");
        String color = "Rojo";
        co3=0;
        if (c1.r1.isEstado() == true) {
            co3++;
        }

        if (c1.r2.isEstado() == true) {
            co3++;
        }
        if (c1.r3.isEstado() == true) {
            co3++;
        }
        if (c1.r4.isEstado() == true) {
            co3++;
        }
        if (co3 == 0) {
            contSali=0;
            salirCarcel(color);
        }else if(comprobarT(color)){
            mover(color);
            
        }else{
            JOptionPane.showMessageDialog(null, "algo pasa");
        }
        JOptionPane.showMessageDialog(null, "Siguiente turno");
    }

    public void turnoj4() {
        JOptionPane.showMessageDialog(null, "Turno4");
        String color = "Verde";
        co4=0;
        if (c1.v1.isEstado() == true) {
            co4++;
        }

        if (c1.v2.isEstado() == true) {
            co4++;
        }
        if (c1.v3.isEstado() == true) {
            co4++;
        }
        if (c1.v4.isEstado() == true) {
            co4++;
        }
        if (co4 == 0) {
            contSali=0;
            salirCarcel(color);
        }else if(comprobarT(color)){
            mover(color);
        }else{
            JOptionPane.showMessageDialog(null, "algo pasa");
        }
        JOptionPane.showMessageDialog(null, "Siguiente turno");
    }

    public void SalirCarcel1(String color) {
        if (this.dado1.getNumero() == this.dado2.getNumero()) {
            if (dado1.getNumero() == 6 || dado1.getNumero() == 1) {
                if (color.equals("Amarillo")) {
                    c1.a1.setEstado(true);
                    c1.a1.setPosicion(5);

                    c1.a2.setEstado(true);
                    c1.a2.setPosicion(5);

                    c1.a3.setEstado(true);
                    c1.a3.setPosicion(5);

                    c1.a4.setEstado(true);
                    c1.a4.setPosicion(5);

                    JOptionPane.showMessageDialog(null, "ha sacado" + dado1.getNumero() + "-" + dado2.getNumero() + ", Salen todas las fichas " + color);
                } else if (color.equals("Azul")) {
                    c1.b1.setEstado(true);
                    c1.b1.setPosicion(5);

                    c1.b2.setEstado(true);
                    c1.b2.setPosicion(5);

                    c1.b3.setEstado(true);
                    c1.b3.setPosicion(5);

                    c1.b4.setEstado(true);
                    c1.b4.setPosicion(5);

                    JOptionPane.showMessageDialog(null, "ha sacado" + dado1.getNumero() + "-" + dado2.getNumero() + ", Salen todas las fichas " + color);
                } else if (color.equals("Rojo")) {
                    c1.r1.setEstado(true);
                    c1.r1.setPosicion(5);

                    c1.r2.setEstado(true);
                    c1.r2.setPosicion(5);

                    c1.r3.setEstado(true);
                    c1.r3.setPosicion(5);

                    c1.r4.setEstado(true);
                    c1.r4.setPosicion(5);

                    JOptionPane.showMessageDialog(null, "ha sacado" + dado1.getNumero() + "-" + dado2.getNumero() + ", Salen todas las fichas " + color);
                } else if (color.equals("Verde")) {
                    c1.v1.setEstado(true);
                    c1.v1.setPosicion(5);

                    c1.v2.setEstado(true);
                    c1.v2.setPosicion(5);

                    c1.v3.setEstado(true);
                    c1.v3.setPosicion(5);

                    c1.v4.setEstado(true);
                    c1.v4.setPosicion(5);

                    JOptionPane.showMessageDialog(null, "ha sacado" + dado1.getNumero() + "-" + dado2.getNumero() + ", Salen todas las fichas " + color);
                } else {
                    JOptionPane.showMessageDialog(null, "Algo a ocurrido no salen");
                }
            } else {

                if (color.equals("Amarillo")) {
                    int contadorrepe = 0;
                    if (c1.a1.isEstado() == false && contadorrepe != 2) {
                        c1.a1.setEstado(true);
                        c1.a1.setPosicion(5);
                        contadorrepe++;
                    }
                    if (c1.a2.isEstado() == false && contadorrepe != 2) {
                        c1.a2.setEstado(true);
                        c1.a2.setPosicion(5);
                        contadorrepe++;
                    }
                    if (c1.a3.isEstado() == false && contadorrepe != 2) {
                        c1.a3.setEstado(true);
                        c1.a3.setPosicion(5);
                        contadorrepe++;
                    }
                    if (c1.a4.isEstado() == false && contadorrepe != 2) {
                        c1.a4.setEstado(true);
                        c1.a4.setPosicion(5);
                        contadorrepe++;
                    }
                } else if (color.equals("Azul")) {
                    int contadorrepe = 0;
                    if (c1.b1.isEstado() == false && contadorrepe != 2) {
                        c1.b1.setEstado(true);
                        c1.b1.setPosicion(5);
                        contadorrepe++;
                    }
                    if (c1.b2.isEstado() == false && contadorrepe != 2) {
                        c1.b2.setEstado(true);
                        c1.b2.setPosicion(5);
                        contadorrepe++;
                    }
                    if (c1.b3.isEstado() == false && contadorrepe != 2) {
                        c1.b3.setEstado(true);
                        c1.b3.setPosicion(5);
                        contadorrepe++;
                    }
                    if (c1.b4.isEstado() == false && contadorrepe != 2) {
                        c1.b4.setEstado(true);
                        c1.b4.setPosicion(5);
                        contadorrepe++;
                    }
                } else if (color.equals("Rojo")) {
                    int contadorrepe = 0;
                    if (c1.r1.isEstado() == false && contadorrepe != 2) {
                        c1.r1.setEstado(true);
                        c1.r1.setPosicion(5);
                        contadorrepe++;
                    }
                    if (c1.r2.isEstado() == false && contadorrepe != 2) {
                        c1.r2.setEstado(true);
                        c1.r2.setPosicion(5);
                        contadorrepe++;
                    }
                    if (c1.r3.isEstado() == false && contadorrepe != 2) {
                        c1.r3.setEstado(true);
                        c1.r3.setPosicion(5);
                        contadorrepe++;
                    }
                    if (c1.r4.isEstado() == false && contadorrepe != 2) {
                        c1.r4.setEstado(true);
                        c1.r4.setPosicion(5);
                        contadorrepe++;
                    }
                } else if (color.equals("Verde")) {
                    int contadorrepe = 0;
                    if (c1.v1.isEstado() == false && contadorrepe != 2) {
                        c1.v1.setEstado(true);
                        c1.v1.setPosicion(5);
                        contadorrepe++;
                    }
                    if (c1.v2.isEstado() == false && contadorrepe != 2) {
                        c1.v2.setEstado(true);
                        c1.v2.setPosicion(5);
                        contadorrepe++;
                    }
                    if (c1.v3.isEstado() == false && contadorrepe != 2) {
                        c1.v3.setEstado(true);
                        c1.v3.setPosicion(5);
                        contadorrepe++;
                    }
                    if (c1.v4.isEstado() == false && contadorrepe != 2) {
                        c1.v4.setEstado(true);
                        c1.v4.setPosicion(5);
                        contadorrepe++;
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Algo a ocurrido no salen");
                }
            }
        }
    }

    public void salirCarcel(String color) {
        lanzar();
        if (this.dado1.getNumero() == this.dado2.getNumero()) {
            if (dado1.getNumero() == 6 || dado1.getNumero() == 1) {
                if (color.equals("Amarillo")) {
                    c1.a1.setEstado(true);
                    c1.a1.setPosicion(5);

                    c1.a2.setEstado(true);
                    c1.a2.setPosicion(5);

                    c1.a3.setEstado(true);
                    c1.a3.setPosicion(5);

                    c1.a4.setEstado(true);
                    c1.a4.setPosicion(5);

                    JOptionPane.showMessageDialog(null, "ha sacado" + dado1.getNumero() + "-" + dado2.getNumero() + ", Salen todas las fichas " + color);
                    mover(color);
                } else if (color.equals("Azul")) {
                    c1.b1.setEstado(true);
                    c1.b1.setPosicion(5);

                    c1.b2.setEstado(true);
                    c1.b2.setPosicion(5);

                    c1.b3.setEstado(true);
                    c1.b3.setPosicion(5);

                    c1.b4.setEstado(true);
                    c1.b4.setPosicion(5);

                    JOptionPane.showMessageDialog(null, "ha sacado" + dado1.getNumero() + "-" + dado2.getNumero() + ", Salen todas las fichas " + color);
                    mover(color);
                } else if (color.equals("Rojo")) {
                    c1.r1.setEstado(true);
                    c1.r1.setPosicion(5);

                    c1.r2.setEstado(true);
                    c1.r2.setPosicion(5);

                    c1.r3.setEstado(true);
                    c1.r3.setPosicion(5);

                    c1.r4.setEstado(true);
                    c1.r4.setPosicion(5);

                    JOptionPane.showMessageDialog(null, "ha sacado" + dado1.getNumero() + "-" + dado2.getNumero() + ", Salen todas las fichas " + color);
                    mover(color);
                } else if (color.equals("Verde")) {
                    c1.v1.setEstado(true);
                    c1.v1.setPosicion(5);

                    c1.v2.setEstado(true);
                    c1.v2.setPosicion(5);

                    c1.v3.setEstado(true);
                    c1.v3.setPosicion(5);

                    c1.v4.setEstado(true);
                    c1.v4.setPosicion(5);

                    JOptionPane.showMessageDialog(null, "ha sacado" + dado1.getNumero() + "-" + dado2.getNumero() + ", Salen todas las fichas " + color);
                    mover(color);
                } else {
                    JOptionPane.showMessageDialog(null, "Algo a ocurrido no salen");
                }
            } else {
                if (color.equals("Amarillo")) {
                    c1.a1.setEstado(true);
                    c1.a1.setPosicion(5);

                    c1.a2.setEstado(true);
                    c1.a2.setPosicion(5);

                    JOptionPane.showMessageDialog(null, "ha sacado" + dado1.getNumero() + "-" + dado2.getNumero() + ", Salen todas las fichas " + color);
                    mover(color);
                } else if (color.equals("Azul")) {
                    c1.b1.setEstado(true);
                    c1.b1.setPosicion(5);

                    c1.b2.setEstado(true);
                    c1.b2.setPosicion(5);

                    JOptionPane.showMessageDialog(null, "ha sacado" + dado1.getNumero() + "-" + dado2.getNumero() + ", Salen todas las fichas " + color);
                    mover(color);
                } else if (color.equals("Rojo")) {
                    c1.r1.setEstado(true);
                    c1.r1.setPosicion(5);

                    c1.r2.setEstado(true);
                    c1.r2.setPosicion(5);

                    JOptionPane.showMessageDialog(null, "ha sacado" + dado1.getNumero() + "-" + dado2.getNumero() + ", Salen todas las fichas " + color);
                    mover(color);
                } else if (color.equals("Verde")) {
                    c1.v1.setEstado(true);
                    c1.v1.setPosicion(5);

                    c1.v2.setEstado(true);
                    c1.v2.setPosicion(5);

                    JOptionPane.showMessageDialog(null, "ha sacado" + dado1.getNumero() + "-" + dado2.getNumero() + ", Salen todas las fichas " + color);
                    mover(color);
                } else {
                    JOptionPane.showMessageDialog(null, "Algo a ocurrido no salen");
                }
            }
        } else {
            contSali++;
            if (contSali < 3) {
                salirCarcel(color);
            }
            
        }
    }

    public void lanzar() {
        this.dado1.soltar();
        this.dado2.soltar();
        JOptionPane.showMessageDialog(null, "ha sacado" + dado1.getNumero() + "-" + dado2.getNumero());
    }

    public void mover(String color) {
        lanzar();
        if (dado1.getNumero() == dado2.getNumero()) {
            int desicion = Integer.parseInt(JOptionPane.showInputDialog("Desea Mover(2) o Sacar(1): "));
            if (desicion == 1 && comprobarF(color)){
                SalirCarcel1(color);
            }
            else{
                moverFicha(color);
            }
            mover(color);
        }else{
            moverFicha(color);
        }

    }

    public boolean comprobarF(String color) {
        boolean estado = false;
        if (color.equals("Amarillo")) {
            if (c1.a1.isEstado() == false) {
                estado = true;
            }
            if (c1.a2.isEstado() == false) {
                estado = true;
            }
            if (c1.a3.isEstado() == false) {
                estado = true;
            }
            if (c1.a4.isEstado() == false) {
                estado = true;
            }
        } else if (color.equals("Azul")) {
            if (c1.b1.isEstado() == false) {
                estado = true;
            }
            if (c1.b2.isEstado() == false) {
                estado = true;
            }
            if (c1.b3.isEstado() == false) {
                estado = true;
            }
            if (c1.b4.isEstado() == false) {
                estado = true;
            }
        } else if (color.equals("Rojo")) {
            if (c1.r1.isEstado() == false) {
                estado = true;
            }
            if (c1.r2.isEstado() == false) {
                estado = true;
            }
            if (c1.r3.isEstado() == false) {
                estado = true;
            }
            if (c1.r4.isEstado() == false) {
                estado = true;
            }
        } else if (color.equals("Verde")) {
            if (c1.v1.isEstado() == false) {
                estado = true;
            }
            if (c1.v2.isEstado() == false) {
                estado = true;
            }
            if (c1.v3.isEstado() == false) {
                estado = true;
            }
            if (c1.v4.isEstado() == false) {
                estado = true;
            }
        }

        return estado;
    }

    public boolean comprobarT(String color) {
        boolean estado = false;
        if (color.equals("Amarillo")) {
            if (c1.a1.isEstado() == true) {
                estado = true;
            }
            if (c1.a2.isEstado() == true) {
                estado = true;
            }
            if (c1.a3.isEstado() == true) {
                estado = true;
            }
            if (c1.a4.isEstado() == true) {
                estado = true;
            }
        } else if (color.equals("Azul")) {
            if (c1.b1.isEstado() == true) {
                estado = true;
            }
            if (c1.b2.isEstado() == true) {
                estado = true;
            }
            if (c1.b3.isEstado() == true) {
                estado = true;
            }
            if (c1.b4.isEstado() == true) {
                estado = true;
            }
        } else if (color.equals("Rojo")) {
            if (c1.r1.isEstado() == true) {
                estado = true;
            }
            if (c1.r2.isEstado() == true) {
                estado = true;
            }
            if (c1.r3.isEstado() == true) {
                estado = true;
            }
            if (c1.r4.isEstado() == true) {
                estado = true;
            }
        } else if (color.equals("Verde")) {
            if (c1.v1.isEstado() == true) {
                estado = true;
            }
            if (c1.v2.isEstado() == true) {
                estado = true;
            }
            if (c1.v3.isEstado() == true) {
                estado = true;
            }
            if (c1.v4.isEstado() == true) {
                estado = true;
            }
        }

        return estado;
    }
    
    public void moverFicha(String color) {
        int Ficha = Integer.parseInt(JOptionPane.showInputDialog("Cual ficha desea mover: "));
        if(color.equals("Amarillo")){
            if(Ficha==c1.a1.getNficha() && c1.a1.isEstado()==true){
                int pos=c1.a1.getPosicion();
                c1.a1.setPosicion(pos+dado1.getNumero()+dado2.getNumero());
                JOptionPane.showMessageDialog(null, "se movio la ficha "+Ficha+" desde "+pos+" hasta "+c1.a1.getPosicion());
                comiendoAmarilla(c1.a1);
            }
            else if(Ficha==c1.a2.getNficha() && c1.a2.isEstado()==true){
                int pos=c1.a2.getPosicion();
                c1.a2.setPosicion(pos+dado1.getNumero()+dado2.getNumero());
                JOptionPane.showMessageDialog(null, "se movio la ficha "+Ficha+" desde "+pos+" hasta "+c1.a2.getPosicion());
                comiendoAmarilla(c1.a2);
            }
            else if(Ficha==c1.a3.getNficha() && c1.a3.isEstado()==true){
                int pos=c1.a3.getPosicion();
                c1.a3.setPosicion(pos+dado1.getNumero()+dado2.getNumero());
                JOptionPane.showMessageDialog(null, "se movio la ficha "+Ficha+" desde "+pos+" hasta "+c1.a3.getPosicion());
                comiendoAmarilla(c1.a3);
            }
            else if(Ficha==c1.a4.getNficha() && c1.a4.isEstado()==true){
                int pos=c1.a4.getPosicion();
                c1.a4.setPosicion(pos+dado1.getNumero()+dado2.getNumero());
                JOptionPane.showMessageDialog(null, "se movio la ficha "+Ficha+" desde "+pos+" hasta "+c1.a4.getPosicion());
                comiendoAmarilla(c1.a4);
            }
            else{
                moverFicha(color);
            }
        }
        else if(color.equals("Azul")){
            if(Ficha==c1.b1.getNficha() && c1.b1.isEstado()==true){
                int pos=c1.b1.getPosicion();
                c1.b1.setPosicion(pos+dado1.getNumero()+dado2.getNumero());
                JOptionPane.showMessageDialog(null, "se movio la ficha "+Ficha+" desde "+pos+" hasta "+c1.b1.getPosicion());
                comiendoAzul(c1.b1);
            }
            else if(Ficha==c1.b2.getNficha() && c1.b2.isEstado()==true){
                int pos=c1.b2.getPosicion();
                c1.b2.setPosicion(pos+dado1.getNumero()+dado2.getNumero());
                JOptionPane.showMessageDialog(null, "se movio la ficha "+Ficha+" desde "+pos+" hasta "+c1.b2.getPosicion());
                comiendoAzul(c1.b1);
            }
            else if(Ficha==c1.b3.getNficha() && c1.b3.isEstado()==true){
                int pos=c1.b3.getPosicion();
                c1.b3.setPosicion(pos+dado1.getNumero()+dado2.getNumero());
                JOptionPane.showMessageDialog(null, "se movio la ficha "+Ficha+" desde "+pos+" hasta "+c1.b3.getPosicion());
                comiendoAzul(c1.b1);
            }
            else if(Ficha==c1.b4.getNficha() && c1.b4.isEstado()==true){
                int pos=c1.b4.getPosicion();
                c1.b4.setPosicion(pos+dado1.getNumero()+dado2.getNumero());
                JOptionPane.showMessageDialog(null, "se movio la ficha "+Ficha+" desde "+pos+" hasta "+c1.b4.getPosicion());
                comiendoAzul(c1.b1);
            }
            else{
                moverFicha(color);
            }
        }
        else if(color.equals("Rojo")){
            if(Ficha==c1.r1.getNficha() && c1.r1.isEstado()==true){
                int pos=c1.r1.getPosicion();
                c1.r1.setPosicion(pos+dado1.getNumero()+dado2.getNumero());
                JOptionPane.showMessageDialog(null, "se movio la ficha "+Ficha+" desde "+pos+" hasta "+c1.r1.getPosicion());
                comiendoRoja(c1.r1);
            }
            else if(Ficha==c1.r2.getNficha() && c1.r2.isEstado()==true){
                int pos=c1.r2.getPosicion();
                c1.r2.setPosicion(pos+dado1.getNumero()+dado2.getNumero());
                JOptionPane.showMessageDialog(null, "se movio la ficha "+Ficha+" desde "+pos+" hasta "+c1.r2.getPosicion());
                comiendoRoja(c1.r2);
            }
            else if(Ficha==c1.r3.getNficha() && c1.r3.isEstado()==true){
                int pos=c1.r3.getPosicion();
                c1.r3.setPosicion(pos+dado1.getNumero()+dado2.getNumero());
                JOptionPane.showMessageDialog(null, "se movio la ficha "+Ficha+" desde "+pos+" hasta "+c1.r3.getPosicion());
                comiendoRoja(c1.r3);
            }
            else if(Ficha==c1.r4.getNficha() && c1.r4.isEstado()==true){
                int pos=c1.r4.getPosicion();
                c1.r4.setPosicion(pos+dado1.getNumero()+dado2.getNumero());
                JOptionPane.showMessageDialog(null, "se movio la ficha "+Ficha+" desde "+pos+" hasta "+c1.r4.getPosicion());
                comiendoRoja(c1.r4);
            }
            else{
                moverFicha(color);
            }
        }
        else{
            if(Ficha==c1.v1.getNficha() && c1.v1.isEstado()==true){
                int pos=c1.v1.getPosicion();
                c1.v1.setPosicion(pos+dado1.getNumero()+dado2.getNumero());
                JOptionPane.showMessageDialog(null, "se movio la ficha "+Ficha+" desde "+pos+" hasta "+c1.v1.getPosicion());
                comiendoVerde(c1.v1);
            }
            else if(Ficha==c1.v2.getNficha() && c1.v2.isEstado()==true){
                int pos=c1.v2.getPosicion();
                c1.v2.setPosicion(pos+dado1.getNumero()+dado2.getNumero());
                JOptionPane.showMessageDialog(null, "se movio la ficha "+Ficha+" desde "+pos+" hasta "+c1.v2.getPosicion());
                comiendoVerde(c1.v2);
            }
            else if(Ficha==c1.v3.getNficha() && c1.v3.isEstado()==true){
                int pos=c1.v3.getPosicion();
                c1.v3.setPosicion(pos+dado1.getNumero()+dado2.getNumero());
                JOptionPane.showMessageDialog(null, "se movio la ficha "+Ficha+" desde "+pos+" hasta "+c1.v3.getPosicion());
                comiendoVerde(c1.v3);
            }
            else if(Ficha==c1.v4.getNficha() && c1.v4.isEstado()==true){
                int pos=c1.v4.getPosicion();
                c1.v4.setPosicion(pos+dado1.getNumero()+dado2.getNumero());
                JOptionPane.showMessageDialog(null, "se movio la ficha "+Ficha+" desde "+pos+" hasta "+c1.v4.getPosicion());
                comiendoVerde(c1.v4);
            }
            else{
                moverFicha(color);
            }
        }
        
    }
    
    public void comiendoAmarilla(FichaAmarilla f){
        FichaAmarilla fa = f;
        if(fa.getPosicion()==c1.b1.getPosicion()+17){
            c1.b1.setPosicion(5);
            c1.b1.setEstado(false);
            JOptionPane.showMessageDialog(null, "Se comio a la ficha "+c1.b1.getNficha()+c1.b1.getColor());
        }
        if(fa.getPosicion()==c1.b2.getPosicion()+17){
            c1.b2.setPosicion(5);
            c1.b2.setEstado(false);
            JOptionPane.showMessageDialog(null, "Se comio a la ficha "+c1.b2.getNficha()+c1.b2.getColor());
        }
        if(fa.getPosicion()==c1.b3.getPosicion()+17){
            c1.b3.setPosicion(5);
            c1.b3.setEstado(false);
            JOptionPane.showMessageDialog(null, "Se comio a la ficha "+c1.b3.getNficha()+c1.b3.getColor());
        }
        if(fa.getPosicion()==c1.b4.getPosicion()+17){
            c1.b4.setPosicion(5);
            c1.b4.setEstado(false);
            JOptionPane.showMessageDialog(null, "Se comio a la ficha "+c1.b4.getNficha()+c1.b4.getColor());
        }
        if(fa.getPosicion()==c1.r1.getPosicion()+34){
            c1.r1.setPosicion(5);
            c1.r1.setEstado(false);
            JOptionPane.showMessageDialog(null, "Se comio a la ficha "+c1.r1.getNficha()+c1.r1.getColor());
        }
        if(fa.getPosicion()==c1.r2.getPosicion()+34){
            c1.r2.setPosicion(5);
            c1.r2.setEstado(false);
            JOptionPane.showMessageDialog(null, "Se comio a la ficha "+c1.r2.getNficha()+c1.r2.getColor());
        }
        if(fa.getPosicion()==c1.r3.getPosicion()+34){
            c1.r3.setPosicion(5);
            c1.r3.setEstado(false);
            JOptionPane.showMessageDialog(null, "Se comio a la ficha "+c1.r3.getNficha()+c1.r3.getColor());
        }
        if(fa.getPosicion()==c1.r4.getPosicion()+34){
            c1.r4.setPosicion(5);
            c1.r4.setEstado(false);
            JOptionPane.showMessageDialog(null, "Se comio a la ficha "+c1.r4.getNficha()+c1.r4.getColor());
        }
        if(fa.getPosicion()+17==c1.v1.getPosicion()){
            c1.v1.setPosicion(5);
            c1.v1.setEstado(false);
            JOptionPane.showMessageDialog(null, "Se comio a la ficha "+c1.v1.getNficha()+c1.v1.getColor());
        }
        if(fa.getPosicion()+17==c1.v2.getPosicion()){
            c1.v2.setPosicion(5);
            c1.v2.setEstado(false);
            JOptionPane.showMessageDialog(null, "Se comio a la ficha "+c1.v2.getNficha()+c1.v2.getColor());
        }
        if(fa.getPosicion()+17==c1.v3.getPosicion()){
            c1.v3.setPosicion(5);
            c1.v3.setEstado(false);
            JOptionPane.showMessageDialog(null, "Se comio a la ficha "+c1.v3.getNficha()+c1.v3.getColor());
        }
        if(fa.getPosicion()+17==c1.v4.getPosicion()){
            c1.v4.setPosicion(5);
            c1.v4.setEstado(false);
            JOptionPane.showMessageDialog(null, "Se comio a la ficha "+c1.v4.getNficha()+c1.v4.getColor());
        }
    }
    public void comiendoAzul(FichaAzul f){
        FichaAzul fb = f;
        if(fb.getPosicion()+17==c1.a1.getPosicion()){
            c1.a1.setPosicion(5);
            c1.a1.setEstado(false);
            JOptionPane.showMessageDialog(null, "Se comio a la ficha "+c1.a1.getNficha()+c1.a1.getColor());
        }
        if(fb.getPosicion()+17==c1.a2.getPosicion()){
            c1.a2.setPosicion(5);
            c1.a2.setEstado(false);
            JOptionPane.showMessageDialog(null, "Se comio a la ficha "+c1.a2.getNficha()+c1.a2.getColor());
        }
        if(fb.getPosicion()+17==c1.a3.getPosicion()){
            c1.a3.setPosicion(5);
            c1.a3.setEstado(false);
            JOptionPane.showMessageDialog(null, "Se comio a la ficha "+c1.a3.getNficha()+c1.a3.getColor());
        }
        if(fb.getPosicion()+17==c1.a4.getPosicion()){
            c1.a4.setPosicion(5);
            c1.a4.setEstado(false);
            JOptionPane.showMessageDialog(null, "Se comio a la ficha "+c1.a4.getNficha()+c1.a4.getColor());
        }
        if(fb.getPosicion()==c1.r1.getPosicion()+17){
            c1.r1.setPosicion(5);
            c1.r1.setEstado(false);
            JOptionPane.showMessageDialog(null, "Se comio a la ficha "+c1.r1.getNficha()+c1.r1.getColor());
        }
        if(fb.getPosicion()==c1.r2.getPosicion()+17){
            c1.r2.setPosicion(5);
            c1.r2.setEstado(false);
            JOptionPane.showMessageDialog(null, "Se comio a la ficha "+c1.r2.getNficha()+c1.r2.getColor());
        }
        if(fb.getPosicion()==c1.r3.getPosicion()+17){
            c1.r3.setPosicion(5);
            c1.r3.setEstado(false);
            JOptionPane.showMessageDialog(null, "Se comio a la ficha "+c1.r3.getNficha()+c1.r3.getColor());
        }
        if(fb.getPosicion()==c1.r4.getPosicion()+17){
            c1.r4.setPosicion(5);
            c1.r4.setEstado(false);
            JOptionPane.showMessageDialog(null, "Se comio a la ficha "+c1.r4.getNficha()+c1.r4.getColor());
        }
        if(fb.getPosicion()==c1.v1.getPosicion()+34){
            c1.v1.setPosicion(5);
            c1.v1.setEstado(false);
            JOptionPane.showMessageDialog(null, "Se comio a la ficha "+c1.v1.getNficha()+c1.v1.getColor());
        }
        if(fb.getPosicion()==c1.v2.getPosicion()+34){
            c1.v2.setPosicion(5);
            c1.v2.setEstado(false);
            JOptionPane.showMessageDialog(null, "Se comio a la ficha "+c1.v2.getNficha()+c1.v2.getColor());
        }
        if(fb.getPosicion()==c1.v3.getPosicion()+34){
            c1.v3.setPosicion(5);
            c1.v3.setEstado(false);
            JOptionPane.showMessageDialog(null, "Se comio a la ficha "+c1.v3.getNficha()+c1.v3.getColor());
        }
        if(fb.getPosicion()==c1.v4.getPosicion()+34){
            c1.v4.setPosicion(5);
            c1.v4.setEstado(false);
            JOptionPane.showMessageDialog(null, "Se comio a la ficha "+c1.v4.getNficha()+c1.v4.getColor());
        }
    }
    public void comiendoRoja(FichaRoja f){
        FichaRoja fr = f;
        if(fr.getPosicion()+34==c1.a1.getPosicion()){
            c1.a1.setPosicion(5);
            c1.a1.setEstado(false);
            JOptionPane.showMessageDialog(null, "Se comio a la ficha "+c1.a1.getNficha()+c1.a1.getColor());
        }
        if(fr.getPosicion()+34==c1.a2.getPosicion()){
            c1.a2.setPosicion(5);
            c1.a2.setEstado(false);
            JOptionPane.showMessageDialog(null, "Se comio a la ficha "+c1.a2.getNficha()+c1.a2.getColor());
        }
        if(fr.getPosicion()+34==c1.a3.getPosicion()){
            c1.a3.setPosicion(5);
            c1.a3.setEstado(false);
            JOptionPane.showMessageDialog(null, "Se comio a la ficha "+c1.a3.getNficha()+c1.a3.getColor());
        }
        if(fr.getPosicion()+34==c1.a4.getPosicion()){
            c1.a4.setPosicion(5);
            c1.a4.setEstado(false);
            JOptionPane.showMessageDialog(null, "Se comio a la ficha "+c1.a4.getNficha()+c1.a4.getColor());
        }
        if(fr.getPosicion()+17==c1.b1.getPosicion()){
            c1.b1.setPosicion(5);
            c1.b1.setEstado(false);
            JOptionPane.showMessageDialog(null, "Se comio a la ficha "+c1.b1.getNficha()+c1.b1.getColor());
        }
        if(fr.getPosicion()+17==c1.b2.getPosicion()){
            c1.b2.setPosicion(5);
            c1.b2.setEstado(false);
            JOptionPane.showMessageDialog(null, "Se comio a la ficha "+c1.b2.getNficha()+c1.b2.getColor());
        }
        if(fr.getPosicion()+17==c1.b3.getPosicion()){
            c1.b3.setPosicion(5);
            c1.b3.setEstado(false);
            JOptionPane.showMessageDialog(null, "Se comio a la ficha "+c1.b3.getNficha()+c1.b3.getColor());
        }
        if(fr.getPosicion()+17==c1.b4.getPosicion()){
            c1.b4.setPosicion(5);
            c1.b4.setEstado(false);
            JOptionPane.showMessageDialog(null, "Se comio a la ficha "+c1.b4.getNficha()+c1.b4.getColor());
        }
        if(fr.getPosicion()==c1.v1.getPosicion()+17){
            c1.v1.setPosicion(5);
            c1.v1.setEstado(false);
            JOptionPane.showMessageDialog(null, "Se comio a la ficha "+c1.v1.getNficha()+c1.v1.getColor());
        }
        if(fr.getPosicion()==c1.v2.getPosicion()+17){
            c1.v2.setPosicion(5);
            c1.v2.setEstado(false);
            JOptionPane.showMessageDialog(null, "Se comio a la ficha "+c1.v2.getNficha()+c1.v2.getColor());
        }
        if(fr.getPosicion()==c1.v3.getPosicion()+17){
            c1.v3.setPosicion(5);
            c1.v3.setEstado(false);
            JOptionPane.showMessageDialog(null, "Se comio a la ficha "+c1.v3.getNficha()+c1.v3.getColor());
        }
        if(fr.getPosicion()==c1.v4.getPosicion()+17){
            c1.v4.setPosicion(5);
            c1.v4.setEstado(false);
            JOptionPane.showMessageDialog(null, "Se comio a la ficha "+c1.v4.getNficha()+c1.v4.getColor());
        }
    }
    public void comiendoVerde(FichaVerde f){
        FichaVerde fv = f;
        if(fv.getPosicion()-17==c1.a1.getPosicion()){
            c1.a1.setPosicion(5);
            c1.a1.setEstado(false);
            JOptionPane.showMessageDialog(null, "Se comio a la ficha "+c1.a1.getNficha()+c1.a1.getColor());
        }
        if(fv.getPosicion()-17==c1.a2.getPosicion()){
            c1.a2.setPosicion(5);
            c1.a2.setEstado(false);
            JOptionPane.showMessageDialog(null, "Se comio a la ficha "+c1.a2.getNficha()+c1.a2.getColor());
        }
        if(fv.getPosicion()-17==c1.a3.getPosicion()){
            c1.a3.setPosicion(5);
            c1.a3.setEstado(false);
            JOptionPane.showMessageDialog(null, "Se comio a la ficha "+c1.a3.getNficha()+c1.a3.getColor());
        }
        if(fv.getPosicion()-17==c1.a4.getPosicion()){
            c1.a4.setPosicion(5);
            c1.a4.setEstado(false);
            JOptionPane.showMessageDialog(null, "Se comio a la ficha "+c1.a4.getNficha()+c1.a4.getColor());
        }
        if(fv.getPosicion()-34==c1.b1.getPosicion()){
            c1.b1.setPosicion(5);
            c1.b1.setEstado(false);
            JOptionPane.showMessageDialog(null, "Se comio a la ficha "+c1.b1.getNficha()+c1.b1.getColor());
        }
        if(fv.getPosicion()-34==c1.b2.getPosicion()){
            c1.b2.setPosicion(5);
            c1.b2.setEstado(false);
            JOptionPane.showMessageDialog(null, "Se comio a la ficha "+c1.b2.getNficha()+c1.b2.getColor());
        }
        if(fv.getPosicion()-34==c1.b3.getPosicion()){
            c1.b3.setPosicion(5);
            c1.b3.setEstado(false);
            JOptionPane.showMessageDialog(null, "Se comio a la ficha "+c1.b3.getNficha()+c1.b3.getColor());
        }
        if(fv.getPosicion()-34==c1.b4.getPosicion()){
            c1.b4.setPosicion(5);
            c1.b4.setEstado(false);
            JOptionPane.showMessageDialog(null, "Se comio a la ficha "+c1.b4.getNficha()+c1.b4.getColor());
        }
        if(fv.getPosicion()-51==c1.r1.getPosicion()+17){
            c1.v1.setPosicion(5);
            c1.v1.setEstado(false);
            JOptionPane.showMessageDialog(null, "Se comio a la ficha "+c1.r1.getNficha()+c1.r1.getColor());
        }
        if(fv.getPosicion()-51==c1.r2.getPosicion()+17){
            c1.v2.setPosicion(5);
            c1.v2.setEstado(false);
            JOptionPane.showMessageDialog(null, "Se comio a la ficha "+c1.r2.getNficha()+c1.r2.getColor());
        }
        if(fv.getPosicion()-51==c1.r3.getPosicion()+17){
            c1.v3.setPosicion(5);
            c1.v3.setEstado(false);
            JOptionPane.showMessageDialog(null, "Se comio a la ficha "+c1.r3.getNficha()+c1.r3.getColor());
        }
        if(fv.getPosicion()-51==c1.r4.getPosicion()+17){
            c1.v4.setPosicion(5);
            c1.v4.setEstado(false);
            JOptionPane.showMessageDialog(null, "Se comio a la ficha "+c1.r4.getNficha()+c1.r4.getColor());
        }
    }
}
