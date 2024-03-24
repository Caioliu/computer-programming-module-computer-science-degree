import javax.swing.JOptionPane;
class Main {
  public static void main(String[] args) {
    JOptionPane.showMessageDialog(null, "O 1° número é divisível pelo 2°?");
    int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1° número: "));
    int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2° número: "));
    if (n1 % n2 == 0) {
      JOptionPane.showMessageDialog(null, "O número " + n1 + " é divisível pelo número " + n2 + ".");
    }
    else { 
      JOptionPane.showMessageDialog(null, "O número " + n1 + " não é divisível pelo número " + n2 + ".");
    }
  }
}