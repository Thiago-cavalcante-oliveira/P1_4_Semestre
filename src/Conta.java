import java.math.BigDecimal;
import java.math.RoundingMode;

public class Conta {
    private String nome;
    private BigDecimal saldo ;
    private String conta;
    private BigDecimal investimento;


    public BigDecimal getInvestimento() {
        return investimento;
    }

    public void setInvestimento(BigDecimal investimento) {
        this.investimento = investimento;
    }

    public String getNome() {
        return nome;
    }
    public String getConta() {
        return conta;
    }
    public void setConta(String conta) {
        this.conta = conta;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public Conta(String nome, BigDecimal saldo, String conta){
        this.nome = nome;
        this.saldo = saldo;
        this.conta = conta;
        this.investimento = new BigDecimal(0);
    }


    public void deposito(BigDecimal valor) {
        if(valor.compareTo(BigDecimal.ZERO) < 0){
            System.out.println("Valor inválido");
            return;
        }
        this.saldo = this.saldo.add(valor);
        System.out.println("Deposito realizado com sucesso!");
    }

    public void saque(BigDecimal valor) {
        if(valor.compareTo(BigDecimal.ZERO) < 0){
            System.out.println("Valor inválido");
            return;
        }
        if(valor.compareTo(this.saldo) >=0 ){
            System.out.println("Saldo insuficiente");
            return;
        }
        this.saldo = this.saldo.subtract(valor);
        System.out.println("Saque realizado com sucesso!");
    }

    public void investimentoAdicionar(BigDecimal valor) {
        if (valor.compareTo(BigDecimal.ZERO) < 0){
            System.out.println("Valor inválido");
            return;
        }

        if(valor.compareTo(this.saldo) >= 0){
            System.out.println("Saldo insuficiente");
            return;
        }
        this.investimento = this.investimento.add(valor) ;
        this.saldo = this.saldo.subtract(valor)  ;
        System.out.println("Investimento realizado com sucesso!");
    }
    public void investimentoRemover(BigDecimal valor) {
        if(valor.compareTo(BigDecimal.ZERO) < 0){
            System.out.println("Valor inválido");
            return;
        }
        if(valor.compareTo(this.investimento) >= 0){
            System.out.println("Saldo insuficiente");
            return;
        }
        this.investimento = this.investimento.subtract(valor) ;
        this.saldo = this.saldo.add(valor) ;
        System.out.println("Investimento resgatado com sucesso!");
    }


}
