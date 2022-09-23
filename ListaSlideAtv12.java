import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("-----------------------");
    System.out.println("CALCULADORA DO OIAPOQUE");
    System.out.println("-----------------------");
    System.out.println();
    Scanner entrada = new Scanner(System.in);
    System.out.print("Digite o 1° número: ");
    double n1 = entrada.nextDouble();
    System.out.print("Digite o 2° número: ");
    double n2 = entrada.nextDouble();
    System.out.println();
    
    System.out.println("MENU");
    System.out.println("----------------");
    System.out.println("[1] Somar.");
    System.out.println("[2] Subtrair.");
    System.out.println("[3] Multiplicar.");
    System.out.println("[4] Dividir.");
    System.out.println("[5] Sair.");
    System.out.println("----------------");

    System.out.print("Opção selecionada: ");
    int choice = entrada.nextInt();
    System.out.println();
    

    if (choice == 1) {
      System.out.println(n1 + " + " + n2 + " = " + (n1+n2));
    }
      else if (choice == 2) {
        System.out.println(n1 + " - " + n2 + " = " + (n1-n2));
      }
        else if (choice == 3) {
          System.out.println(n1 + " * " + n2 + " = " + (n1*n2));
        }
          else if (choice == 4) {
            System.out.println(n1 + " / " + n2 + " = " + (n1/n2));
          }
          else {
            System.out.println("Programa finalizado.");
          }
  }
}