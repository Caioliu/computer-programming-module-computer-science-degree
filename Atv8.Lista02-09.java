import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("-------------------------");
    System.out.println("  Quantos são de maior?  ");
    System.out.println("-------------------------");
    System.out.println();
    
    Scanner entrada = new Scanner(System.in);
    int idade;
    int cont = 0;
 
      for (int i = 1; i <= 20; i++) {
        System.out.print("Por favor, informe a idade da " + i + "°" + " pessoa: ");
        idade = entrada.nextInt();
        System.out.println();
   
        if (idade >= 18) {
          cont = cont + 1;
        }
      }
        System.out.println("A quantidade de pessoas com maioridade é de: " + cont);
  }
}