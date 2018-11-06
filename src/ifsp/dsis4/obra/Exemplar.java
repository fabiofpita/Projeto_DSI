/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsp.dsis4.obra;

/**
 *
 * @author Georg
 */
public class Exemplar {
    
    private boolean disponivel;
    private int identificador;
    
    
    public Exemplar(boolean disponivel, int identificador){
        this.disponivel = disponivel;
        this.identificador = identificador;
    }
    
    public boolean getDisponivel(){
        return disponivel;
    }
    
    public int getIdentificador(){
        return identificador;
    }
}
