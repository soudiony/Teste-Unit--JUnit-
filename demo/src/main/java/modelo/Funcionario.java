package modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class Funcionario {

    private String nome;
    private LocalDate dataAdmissao;
    private BigDecimal salario;



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

        public Funcionario(String nome, LocalDate dataAdmissao, BigDecimal salario) {
        this.nome = nome;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
    }

    public void reajusteSalario(BigDecimal reajuste) {

        this.salario = this.salario.add(reajuste);
        arremdodarSalario();
   }

    private void arremdodarSalario() {
       this.salario = this.salario.setScale(2, RoundingMode.HALF_UP);
    }
}
