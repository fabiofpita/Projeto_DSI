/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsp.dsis4.obra;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Georg
 */
public class Obra {
    
    private int identificador;
    private String isbn;
    private String titulo;
    private Categoria categoria;
    private String autor;
    private String palavras_chave;
    private LocalDate publicacao;
    private int edicao;
    private String editora;
    private List<Exemplar> exemplares;
    
    public Obra(){}
    
    public Obra(int identificador, String isbn, String titulo, Categoria categoria, String autor, String palavras, LocalDate data, int edicao, String editora){
        this.identificador = identificador;
        this.isbn = isbn;
        this.titulo = titulo;
        this.categoria = categoria;
        this.autor = autor;
        this.palavras_chave = palavras;
        this.publicacao = data;
        this.edicao = edicao;
        this.editora = editora;
    }

    public int getIdentificador(){
        return identificador;
    }
    
    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public String getAutor() {
        return autor;
    }

    public String getPalavras_chave() {
        return palavras_chave;
    }

    public LocalDate getPublicacao() {
        return publicacao;
    }

    public int getEdicao() {
        return edicao;
    }

    public String getEditora() {
        return editora;
    }

    public List<Exemplar> getExemplares() {
        return exemplares;
    }

    public void setIdentificador(int identificador){
        this.identificador = identificador;
    }
    
    public void setExemplares(List<Exemplar> exemplares) {
        this.exemplares = exemplares;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPalavras_chave(String palavras_chave) {
        this.palavras_chave = palavras_chave;
    }

    public void setPublicacao(LocalDate publicacao) {
        this.publicacao = publicacao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
    
    public int qtdObras(){
        return exemplares.size();
    }
    
    public int qtdObrasDisponiveis(){
        int i = 0;
        int retorno = 0;
        
        while(i < qtdObras()){
            
            if(exemplares.get(i).getDisponivel()){
                retorno ++;
            }
            
            i++;
        }
        
        return retorno;
    }
}
