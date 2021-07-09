package service;

import modelo.Funcionario;

import java.math.BigDecimal;

public class ReajusteService {

    public void concedeAumento(Funcionario funcionario, Desempenho desempenho) {

        if (desempenho == Desempenho.A_DESEJAR) {
            BigDecimal reajuste = funcionario.getSalario().multiply(new BigDecimal("0.03"));

            funcionario.reajusteSalario(reajuste);
        } else  if (desempenho == Desempenho.BOM) {
            BigDecimal reajuste = funcionario.getSalario().multiply(new BigDecimal("0.15"));

            funcionario.reajusteSalario(reajuste);
        } else  if (desempenho == Desempenho.OTIMO) {
            BigDecimal reajuste = funcionario.getSalario().multiply(new BigDecimal("0.20"));

            funcionario.reajusteSalario(reajuste);
        }
    }
}
