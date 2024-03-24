import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("---------------------------");
    System.out.println("      ORDEM CRESCENTE      ");
    System.out.println("---------------------------");

    Scanner entrada = new Scanner(System.in);

    System.out.println();
    
    System.out.print("Digite um número: ");
    int numero1 = entrada.nextInt();
    System.out.print("Digite outro número: ");
    int numero2 = entrada.nextInt();

    System.out.println();

    if (numero1 < numero2)
      System.out.println(numero1 + " < " + numero2);
    else  
      System.out.println(numero2 + " < " + numero1);
    
  }
}