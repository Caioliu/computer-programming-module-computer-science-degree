
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("----------------------------------------");
    System.out.println("            RAIZ OU QUADRADO            ");
    System.out.println("----------------------------------------");     
    System.out.println();
    
    System.out.println("Digite um número: [positivo/negativo]");
    double numero = input.nextDouble();
    
    if (numero >= 1)
    System.out.println("A raiz quadrada de " + numero + " é: " + Math.sqrt(numero));
      
    else if (numero <= -1)
    System.out.println("O valor " + numero + " ao quadrado é: " + Math.pow(numero,2));
  }
}