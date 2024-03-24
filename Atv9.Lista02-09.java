import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("-----------------------");
    System.out.println("    ÁREA DE LOSANGO    ");
    System.out.println("-----------------------");
    System.out.println();
    
    Scanner scanner1 = new Scanner(System.in);
    
    System.out.print("Informe o valor da diagonal maior do losango: ");
    double diagonalMaior = scanner1.nextDouble();
    System.out.print("Informe o valor da diagonal menor do losango: ");
    double diagonalMenor = scanner1.nextDouble();
    double area = (diagonalMaior * diagonalMenor) / 2;
    
    System.out.println();
    System.out.println("A área do losango é: " + area);
  }
}