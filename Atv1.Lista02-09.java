import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("---------------------------");
    System.out.println("POSITIVO, NEGATIVO OU NULO?");
    System.out.println("---------------------------");               
    System.out.println();
                       
    System.out.print("Digite o número: ");
    Scanner scanner1 = new Scanner(System.in);
    int numero = scanner1.nextInt();
    
    if(numero > 0)
        System.out.println("O número " + numero + " é " + "POSITIVO.");
      
    else if(numero < 0)
        System.out.println("O número " + numero + " é " + "NEGATIVO");
      
    else
      System.out.println("O número " + numero + " é " + "NULO.");
  }
}