/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsp.dsis4.gerenciamento;

import Leitores.Funcionario;
import Leitores.Leitor;
import ifsp.dsis4.obra.Exemplar;
import java.time.LocalDate;

/**
 *
 * @author Georg
 */
public class Emprestimo {
    
    private LocalDate data_emprestimo;
    private LocalDate data_devolucao;
    private Leitor leitor;
    private Funcionario funcionario;
    private Exemplar exemplar;

    public Emprestimo() {
    }

    public LocalDate getData_emprestimo() {
        return data_emprestimo;
    }

    public LocalDate getData_devolucao() {
        return data_devolucao;
    }

    public Leitor getLeitor() {
        return leitor;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public Exemplar getExemplar() {
        return exemplar;
    }

    public void setData_emprestimo(LocalDate data_emprestimo) {
        this.data_emprestimo = data_emprestimo;
    }

    public void setData_devolucao(LocalDate data_devolucao) {
        this.data_devolucao = data_devolucao;
    }

    public void setLeitor(Leitor leitor) {
        this.leitor = leitor;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public void setExemplar(Exemplar exemplar) {
        this.exemplar = exemplar;
    }
}