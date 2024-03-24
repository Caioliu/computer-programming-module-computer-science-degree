import javax.swing.JOptionPane;
class Main {
  public static void main(String[] args) {
    JOptionPane.showMessageDialog(null, "Digite o número e eu te digo se ele é divisível por 3 e 7 simultaneamente!");
    int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número: "));

    if (n1 % 7 == 0)  {
      if (n1 % 3 == 0) {
       JOptionPane.showMessageDialog(null, "O número " + n1 + " é divisível por 3 e 7 simultaneamente.");  
      }    
    }  
    else {
      JOptionPane.showMessageDialog(null, "O número " + n1 + " não é divisível por 3 e 7 simultaneamente.");  
    }
      
  }
}