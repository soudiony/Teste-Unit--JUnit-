import modelo.Funcionario;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.util.Assert;
import service.BonusService;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;


class BonusServiceTeste {

    @Test
    void bonusZeroSalarioAlto() {                            /*Linha 1: Estanciar a Classe
                                                              Linha 2: chamar metodo ao objeto instaciado da classe BonusService*/
        //CENÁRIO (O METODO)
        BonusService bonusService = new BonusService();
        BigDecimal valorBonus = bonusService.calcularBonus(new Funcionario("diony", LocalDate.now(), new BigDecimal(25000)));

        assertEquals(new BigDecimal ("0.00"), valorBonus);              /* Ação */
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
