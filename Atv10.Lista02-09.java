import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scanner1 = new Scanner(System.in);
    System.out.println("-----------------------------");
    System.out.println("          CONVERSOR          ");
    System.out.println("-----------------------------");
    System.out.println();
    
    System.out.print("Digite o valor em polegadas: ");
    float polegadas = (float) scanner1.nextInt();

    System.out.println("-----------------------------");
    
    float centimetros = (float) (polegadas * 2.54); 
    System.out.println(polegadas + " polegadas são " + centimetros + " centímetros.");
  }
}