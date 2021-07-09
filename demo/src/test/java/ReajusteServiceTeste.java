import modelo.Funcionario;
import org.junit.jupiter.api.Test;
import service.Desempenho;
import service.ReajusteService;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReajusteServiceTeste {

    @Test
    public void reajusteADesejar(){

        ReajusteService reajusteService = new ReajusteService();
        Funcionario funcionario = new Funcionario
                ("Diony", LocalDate.now(), new BigDecimal(1000.00));

        reajusteService.concedeAumento(funcionario, Desempenho.A_DESEJAR);
        assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());

    }
    @Test
    public void reajusteBom(){

        ReajusteService reajusteService = new ReajusteService();
        Funcionario funcionario = new Funcionario
                ("Diony", LocalDate.now(), new BigDecimal(1000.00));

        reajusteService.concedeAumento(funcionario, Desempenho.BOM);
        assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());

    }
    @Test
    public void reajusteOtimo(){

        ReajusteService reajusteService = new ReajusteService();
        Funcionario funcionario = new Funcionario
                ("Diony", LocalDate.now(), new BigDecimal(1000.00));

        reajusteService.concedeAumento(funcionario, Desempenho.OTIMO);
        assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());

    }
}
