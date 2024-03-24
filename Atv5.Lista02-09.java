import java.util.Scanner;
class Main {
  public static void main(String[] args) {
   

    System.out.println("----------------------------------------");
    System.out.println("            RAIZ OU QUADRADO            ");
    System.out.println("----------------------------------------");     
    System.out.println();
   
    Scanner entrada = new Scanner(System.in);
    
    System.out.print("Por favor, escreva um número: ");
    float numero1 = (float) entrada.nextFloat();
    System.out.print("Por favor, escreva outro número: ");
    float numero2 = (float) entrada.nextFloat();

    System.out.println();

    if (numero1 > numero2)
      System.out.println(" O quadrado do menor número: " +  (Math.pow(numero2,2)) + "\n A raiz do maior número: " + (Math.sqrt(numero1)));
    else
      System.out.println(" O quadrado do menor número: " +  (Math.pow(numero1,2)) + "\n A raiz do maior número: " + (Math.sqrt(numero2)));
  }
} 