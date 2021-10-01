/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FabricaFichas;

/**
 *
 * @author sebas
 */
public class FichaVerde extends Ficha{
    int tipo;
    boolean estado;
    int posicion;
    public FichaVerde(int tipo, int nFicha) {
        super(tipo, nFicha);
        this.tipo=tipo;
        this.posicion=0;
        this.estado=false;
    }
    @Override
    public void definirFicha(){
        setColor("Verde");
    }
    
}
