import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("--------------------");
    System.out.println("    Faixa etária    ");
    System.out.println("--------------------");
    System.out.println();
    System.out.print("Digite a idade do nadador: ");
    int idade = entrada.nextInt();

    if (idade <= 7) {
      System.out.println("Nadador de categoria INFANTIL.");
    }
      else if ((idade > 7) && (idade <= 10)) {
        System.out.println("Nadador de categoria JUVENIL.");
      }
        else if ((idade > 10) && (idade <= 15)) {
          System.out.println("Nadador de categoria ADOLESCENTE.");
        }
          else if ((idade > 16) && (idade <= 30)) {
            System.out.println("Nadador de categoria ADULTO.");
          }
            else {
              System.out.println("Nadador de categoria SENIOR.");
            }
    
    
  }
}