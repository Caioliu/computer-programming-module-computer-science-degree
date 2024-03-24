import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scanner1 = new Scanner(System.in);

    System.out.println("------------------------");
    System.out.println("    DIVISÍVEL POR 5?    ");
    System.out.println("------------------------");
    System.out.println();
                     
    
    System.out.print("Digite um número: ");
    int numero1 = scanner1.nextInt();

    if (numero1 % 5 == 0)
      System.out.println("O número " + numero1 + " é divisível por 5.");
      
    else
      System.out.println("O número " + numero1 + " não é divisível por 5.");
  }
}