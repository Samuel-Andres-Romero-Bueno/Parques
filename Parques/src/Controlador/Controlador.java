package Controlador;

import FabricaFichas.FichaAmarilla;
import FabricaFichas.FichaAzul;
import FabricaFichas.FichaRoja;
import FabricaFichas.FichaVerde;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sebas
 */
public final class Controlador {
    private final int nJugadores;
    private final int tamañoTablero;
    public FichaAmarilla a1;
    public FichaAmarilla a2;
    public FichaAmarilla a3;
    public FichaAmarilla a4;
    public FichaAzul b1;
    public FichaAzul b2;
    public FichaAzul b3;
    public FichaAzul b4;
    public FichaRoja r1;
    public FichaRoja r2;
    public FichaRoja r3;
    public FichaRoja r4;
    public FichaVerde v1;
    public FichaVerde v2;
    public FichaVerde v3;
    public FichaVerde v4;
    public Controlador(int Jugadores){
        this.nJugadores=Jugadores;
        for(int i=1; i<=nJugadores; i++){
            PonerJugador(i);
        }
        this.tamañoTablero=17*nJugadores+8;
    }
    public int getTamañoTablero() {
        return tamañoTablero;
    }

    public int getnJugadores() {
        return nJugadores;
    }
    
    
    public void PonerJugador(int i){
        
        switch(i){
            case 1:
                for(int j=0;j<4;j++){
                    CrearFichasA(i, j);
                }
            case 2:
                for(int j=0;j<4;j++){
                    CrearFichasB(i, j);
                }
            case 3:
                for(int j=0;j<4;j++){
                    CrearFichasR(i, j);
                }
            default:
                for(int j=0;j<4;j++){
                    CrearFichasV(i, j);
                }
        }
    }
    public void CrearFichasA(int i, int j){
        switch(j){
            case 0:
                a1 = new FichaAmarilla(i, j+1);
                a1.definirFicha();
            case 1:
                a2 = new FichaAmarilla(i, j+1);
                a2.definirFicha();
            case 2:
                a3 = new FichaAmarilla(i, j+1);
                a3.definirFicha();
            default:
                a4 = new FichaAmarilla(i, j+1);
                a4.definirFicha();
        }
    }
    public void CrearFichasB(int i, int j){
        switch(j){
            case 0:
                b1 = new FichaAzul(i, j+1);
                b1.definirFicha();
            case 1:
                b2 = new FichaAzul(i, j+1);
                b2.definirFicha();
            case 2:
                b3 = new FichaAzul(i, j+1);
                b3.definirFicha();
            default:
                b4 = new FichaAzul(i, j+1);
                b4.definirFicha();
        }
    }
    public void CrearFichasR(int i, int j){
        switch(j){
            case 0:
                r1 = new FichaRoja(i, j+1);
                r1.definirFicha();
            case 1:
                r2 = new FichaRoja(i, j+1);
                r2.definirFicha();
            case 2:
                r3 = new FichaRoja(i, j+1);
                r3.definirFicha();
            default:
                r4 = new FichaRoja(i, j+1);
                r4.definirFicha();
        }
    }
    public void CrearFichasV(int i, int j){
        switch(j){
            case 0:
                v1 = new FichaVerde(i, j+1);
                v1.definirFicha();
            case 1:
                v2 = new FichaVerde(i, j+1);
                v2.definirFicha();
            case 2:
                v3 = new FichaVerde(i, j+1);
                v3.definirFicha();
            default:
                v4 = new FichaVerde(i, j+1);
                v4.definirFicha();
        }
    }
}
