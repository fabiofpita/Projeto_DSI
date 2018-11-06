/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsp.dsis4.gerenciamento;

import java.time.LocalDate;

/**
 *
 * @author Georg
 */
public class Devolucao {
    private LocalDate data_devolvida;
    private Emprestimo emprestimo;

    public Devolucao(LocalDate data_devolvida, Emprestimo emprestimo) {
        this.data_devolvida = data_devolvida;
        this.emprestimo = emprestimo;
    }

    public LocalDate getData_devolvida() {
        return data_devolvida;
    }

    public Emprestimo getEmprestimo() {
        return emprestimo;
    }
}
