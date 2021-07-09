package service;

import modelo.Funcionario;

import java.math.BigDecimal;

public class ReajusteService {

    public void concedeAumento(Funcionario funcionario, Desempenho desempenho) {

            BigDecimal percentual = desempenho.percentualReajsute();
            BigDecimal reajuste = funcionario.getSalario().multiply(percentual);

            funcionario.reajusteSalario(reajuste);




    }
}
