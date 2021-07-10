package service;

import modelo.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BonusService {

    public BigDecimal calcularBonus(Funcionario funcionario) {
        BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1"));

        if (valor.compareTo(new BigDecimal("1000")) > 0) {
            throw new IllegalArgumentException("SALARIO FORA DA TABELA, NAO DIREITO A BONUS");
        }
        return valor.setScale(2, RoundingMode.HALF_UP); // .setScale... arrendora valor quebrado
    }

}
