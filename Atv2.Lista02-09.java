import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scanner1 = new Scanner(System.in);

    System.out.println("---------------------");
    System.out.println("    PAR OU ÍMPAR?    ");
    System.out.println("---------------------");
    System.out.println();
    
    System.out.print("Digite o número: ");
    int numero = scanner1.nextInt();
    
    if (numero % 2 == 0)
      System.out.println("O número " + numero + " é " + "par.");
      
    else
      System.out.println("O número " + numero + " é " + "ímpar.");
  }
}