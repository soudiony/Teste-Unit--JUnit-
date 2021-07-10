import modelo.Funcionario;
import org.junit.jupiter.api.*;
import service.Desempenho;
import service.ReajusteService;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ReajusteServiceTeste {
    private ReajusteService reajusteService;
    private Funcionario funcionario;

    @BeforeEach  // chama antes de cada metodo
    public void dadosDeFuncionario(){
        System.out.print("iniciou-");
        this.reajusteService = new ReajusteService();
        this.funcionario = new Funcionario
                ("Diony", LocalDate.now(), new BigDecimal(1000.00));
    }
    @AfterEach
    public void finalMetodo(){
        System.out.println("fim");
    }

    @BeforeAll
    public static void iniciouMetodos(){
        System.out.println("PRIMEIRO");
    }
    @AfterAll
    public static void finalizouMetodos(){
        System.out.println("FINALIZOU");
    }


    @Test
    public void reajusteADesejar(){
// chama o @BeforeEach

        reajusteService.concedeAumento(funcionario, Desempenho.A_DESEJAR);
        assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());

    }
    @Test
    public void reajusteBom(){
        reajusteService.concedeAumento(funcionario, Desempenho.BOM);
        assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());

    }
    @Test
    public void reajusteOtimo(){

        reajusteService.concedeAumento(funcionario, Desempenho.OTIMO);
        assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());

    }
}
