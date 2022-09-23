import javax.swing.JOptionPane;
class Main {
  public static void main(String[] args) {
    double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 1ª nota do aluno: "));
    double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 2ª nota do aluno: "));
    double media = ((nota1 + nota2) / 2); 
    if (media >= 7) {
      JOptionPane.showMessageDialog(null,"Média: " + media);
      JOptionPane.showMessageDialog(null, "Aluno aprovado!");
    }
    else {
      JOptionPane.showMessageDialog(null, "Média: " + media);
      JOptionPane.showMessageDialog(null, "Aluno reprovado.");
    } 
      
  }
}