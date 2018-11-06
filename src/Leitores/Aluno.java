/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Leitores;

import java.time.LocalDate;

/**
 *
 * @author Georg
 */
public class Aluno extends Leitor{
    
    private String prontuario;

    public Aluno(int id, String nome, String endereco, String cidade, String estado, String telefone, String email, String rg, LocalDate nascimento, String prontuario) {
        super(id, nome, endereco, cidade, estado, telefone, email, rg, nascimento);
        this.prontuario = prontuario;
    }
    
    public String getProntuario() {
        return prontuario;
    }
}
