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
public class Categoria {

    private int codigo_categoria;
    private String descricao;

    public Categoria(int codigo_categoria, String descricao) {
        this.codigo_categoria = codigo_categoria;
        this.descricao = descricao;
    }

    public int getCodigo_categoria() {
        return codigo_categoria;
    }

    public String getDescricao() {
        return descricao;
    }
    
}
