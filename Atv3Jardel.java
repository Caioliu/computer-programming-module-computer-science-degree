import javax.swing.JOptionPane;
class Main {
  public static void main(String[] args) {
    JOptionPane.showMessageDialog(null, "Digite o número e eu te digo se ele é divisível por 10, 5 ou 2!");
    
    int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número: "));
    
    if ((n1 % 10 == 0) || (n1 % 5 == 0) || (n1 % 2 == 0))
 { JOptionPane.showMessageDialog(null, "O número " + n1 + " é divisível por 10, 5 ou 2.");   }
          else { 
      JOptionPane.showMessageDialog(null, "O número " + n1 + " não é divisível por 10, nem por 5, nem por 2."); 
          }
  }
}