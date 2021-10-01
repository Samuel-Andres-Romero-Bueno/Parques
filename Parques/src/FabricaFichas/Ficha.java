package FabricaFichas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sebas
 */
public abstract class Ficha {
    private String Color;
    private int tipo;
    private boolean estado;
    private int posicion;
    private int nficha;

    public Ficha(int tipo, int nFicha) {
        this.Color = null;
        this.tipo = tipo;
        this.estado = false;
        this.posicion = 0;
        this.nficha=nFicha;
    }

    public int getNficha() {
        return nficha;
    }

    public void setNficha(int nficha) {
        this.nficha = nficha;
    }
    
    public abstract void definirFicha();

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
    
}
