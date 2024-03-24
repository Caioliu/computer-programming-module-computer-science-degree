import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("--------------------------");
    System.out.println("      LINHA CRÉDITO       ");
    System.out.println("--------------------------");
    System.out.println();

    Scanner scanner1 = new Scanner(System.in);
    
    System.out.print("Qual o salário bruto do beneficiário? R$");
    double salBruto = scanner1.nextDouble();
    double maxEmprestimo = salBruto / 100 * 30;
    System.out.println("Seu limite de crédito é de: R$" + maxEmprestimo);
    System.out.println();
    System.out.print("Qual o valor deseja requerir do empréstimo? R$");
    double emprestimo = scanner1.nextDouble();
    
    System.out.println();

    if (maxEmprestimo > emprestimo)
        System.out.println("Crédito concedido!\nSeu novo limite de crédito é de R$" + (maxEmprestimo - emprestimo));
      
    else 
      System.out.println("Crédito negado.\nO valor do empréstimo não pode ser superior a R$" + maxEmprestimo);
  }
}