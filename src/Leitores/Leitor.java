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
public abstract class Leitor {
    
    private int id_leitor;
    
    private String nome;
    private String endereco;
    private String cidade;
    private String estado;
    private String telefone;
    private String email;
    private String rg;
    private LocalDate nascimento;

    public Leitor(int id, String nome, String endereco, String cidade, String estado, String telefone, String email, String rg, LocalDate nascimento) {
        this.id_leitor = id;
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.telefone = telefone;
        this.email = email;
        this.rg = rg;
        this.nascimento = nascimento;
    }
    
    public void setId(int id){
        this.id_leitor = id;
    }

    public int getId(){
        return id_leitor;
    }
    
    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getRg() {
        return rg;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }
    
    
}
