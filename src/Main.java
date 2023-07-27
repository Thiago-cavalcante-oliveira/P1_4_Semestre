import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Conta conta = new Conta("João", new BigDecimal(100), "1234-5");

          Scanner scanner = new Scanner(System.in);

            boolean continuacao = true;
          while(continuacao) {
              System.out.println("Qual operacao deseja realizar? 1 - Saque, 2 - Deposito, 3 - Saldo, 4 - Investimento, 5-Sair");


              String operacao = scanner.next();

              scanner.reset();
              switch (operacao) {

                  case "1":
                      System.out.println("Qual valor deseja sacar?");
                      BigDecimal valorSaque = BigDecimal.valueOf(scanner.nextInt());
                      conta.saque(valorSaque);

                      break;
                  case "2":
                      System.out.println("Qual valor deseja depositar?");
                      BigDecimal valorDeposito = BigDecimal.valueOf(scanner.nextInt());
                      conta.deposito(valorDeposito);

                      break;
                  case "3":
                      System.out.println("Correntista: " + conta.getNome());
                      System.out.println("Seu saldo é: " + conta.getSaldo());
                      System.out.println("Seu investimento é: " + conta.getInvestimento());
                      break;
                  case "4":
                      System.out.flush();
                      System.out.println("Valor Investido: " + conta.getInvestimento());
                      System.out.println("1 - investir, 2 - Resgatar investimento, 3 - Sair");
                      int valorInvestimento = scanner.nextInt();
                      if (valorInvestimento == 1){
                          System.out.println("Qual valor deseja investir?");
                          valorInvestimento = scanner.nextInt();
                      conta.investimentoAdicionar(new BigDecimal(valorInvestimento));

                      }
                      else if (valorInvestimento == 2){
                          System.out.println("Qual valor deseja resgatar?");
                          valorInvestimento = scanner.nextInt();
                          conta.investimentoRemover(new BigDecimal(valorInvestimento));

                      }

                      break;
                  case "5":
                      System.out.println("Obrigado por utilizar nosso sistema!");
                      continuacao = false;

                      break;


                  default:
                      System.out.println("Operação inválida!");
                      break;


              }
              System.out.flush();
conta.setInvestimento(new BigDecimal(conta.getInvestimento().doubleValue() * 1.05));

          }

}}