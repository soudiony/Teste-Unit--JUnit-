import modelo.Funcionario;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.util.Assert;
import service.BonusService;


import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;


class BonusServiceTeste {

    @Test
    void bonusZeroSalarioAlto() {

        BonusService bonusService = new BonusService();
        // "verificar Exception" assertThrows(IllegalArgumentException.class,
        //      () ->  bonusService.calcularBonus(new Funcionario("diony", LocalDate.now(), new BigDecimal(25000))));

    try {
        bonusService.calcularBonus(new Funcionario("diony", LocalDate.now(), new BigDecimal(11000)));
         fail("Erro ao rodar");

    }catch (Exception e) {
        assertEquals("SALARIO FORA DA TABELA, NAO DIREITO A BONUS", e.getMessage());

        }
    }

    @Test
    void bonusOkSalarioBaixo() {
        BonusService bonusService = new BonusService();
        BigDecimal valorBonus = bonusService.calcularBonus(new Funcionario("diony", LocalDate.now(), new BigDecimal(5000)));

        assertEquals(new BigDecimal("500.00") , valorBonus);
    }

    @Test
    void bonusOkSalarioExato() {
        BonusService bonusService = new BonusService();
        BigDecimal valorBonus = bonusService.calcularBonus(new Funcionario("diony", LocalDate.now(), new BigDecimal(10000)));

        assertEquals(new BigDecimal("1000.00") , valorBonus);
    }




}
